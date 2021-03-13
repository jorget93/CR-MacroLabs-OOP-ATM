import java.util.Scanner;

public class Console {
    Scanner userInput = new Scanner(System.in);

    public void greetingMessage(){
        System.out.println("Welcome to a real financial institution you can trust! \n");
    }

    //Just to testing!

    // We will need a prompt to enter a PIN before anything else.
    // link to account object associated with pin in HashMap
    public void pinRequestMenu() {
        System.out.print("Please enter your PIN: ");

        String input = "";
        boolean pinMenu = true;
        while (pinMenu) {
            input = userInput.nextLine();
            // actual conditional
            //if (user pin is one of the keys in the hash map) {link to those accounts and break}
            // below just for testing
            if (input == "1234") {
                pinMenu = false;
                break;
            }
            System.out.println("PIN not recognized. Please try again.");
        }
    }


    //Simple user Interface
    public void chooseAccount(){
        System.out.println("Which account would you like to access?");
        System.out.println("1 - Checking, 2 - Savings, 2 - Investing");


        String input = "";
        boolean accountSelection = true;
        while (accountSelection) {
            input = userInput.nextLine();
            switch (input) {
                case "1": {
                    System.out.println("You have chosen Checking");
                    // insert call to correct map key/value(account object)
                    accountSelection = false;
                    break;
                }
                case "2": {
                    System.out.println("You have chosen Savings");
                    // insert call to correct map key/value(account object)
                    accountSelection = false;
                    break;
                }
                case "3": {

                    System.out.println("You have chosen Investing");
                    // insert call to correct map key/value(account object)
                    accountSelection = false;
                    break;
                }
                default: {
                    System.out.println("Please choose from the menu.");
                    break;
                }
            }
        }




    }
// this will expand to include transfer and other method calls
    public void depositOrWithdraw() {
        System.out.println("Would you like to deposit or withdraw funds?");
        System.out.println("1 - Deposit, 2 - Withdraw");

        String input = "";
        boolean depositOrWithdrawMenu = true;
        while (depositOrWithdrawMenu) {
            input = userInput.nextLine();
            switch (input) {
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
