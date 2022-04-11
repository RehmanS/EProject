package com.example.DAO;

import com.example.Model.Student;
import java.util.LinkedList;

public interface StudentDao {

    LinkedList<Student> getStudentList() throws Exception;

}
