<%-- 
    Document   : enter_lab_into_db
    Created on : 26 Dec, 2015, 4:35:27 PM
    Author     : Tarequzzaman
--%>

<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            .header{
                background-color: #5EFB6E; 
                text-align: center;
                padding: 30px;
            }
            .mainmanu{
                text-align: center;
                align: center;
            }
            .main1{


                margin-top: 200px;
                width: 300px;
                height: 200px;
                overflow:hidden; 

            }
            .main1 ul{

                margin: 0;
                padding:0;
                list-style:none;
            }
            .main1 ul li{

                float:none;
                border:2px solid #ddd;
            }
            .main1 ul li a{

                text-decoration: none;
                color:#000;
                display: block;
                padding: 10px 20px;
            }
            .main1 ul li a:hover{
                background-color: darkorange;
            }
        </style>
    </head>
    <body>
        <div class ="main">
            <div class="header">

                <h1>Welcome to result Processing System</h1>
            </div>
            <div class="mainmanu">
                <%
                    String session_ = (String) session.getAttribute("session");
                    String sem = (String) session.getAttribute("semester");
                    String course_id = (String) session.getAttribute("course_id");
                    int semester= Integer.parseInt(sem);
                    long registration_no = Long.parseLong(request.getParameter("registration"));
                    float marks = Float.parseFloat(request.getParameter("marks"));                 
                %>
                <%@ page import = "java.sql.*" %>  
                <%
                    try {

                        Class.forName("oracle.jdbc.driver.OracleDriver");
                        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "pro", "sec");
                        Statement st = con.createStatement();
                        String sql = "insert into Lab(registration_no,session_,semester,course_id,marks_lab,count_lab) values("+ registration_no + ",'" + session_ + "'," + semester + ",'" + course_id + "'," + marks + ",lab_tag.nextval)";
                        PreparedStatement ps = con.prepareStatement(sql);
                        ps.executeUpdate();
                        out.println("<center><h1> Data has been inserted succesfully </h1></center>");

                %>          
                <%

                } catch (Exception e) {
                    out.println(e);
                %>
               
                <% }
                %>

            </div>
            <div class="footer">


            </div>
        </div>

    </body>
</html>
