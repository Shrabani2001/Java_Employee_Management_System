/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

/**
 *
 * @author shrna
 */
import java.sql.*;
public class ViewService {
    public static ResultSet getData(){
        try{
            Connection cn = repository.ConnectionDB.getConnectiondb();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("select * from user_table");
            return rs;
        }catch(Exception ee){
            ee.printStackTrace();
        }
        return null;
    }
    
    
}
