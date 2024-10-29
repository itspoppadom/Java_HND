public abstract class BankBranch {
    private String branchName;
    private String checkingAccount;
    private String savingAccount;

    public BankBranch(String branchName, String checkingAccount, String savingAccount) {
        this.branchName = branchName;
        this.checkingAccount = checkingAccount;
        this.savingAccount = savingAccount;

    }

    public String getBranchName() {
        return branchName;

    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;

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