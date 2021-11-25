package com.xchedu.houserent.view;

import com.xchedu.houserent.domain.House;
import com.xchedu.houserent.service.HouseService;

import java.util.Scanner;

public class HouseView {

    private boolean loop = true;
    private char key = ' ';
    Scanner myScanner = new Scanner(System.in);
    private HouseService houseService = new HouseService(2); // 可儲存房屋資料大小


    //主菜單
    public void mainMenu() {
        do {
            System.out.println("\n--------房屋出租系統-------");
            System.out.println("\t\t1 新 增 房 屋");
            System.out.println("\t\t2 查 找 房 屋");
            System.out.println("\t\t3 刪 除 房 屋 訊 息");
            System.out.println("\t\t4 修 改 房 屋 訊 息");
            System.out.println("\t\t5 房 屋 列 表");
            System.out.println("\t\t6 退       出");

            System.out.print("請輸入選項(1~6) : ");
            key = myScanner.next().charAt(0);

            switch (key) {
                case '1':
                    addHouse();
                    break;
                case '2':
                    searchHouse();
                    break;
                case '3':
                    delHouse();
                    break;
                case '4':
                    modifyHouse();
                    break;
                case '5':
                    listHouse();
                    break;
                case '6':
                    logout();
                    break;
            }
        } while (loop);
    }

    //取得房屋資料
    public void listHouse() {
        System.out.println("\n--------房屋列表-------");
        System.out.println("編號\t房主\t電話\t\t\t\t地址\t\t月租\t\t狀態");
        //取得房屋資料
        House[] houses = houseService.list();
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] == null) {
                break;
            }
            System.out.println(houses[i]);
        }
    }

    //新增房屋
    public void addHouse() {
        System.out.println("\n--------新增房屋-------");
        System.out.print("姓名 : ");
        String name = myScanner.next();
        System.out.print("電話 : ");
        String phone = myScanner.next();
        System.out.print("地址 : ");
        String address = myScanner.next();
        System.out.print("月租 : ");
        int rent = myScanner.nextInt();
        System.out.print("狀態 : ");
        String state = myScanner.next();
        //創建一個新的House物件
        House house = new House(0, name, phone, address, rent, state);
        if (houseService.add(house)) {
            System.out.println("--------新增成功-------");
        } else {
            System.out.println("--------新增失敗-------");
        }
    }

    //delHouse() 接收用戶要刪除的id，調用HouseService的方法
    public void delHouse() {
        String del = " "; //接收是否要刪除的回覆(y/n)

        System.out.println("\n--------刪除房屋資料-------");
        System.out.print("請輸入要刪除的房屋編號(-1退出刪除系統) : ");
        int readId = myScanner.nextInt();
        if (readId == -1) {
            System.out.println("--------退出房屋刪除-------");
            return; //退出方法
        }

        while (true) {
            System.out.print("請確認是否要刪除，請小心選擇(Y/N)");
            del = myScanner.next();
            del = del.toUpperCase(); //將用戶輸入改成大寫
            if ("Y".equals(del) || "N".equals(del)) {
                break;
            }
        }

        if ("Y".equals(del)) { //真的刪除，調用HouseService 的 del()方法
            if (houseService.del(readId)) {
                System.out.println("--------刪除房屋資料成功-------");
            } else {
                System.out.println("--------房屋編號不存在，刪除資料失敗-------");
            }
        } else {
            System.out.println("--------退出房屋刪除-------");
            return; //退出方法即可
        }
    }

    //退出房屋系統
    public void logout() {
        String confirm = " ";
        while (true) {
            System.out.print("\n是否要退出系統(y/n) : ");
            confirm = myScanner.next();
            confirm = confirm.toUpperCase();
            if ("Y".equals(confirm) || "N".equals(confirm)) {
                break;
            }
        }
        if ("Y".equals(confirm)) {
            System.out.println("成功退出系統");
            loop = false;
        } else {
            System.out.println("返回房屋系統");
            return;
        }
    }

    //查找房屋資料  ，調用 serach()
    public void searchHouse() {
        int serach = 0;

        System.out.println("\n--------查詢房屋資料-------");
        System.out.print("請輸入房屋編號(-1退出查詢): ");
        serach = myScanner.nextInt();
        if (serach == -1) {
            System.out.println("--------退出房屋查詢-------");
            return;
        }
        House searHouse = houseService.search(serach);
        if (searHouse != null) {
            System.out.println("編號\t房主\t電話\t\t\t\t地址\t\t月租\t\t狀態");
            System.out.println(searHouse);
        } else {
            System.out.println("房屋編號不存在");
        }
    }

    //修改房屋資料
    public void modifyHouse() {
        int mod = 0;
        System.out.println("\n--------修改房屋資料-------");
        System.out.println("請輸入要修改的房屋編號(-1退出修改) : ");
        mod = myScanner.nextInt();
        if (mod == -1) {
            System.out.println("--------退出房屋修改-------");
            return;
        }

        House house = houseService.search(mod);
        //調用先前寫好的查詢id是否存在
        if (house == null) {
            System.out.println("房屋編號不存在");
            return;
        }

        //若有資料 則house中有儲存該修改房屋的相關資料
        System.out.print("姓名(" + house.getName() + ") :");
        Scanner scanner = new Scanner(System.in);
        String changeNmae = scanner.nextLine();
        System.out.print("電話(" + house.getPhone() + ") :");
        Scanner scanner2 = new Scanner(System.in);
        String changePhone = scanner2.nextLine();
        System.out.print("地址(" + house.getAddress() + ") :");
        Scanner scanner3 = new Scanner(System.in);
        String changeAddress = scanner3.nextLine();
        System.out.print("月租(" + house.getRent() + ") :");
        Scanner scanner5 = new Scanner(System.in);
        String rent = scanner5.nextLine();
        Integer changeRent;
        if(rent.equals("")){
            changeRent = -1;
        }else{
            changeRent = Integer.parseInt(rent);
        }
        System.out.print("狀態(" + house.getState() + ") :");
        Scanner scanner4 = new Scanner(System.in);
        String changeState = scanner4.nextLine();
        if(!"".equals(changeNmae)){
            house.setName(changeNmae);
        }
        if(!"".equals(changePhone)){
            house.setPhone(changePhone);
        }
        if(!"".equals(changeAddress)){
            house.setAddress(changeAddress);
        }
        if(changeRent!=-1){
            house.setRent(changeRent);
        }
        if(!"".equals(changeState)){
            house.setState(changeState);
        }
        System.out.println("修改完成");
    }
}