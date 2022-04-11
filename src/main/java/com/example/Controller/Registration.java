package com.example.Controller;

import com.example.DAO.LoginDao;
import com.example.DAO.RegisterDao;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Registration")
public class Registration extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        PrintWriter pw = response.getWriter();
        String action = request.getParameter("lr");

        if (action.equalsIgnoreCase("login")) {
            String email = request.getParameter("email");
            String password = request.getParameter("password");

            try {
                boolean login = LoginDao.checkLoginData(email, password);

                if (login) {
                    response.sendRedirect("main.jsp");
                } else {
                    pw.write("Error");
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (action.equalsIgnoreCase("register")) {

            String firstName = request.getParameter("fullName");
            String code = request.getParameter("password");
            String email = request.getParameter("email");

            try {
                RegisterDao.register(firstName, code, email);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }

}