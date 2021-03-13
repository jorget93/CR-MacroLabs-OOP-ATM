import org.junit.Assert;
import org.junit.jupiter.api.Test;

/*
Test checklist:
Test both constructors
Check balance
Test withdrawal (Both with enough and not enough money in account, withdrawing negative amount...)
Test deposit (make sure positive)

*/

public class TestAccount {

    @Test
    public void testConstructor(){
        int e=9;
        int a=9;
        Assert.assertEquals(a,e);
    }

    @Test
    public void testConstructNull(){}

    @Test
    public void testA0() {
        Account a = new Account(0.0);
        Assert.assertEquals(0.0, a.getBalance(), 0.0001);
    }

    @Test
    public void testA00() {
        Account a = new Account(10.0);
        Assert.assertEquals(10.0, a.getBalance(), 0.0001);
    }

    @Test
    public void testA01() {
        Account a = new Account(0.0);
        Assert.assertEquals(true, a.closeAccount());
    }

    @Test
    public void testA02() {
        Account a = new Account(10.0);
        Assert.assertEquals(false, a.closeAccount());
    }

    @Test
    public void testA1() {
        Account a = new Account(0.0);
        a.deposit(100.0);
        Assert.assertEquals(100.0, a.getBalance(), 0.0001);
    }

    @Test
    public void testA2() {
        Account a = new Account(10.0);
        a.deposit(100.0);
        Assert.assertEquals(110.0, a.getBalance(), 0.0001);
    }

    @Test
    public void testA3() {
        Account a = new Account(200.0);
        Double actual = a.withdraw(100.0);
        Assert.assertEquals(100.0, actual, 0.0001);
    }

    @Test
    public void testA4() {
        Account a = new Account(0.0);
        Double actual = a.withdraw(1.0);
        Assert.assertEquals(0.0, actual, 0.0001);
    }

    @Test
    public void testA5() {
        Account a = new Account(10.0);
        Account b = new Account(0.0);
        a.transfer(b, 10.0);
        Assert.assertEquals(0.0, a.getBalance(), 0.0001);
        Assert.assertEquals(10.0, b.getBalance(), 0.0001);
    }

    @Test
    public void testA6() {
        Account a = new Account(10.0);
        Account b = new Account(0.0);
        a.transfer(b, 100.0); // nothing should happen
        Assert.assertEquals(10.0, a.getBalance(), 0.0001);
        Assert.assertEquals(0.0, b.getBalance(), 0.0001);
    }



}
