package com.xchedu.interface_;

//相關檔案 DBInterface MySQL Oracle
public class Interface03 {
    public static void main(String[] args) {
        MySQL mySQL = new MySQL();
        Oracle oracle = new Oracle();
        connectDB(mySQL);
        connectDB(oracle);
    }

    public static void connectDB(DBInterface dbInterface){
        dbInterface.connect();
        dbInterface.close();
    }
}

