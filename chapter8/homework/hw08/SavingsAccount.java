package com.homework.hw08;

public class SavingsAccount extends BankAccount{
    private int count = 3;

    public SavingsAccount(int balance) {
        super(balance);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public void deposit(int amount) {
        if(count > 0){
            super.deposit(amount);
            count--;
        }else{
            super.deposit(amount - 1);
        }
    }

    @Override
    public void withdraw(int amount) {
        if(count > 0){
            super.withdraw(amount);
            count--;
        }else{
            super.withdraw(amount + 1);
        }
    }

    public void earnMonthlyInterest(){ //統計上次的利息，重製次數
        count = 3;
        super.deposit(getBalance());
    }
}
