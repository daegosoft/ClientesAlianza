package com.services.vo;

import java.math.BigDecimal;
import java.util.Date;

public class Cliente {
    
    private String sharedKey;
    private String bussinesID;
    private String email;
    private double phone;
    private Date dateAdd;
    
    public Cliente(){
    }
    
    public Cliente(String sharedKey, String bussinesID, String email, double phone, Date dateAdd){
        this.sharedKey = sharedKey;
        this.bussinesID = bussinesID;
        this.email = email;
        this.phone = phone;
        this.dateAdd = dateAdd;
    }
    
    public String getSharedKey() {
        return sharedKey;
    }

    public void setSharedKey(String sharedKey) {
        this.sharedKey = sharedKey;
    }

    public String getBussinesID() {
        return bussinesID;
    }

    public void setBussinesID(String bussinesID) {
        this.bussinesID = bussinesID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getPhone() {
        return phone;
    }

    public void setPhone(double phone) {
        this.phone = phone;
    }

    public Date getDateAdd() {
        return dateAdd;
    }

    public void setDateAdd(Date dateAdd) {
        this.dateAdd = dateAdd;
    }

    @Override
    public String toString() {
        return "Cliente{" + "sharedKey=" + sharedKey + ", bussinesID=" + bussinesID + ", email=" + email + ", phone=" + phone + ", dateAdd=" + dateAdd + '}';
    }
    
    
}
