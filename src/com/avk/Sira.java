/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avk;

/**
 *
 * @author murat
 */
public class Sira {
    
    private String siraNo,kabinNo;

   
    
    public Sira(String siraNo,String kabinNo){
        this.kabinNo = kabinNo;
        this.siraNo = siraNo;
    }

    Sira(int bilgi, int kabinNo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
     public String getSiraNo() {
        return siraNo;
    }

    public void setSiraNo(String siraNo) {
        this.siraNo = siraNo;
    }

    public String getKabinNo() {
        return kabinNo;
    }

    public void setKabinNo(String kabinNo) {
        this.kabinNo = kabinNo;
    }
}
