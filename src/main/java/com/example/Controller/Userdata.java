package com.example.Controller;

import com.example.DAO.StudentDao;
import com.example.DAO.StudentDaoImpl;
import com.example.Model.Student;
import com.example.Service.StudentService;
import com.example.Service.StudentServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.LinkedList;

@WebServlet("/Userdata")
public class Userdata extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {

            StudentDao studentDao = new StudentDaoImpl();
            StudentService studentService = new StudentServiceImpl(studentDao);

            LinkedList<Student> studentList = studentService.getStudentList();
            request.setAttribute("studentList", studentList);
            request.getRequestDispatcher("studentList.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
