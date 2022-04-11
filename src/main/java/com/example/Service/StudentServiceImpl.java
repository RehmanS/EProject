package com.example.Service;

import com.example.DAO.StudentDao;
import com.example.Model.Student;

import java.util.LinkedList;

public class StudentServiceImpl implements StudentService {

    private StudentDao studentDao;

    public StudentServiceImpl(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public LinkedList<Student> getStudentList() throws Exception {
        return studentDao.getStudentList();
    }
}
