package com.xchedu.homework;

import java.util.HashSet;
import java.util.Objects;

public class hw06 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        person p1 = new person(1001, "aa");
        person p2 = new person(1002, "bb");
        hashSet.add(p1);
        hashSet.add(p2);
        System.out.println(hashSet);
        System.out.println(p1); //hash 35096
        p1.name = "cc";
        System.out.println(p1); //hash 35160
        System.out.println("--------------------------");
        System.out.println(hashSet.remove(p1));  //在remove前 改變name 但 hsah 仍為 35096
        System.out.println(hashSet);  // 2
        hashSet.add(new person(1001,"cc"));
//        System.out.println("--------------------------");
//        System.out.println();
//        System.out.println("--------------------------");
        System.out.println(hashSet);
        hashSet.add(new person(1001,"aa"));
        System.out.println(hashSet);
    }
}

class person{
    public int id;
    public String name;

    public person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        person person = (person) o;
        return id == person.id &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() { //根據id & name 去計算哈希值
        return Objects.hash(id, name);
//        return 10;
    }

    @Override
    public String toString() {
        return "person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}