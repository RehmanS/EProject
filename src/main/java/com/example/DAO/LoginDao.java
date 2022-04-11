package com.example.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {
    public static boolean checkLoginData(String email, String password) throws Exception{
        String query = "Select * from users where email = ? and password = ?";
        try(Connection c = DBHelper.getConnection(); PreparedStatement ps = c.prepareStatement(query)){
            ps.setString(1,email);
            ps.setString(2,password);
            ResultSet rs = ps.executeQuery();

            if(rs.next()){
                return true;
            }
        }
        return false;
    }
}
