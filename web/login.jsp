<%-- 
    Document   : login.jsp
    Created on : May 16, 2023, 2:09:26 PM
    Author     : minhhieu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" href="styles/login.css" />

    <link
      href="plugins/font-awesome-4.7.0/css/font-awesome.min.css"
      rel="stylesheet"
      type="text/css"
    />
    <link
    rel="shortcut icon"
    href="images/logo-title4.png"
    type="image/x-icon"
  />

    <title>Login Hot Food</title>
  </head>
  <body>
    <div class="container" id="container">
            <div class="form-container sign-up-container">
              <form action="login" method="post">
                <h1 style="margin-bottom: 10px; color: #3b3b4d">Create Account</h1>
                <div class="social-container">
      <!--            <a href="#" class="social"
                    ><i class="fa fa-facebook" aria-hidden="true"></i
                  ></a>-->
                  <a href="https://accounts.google.com/o/oauth2/auth?scope=email profile&redirect_uri=http://localhost:8080/Final_Project_SWE391/GoogleSignInServlet&response_type=code
                     &client_id=47980504396-boe53k1d63t9639n02bdob58ki3fnkjb.apps.googleusercontent.com&approval_prompt=force" class="social">
                      <i class="fa fa-google" aria-hidden="true"></i
                  ></a> 
                </div>
                <p>${status1}${status}</p>
                <span style="margin-bottom: 10px;">or use your email for registration</span>
                <input type="hidden" name="opption" value="register"/>
                <input type="text" value="${fullname}" name="fullname" placeholder="Full-Name" />
                <input type="text" name="username1" placeholder="Username" required/>
                <input type="password" name="password1" placeholder="New password" required/>
                <input type="email" name="email" placeholder="Email" required/>
                <input type="text" name="address" placeholder="Address" required/>
                <input type="tel" value="${phoneNum}" name="phone" placeholder="Phone number" required/>
                <button style="margin-top: 15px;">Sign Up</button>
              </form>
            </div>
      <div class="form-container sign-in-container">
        <form action="login" method="post">
          <h1 style="margin-bottom: 15px; color: #3b3b4d">Sign in</h1>
          <div class="social-container">
<!--            <a href="#" class="social"
              ><i class="fa fa-facebook" aria-hidden="true"></i
            ></a>-->
            <a href="https://accounts.google.com/o/oauth2/auth?scope=email profile&redirect_uri=http://localhost:8080/Final_Project_SWE391/GoogleSignInServlet&response_type=code
                     &client_id=47980504396-boe53k1d63t9639n02bdob58ki3fnkjb.apps.googleusercontent.com&approval_prompt=force" 
                class="social">
                <i class="fa fa-google" aria-hidden="true"></i
            ></a>
          </div>
          <span style="margin: 5px 0 20px 0;">or use your account</span>
          <p>${mess}${status}</p>
          <input type="hidden" name="opption" value="login"/>
          <input type="text" name="username" placeholder="Username or email address" required />
          <input type="password" name="password" placeholder="Password" required />
          <a href="#" style="margin: 30px 0">Forgot your password?</a>
          <button>Sign In</button>
        </form>
      </div>
      <div class="overlay-container">
        <div class="overlay">
          <div class="overlay-panel overlay-left">
              <h1 style="color: #1e1e27">Welcome <span>back</span></h1>
            <p>
              Quickly log in, to avoid hunger
            </p>
            <button class="ghost" id="signIn">Sign In</button>
          </div>
          <div class="overlay-panel overlay-right">
            <h1><a href="index.jsp">hot<span>food</span></a></h1>
            <p>Enter your personal information and start ordering our food</p>
            <button class="ghost" id="signUp">Sign Up</button>
          </div>
        </div>
      </div>
    </div>

    <script src="js/login.js"></script>
  </body>
</html>
