package ATMexercise;

public class ATM {
    private int balance;

    public ATM(int balance) {
        this.balance = balance;

    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int deposit(int amount) {
        return balance + amount;


    }
    public int withdraw(int amount) {
        return balance - amount;
    }
    public void printBalance() {
        System.out.println(getBalance());

    }
}