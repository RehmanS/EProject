<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
    <link rel="stylesheet" href="CSS/style.css" type="text/css" media="all"/>
</head>
<body>
<form action="Registration" method="post">
    <section class="w3l-mockup-form">
        <div class="container">

            <div class="workinghny-form-grid">
                <div class="main-mockup">
                    <div class="alert-close">
                        <span class="fa fa-close"></span>
                    </div>
                    <div class="w3l_form align-self">
                        <div class="left_grid_info">
                            <img src="Image/image2.svg" alt="">
                        </div>
                    </div>
                    <div class="content-wthree">
                        <h2>Register Now</h2>
                        <p>Lorem ipsum dolor sit amet consectetur adipisicing elit.</p>
                        <form action="" method="post">

                            <input type="text" class="name" name="fullName" placeholder="Enter your fullName" required>
                            <input type="email" class="email" name="email" placeholder="Enter your email" required>

                            <input type="password" class="password" name="password" placeholder="Enter Your password"
                                   required>
                            <button name="lr" class="btn" type="submit" value="register">Register</button>
                        </form>
                        <div class="social-icons">
                            <p>Have an account! <a href="index.jsp">Login</a></p>
                        </div>
                    </div>
                </div>
            </div>

        </div>
    </section>
</form>

</body>
</html>
