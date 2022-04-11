<%@ page import="com.example.Model.Student" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.LinkedList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% LinkedList<Student> studentList = (LinkedList<Student>) request.getAttribute("studentList");%>
<html>
<head>
    <title>Data</title>
    <link rel="stylesheet" href="CSS/main.css" type="text/css" media="all"/>
</head>
<body>

<div id="container">
    <jsp:include page="header.jsp"></jsp:include>
    <jsp:include page="menu.jsp"></jsp:include>
    <div id="content">
        <table id="studentTable">
            <caption> Student Data</caption>
            <thead>
            <tr>
                <th>Name</th>
                <th>Surname</th>
                <th>Address</th>
                <th>Phone</th>
            </tr>
            </thead>

            <tbody>
            <% for (Student student : studentList) { %>
            <tr>
                <td><%= student.getName() %>
                </td>
                <td><%= student.getSurname() %>
                </td>
                <td><%= student.getAddress() %>
                </td>
                <td><%= student.getPhone() %>
                </td>
            </tr>
            <% } %>
            </tbody>
        </table>
    </div>
    <jsp:include page="footer.jsp"></jsp:include>
</div>
</body>
</html>
<!--


-->