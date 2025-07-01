/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan.pkg9;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;


/**
 *
 * @author Ayu Sri Ratnasari
 * Tanggal : 17 Mei 2025
 * 
 */
public class dbkoneksi {
    static String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static String DB_URL = "jdbc:mysql://localhost/bukualamat";
    static String DB_USERS = "root";
    static String DB_PASS = "";
    static Connection konek;
   
    public Connection koneksi(){
        try{
            Class .forName(JDBC_DRIVER);
            return DriverManager.getConnection(DB_URL, DB_USERS, DB_PASS);
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Terjadi masalah koneksi database");
        }
        return null;
    }
    
}
