package ATM;

import java.util.Scanner;

public class Account {
    private double balance;

    Scanner sc = new Scanner(System.in);

    public Account(){
        this.balance = 0;
    }


    public void setBalance(double saving){
        this.balance = saving;

    }
    public double getBalance() {
        return this.balance;
    }

    public void showBalance(){
        System.out.println(this.balance);
    }

    public void withdraw(){
        System.out.println("Enter the amount to withdraw: " );
        double amount = sc.nextDouble();
        System.out.println("Withdraw amount : " + amount);
        System.out.println("The balance is : " + this.balance);
        if (amount < this.balance){
            this.balance -= amount;
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }
    public void deposit(){
        System.out.println("Enter the amount to deposit: " );
        double amount = sc.nextDouble();
        if (amount > 0){
            this.balance += amount;
        }
        else{
            System.out.println("Wrong deposit amount");
        }
    }
}
