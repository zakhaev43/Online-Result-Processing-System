<%-- 
    Document   : forgot_pass
    Created on : 15 Jan, 2016, 12:06:54 PM
    Author     : Tarequzzaman
--%>

<%@page import= "email.sendemail" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="css/bootstrap.min.css" rel="stylesheet">
              <link href="css/style.css" rel="stylesheet">
        <title>Forgot Password</title>

        <script>
            function myfunction()
            {
                var data_true=0;
                var email=  document.getElementById("Email").value;
                if(email=="" || email==null)
                {
                    data_true=1;
                    document.getElementById("b").innerHTML="Enter your email ID";
                }
                
                if(data_true==0)
                {
                    return true;
                }
                else{
                    return false;
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
                    <input type="hidden" class="btn btn-info navbar-btn btn-sm navbar-right">


                    <a href="login.jsp" class="btn btn-info navbar-btn btn-sm navbar-right">Sign In</a>

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

                    <form action="sendemail" class="form-horizontal" onsubmit="return myfunction()" method="post">


                        <div class="form-group">
                            <div class="col-lg-8">
                                <input type="Email" class="form-control" id="Email" placeholder="Enter Your Email" name="Email">        
                                <div class="text-center">
                                <span id ="b" style="color: red;"> </span>
                                </div>
                               
                            </div>
                            <div class="col-lg-4">
                               
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-lg-8 col-lg-offset-3">
                                <button type="submit" class="btn btn-sm btn-info">Submit</button>                             
                            </div>

                        </div>
                        
                        <%
                          String em= (String) request.getAttribute("invalid");
                          if(em==null|| em=="")
                          {
                         %>
                        
                         <%
                          }else{
                          %>
                          <script>
                              document.getElementById("b").innerHTML="Invalid Email Please enter correct email";
                          </script>
                          <%
                          }
                         %>
                    </form>
                </div>
            </div>

        </section>

         <footer class="footer ">
            <div class="text-center">
                <div class="container">
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

