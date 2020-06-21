<%-- 
    Document   : view_as_theory_lab_absent
    Created on : 29 Dec, 2015, 10:54:18 AM
    Author     : Tarequzzaman
--%>

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
                height: 300px;
           

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
            .footer{
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
                <center>
                    <div class="main1">
                        <ul>
                            <li> <a href="enter_session_semester_for_view_whole_theory_result.jsp">Theory</a></li>                          
                            <li><a href="enter_session_semester_for_view_whole_lab_result.jsp">Lab</a></li>
                            <li><a href="enter_session_semester_for_view_whole_absent_result.jsp">Absent</a></li>
                        </ul> 
                    </div>
                </center>

            </div>
             <%@ page import="java.io.*,java.util.*" %>
            <%
            Calendar calendar = new GregorianCalendar();
            int year=calendar.get(Calendar.YEAR);
            %>
            <div class="footer">

                Copyright &COPY <%=year%> 
            </div>
        </div>

    </body>

</html>
