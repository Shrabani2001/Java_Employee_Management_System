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
public class LoginService {
    public static boolean validUser(String name,String password){
        try{
            Connection cn = repository.ConnectionDB.getConnectiondb();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("select * from User_table where name = '"+name+"'and password = '"+password+"'");
            while(rs.next()){
                return true;
            }        
        }catch(Exception se){
            se.printStackTrace();
        }
        return false;
    }
    
}
