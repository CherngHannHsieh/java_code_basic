package com.xchedu.list_;

import java.util.LinkedList;

public class LinkedListCRUD {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println(linkedList);
        /*
        1. LinkedList linkedList = new LinkedList();
            public LinkedList(){}
        2.  此時 first,last = null
        3.  public boolean add(E e) {
                linkLast(e);
                return true;
            }
        4. 將新的節點，加到雙向鏈表的最後
           void linkLast(E e) {
                final Node<E> l = last;
                final Node<E> newNode = new Node<>(l, e, null);
                last = newNode;
                if (l == null)
                    first = newNode;
                else
                    l.next = newNode;
                size++;
                modCount++;
            }
        */

        linkedList.remove(); //默認刪除第一個
//        System.out.println(linkedList.remove());
        System.out.println(linkedList);
        /*
        1.  public E remove() {
                return removeFirst(); //刪除第一個
            }
        2.  public E removeFirst() {
                final Node<E> f = first; //指派當前first 給 f
                if (f == null)
                    throw new NoSuchElementException();
                return unlinkFirst(f); //這個才是刪除的動作
            }
        3.  private E unlinkFirst(Node<E> f) {
        // assert f == first && f != null;
                final E element = f.item;
                final Node<E> next = f.next;
                f.item = null;
                f.next = null; // help GC
                first = next;
                if (next == null)
                    last = null;
                else
                    next.prev = null;
                size--;
                modCount++;
                return element;
            }
        */

        linkedList.set(0,99);
        System.out.println(linkedList);
        /*
        1.  private void checkElementIndex(int index) {
                if (!isElementIndex(index))
                    throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
            }
        2.  Node<E> node(int index) {
        // assert isElementIndex(index);
                if (index < (size >> 1)) {
                    Node<E> x = first;
                    for (int i = 0; i < index; i++)
                        x = x.next;
                    return x;
                } else {
                    Node<E> x = last;
                    for (int i = size - 1; i > index; i--)
                        x = x.prev;
                    return x;
                }
            }
        3.  public E set(int index, E element) {
                checkElementIndex(index);
                Node<E> x = node(index);
                E oldVal = x.item;  //將舊的值給oldVal
                x.item = element;   //把新值給 x.item
                return oldVal;      //返回舊值
            }
        */

        Object o = linkedList.get(0);
        System.out.println(o);
        /*
        1.  public E get(int index) {
                checkElementIndex(index);
                return node(index).item;
            }
        2.
        3. 同 更改
        */
    }
}
