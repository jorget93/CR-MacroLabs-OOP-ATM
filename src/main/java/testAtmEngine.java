import org.junit.Assert;
import org.junit.jupiter.api.Test;

/*
Test checklist:
Test both constructors
Check balance
Test withdrawal (Both with enough and not enough money in account, withdrawing negative amount...)
Test deposit (make sure positive)

*/

public class testAtmEngine {
    @Test
    public void engineConstructor(){
        AtmEngine bank = new AtmEngine();
        Assert.assertTrue(bank instanceof AtmEngine);
    }

    @Test
    public void addNewUser(){
        AtmEngine badBank = new AtmEngine();
        Account a=new Account(10.0);
        String userPin="8675309";
        badBank.addNewAccount(userPin,a);
        badBank.printAllAccounts(userPin);
    }

    @Test
    public void addNewAccount(){
        AtmEngine badBank = new AtmEngine();
        Account a=new Account(10.0);
        Account b=new Account(10.0);
        String userPin="8675309";
        badBank.addNewAccount(userPin,a);
        badBank.addNewAccount(userPin,b);
        badBank.printAllAccounts(userPin);
    }
}
