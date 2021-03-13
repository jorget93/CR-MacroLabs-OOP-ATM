import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AtmEngine {
    Map<String, List<Account>> bank;

    //No need for parameters right now.
    public AtmEngine(){}


    //Method to make a new account. adds new accounts and can add new users.
    public void addNewAccount(String passcode, Account newAccount){
        List<Account> tempList = bank.get(passcode); //makes a placeholder list to hold the list from the map
        if(tempList == null) { //If name is a new entry...
            tempList = new ArrayList<>(); //make a new instance of list
            bank.put(passcode, tempList); //and put the new empty list into the book attatched to a name
        }
        tempList.add(newAccount);//adds the account to the list attatched to the password.
    }

    //Method to close an account
    public void closeAccount(String password, Integer whichOne){
        List<Account>currentUserAccounts= bank.get(password);
        if(currentUserAccounts.get(whichOne).closeAccount()){
            currentUserAccounts.remove(whichOne);
        }
    }


    //Method to show list of available accounts under a passcode
    public void printAllAccounts(String password){
        List<Account>currentUserAccounts= bank.get(password);
        for(int i=0; i<currentUserAccounts.size();i++){
            System.out.println("Account #:"+i+" Type:"+currentUserAccounts.get(i).getAccountType());
            System.out.println("Balance-------->"+currentUserAccounts.get(i).getBalance());
        }
    }


    //Method to transfer funds between existing accounts
    public void transfer(String password, Integer accountGiving, Integer accountReceiving, Double cash){
        List<Account>currentUserAccounts= bank.get(password);
        currentUserAccounts.get(accountGiving).transfer(currentUserAccounts.get(accountReceiving),cash);
    }
}
