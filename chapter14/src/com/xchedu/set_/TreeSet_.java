package com.xchedu.set_;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSet_ {
    public static void main(String[] args) {
        //1. 使用無參建構子創建Treeset，仍是無序的

//        TreeSet treeSet = new TreeSet();
        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                // 調用 String 的 compareTo進行字符串大小比較
//                return ((String) o1).compareTo((String) o2);
                // 長度由短到長
                return ((String) o1).length() - ((String) o2).length();
            }
        });
        treeSet.add("apple");
        treeSet.add("banana");
        treeSet.add("king");
        treeSet.add("dd");
        treeSet.add("aa");
        System.out.println(treeSet);

        /*
        1. 將傳入的比較器物件，賦給了TreeSet底層的TreeMap 屬性 comparator
        public TreeMap(Comparator<? super K> comparator) {
            this.comparator = comparator;
        }
        2. 比較時
        if (cpr != null) { // cpr = comparator 匿名內部類(物件)
            do {
                parent = t; //
                cmp = cpr.compare(key, t.key); //這裡的compare會是匿名內部類的copare =>動態綁定
                if (cmp < 0)
                    t = t.left;
                else if (cmp > 0)
                    t = t.right;
                else
                    return t.setValue(value); //會回傳舊的Value，但value = PRESENT(共享)，若改成比較長度，會變成不加入同樣字符串長度
            } while (t != null);
        }
        */
    }
}
