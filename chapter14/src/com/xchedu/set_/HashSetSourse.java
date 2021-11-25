package com.xchedu.set_;

import java.util.HashSet;

public class HashSetSourse {
    public static void main(String[] args) {
        //hashset底層是hashmap
        HashSet hashSet = new HashSet();
        hashSet.add("java");
        hashSet.add("hsp");
        hashSet.add("java");
        System.out.println(hashSet);
        /*
        1. 建構子
        public HashSet() {
            map = new HashMap<>(); //底層是HashMap
        }
        2.
        public boolean add(E e) { // e = java
            return map.put(e, PRESENT)==null;
            //if true,add
            //private static final Object PRESENT = new Object(); static => 共享
        }
        3. 執行put()，hash(key)得到key對應的hash值，算法 : h = key.hashCode()) ^ (h >>> 16)
        // key = java, value = PRESENT 共享
        public V put(K key, V value) {
            return putVal(hash(key), key, value, false, true);
        }
        4. 執行 putVal
        final V putVal(int hash, K key, V value, boolean onlyIfAbsent,
                   boolean evict) {
        Node<K,V>[] tab; Node<K,V> p; int n, i; //輔助變數
        //table 是 HashMap 的 Array，類型是Node[]。
        //當 table 為 null，或大小為 0 時，進行第一次擴容，擴到16
        if ((tab = table) == null || (n = tab.length) == 0)
            n = (tab = resize()).length;
        //根據key所計算的hash，去計算該key要存放在table的哪個索引值，並賦值給 p
        //判斷 p 是否為 null
        //若 p 為 null，表示還沒存放過元素，就建立Node(hash, key="java", value=PRESNET, null)，並將其放在 tab[i]
        if ((p = tab[i = (n - 1) & hash]) == null)
            tab[i] = newNode(hash, key, value, null);
        else {
            Node<K,V> e; K k; //輔助變數
            //若當前索引位置對應的鏈表的第一個元素與準備添加的key的hash值相同，且符合下述兩個條件之一
            //(1) p指向的key 和 準備加入的 key 是同一個對象
            //(2) key 不為 null ，且p指向的key equals 準備加入的 key
            //則不能加入
            if (p.hash == hash &&
                ((k = p.key) == key || (key != null && key.equals(k))))
                e = p;
            //判斷 p 是不是紅黑樹，是的話調用putTreeVal來進行添加
            else if (p instanceof TreeNode)
                e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
            else { // 如果table對應的位置已經是一個鏈表時，使用for loop 比較
                //無窮迴圈
                for (int binCount = 0; ; ++binCount) {
                //依序和鏈表的每一個元素比較，都不相同的話，加入到該鏈表的最後，並立即判斷該鏈表元素是否已達到8個節點，若>=8，調用treeifyBin()，將該鏈表轉成紅黑樹。 轉紅黑樹前，會先判斷是否符合條件
//                if (tab == null || (n = tab.length) < MIN_TREEIFY_CAPACITY) (static final int(64))
//                    resize();
                //條件成立，會先進行擴容，只有上面條件不符合才進行紅黑樹轉換
                    if ((e = p.next) == null) {
                        p.next = newNode(hash, key, value, null);
                        if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
                            treeifyBin(tab, hash);
                        break;
                    }
                    //依序和鏈表中元素進行比較，若一樣break
                    if (e.hash == hash &&
                        ((k = e.key) == key || (key != null && key.equals(k))))
                        break;
                    //兩個條件都不符合，將p往後移
                    p = e;
                }
            }
            if (e != null) { // existing mapping for key
                V oldValue = e.value;
                if (!onlyIfAbsent || oldValue == null)
                    e.value = value;
                afterNodeAccess(e);
                return oldValue;
            }
        }
        ++modCount;
        //每新增一個Node , size++
        if (++size > threshold)
            resize(); //擴容
        afterNodeInsertion(evict);
        return null;
    }
        */
    }
}
