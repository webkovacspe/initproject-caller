import org.junit.Assert;
import org.junit.Test;

public class test {
    @Test
    public void testWhoAmI() {
        WhoAmI whoAmI = new WhoAmI();
        Assert.assertEquals("BootCamp", whoAmI.WhoAmI());
    }
}