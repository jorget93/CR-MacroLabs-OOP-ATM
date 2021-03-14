import java.util.Scanner;

public class Cases {
    Scanner userInput = new Scanner(System.in);
    AtmEngine engine = new AtmEngine();
    //////
    public void customerPortal() {
        System.out.println("What type of account would you like to open?");
        String accountType = userInput.nextLine();
        System.out.println("What is your initial deposit?");
        Double initialDeposit = userInput.nextDouble();
        System.out.println("Choose a 4 digit PIN?");
        String pin = userInput.nextLine();
        Account account = new Account(initialDeposit, accountType);
        engine.addNewAccount(pin, account);
    }
}
