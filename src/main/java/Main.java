import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {
    AtmEngine atmEngine = new AtmEngine();
    BreakCheck newCheck = new BreakCheck();
    Scanner userInput = new Scanner(System.in);
    String pin = "";
    Integer currentAccount = 0;

    public static void main(String[] args) {
        // build instance of AtmEngine and call that in the
        // instance in the console methods
        Console consoleOut = new Console();
        consoleOut.greetingMessage();
        consoleOut.customerPortal();
        //consoleOut.chooseAccount();
        consoleOut.accountActions();
    }

    public void newCustomer() {

        System.out.println("What type of account would you like to open?");
        String accountType = newCheck.confirmIsNumber();
        System.out.println("What is your initial deposit?");
        Double initialDeposit = newCheck.isDouble();
        pin = newCheck.pinGenerator();
        if(atmEngine.userExists(pin)){
            pin = newCheck.pinGenerator();
        }
        System.out.println("Your new pin is: " + pin);
        Account account = new Account(initialDeposit,accountType);
        atmEngine.addNewAccount(pin, account);
        atmEngine.printAllAccounts(pin);
        currentAccount = 0;
    }

    public void getAccountSummary(){
        atmEngine.printAllAccounts(pin);
    }

    public void depositMade() {
        System.out.print("Amount to be deposited: ");
        Double amount = userInput.nextDouble();
        atmEngine.depositCash(this.pin, currentAccount, amount);
        atmEngine.printAllAccounts(pin);
    }

    public void withdrawMade() {
        System.out.print("Amount to be withdrawn: ");
        Double amount = userInput.nextDouble();
        atmEngine.withdrawCash(pin, currentAccount, amount);
        atmEngine.printAllAccounts(pin);
    }

    public void transferMade() {
        System.out.println("Pull funds from?");
        Integer accountFrom = userInput.nextInt();
        System.out.println("Move funds to?");
        Integer accountTo = userInput.nextInt();
        System.out.println("Amount to be transferred?");
        Double amount = userInput.nextDouble();

        atmEngine.transfer(this.pin, accountFrom - 1, accountTo - 1, amount);
    }

    public void chooseAccount() {
        atmEngine.printAllAccounts(pin);
        System.out.println("Choose an account:");
        Integer accountToAccess = userInput.nextInt();
        currentAccount = accountToAccess - 1;
    }

    public void additionalAccount() {
        System.out.println("What type of account would you like to add?");
        String additionalAccountType = newCheck.confirmIsNumber();;
        System.out.println("What is your initial deposit?");
        Double initialDeposit = newCheck.isDouble();
        Account account = new Account(initialDeposit,additionalAccountType);
        atmEngine.addNewAccount(pin, account);
        atmEngine.printAllAccounts(pin);
    }

    public void closeAccount() {
        atmEngine.printAllAccounts(pin);
        System.out.println("Which account would you like to close?");
        Integer accountToClose = userInput.nextInt();
        atmEngine.closeAccount(pin,accountToClose - 1);
        System.out.println("Account must be empty to close. Please make necessary transfer.\n");

    }

    public void returningCustomer() {
        System.out.println("Please enter your PIN: ");
        String returningPin = userInput.nextLine();
        pin = returningPin;
    }


}
