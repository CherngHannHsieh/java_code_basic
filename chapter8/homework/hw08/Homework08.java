package com.homework.hw08;

public class Homework08 {
    public static void main(String[] args) {
//        CheckingAccount checkingAccount = new CheckingAccount(1000);
//        checkingAccount.deposit(100);
//        checkingAccount.withdraw(10);
//        System.out.println(checkingAccount.getBalance());
        SavingsAccount savingsAccount = new SavingsAccount(10000);
        savingsAccount.deposit(100);
        savingsAccount.deposit(200);
        savingsAccount.deposit(300);
        System.out.println(savingsAccount.getBalance());
        savingsAccount.deposit(400);
        System.out.println(savingsAccount.getBalance());
        savingsAccount.withdraw(100);
        savingsAccount.earnMonthlyInterest();
        System.out.println(savingsAccount.getBalance());
    }
}

class BankAccount{
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount){
        balance += amount;
    }

    public void withdraw(int amount){
        balance -= amount;
    }
}
