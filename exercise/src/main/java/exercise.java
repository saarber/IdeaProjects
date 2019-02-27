import java.io.File;
import java.io.IOException;
import java.net.InetAddress;

import org.junit.Assert;
import org.junit.Test;

import junit.framework.SystemTestCase4;



import static org.junit.Assert.fail;

public class exercise extends SystemTestCase4 {

    String filename = "pom.xml";
    String ipAddress = "192.168.85.5";

    @Test
    public void isPomExist() {

        report.report("Hello JSystem ");
        File file = new File(filename);
        Assert.assertTrue(file.exists());
        report.report(filename + " Exist");


    }

    @Test
    public void pingHost()
    {

        try {
            InetAddress inet = InetAddress.getByName(ipAddress);
            boolean reachable = inet.isReachable(5000);
            if (reachable) {
                report.report("Host is reachable");
            } else {
                fail("Host is not reachable");
            }

        } catch (IOException exc) {
            fail(exc.getMessage());
        }

    }

}
