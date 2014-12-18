/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package siniflar;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author TUGBA
 */
public class Sil {
    PreparedStatement ps;
    private String k_no;

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
    
    public boolean KSil(Sil s){
        veritabani_baglanti vb=new veritabani_baglanti();
        vb.baglan();
        
        String sorgu="delete from kategoriler where k_no=?";
        try {
            ps=vb.con.prepareStatement(sorgu);
            ps.setString(1, s.getK_no());
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Sil.class.getName()).log(Level.SEVERE, null, ex);
        }
     
        return true;
    }
            
    
}
