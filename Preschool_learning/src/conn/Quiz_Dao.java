/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sandy
 */
public class Quiz_Dao {
    Connection con;
    PreparedStatement pst;
    ResultSet rst;
    
    public ArrayList getQuestion(String type){
        ArrayList al = new ArrayList();
        Quiz_Tao tao = null;
        try {
            con = ConnectionFactory.createConnectin();
            pst = con.prepareStatement("select * from question_tbl where type = ?");
            pst.setString(1, type);
            rst = pst.executeQuery();
            while (rst.next()) {                
               tao = new Quiz_Tao();
               tao.setQuestion(rst.getString(2));
               tao.setAns1(rst.getString(3));
               tao.setAns2(rst.getString(4));
               tao.setAns3(rst.getString(5));
               tao.setAns4(rst.getString(6));
               tao.setC_ans(rst.getString(7));
               tao.setAlt(rst.getString(8));
               al.add(tao);
               
            }
            return al;
        } catch (SQLException ex) {
            Logger.getLogger(Quiz_Dao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
