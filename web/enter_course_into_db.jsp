<%-- 
    Document   : enter_course_into_db
    Created on : 7 Nov, 2015, 10:29:37 PM
    Author     : Tarequzzaman
--%>

<%@page import="oracle.net.aso.i"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="css/text.css"/>
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
                    String course_id = request.getParameter("course_id");
                    if (course_id == null || course_id == "") {
                %>
                <jsp:forward page="Errorpage.jsp"/>
                <%                   }
                    String course_name = request.getParameter("course_title");

                    if (course_name == null || course_name == "") {%>
                <jsp:forward page="Errorpage.jsp"/> 
                <% }
                    String course_type = request.getParameter("course_type");
                    if (course_type == null || course_type == "") {%>
                <jsp:forward page="Errorpage.jsp"/> 
                <% }
                    float credit = Float.parseFloat(request.getParameter("credit"));
                    if (credit == 0) {%>
                <jsp:forward page="Errorpage.jsp"/> 
                <% }
                %>
                <%@ page import = "java.sql.*" %>  
                <%
                    try {

                        Class.forName("oracle.jdbc.driver.OracleDriver");
                        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "pro", "sec");
                        Statement st = con.createStatement();
                        String sql = "insert into course(course_id,course_title,course_type,credit) values('" + course_id + "','" + course_name + "','" + course_type + "'," + credit + ")";
                        PreparedStatement ps = con.prepareStatement(sql);
                        ps.execute();
                        out.println("<center><h1> Data has been inserted succesfully </h1></center>");

                %>



                <%

                } catch (Exception e) {
                %>
                <jsp:forward page="Errorpage.jsp"/>
                <%                       }
                %>



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
