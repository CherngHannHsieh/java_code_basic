package com.xchedu.set_;

public class HashSetStructure {
    public static void main(String[] args) {
        //模擬HashSet底層 => HashMap
        //1. 創建一個陣列
        Node[] table = new Node[16];
        //2.創建節點
        Node john = new Node("john", null);

        table[2] = john;
        Node jacky = new Node("jacky", null);
        john.next = jacky;
        Node rose = new Node("Rose", null);
        jacky.next = rose;

        Node lucy = new Node("lucy", null);
        table[3] = lucy;
        System.out.println(table);
    }
}

class Node { //鏈表
    Object item;
    Node next;

    public Node(Object item, Node next) {
        this.item = item;
        this.next = next;
    }
}