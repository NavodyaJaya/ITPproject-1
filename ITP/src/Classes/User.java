/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Shanika
 */
public class User {
    
    public String username;
    public String Password;
    public int priv_no;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return Password;
    }

    public int getPriv_no() {
        return priv_no;
    }

    public void setUsername(String username) {
        this.username = username;
    }

   
    
    public void login(){
    
    }
    
    public void logout(){
        
        
    } 
    
    //public boolean AuthUsers(String user, String pass){
        
        //String q = "SELECT (username, password) FROM user WHERE usename=user AND passowrd=pass";
    //}
}
