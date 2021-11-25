package com.xchedu.map_;

import java.util.HashMap;

public class HashMapSource {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("java",10);
        hashMap.put("php",10);
        hashMap.put("java",20);

        System.out.println(hashMap);
        /*
        1. 建構子初始化，HashMap$Node[] table = null
        public HashMap() {
            this.loadFactor = DEFAULT_LOAD_FACTOR(0.75); // all other fields defaulted
        }
        2. 執行 put ，調用hash(key)計算key 的 hash
        public V put(K key, V value) { ///key = java value = 10
            return putVal(hash(key), key, value, false, true);
        }
        3. 執行putVal
        final V putVal(int hash, K key, V value, boolean onlyIfAbsent,
                   boolean evict) {
            Node<K,V>[] tab; Node<K,V> p; int n, i; //輔助變數
            //如果底層table = null 或 length = 0，就擴容到16
            if ((tab = table) == null || (n = tab.length) == 0)
                n = (tab = resize()).length;
            //取出hash值對應的table索引位置的Node，如果為null，就直接把加入的k-v創建為一個Node放入
            if ((p = tab[i = (n - 1) & hash]) == null)
                tab[i] = newNode(hash, key, value, null);
            else {
                Node<K,V> e; K k; //輔助變數
                //如果table的索引位置的key 的hash值和新的key的hash值相同，並滿足( table現有的節點的key和準備加入的key是同一物件 || equals返回真 )。就認為不能加入新的value
                if (p.hash == hash &&
                    ((k = p.key) == key || (key != null && key.equals(k))))
                    e = p;
                //如果當前table的已有Node是紅黑樹，就按照紅黑樹方式處理
                else if (p instanceof TreeNode)
                    e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
                else {
                    //找到的節點後面是鏈表，循環比較
                    for (int binCount = 0; ; ++binCount) {
                        //如果整個鏈表沒有和他相同的，則加入到該鏈表的最後。加入後判斷該鏈表的各樹是否已達到8個，>=8就調用treeifyBin進行紅黑樹的轉換
                        if ((e = p.next) == null) {
                            p.next = newNode(hash, key, value, null);
                            if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
                                treeifyBin(tab, hash);
                            break;
                        }
                        if (e.hash == hash &&
                            ((k = e.key) == key || (key != null && key.equals(k))))
                            break;
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
            //每加一個Node,size++
            if (++size > threshold) //size > threshold ，就擴容
                resize();
            afterNodeInsertion(evict);
            return null;
        }
        */
    }
}
