package com.example.DAO;

import com.example.Model.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

public class StudentDaoImpl implements StudentDao {

    @Override
    public LinkedList<Student> getStudentList() throws Exception {
        LinkedList<Student> studentList = new LinkedList<>();
        String query = "SELECT * FROM STUDENT WHERE status = 1";
        try (Connection con = DBHelper.getConnection(); PreparedStatement ps = con.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Student student = new Student();
                student.setName(rs.getString("name"));
                student.setSurname(rs.getString("surname"));
                student.setAge(rs.getInt("age"));
                student.setAddress(rs.getString("address"));
                student.setPhone(rs.getString("phone"));
                studentList.add(student);
            }
        }
        return studentList;
    }
}
