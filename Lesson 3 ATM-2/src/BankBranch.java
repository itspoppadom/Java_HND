public class BankBranch {
    private String branchID;
    private String checkingAccount;
    private String savingAccount;

    public BankBranch(String branchID, String checkingAccount, String savingAccount) {
        this.branchID = branchID;
        this.checkingAccount = checkingAccount;
        this.savingAccount = savingAccount;

    }

    public String getBranchName() {
        return branchID;

    }

    public void setBranchName(String branchID) {
        this.branchID = branchID;

    }

    public String getCheckingAccount() {
        return checkingAccount;
    }

    public void setCheckingAccount(String checkingAccount) {
        this.checkingAccount = checkingAccount;
    }

    public String getSavingAccount() {
        return savingAccount;
    }

    public void setSavingAccount(String savingAccount) {
        this.savingAccount = savingAccount;
    }

    public void MaintenanceAccount() {
        System.out.println("Maintenance Account");
    }
    public void accountBalance() {
        System.out.println("Account Balance");
    }
}