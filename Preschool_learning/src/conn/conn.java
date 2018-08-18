/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Sandy
 */
public class conn {
    
      Connection con;
   ResultSet rs;
   Statement stmt;
    
   public conn(String databasename) throws ClassNotFoundException,SQLException {
      
           
          Class.forName("com.mysql.jdbc.Driver");
       con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school_db","root","");
      System.out.println("1");
          // stmt=con.createStatement();
   }
   
   public ResultSet query(String SQL) throws SQLException{
   Statement stmt=con.createStatement();
   ResultSet result=stmt.executeQuery(SQL);
   return result;
   }
   
   
   
   public int Update(String SQL) throws SQLException{
    Statement stmt=con.createStatement();
    int done=stmt.executeUpdate(SQL);
   return done;
  }
   
   
   public int UpdateReturnID(String SQL)throws SQLException{
    Statement stmt=con.createStatement();
    int id=-1;
    stmt.executeUpdate(SQL,Statement.RETURN_GENERATED_KEYS);
    ResultSet result=stmt.getGeneratedKeys();
    if(result.next()){
   id=result.getInt(1);
   }
   return id;
  
   
   }
   
   
    
}
