<%-- 
    Document   : view_result_published
    Created on : 11 Feb, 2016, 2:02:59 AM
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
        <title>Published Result</title>


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
                         <%
                               String name1= (String) session.getAttribute("logger");
                            if (name1=="admin") {
                        %>
                        <li><a href="index.jsp">Result Processing</a>  </li>
                        <%}%>
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

        <diV class="text-center">

            <h3>These result  are published</h3>
        </div>
                <div class="col-lg-3"></div>
        <div class="col-lg-5">
            <table class="table table-bordered table-hover table-responsive text-center">
                <tr class="danger">
                    <th class="text-center">Session</th>
                    <th class="text-center">Semester</th>
                </tr>

                <%@ page import ="java.sql.*" %>  
                <%
                    try {

                        Class.forName("oracle.jdbc.driver.OracleDriver");
                        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "pro", "sec");
                        Statement st = con.createStatement();
                        String sql = "select * from result_published";
                        ResultSet rs = st.executeQuery(sql);
                %>



                <%
                    while (rs.next()) {
                %>
                <tr class="info">
                    <%
                       String ses= rs.getString(1);
                       int sem = rs.getInt(2);
                       out.println("<td>"+ses+"</td>");
                       out.println("<td>"+sem+"</td>");
                    %>
                </tr>

                <%    }
                    } catch (Exception e) {
                        e.printStackTrace();
                        out.println(e);
                      
                    }
                %>
            </table>
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

