package com.homework.hw08;

public class CheckingAccount extends BankAccount{
    //每存提款一次，收1元手續費
    public CheckingAccount(int balance) {
        super(balance);
    }

    @Override
    public void deposit(int amount) {
        super.deposit(amount - 1);
    }

    @Override
    public void withdraw(int amount) {
        super.withdraw(amount + 1);
    }
}
