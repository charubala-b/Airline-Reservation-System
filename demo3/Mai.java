package com.example.demo3;
import java.sql.Connection;
import java.sql.DriverManager;

public class Mai {
    public static void main(String[] args) {
        try {
            Connection obj = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "root@123");
            System.out.println(obj);
        }
        catch(Exception e){
            System.out.println(e);

        }
    }
}
