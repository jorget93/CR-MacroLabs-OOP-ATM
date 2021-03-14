import java.util.Scanner;

public class Console {
    Main main = new Main();
    Scanner userInput = new Scanner(System.in);

    public void greetingMessage(){
        System.out.println("Welcome to a real financial institution! \n");
    }

    //Just to testing!

    // We will need a prompt to enter a PIN before anything else.
    // link to account object associated with pin in HashMap

    public static String getStringInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        String userInput = scanner.nextLine();
        return userInput;
    }

    public String customerPortal(/*String prompt*/) {
        System.out.println("Are you already an account holder at real financial institution?");
        System.out.println("1 - New Customer, 2 - Existing Customer");
        //getStringInput(prompt);
        String customerStatus = "";
        boolean invalidInput = true;
        while (invalidInput) {
            customerStatus = userInput.nextLine();
            switch (customerStatus) {
                case "1": {
                    main.newCustomer();
                    invalidInput = false;
                    break;
                }
                case "2": {
                    invalidInput = false;
                    break;
                }
                default: {
                    System.out.println("Please choose from the menu.");
                    break;
                }
            }
        }
        return customerStatus;
    }

    public void pinRequest() {
        System.out.print("please enter PIN: ");
        String pinNumber = userInput.nextLine();
        if (pinNumber.length() != 4) {
            System.out.println("enter a 4 digit pin.");
        } else if (pinNumber)
        //integer.valueof()
    }

    //Simple user Interface
    public String chooseAccount(){
        System.out.println("Which account would you like to access?");
        System.out.println("1 - Checking, 2 - Savings, 3 - Investing");


        String accountType = "";
        boolean invalidInput = true;
        while (invalidInput) {
            accountType = userInput.nextLine();
            switch (accountType) {
                case "1": {
                    System.out.println("You have chosen Checking");
                    // insert call to correct map key/value(account object)
                    invalidInput = false;
                    break;
                }
                case "2": {
                    System.out.println("You have chosen Savings");
                    // insert call to correct map key/value(account object)
                    invalidInput = false;
                    break;
                }
                case "3": {

                    System.out.println("You have chosen Investing");
                    // insert call to correct map key/value(account object)
                    invalidInput = false;
                    break;
                }
                default: {
                    System.out.println("Please choose from the menu.");
                    break;
                }
            }
        }
        return accountType;
    }
// this will expand to include transfer and other method calls
    public String depositOrWithdraw() {
        System.out.println("Would you like to deposit or withdraw funds?");
        System.out.println("1 - Deposit, 2 - Withdraw");

        String accountAction = "";
        boolean invalidInput = true;
        while (invalidInput) {
            accountAction = userInput.nextLine();
            switch (accountAction) {
                case "1": {
                    this.deposit();
                    break;
                }
                case "2": {
                    this.withdraw();
                    break;
                }
                default: {
                    System.out.println("Please choose from the menu.");
                    break;
                }
            }
        }
        return accountAction;
    }
    public void deposit() {
        System.out.print("Amount to be deposited: ");
        //receive input
        //parse to int
        //if not an int return message to try again
    }
    public void withdraw() {
        System.out.print("Amount to be withdrawn: ");
        //if ( input greater than account balance ask for new amount)
    }

    //DO A COMMENT

}
