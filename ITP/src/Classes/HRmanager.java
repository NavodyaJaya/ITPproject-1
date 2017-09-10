/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

//import HR.AddEmployee;
import HR.AddCase;
import HR.AddLeave;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Shanika
 */
public class HRmanager extends Employee{
    
    //Creates the database connection
    Connection conn= dbConnect.connect();;
    PreparedStatement pst=null;
    
    //Creates an Employee object
    Employee e = new Employee();
    
    //Creates a case object
    discase c1 = new discase();
    
    //Creates a leave object
    leave l = new leave();
    
    
    public void addemp(String eid, String fn, String ln, String desg, String n, String dept, String add, String ph){
        e.Empid = eid;
        e.fname = fn;
        e.lname = ln;
        e.designation = desg;
        e.NIC = n;
        e.dep = dept;
        e.address = add;
        e.phone = ph;
        
        String sq = "INSERT INTO employee VALUES ('"+ e.Empid +"', '"+ e.fname +"', '"+ e.lname +"', '"+ e.designation +"', '"+ e.NIC +"', '"+ e.dep +"', '"+ e.address +"', '"+ e.phone +"')";
        
        try {
            pst = conn.prepareStatement(sq);
            pst.execute();
            JOptionPane.showMessageDialog(null,"One employee added to the database!");
            
        } catch (SQLException ex) {
            System.out.println("Error when adding to database! Please check connectivity.");
            
        }
    }
    
    public void delemp(String eid){
        e.Empid = eid;
        
        String sq = "DELETE FROM employee WHERE emp_id = '"+ e.Empid +"' ";
        
        try {
            pst = conn.prepareStatement(sq);
            pst.execute();
             JOptionPane.showMessageDialog(null,"One employee deleted from the database!");
            
        } catch (SQLException ex) {
           System.out.println("Error when accessing database! Please check connectivity.");
           
        }
    }
    
    public void updateemp(String eid, String fn, String ln, String desg, String n, String dept, String add, String ph){
        e.Empid = eid;
        e.fname = fn;
        e.lname = ln;
        e.designation = desg;
        e.NIC = n;
        e.dep = dept;
        e.address = add;
        e.phone = ph;
        
        String sq = "UPDATE employee SET emp_id = '"+ e.Empid +"', fname = '"+ e.fname +"', lname = '"+ e.lname +"', designation = '"+ e.designation +"', NIC = '"+ e.NIC +"', department = '"+ e.dep +"', address = '"+ e.address +"', phone_no = '"+ e.phone +"' WHERE emp_id = '"+ e.Empid +"' ";
        
        try {
            pst = conn.prepareStatement(sq);
            pst.execute();
            JOptionPane.showMessageDialog(null,"One employee was changed in the databse!");
            
        } catch (SQLException ex) {
            System.out.println("Error when adding to database! Please check connectivity.");
            
        }
    }
    
    public void searchemp(){
    
    }
    
    public void addleave(String eid, String sd, String ed, String lt, String wp, String r, int d){
        
        l.empID = eid;
        l.sdate = sd;
        l.edate = ed;
        l.type = lt;
        l.workplace = wp;
        l.reason = r;
        l.duration = d;
    
        String  q="INSERT INTO leave (start_date,end_date,type,workplace,reason,duration,emp_id) VALUES ('"+ l.sdate +"', '"+ l.edate +"', '"+ l.type +"', '"+ l.workplace +"', '"+ l.reason +"', '"+ l.duration +"', '"+ l.empID +"')";
        
        try {
            pst = conn.prepareStatement(q);
            pst.execute();
            JOptionPane.showMessageDialog(null,"One leave record added to the databse!");
        } catch (SQLException ex) {
            
            Logger.getLogger(AddLeave.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void delleave(){
    
    }
    
    public void searchleave(){
    
    }
    
    public void addcase(String eid, String cn, String n, String des, String cb, String co, String dept, String stat){
        
        c1.empID = eid;
        c1.casename = cn;
        c1.name = n;
        c1.desc = des;
        c1.createdby = cb;
        c1.createdon = co;
        c1.dep = dept;
        c1.status = stat;
        
        
        String q = "INSERT INTO case (case_id,case_name,emp_id,emp_name,description,createdby,createdon,dep,status) VALUES (0,'"+ c1.casename +"', '"+ c1.empID +"', '"+ c1.name +"', '"+ c1.desc +"', '"+ c1.createdby +"', '"+ c1.createdon +"','"+ c1.dep +"', '"+ c1.status +"')";
        
            try{
            pst = conn.prepareStatement(q);
            pst.execute();
            JOptionPane.showMessageDialog(null,"One case was changed in the databse!");
            }
            catch(SQLException e){
            Logger.getLogger(AddCase.class.getName()).log(Level.SEVERE, null, e);
            System.out.println("Error when adding to database! Please check connectivity.");
            }
    }
    
    public void viewcase(){
    
    }
    
    public void viewatt(){
    
    }
    
    public void addent(){
    
    }
    
    public void approveleave(String eid, int lid, String a){
    
        l.empID=eid;
        l.leaveID=lid;
        l.appr=a;
        
        if(l.appr=="Yes"){
            
            String sql = "INSERT INTO leave (approvement) VALUES ('"+ l.appr +"')";
            
            try{
            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null,"One leave approved!");
            }
            catch(SQLException e){
            Logger.getLogger(AddLeave.class.getName()).log(Level.SEVERE, null, e);
            System.out.println("Error when adding to database! Please check connectivity.");
            }
        }
        else{
            
            String sql = "INSERT INTO leave (approvement) VALUES ('"+ l.appr +"')";
            
            try{
            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null,"One leave Not approved!");
            }
            catch(SQLException e){
            Logger.getLogger(AddLeave.class.getName()).log(Level.SEVERE, null, e);
            System.out.println("Error when adding to database! Please check connectivity.");
            }
        }
        
    }
    
}
