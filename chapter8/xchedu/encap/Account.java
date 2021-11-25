package com.xchedu.encap;

public class Account {
    //為了封裝，全設為private
    private String name; // 2 - 4
    private double money; // >20
    private String password; // len = 6

    public Account() {
    }

    public Account(String name, double money, String password) {
        this.setName(name);
        this.setMoney(money);
        this.setPassword(password);
    }

    public void setName(String name) {
        if(name.length() >= 2 && name.length() <= 4){
            this.name = name;
        }else{
            System.out.println("名字長度錯誤，給予預設值");
            this.name = "白癡";
        }
    }

    public void setMoney(double money) {
        if(money > 20){
            this.money = money;
        }else{
            System.out.println("你個窮光蛋");
            this.money = 0;
        }
    }

    public void setPassword(String password) {
        if(password.length() == 6){
            this.password = password;
        }else {
            System.out.println("密碼長度錯誤，改為預設密碼");
            this.password = "000000";
        }
    }

    public String getName() {
        return name;
    }

    public double getMoney() {
        return money;
    }

    public String getPassword() {
        return password;
    }

    public void getInfo(){
        System.out.println(name + "\t" + money + "\t" + password);
    }
}
