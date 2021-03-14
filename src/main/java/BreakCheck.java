import java.util.Random;
import java.util.Scanner;

public class BreakCheck {

    public String is123(){
        String newString = "";
        boolean redo = true;
        while(redo) {
            newString = Console.getStringInput("1 - Checking, 2 - Savings, 3 - Investing");
            switch(newString){
                case "1":
                    redo = false;
                    return "Checking";
                case "2":
                    redo = false;
                    return "Savings";
                case "3":
                    redo = false;
                    return "Investing";
                default: System.out.println("Please choose from the menu!");
            }
        }
        return null;
    }
    public Double isDouble(){
        String newString = Console.getStringInput("Enter amount:");
        Double result = 0.0;
        try {
            result =  Double.parseDouble(newString);
        } catch (NumberFormatException e) {
            System.out.println("Please enter valid amount!");
            return 0.0;
        }
        return result;
    }

    public String pinGenerator(){
        String newPin = "";
        Random randomInt = new Random();
        for(int i =8; i > 0; i--){
            newPin += String.valueOf(randomInt.nextInt(9)+1);
        }
        System.out.println("Your new pin is: " + newPin);
        return newPin;
    }
}
