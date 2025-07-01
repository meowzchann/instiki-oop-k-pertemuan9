/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan.pkg9;

import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Ayu Sri Ratnasari
 * Tanggal : 17 Mei 2025
 * 
 */
public class Pertemuan9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            dbkoneksi dbk = new dbkoneksi();
            Statement stm = dbk.koneksi().createStatement();
            String sql = "SELECT * FROM datateman";
            ResultSet rs = stm.executeQuery(sql);
            
            while(rs.next()){
                System.out.println("Nama: "+rs.getString("namateman")+" | Alamat : "+rs.getString("alamat")+" | No telp: "+rs.getString("telp"));
            }
                    
        }catch(Exception err){
            System.out.println("Error akses data teman");
        }
    }
    
}
