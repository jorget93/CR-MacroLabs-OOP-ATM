import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.StringWriter;

//@RunWith(Parameterized.class)
public class BreakCheckTest {

    @Test
    public void pinGeneratorTest1(){
        //Given
        BreakCheck newCheck = new BreakCheck();
        //Action
        String newPin = newCheck.pinGenerator();
        //Expected
        int expected = 8;
        //Actual
        int actual = newPin.length();
        System.out.println(newPin);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void pinGeneratorTest2(){
        //Given
        BreakCheck newCheck = new BreakCheck();
        //Action
        String newPin = newCheck.pinGenerator();
        //Expected
        int expected = 8;
        //Actual
        int actual = newPin.length();
        System.out.println(newPin);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void pinGeneratorTest3(){
        //Given
        BreakCheck newCheck = new BreakCheck();
        //Action
        String newPin = newCheck.pinGenerator();
        //Expected
        int expected = 8;
        //Actual
        int actual = newPin.length();
        System.out.println(newPin);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void isDouble(){
        StringWriter output = new StringWriter();
    }


}
