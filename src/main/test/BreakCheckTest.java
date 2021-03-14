import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

//@RunWith(Parameterized.class)
public class BreakCheckTest {

    @Test
    public void pinGeneratorTest(){
        //Given
        BreakCheck newCheck = new BreakCheck();
        //Action
        String newPin = newCheck.pinGenerator();
        //Expected
        int expected = 8;

        int actual = newPin.length();
        System.out.println(newPin);
        Assert.assertEquals(expected,actual);
    }

}
