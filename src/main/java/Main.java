import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {
    AtmEngine atmEngine = new AtmEngine();
    Scanner userInput = new Scanner(System.in);
    String pin = "";

    public static void main(String[] args) {
        // build instance of AtmEngine and call that in the
        // instance in the console methods
        Console consoleOut = new Console();
        consoleOut.greetingMessage();
        consoleOut.customerPortal();
        consoleOut.chooseAccount();
        consoleOut.accountActions();

    }

    public void newCustomer() {

        System.out.println("What type of account would you like to open?");
        String accountType = userInput.nextLine();
        System.out.println("What is your initial deposit?");
        Double initialDeposit = userInput.nextDouble();
        userInput.nextLine();
        System.out.println("Choose a 4 digit PIN?");
        String pin = userInput.nextLine();
        this.pin = pin;

        Account account = new Account(initialDeposit,accountType);
        atmEngine.addNewAccount(pin, account);

        atmEngine.printAllAccounts(pin);
    }

    public void depositMade() {
        System.out.print("Amount to be deposited: ");
        Double amount = userInput.nextDouble();
        atmEngine.depositCash(this.pin, 0, amount);
        atmEngine.printAllAccounts(pin);
    }

    public void withdrawMade() {
        System.out.print("Amount to be withdrawn: ");
        Double amount = userInput.nextDouble();
        atmEngine.withdrawCash(pin, 0, amount);
        atmEngine.printAllAccounts(pin);
    }

    public void transferMade() {
        System.out.println("Pull funds from?");
        Integer accountFrom = userInput.nextInt();
        System.out.println("Move funds to?");
        Integer accountTo = userInput.nextInt();
        System.out.println("Amount to be transferred?");
        Double amount = userInput.nextDouble();

        atmEngine.transfer(this.pin, accountFrom, accountTo, amount);

    }

    public void additionalAccount() {

    }
}
