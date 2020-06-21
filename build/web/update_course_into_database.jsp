<%-- 
    Document   : course
    Created on : 29 Oct, 2015, 5:45:16 PM
    Author     : Tarequzzaman
--%>

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
                font-size: 17px;
                font-family: sans-serif;
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
                    String course_id , course_title, course_type;
                    float credit;
                    course_id = request.getParameter("course_id");
                    course_title = request.getParameter("course_title");            
                    course_type = request.getParameter("course_type");
                    credit = Float.parseFloat(request.getParameter("credit"));
                %>
                
                <%@ page import = "java.sql.*" %>  
            <%
                try {
                  // out.print(course_id);
                      Class.forName("oracle.jdbc.driver.OracleDriver");
                    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "pro", "sec");
                    String sql = "update course set course_title='"+course_title+"',course_type='"+course_type+"',credit="+credit+" where course_id='"+course_id+"'";
                     PreparedStatement ps = con.prepareStatement(sql);
                     ps.executeUpdate();
                    out.println("<center><h1> Data has been updated succesfully </h1></center>");


            %>



            <%

            } catch (Exception e) {
            %>
            <jsp:forward page="Errorpage.jsp"/>
            <%       }
            %>

            </div>
            <div class="footer">


            </div>
        </div>

    </body>
</html>
