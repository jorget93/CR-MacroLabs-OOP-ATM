/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
        // build instance of AtmEngine and call that in the
        // instance in the console methods
        AtmEngine atmEngine = new AtmEngine();
        Console consoleOut = new Console();
        consoleOut.greetingMessage();
        consoleOut.customerPortal();
        consoleOut.chooseAccount();
        consoleOut.depositOrWithdraw();



    }
    //if customer portal returns 1
    // then it must asl for a new passcode and

    public void createNewAccount() {


    }
}
