<%-- 
    Document   : view_course
    Created on : 30 Oct, 2015, 10:37:06 PM
    Author     : Tarequzzaman
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Course</title>
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
                margin-top: 150px;
                overflow:hidden; 
                margin-bottom: 200px;
            }
            #x{
                text-align: center;
            }
            .footer{
                text-align: center;
                margin-top: 150px;
            }
            .sub{
                align: center;
                margin-top: 100px;
            }
            table{
                border-collapse: collapse;
            }
            th{
                background-color: bisque;
            }
            tr{
                text-align: center;
            }
        </style>

    </head>
    <body>
        <div class ="main">
            <div class="header">

                <h1>Welcome to result Processing System</h1>
            </div>
            <div class="mainmanu">

                <div  class="sub" >
                    <center>
                        <table border="2px" padding="2px" >
                            <tr>
                                <th>Course Id</th>
                                <th>Course Name</th>
                                <th>Course Type</th>
                                <th>Credit</th>
                            </tr>
                            <%@page import="java.sql.*" %>
                            <%
                                try {
                                    Class.forName("oracle.jdbc.driver.OracleDriver");
                                    Connection con;
                                    Statement st;
                                    ResultSet rs;
                                    con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "pro", "sec");
                                    st = con.createStatement();
                                    String sql = "select * from course order by course_id";
                                    rs = st.executeQuery(sql);
                            %>
                            <%
                                while (rs.next()) {

                            %>
                            <tr>
                            <%
                            String course_id=rs.getString(1);
                            out.println("<td>"+course_id+"</td>");
                            String Course_Title=rs.getString(2);
                            out.println("<td>"+Course_Title+"</td>");
                            String course_type=rs.getString(3);
                            out.println("<td>"+course_type+"</td>");
                            String credit = rs.getString(4);
                            out.println("<td>"+credit+"</td>");
                            %>
                            <tr>
                            <%     }
                                } catch (Exception e) {
                                    out.println("Error occure");
                                }
                            %>
                        </table>
                    </center>
                </div>


            </div>
            <%@ page import="java.io.*,java.util.*" %>
            <%
                Calendar calendar = new GregorianCalendar();
                int year = calendar.get(Calendar.YEAR);
            %>
            <div class="footer">

                Copyright &COPY <%=year%> 
            </div>
        </div>

    </body>
</html>

