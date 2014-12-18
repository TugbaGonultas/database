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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TUGBA
 */
public class Listele {
    PreparedStatement ps;
    ResultSet rs=null;
    private String k_no;
    private String ad;

    public PreparedStatement getPs() {
        return ps;
    }

    public void setPs(PreparedStatement ps) {
        this.ps = ps;
    }

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
    
          public ArrayList<Listele> list(){
        veritabani_baglanti vb=new veritabani_baglanti();
        vb.baglan();
        
        ArrayList<Listele> liste=new ArrayList<>();
        
        try{
            String sorgu1="select *from kategoriler";
            ps=vb.con.prepareStatement(sorgu1);
            rs=ps.executeQuery();
            while(rs.next()){
                Listele e=new Listele();
                e.setK_no(rs.getString(1));
                e.setAd(rs.getString(2));
                
                liste.add(e);
            }
            
        
        }catch(Exception ex){
            
        }
        return liste;
            }
    
}
