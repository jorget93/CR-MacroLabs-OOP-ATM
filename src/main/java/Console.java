import java.util.Scanner;

public class Console {

    public void greetingMessage(){
        System.out.println("Welcome!");
    }

    //Just to test!


    //Simple user Interface
    public void chooseAccount(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Which account would you like to access?");
        System.out.println("0 - Checking, 1 - Savings, 2 - Investing");

        int numIn = 0;
        if(userInput.hasNextInt() && userInput.nextInt() < 4){
            numIn = userInput.nextInt();
        }
        else {
            System.out.println("Please choose from the menu!");
        }

        switch (numIn){
            case 0:  {
                System.out.println("You have chosen Checking");
                break;
            }
            case 1:  {
                System.out.println("You have chosen Savings");
                break;
            }
            case 2:  {

                System.out.println("You have chosen Investing");
                break;
            }
        }
    }
}
