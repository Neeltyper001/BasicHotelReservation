package com.databaseConnection;
import java.sql.DriverManager;
import java.sql.Connection;
import java.lang.ClassNotFoundException;
import java.sql.SQLException;

public class DatabaseConnection {
    private static String databaseName;
    private static String URL;
    private static String username;
    private static String password;
    private static Connection connection;
    public DatabaseConnection() {
        this.databaseName = "hotelreservation";
        this.URL = "jdbc:mysql://localhost:3306/"+databaseName;
        this.username = "root";
        this.password = "Neelesh@6172";


        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Drivers loaded successfully!!");
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        try{
            this.connection = DriverManager.getConnection(URL,username,password);
            System.out.println("Successfull connection with database!!!");
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    public Connection getConnection(){
        return connection;
    }

    public void closeConnection(){
        try{
          this.connection.close();
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
