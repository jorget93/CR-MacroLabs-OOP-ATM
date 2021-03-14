import org.junit.Assert;
import org.junit.Test;

public class BreakCheckTest {
    @Test
    public void pinGeneratorTest(){
        BreakCheck newCheck = new BreakCheck();
        String newPin = newCheck.pinGenerator();

        int expected = 8;

        int actual = newPin.length();

        Assert.assertEquals(expected,actual);
    }
}
