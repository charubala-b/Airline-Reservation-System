package com.example.demo3;
import java.sql.Connection;
import java.sql.DriverManager;
public class DatabaseConnection {
    public Connection databaseLink;

    public Connection getDBConnection() {
        String databaseName="project";
        String databaseUser="root";
        String databasePassword="root@123";
        String url="jdbc:mysql://localhost:3306/"+databaseName;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            databaseLink=DriverManager.getConnection(url,databaseUser,databasePassword);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        return databaseLink;
    }


}
