/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package siniflar;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author TUGBA
 */
public class Ekle {
    

    PreparedStatement ps;
    
    private String k_no;
    private String ad;

    public String getK_no() {
        return k_no;
    }

    public void setK_no(String k_no) {
        this.k_no = k_no;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

   
    
    public boolean kategoriEkle(Ekle k_ekle){
        veritabani_baglanti vb=new veritabani_baglanti();
        vb.baglan();
        
        String sorgu="insert into kategoriler (k_no,ad) values (?,?)";
        try {
            ps=vb.con.prepareStatement(sorgu);
            
            ps.setString(1, k_ekle.getK_no());
            ps.setString(2, k_ekle.getAd());
                ps.execute();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "eklenmedi");
        }
    
        return true;
    }
     
    
}
