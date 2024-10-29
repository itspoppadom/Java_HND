public class HumanUser extends BankBranch {
    private String usersName;
    private String bankCard;
    private String pinNum;

    public HumanUser(String checkingAccount, String savingAccount, String branchID, String usersName, String bankCard, String pinNum) {
        super(checkingAccount,savingAccount, branchID);
        this.usersName = usersName;
        this.bankCard = bankCard;
        this.pinNum = pinNum;
    }
    public String getUsersName() {
        return usersName;
    }
    public void setUsersName(String usersName) {
        this.usersName = usersName;
    }
    public String getBankCard() {
        return bankCard;
    }
    public void setBankCard(String bankCard) {
        this.bankCard = bankCard;
    }
    public String getPinNum() {
        return pinNum;
    }
    public void setPinNum(String pinNum) {
        this.pinNum = pinNum;
    }
    @Override
    public void accountBalance(){
       System.out.println("Human Account Balance");
    };
    public void withdrawFunds(double amount){
        System.out.println("You're withdrawing the following amount: "+amount);

    }
    public void depositFunds(double amount){
        System.out.println("You're away to deposit the following amount: "+amount);
    }
    public void transferFunds(double amount){
        System.out.println("You're away to transfer the following amount: "+amount);

    }

}
