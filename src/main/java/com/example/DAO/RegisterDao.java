package com.example.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class RegisterDao {

    public static void register(String name, String password, String email) throws Exception {
        String query = "insert into users(fullname,email,password) values(?,?,?)";

        try (Connection c = DBHelper.getConnection(); PreparedStatement ps = c.prepareStatement(query)) {
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, password);
            ps.execute();
        }
    }
}
