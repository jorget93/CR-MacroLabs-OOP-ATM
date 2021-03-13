import java.math.BigInteger;
import java.util.Scanner;

public class Console {

    public void greetingMessage(){
        System.out.println("Welcome!");
    }


    //Simple user Interface
    //Needs modification to only take in an integer
    public void chooseAccount(){
        Scanner userInput = new Scanner(System.in);
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
}
