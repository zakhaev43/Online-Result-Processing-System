<%-- 
    Document   : profile
    Created on : 6 Feb, 2016, 5:01:13 PM
    Author     : Tarequzzaman
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/style.css" rel="stylesheet">
        <style>

        </style>
        <title><%=session.getAttribute("logger")%> </title>



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

                    <% String name = (String) session.getAttribute("logger");%>
                    <a href="templete_1.jsp" class="btn btn-info navbar-btn btn-sm navbar-right">Sign Out</a>
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
        <%
            String registration = (String) session.getAttribute("reg");

        %>
        <%@ page import = "java.sql.*" %>  
        <%
            String hometown = "", session_ = "", email = "";
            try {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "pro", "sec");
                Statement st = con.createStatement();
                String sql = "select hometown,email,session_ from logger_info where registration_no=" + registration + "";
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    hometown = rs.getString(1);

                    email = rs.getString(2);
                    session_ = rs.getString(3);
                }
            } catch (Exception e) {
            }
        %>
        <div class="col-lg-offset-2 col-lg-8">
            <div class="row image thumbnail">
                <div class="col-lg-9">
                    <h3><%=session.getAttribute("logger")%></h3>
                    <h5>Hometown : <%=hometown%></h5>
                    <h5>Registration No : <%=registration%></h5>
                    <h5>Session : <%=session_%></h5>
                    <h5>Email : <%=email%></h5>
                </div>
                <div class="col-lg-3">
                    <img src="picview.jsp?id=<%=registration%>" style="width:140px; height:140px"/>

                </div>
            </div> 
        </div>
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

