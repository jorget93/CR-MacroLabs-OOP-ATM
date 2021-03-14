public class Account {

    Double balance;
    String accountType= "Checking";
    //Might use this for something later.
    //Maybe an added modifier in case of multiple accounts of same type
    String IDnum;


    //A new instance of account would need starting funds and account type
    public Account(Double startingBalance, String typeOfAccount){
        if(startingBalance>=0) balance=startingBalance;
        else {balance=0.0; System.out.println("Can't open with a negative balance.");}
        accountType=typeOfAccount;
    }

    //the version of the constructor the tests use.
    //The console should probably use the other one.
    //If this constructor IS used, account defaults to a checking account.
    public Account(Double startingBalance){
        if(startingBalance>=0) balance=startingBalance;
        else {balance=0.0; System.out.println("Can't open with a negative balance.");}
    }

    public Double getBalance(){
        return balance;
    }

    public String getAccountType(){
        return accountType;
    }



    //Possible area to expand on: perhaps withdrawing works differently pending account type.
    //prevents overdrawing. uses return statement for either
    //A balance or to be used in the transfer method.
    public Double withdraw(Double amount){
        if(amount>balance){
            System.out.println("Insufficient funds for withdrawal.");
            return 0.0;
        }else if(amount<0.0){
            System.out.println("Cannot withdraw negative amount.");
            return 0.0;
        }else{balance-=amount;
            return amount;}
    }

    //cannot deposit a negative amount
    public void deposit(Double amount){
        if (amount>=0.0) balance+=amount;;
        if (amount<0.0) System.out.println("You can't deposit what you don't have.");
    }



    public void transfer(Account gettingMoney, Double amount){
        //Can we write transfer so that it just cal the deposit and withdraw methods?
        // - ryan
        //Yes? That's what this is. using the deposit method from one account from a withdrawal
        gettingMoney.deposit(this.withdraw(amount));
    }


    //Uncertain if this is needed, but it was in the tests.
    //Returns true if the account can be closed. False if not.
    public Boolean closeAccount(){
        if (balance==0.0){return true;}
        else return false;
    }

}
