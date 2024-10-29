public class HumanUser extends BankBranch {
    private String usersName;
    private String BankCard;
    private String PinNum;

    public HumanUser(String checkingAccount,String savingAccount,String branchName, String usersName, String BankCard, String PinNum) {
        super(checkingAccount,savingAccount, branchName);
        this.usersName = usersName;
        this.BankCard = BankCard;
        this.PinNum = PinNum;
    }
    public String getUsersName() {
        return usersName;
    }
    public void setUsersName(String usersName) {
        this.usersName = usersName;
    }
    public String getBankCard() {
        return BankCard;
    }
    public void setBankCard(String BankCard) {
        this.BankCard = BankCard;
    }
    public String getPinNum() {
        return PinNum;
    }
    public void setPinNum(String PinNum) {
        int randomNum  = (int) (Math.random()*10000);
        String pinNum = String.format("%06d",randomNum);
        this.PinNum = pinNum;
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
