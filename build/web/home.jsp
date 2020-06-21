<%-- 
    Document   : home
    Created on : 13 Jan, 2016, 11:00:23 PM
    Author     : Tarequzzaman
--%>

<%@page import= "com.student_validity"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/style.css" rel="stylesheet">
        <title>Home</title>


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


                    <input type="hidden" class="btn btn-info navbar-btn btn-sm navbar-right">
                    <% if (session.getAttribute("logger") == null) {%>
                    <a href="login.jsp" class="btn btn-info navbar-btn btn-sm navbar-right">Sign In</a>
                    <%} else {%>
                    <a href="templete_1.jsp" class="btn btn-info navbar-btn btn-sm navbar-right">Sign Out</a>
                    <% String name = (String) session.getAttribute("logger");%>
                    <ul class="nav navbar-nav navbar-right" >

                        <li><a href="profile.jsp"><%=name%></a>  </li>
                    </ul>
                    <%}%>
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
        <div class="container-fluid">
            <div class="text-center">

                <div class="col-md-offset-2 col-md-8">
                    <div class="carousel slide" id="myCarosel">
                        <ol class="carousel-indicators">
                            <li data-target="#myCarosel" data-slide-to="0"></li>
                            <li data-target="#myCarosel" data-slide-to="1" class="active"></li>
                            <li data-target="#myCarosel" data-slide-to="2"></li>
                        </ol>
                        <div class="carousel-inner">
                            <div class="item active img-thumbnail">
                                <img src="image/1.jpg" alt="problem with loading ......" class="image-resposive">
                                <div class="carousel-caption">
                                    <h4>The beautiful Campus</h4>
                                </div>

                            </div>
                            <div class="item img-thumbnail">
                                <img src="image/2.jpg" alt="problem with loading ......" class="image-resposive">
                                <div class="carousel-caption">
                                    <h4>Shaheed Minar</h4>
                                </div>
                            </div>
                            <div class="item img-thumbnail">
                                <img src="image/3.JPG" alt="problem with loading ......" class="image-resposive">
                                <div class="carousel-caption">
                                    <h4>Boy's Hostel</h4>
                                </div>
                            </div>
                        </div>
                        <a class="carousel-control left" href="#myCarosel" data-slide="prev">

                            <span class="icon-prev"></span>
                        </a>
                        <a class="carousel-control right" href="#myCarosel" data-slide="next">

                            <span class="icon-next"></span>
                        </a>
                    </div>
                </div>  
            </div>
        </div>

        <div class="container">
            <hr>
            <div class="row">
                <div class="col-xs-1">
                    <a class="btn btn-success btn-lg"> <span class="glyphicon glyphicon-hand-right"> </span> </a>
                </div>
                <div class="col-xs-11">
                    <h2>Sylhet Engineering College</h2>
                </div>
            </div>
            <p>Sylhet Engineering College (SEC) established in the year 2007 under the School of Applied Sciences & Technology, Shahjalal University of Science and Technology, is best of its kind with a motto to produce the best in class engineers for the 21st century. As a divisional city of Bangladesh, Sylhet had no full fledged undergraduate level engineering institute. So the Government of Peoples Republic of Bangladesh has established Sylhet Engineering College as an engineering faculty section of Shahjalal University of Science and Technology. 

With a state-of-the-art facilities and a marvelous landscape of campus, Sylhet Engineering College has become an engineering educational hub of Bangladesh.The campus includes three large academic buildings, library and computer center, admin building, the principal's quarter, teachers and stuff quarters. There are two male students' dormitories and a female students' dormitory.

There are currently three departments offering B.Sc in Engineering degree , that includes:

- Department of Computer Science and Engineering
- Department of Electrical and Electronics Engineering
- Department of Civil Engineering

It is expected that, Sylhet Engineering College will be upgraded to a full-fledged public university and will be named Sylhet University of Engineering and Technology (SUET).</p>
        </div>       
        <footer class="footer">
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
