<%-- 
    Document   : insertingstudentdata
    Created on : 16 Oct, 2015, 11:56:53 AM
    Author     : Tarequzzaman
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
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

                overflow:hidden; 

            }
            .main1 ul{

                margin: 0;
                padding:0;

                list-style:none;
            }
            .main1 ul li{

                float:left;
                border-left:1px solid #ddd;

            }
            .main1 ul li a{
                text-decoration: none;
                color:#000;
                background-color:bisque;
                display: block;
                padding: 10px 20px;
            }
            .main1 ul li a:hover{
                background-color: crimson;
            }
            .main1 ul li a:active {
                color: #0000FF;
            }

        </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Data update Page</title>

    </head>
    <body>
        <div class ="main">
            <div class="header">

                <h1>Welcome to result Processing System</h1>
            </div>
            <div class="mainmanu">
                <div class="main1">
                    <ul>
                        <li> <a href="index.jsp">Home</a></li>

                    </ul> 
                </div>

            </div>
            <%@ page import="java.io.*,java.util.*" %>
            <%
                Calendar calendar = new GregorianCalendar();
                int year1 = calendar.get(Calendar.YEAR);
            %>

            <%

                String student, father, mother, year;
                student = request.getParameter("std_name");
                if (student.compareTo("") == 0) {
            %>       
        
            <jsp:forward page="Errorpage.jsp"/>
            <%}
                year = request.getParameter("session");
                if (year.compareTo("") == 0) {
            %>
            <jsp:forward page="Errorpage.jsp"/>
            <%}
            %>
            <%

                String registration = request.getParameter("test");

            %>


            <%@ page import = "java.sql.*" %>  
            <%
                try {
                   // out.print("<p>-"+registration+"-</p>");
                      Class.forName("oracle.jdbc.driver.OracleDriver");
                    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "pro", "sec");
                    String sql = "update student set student_name='" + student + "', session_='"+year+"' where registration_no='"+registration+"'";
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


            <div class="footer">

                Copyright &COPY <%=year1%> 
            </div>
        </div>


    </body>

</html>
