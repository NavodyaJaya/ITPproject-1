/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Shanika
 */
public class User {
    
    public String username;
    public String Password;
    public int priv_no;
    public String empId;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return Password;
    }

    public int getPriv_no() {
        return priv_no;
    }
    
    public int getPriv_no(String us){
        
        String p = "SELECT (username) FROM user WHERE username=us";
        if(p.matches("Admin"))
            return 1;
        else if(p.matches("HR"))
            return 2;
        else if(p.matches("Finance"))
            return 3;
        else if(p.matches(""))
            return 4;
        else if(p.matches(""))
            return 5;
        else if(p.matches(""))
            return 6;
        else if(p.matches(""))
            return 7;
        else if(p.matches(""))
            return 8;
        else if(p.matches(""))
            return 9;
        else if(p.matches(""))
            return 10;
        else if(p.matches(""))
            return 11;
        else if(p.matches(""))
            return 12;
        else
            return 0;
        
        
    }

    public void setUsername(String username) {
        this.username = username;
    }

   
    
    public void login(){
    
    }
    
    public void logout(){
        
        
    } 
    
    //public boolean AuthUsers(String user, String pass){
        
        /*Connection conn = null;
        PreparedStatement pst = null;
        
        conn = dbConnect.connect();
        
        String q = "SELECT (username, password) FROM user WHERE usename=user AND passowrd=pass";
        
        //if
        */
    //}
}
