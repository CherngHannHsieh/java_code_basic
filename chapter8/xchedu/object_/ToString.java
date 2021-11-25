package com.xchedu.object_;

public class ToString {
    public static void main(String[] args) {
        Monster monster = new Monster("ghost", "eat", 1000);
        //未重寫toString() 使用Object的方法
        //輸出 包名+類名+@+16進制的hashcode
        System.out.println(monster.toString());
        //直接輸出對象 toString()被默認調用
        System.out.println(monster);
    }
}

class Monster{
    private String name;
    private String job;
    private double sal;

    public Monster(String name, String job, double sal) {
        this.name = name;
        this.job = job;
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", sal=" + sal +
                '}';
    }
}