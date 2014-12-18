/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package siniflar;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class veritabani_baglanti {
   
    
 
 public Connection con;
 private String url="jdbc:mysql://localhost:3306/";
 private String dbname="alisveris";
 private String driver="com.mysql.jdbc.Driver";
 private String userName="root";
 private String password="tugba";
   
    public void baglan() {
        
      
        try 
        {
            Class.forName(driver).newInstance();
            con = (Connection) DriverManager.getConnection(url+dbname,userName,password);
            JOptionPane.showMessageDialog(null, "BAĞLANTI BAŞARILI");
        } 
        catch (Exception ex) 
        {
            
            JOptionPane.showMessageDialog(null, "HATA  VAR!");

        }
   }
}
