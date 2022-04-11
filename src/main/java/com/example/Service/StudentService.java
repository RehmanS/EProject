package com.example.Service;

import com.example.Model.Student;
import java.util.LinkedList;

public interface StudentService {

    LinkedList<Student> getStudentList() throws Exception;

}
