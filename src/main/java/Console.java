import java.util.Scanner;

public class Console {

    public void greetingMessage(){
        System.out.println("Welcome!");
    }
    Scanner userInput = new Scanner(System.in);
    //Just to testing!


    //Simple user Interface
    public void chooseAccount(){
        System.out.println("Which account would you like to access?");
        System.out.println("1 - Checking, 2 - Savings, 2 - Investing");

        String numIn = "";
        if(userInput.hasNextLine()){
            numIn = userInput.nextLine();
        }
        else {
            System.out.println("Please choose from the menu!");
        }

        switch (numIn){
            case "1":  {
                System.out.println("You have chosen Checking");
                break;
            }
            case "2":  {
                System.out.println("You have chosen Savings");
                break;
            }
            case "3":  {

                System.out.println("You have chosen Investing");
                break;
            }
        }
    }

    public void depositOrWithdraw() {
        System.out.println("Would you like to deposit of withdraw funds?");
        System.out.println("1 - Deposit, 2 - Withdraw, 3 - Transfer");

        String numIn = userInput.nextLine();
        switch (numIn) {
            case "1": {
                this.deposit();
                break;
            }
            case "2": {
                this.withdraw();
                break;
            }
            case "3": {
                this.transfer();
                break;
            }
            default: {
                System.out.println("Please choose from the menu!");
            }
        }
    }
    public void deposit() {
        System.out.println("Amount to be deposited? ");
        //receive input
        //parse to int
        //if not an int return message to try again
    }
    public void withdraw() {
        System.out.println("Amount to be withdrawn? ");
        if (// input greater than account balance ask for new amount)
    }

    public void transfer() {
        System.out.println("What account are you transferring FROM?");
        String accountFrom = userInput.nextLine();
        System.out.println("What account are you transferring TO?");
        String accountTo = userInput.nextLine();

        // include overdraw logic from withdraw for FROM account
        //

    }


}
