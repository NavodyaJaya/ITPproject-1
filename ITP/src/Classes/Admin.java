/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Shanika
 */
public class Admin extends Employee {
    
    //Creates the database connection
    Connection conn= dbConnect.connect();;
    PreparedStatement pst=null;
    
    //Creates a user onject
    User u1 = new User();
    
    public void adduser(String id, String uname, String pass, int p){
        
        u1.empId= id;
        u1.username = uname;
        u1.Password = pass;
        u1.priv_no = p;
        
        String q = "INSERT INTO user VALUES ('"+ u1.username +"', '"+ u1.Password +"', '"+ u1.priv_no +"', '"+ u1.empId +"')";
        
        try {
            pst = conn.prepareStatement(q);
            pst.execute();
            JOptionPane.showMessageDialog(null,"One user added to the database!");
            
        } catch (SQLException ex) {
            System.out.println("Error when adding to database! Please check connectivity.");
            
        }
        
    }
    
    public void deluser(){
        
    }
    
    public void searchuser(){
    
    }
    
    
}
