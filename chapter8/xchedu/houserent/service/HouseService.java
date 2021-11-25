package com.xchedu.houserent.service;

import com.xchedu.houserent.domain.House;

import java.util.Scanner;

public class HouseService {

    private House[] houses; //保存房屋資料
    private int houseNum = 1; //目前有多少房屋資料
    private int idCounter = 1;// id 紀錄器

    //建構子
    public HouseService(int size){
        houses = new House[size];
        houses[0] = new House(1,"房屋","0909123456","信義區",50000,"未出租");
    }

    //新增房屋資料
    public boolean add(House newHouse){
        //判斷是否可以繼續新增
        if(houseNum == houses.length){
            System.out.println("已經滿了...");
            return false;
        }
        // 將輸入的房屋資訊添加到houses[]中，然後對houseNum進行++
        //將houses[houseNum++] 指向 newHouse 這個物件
        houses[houseNum++] = newHouse;
        //需要設計id自增長
        //此時 newHouse 與 houses[houseNum++] 是指向同一個物件
        newHouse.setId(++idCounter);
        return true;
    }

    //del() method，刪除一個房屋資訊
    public boolean del(int delId){
        //要先找到要刪除的房屋 id 所處在的 index
        int index = -1;
        for (int i = 0; i < houseNum; i++) {
            //循環所有房屋陣列，抓出與delId 一樣編碼的房屋資料
            if(delId == houses[i].getId()){
                index = i;
            }
        }
        if(index == -1){ //沒找到
            return false;
        }
        //刪除資料
        // 將後方的資料傳給前一個 若houseNum沒有 -1 ，會報錯
        for (int i = index; i < houseNum - 1 ; i++) {
            houses[i] = houses[i+1];
        }
        //將存有房屋資料的最後一個設置為 null
        houses[--houseNum] = null;
        return true;
    }

    //serach()
    public House search(int searchId){
        //判斷searchId存在與否

        for (int i = 0; i < houseNum; i++) {
            if(houses[i].getId() == searchId){
                return houses[i];
            }
        }
        return null;
    }

    //返回 House[] 給 房屋列表介面
    public House[] list(){
        return houses;
    }

    //修改
    public void change(int changeId){
        int index = -1;
        Scanner scanner = new Scanner(System.in);

        //判斷id 存在與否
        for (int i = 0; i < houseNum; i++) {
            if(houses[i].getId() == changeId){
                index = i;
            }
        }
        if(index == -1){
            System.out.println("房屋編號不存在");
            return;
        }
        //修改與顯示
        System.out.print( "姓名(" + houses[index].getName() + ") :");
        String changeNmae = scanner.nextLine();
        System.out.print( "電話(" + houses[index].getPhone() + ") :");
        String changePhone = scanner.nextLine();;
        System.out.print( "地址(" + houses[index].getAddress() + ") :");
        String changeAddress = scanner.nextLine();;
        System.out.print( "月租(" + houses[index].getRent() + ") :");
        Integer changeRent = scanner.nextInt();
        System.out.print( "狀態(" + houses[index].getState() + ") :");
        String changeState = scanner.nextLine();
        if(changeNmae!=null){
            houses[index].setName(changeNmae);
        }
        if(changePhone!=null){
            houses[index].setPhone(changePhone);
        }
        if(changeAddress!=null){
            houses[index].setAddress(changeAddress);
        }
        if(changeRent!=null){
            houses[index].setRent(changeRent);
        }
        if(changeState!=null){
            houses[index].setState(changeState);
        }
        System.out.println("修改完成");
    }
}
