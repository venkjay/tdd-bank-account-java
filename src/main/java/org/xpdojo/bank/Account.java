package org.xpdojo.bank;

public class Account {

    private String name;
    private int number;
    private double balance;


    public void deposit(int amount) {
        System.out.println("Amount "+amount+" deposited successfully");
        double newBalance = getBalance() + amount;
        setBalance(newBalance);
    }

    public void setBalance(double newBalance ) {
        this.balance = newBalance;
    }

    public double getBalance() {
        return this.balance;
    }
}
