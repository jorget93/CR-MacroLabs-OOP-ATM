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
        Account a=new Account(-9.0);
        Account b=new Account(10.0);
        Account c=new Account(10.0);
        Account d=new Account(34.0);
        String userPin="8675309";
        String otherUser="Dude it's just a test.";
        badBank.addNewAccount(userPin,a);
        badBank.addNewAccount(userPin,b);
        badBank.addNewAccount(otherUser,c);
        badBank.addNewAccount(otherUser,d);
        badBank.printAllAccounts(otherUser);
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

    @Test
    public void removeTest(){
        AtmEngine badBank = new AtmEngine();
        Account a=new Account(10.0, "Investment");
        Account b=new Account(0.0, "Whatever");
        Account c= new Account(33.9,"PleaseJustWork");
        String userPin="8675309";
        badBank.addNewAccount(userPin,a);
        badBank.addNewAccount(userPin,b);
        badBank.addNewAccount(userPin,c);
        badBank.closeAccount(userPin,1);
        badBank.printAllAccounts(userPin);
    }

    @Test
    public void removeTest2(){
        AtmEngine badBank = new AtmEngine();
        Account a=new Account(10.0, "Investment");
        Account b=new Account(0.0, "Whatever");
        Account c= new Account(33.9,"PleaseJustWork");
        String userPin="8675309";
        badBank.addNewAccount(userPin,a);
        badBank.addNewAccount(userPin,b);
        badBank.addNewAccount(userPin,c);
        badBank.closeAccount(userPin,0);
        badBank.printAllAccounts(userPin);
    }

    @Test
    public void depositAtmTest(){
        AtmEngine badBank = new AtmEngine();
        Account a=new Account(10.0, "Investment");
        Account b=new Account(0.0, "Whatever");
        Account c= new Account(33.9,"PleaseJustWork");
        String userPin="8675309";
        badBank.addNewAccount(userPin,a);
        badBank.addNewAccount(userPin,b);
        badBank.addNewAccount(userPin,c);
        badBank.depositCash(userPin,0,44.9);
        badBank.depositCash(userPin,2,-21.0);
        badBank.printAllAccounts(userPin);
    }

    @Test
    public void withdrawAtmTest(){
        AtmEngine badBank = new AtmEngine();
        Account a=new Account(10.0, "Investment");
        Account b=new Account(0.0, "Whatever");
        Account c= new Account(33.9,"PleaseJustWork");
        String userPin="8675309";
        badBank.addNewAccount(userPin,a);
        badBank.addNewAccount(userPin,b);
        badBank.addNewAccount(userPin,c);
        badBank.withdrawCash(userPin,0,5.5);
        badBank.withdrawCash(userPin,1,44.9);
        badBank.withdrawCash(userPin,2,-21.0);
        badBank.printAllAccounts(userPin);
    }

    @Test
    public void transferAtmTest(){
        AtmEngine badBank = new AtmEngine();
        Account a=new Account(10.0, "Investment");
        Account b=new Account(0.0, "Whatever");
        Account c= new Account(33.9,"PleaseJustWork");
        String userPin="8675309";
        badBank.addNewAccount(userPin,a);
        badBank.addNewAccount(userPin,b);
        badBank.addNewAccount(userPin,c);
        badBank.transfer(userPin,0,2,9.21);
        badBank.printAllAccounts(userPin);
    }

    @Test
    public void transferAtmTest2(){
        AtmEngine badBank = new AtmEngine();
        Account a=new Account(10.0, "Investment");
        Account b=new Account(0.0, "Whatever");
        Account c= new Account(33.9,"PleaseJustWork");
        String userPin="8675309";
        badBank.addNewAccount(userPin,a);
        badBank.addNewAccount(userPin,b);
        badBank.addNewAccount(userPin,c);
        badBank.transfer(userPin,1,0,9.21);
        badBank.printAllAccounts(userPin);
    }

    @Test
    public void transferAtmTest3(){
        AtmEngine badBank = new AtmEngine();
        Account a=new Account(10.0, "Investment");
        Account b=new Account(0.0, "Whatever");
        Account c= new Account(33.9,"PleaseJustWork");
        String userPin="8675309";
        badBank.addNewAccount(userPin,a);
        badBank.addNewAccount(userPin,b);
        badBank.addNewAccount(userPin,c);
        badBank.transfer(userPin,2,0,-12.1);
        badBank.printAllAccounts(userPin);
    }

    @Test
    public void transferAtmTest4(){
        AtmEngine badBank = new AtmEngine();
        Account a=new Account(10.0, "Investment");
        Account b=new Account(0.0, "Whatever");
        Account c= new Account(33.9,"PleaseJustWork");
        String userPin="8675309";
        badBank.addNewAccount(userPin,a);
        badBank.addNewAccount(userPin,b);
        badBank.addNewAccount(userPin,c);
        badBank.transfer(userPin,0,1,15.5);
        badBank.printAllAccounts(userPin);
    }
}
