package com.xchedu.list_;

public class LinkedList01 {
    public static void main(String[] args) {
        //1.新增節點
        Node node1 = new Node("1jacky");
        Node node2 = new Node("2smith");
        Node node3 = new Node("3Wang");
        Node node4 = new Node("4anna");

        //2.給予連結
        //j -> s -> w
        node1.next = node2;
        node2.next = node3;
        //w -> s -> j
        node3.pre = node2;
        node2.pre = node1;

        Node first = node1;
        Node last = node3;

        //遍歷鏈表
        while(true){
            if(first == null){
                break;
            }
            System.out.println(first);
            first = first.next;
        }
        //反向遍歷
//        while(true){
//            if(last == null){
//                break;
//            }
//            System.out.println(last);
//            last = last.pre;
//        }

        //新增 node 4 到 node 2 後
        node2.next = node4;
        node3.pre = node4;
        node4.next = node3;
        node4.pre = node2;

        first = node1;
        while(true){
            if(first == null){
                break;
            }
            System.out.println(first);
            first = first.next;
        }

        //刪除 node 2
        node1.next = node2.next;
        node4.pre = node2.pre;

        first = node1;
        while(true){
            if(first == null){
                break;
            }
            System.out.println(first);
            first = first.next;
        }
    }
}

class Node{
    public Object item;  //儲存資料的地方
    public Node next;
    public Node pre;

    public Node(Object item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Node{" +
                "item=" + item +
                '}';
    }
}