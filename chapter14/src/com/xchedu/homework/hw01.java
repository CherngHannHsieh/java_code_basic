package com.xchedu.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class hw01 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new News("武漢肺炎確診數超過千萬人，中國當局不承認過失，遭美方究責"));
        arrayList.add(new News("釣魚在兜裡"));
        Collections.reverse(arrayList);
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            if(((News) next).getTitle().length() > 15){
                String sub = ((News) next).getTitle().substring(0,15);
                sub += "...";
                next = sub;
            }
            System.out.println(next);
        }
    }
}

class News{
    private String title;
    private String content;

    public News(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return title ;
    }
}
