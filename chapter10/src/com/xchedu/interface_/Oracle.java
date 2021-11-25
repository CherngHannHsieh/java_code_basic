package com.xchedu.interface_;

public class Oracle implements DBInterface{
    @Override
    public void connect() {
        System.out.println("Oracle connect...");
    }

    @Override
    public void close() {
        System.out.println("Oracle close");
    }
}
