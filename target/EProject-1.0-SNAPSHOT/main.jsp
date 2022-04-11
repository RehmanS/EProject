<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Data</title>
    <link rel="stylesheet" href="CSS/main.css" type="text/css" media="all"/>
</head>
<body>
<form action="Userdata" method="post">
    <div id="container">
        <jsp:include page="header.jsp"></jsp:include>
        <jsp:include page="menu.jsp"></jsp:include>
        <div id="content">
            <table id="studentTable">
                <caption> Student Data</caption>
                <tr>
                    <th>Name</th>
                    <th>Surname</th>
                    <th>Address</th>
                    <th>Phone</th>
                </tr>

                <tr>
                    <td>Rehman</td>
                    <td>Sultanli</td>
                    <td>Qax</td>
                    <td>070-591-85-54</td>
                </tr>

            </table>
        </div>
        <jsp:include page="footer.jsp"></jsp:include>
    </div>

</form>
</body>
</html>
