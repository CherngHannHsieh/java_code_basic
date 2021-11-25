package com.xchedu.interface_;

public class MySQL implements DBInterface{
    @Override
    public void connect() {
        System.out.println("MySQL connect...");
    }

    @Override
    public void close() {
        System.out.println("MySQL close...");
    }
}
