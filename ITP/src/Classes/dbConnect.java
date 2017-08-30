/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Shanika
 */
public class dbConnect {
    
    public static Connection connect(){
    
        Connection con = null;
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/smms", "root", "");
            
        }
        catch(Exception e){
        
            System.out.println("Database Connection failed!");
        }
        
        return con;
    }
}
