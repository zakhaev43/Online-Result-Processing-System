<%-- 
    Document   : login
    Created on : 9 Jan, 2016, 12:09:05 AM
    Author     : Tarequzzaman
--%>
<%@page import= "com.login_validation"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="css/bootstrap.min.css" rel="stylesheet">
         <link href="css/style.css" rel="stylesheet">
        <title>Sign in</title>

        <script>
            function myfunction(){
                var data_true=0;
                var email= document.getElementById("Email").value;
                var password = document.getElementById("pass").value;
                if(email==null || email==""){
                    document.getElementById("b").innerHTML="Enter Email Id";
                    data_true=1;
                }
                var len = password.length;
                if(password==null || password=="")
                {
                    data_true=1;
                    document.getElementById("c").innerHTML="Required Password";
                }
               
                else if(len<8){
                    data_true=1;               
                    document.getElementById("c").innerHTML="Error Password";
                }
                if(data_true==1)
                {
                    return false;                    
                }
                else{
                    return true;
                }
                    
            }
        </script>
    </head>
    <body>
        <nav class="navbar navbar-inverse navbar-fixed-top" id="mynavbar">
            <div class="container-fluid">
                <div class="navbar-header">

                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navbar-collapse">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a href="home.jsp" class="navbar-brand">SEC</a>
                </div>

                <div class="collapse navbar-collapse" id="navbar-collapse">
                   

                  

                    <ul class="nav navbar-nav" >
                        <li><a href="home.jsp">Home</a>  </li>
                        <li><a href="#">Photo Gallary</a>  </li>
                        <li><a href="#">Student Profile</a>  </li>
                        <li><a href="templete.jsp">Result</a>  </li>
                        <li><a href="#">About us</a>  </li>
                        <li><a href="#">Contact</a>  </li>

                    </ul>

                </div>
            </div>
        </nav>
        <div class="jumbotron">
            <div class="container-fluid">

                <hr>
                <div class="row">
                    <div class="col-lg-12">
                        <div class="col-sm-1">
                            <div class="img-responsive">
                                <a href="templete.jsp"> <img src="image/bd_logo.png" /></a>
                            </div>  
                        </div>
                        <div class="col-sm-10">
                            <h1>Sylhet Engineering College</h1>
                        </div>
                    </div>
                </div>
            </div>

        </div>


        <section>

            <div class="container">
                <br>   
                <br>
                <br>  <br>
                <div class="col-lg-3">

                </div>

                <div class="col-lg-8">

                    <form action="login_validation" class="form-horizontal" onsubmit="return myfunction()" method="post">

                        <div class="form-group" id="e">
                            <label  for="Email" class="col-lg-2 control-label">Email</label>
                            <div class="col-lg-6">
                                <input type="Email" class="form-control" id="Email" placeholder="Enter Your Email" name="Email">
                            </div>
                            <span style="color:red;"></span><br>
                            <div class="col-lg-4">
                                <span id ="b" style="color: red;"> </span>
                            </div>
                        </div>

                        <div class="form-group" id="p">
                            <label  for="pass" class="col-lg-2 control-label">Password</label>
                            <div class="col-lg-6">
                                <input type="password" class="form-control" id="pass" placeholder="Enter Your Password" name="password">
                            </div>
                            <span style="color:red;"></span><br>
                            <div class="col-lg-4">
                                <span id ="c" style="color: red;"> </span>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-lg-6 col-lg-offset-2">
                                <button type="submit" class="btn btn-sm btn-info">Submit</button>                                
                                <a href="sign_up.jsp" class="btn btn-sm btn-info">Sign Up</a>
                                <a href="forgot_pass.jsp" class="danger">Forgot password</a>
                            </div>

                        </div>
                    </form>

                    <%
                        String s = (String) request.getAttribute("error");
                        String email=(String) request.getAttribute("email");
                        String pass=(String) request.getAttribute("pass");                      
                        if (s == null || s == "") {
                    %>
                
                    <% } else {
                    %>
                   
                    <script>
                        document.getElementById("e").className="form-group has-error";
                        document.getElementById("p").className="form-group has-error";
                        document.getElementById("Email").value="<%=email%>";
                        document.getElementById("pass").value="<%=pass%>";
                        document.getElementById("b").innerHTML="Invalid Email";
                        document.getElementById("c").innerHTML="Invalid Password";
                    </script>

                    <% }
                    %>
                </div>
            </div>

        </section>
 <footer class="footer ">
            <div class="text-center">
                <div class="container-fluid">
                    <%@ page import="java.io.*,java.util.*" %>
                    <%
                        Calendar calendar = new GregorianCalendar();
                        int year = calendar.get(Calendar.YEAR);
                    %>
                    <p class="text-muted">Copyright &COPY 2015 to <%=year%> <br>by Department Of CSE All rights reserved </p>
                </div>
            </div>
           
        </footer>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
    </body>
</html>

