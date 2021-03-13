import java.math.BigInteger;
import java.util.Scanner;

public class Console {

    //added a comment

    public void greetingMessage(){
        System.out.println("Welcome!");
    }
    Scanner userInput = new Scanner(System.in);

    //Simple user Interface
    //Needs modification to only take in an integer
    public void chooseAccount(){

        System.out.println("Which account would you like to access?");
        System.out.println("1 - Checking, 2 - Savings, 3 - Investing");

        int numIn = 0;
        if(userInput.hasNextInt() && userInput.nextInt() < 4){
            numIn = userInput.nextInt();
        }
        else {
            System.out.println("Please choose from the menu!");
        }

        switch (numIn){
            case 1:  {
                System.out.println("You have chosen Checking");
                break;
            }
            case 2:  {
                System.out.println("You have chosen Savings");
                break;
            }
            case 3:  {

                System.out.println("You have chosen Investing");
                break;
            }
        }
    }

    public void depositOrWithdraw() {
        System.out.println("Would you like to deposit of withdraw funds?");
        System.out.println("1 - Deposit, 2 - Withdraw");

        int numIn = 0;

        switch (numIn) {
            case 1: {
                this.deposit();
                break;
            }
            case 2: {
                this.withdraw();
                break;
            }
            default: {
                System.out.println("Please choose from the menu!");
            }

        }
    }

    public void deposit() {

    }

    public void withdraw() {
        if (// input greater than account balance ask for new amount)
    }
}
