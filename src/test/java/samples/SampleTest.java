package samples;

import org.testng.Assert;
import org.testng.annotations.Test;


/**
 * Sample test with main code dependency.
 */
public class SampleTest {

    @Test(groups = {"unit"})
    public void first(){
        System.out.println("first"+Example.TEXT_FROM_JAVA);
        System.out.println("first");
        Assert.assertEquals("1", "1");
    }

    @Test(groups = {"web"})
    public void second(){
        System.out.println("second");
        Assert.assertEquals("2", "2");
    }
}
