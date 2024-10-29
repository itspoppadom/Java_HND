public class ATM extends BankBranch{
    public boolean logIn;
    public boolean logOut;
    public String bankAccount ;
    public ATM(String branchName, String checkingAccount,String savingAccount) {
        super(branchName, checkingAccount, savingAccount);
        this.logIn = false;
        this.logOut = logOut;
        logIn = false;
        logOut = true;

    }
    public boolean isLogIn(boolean logIn){
        return this.logIn==logIn;
    }
    public boolean isLogOut(boolean logOut){
        return this.logOut==logOut;
    }
    public void setLogIn(boolean logIn){
        this.logIn=logIn;
    }
    public void readBankCard(){
        System.out.println("Verifying account details");
    }
    public void printReceipt(int amountRequested, String bankAccount){
        System.out.println("Thank you for your transaction. \n Amount: "+amountRequested+"\n Bank Account: "+bankAccount );
    }
    public void dispenseCash(int amountRequested, String bankAccount){
        System.out.println("Dispensing Cash for "+bankAccount);

    }
    public void acceptsCashCheque(int amountRequested, String bankAccount){
        System.out.println("Please enter your cash or notes below "+bankAccount);
        System.out.println("Thank you for your deposit.");

    }
    public void calculateFunds(){
        System.out.println("Requesting balance from the bank, please wait..");
        System.out.println("Your balance is");
    }
}
