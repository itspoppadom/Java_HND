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
    public void readBankCard(){
        System.out.println("Verifying account details");
    }
    public void printReceipt(int amountDispensed, String bankAccount){
        System.out.println("Thank you for your transaction. \n Amount: "+amountDispensed+"\n Bank Account: "+bankAccount );
    }
    public void
}
