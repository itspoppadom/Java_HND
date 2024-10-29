import java.util.Scanner;
public class DemoATM {

    public static void main(String[] args) {
        BankBranch bankUser = new HumanUser("7009813","18941345", "Rosehill","Dominic","4569891945831212", "1111");

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to our new ATM, please enter your card to login");
        String currentCheckingAccount = bankUser.getCheckingAccount();
        String currentSavingAccount = bankUser.getSavingAccount();




        System.out.println("Please enter your pin");
        String enterUserPin = scan.nextLine();
        if (enterUserPin != pinNum){
        bankUser.
        }

        bankUser.getCheckingAccount();
    }
}
