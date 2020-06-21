<%-- 
    Document   : index
    Created on : 9 Sep, 2015, 1:03:26 PM
    Author     : Tarequzzaman
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

 <link href="css/bootstrap.min.css" rel="stylesheet">
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
        <link href="css/style.css" rel="stylesheet">
        
    </head>
    <body>
        <div class ="main">
            <div class="header">

                <h1>Welcome to result Processing System</h1>
            </div>
            <div class="mainmanu">
                <div class="main1">
                    <ul>
                        <li><a href="home.jsp">Back to Home</a></li>
                        <li> <a href="stdinfo.jsp">Student Information</a></li>
                        <li><a href="result_processing.jsp">Result Processing</a></li>
                        <li><a href="course.jsp">Course Curriculum</a></li>
                        <li><a href="result_published.jsp">Result Published</a></li>
                    </ul> 
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
                        <p class="text-muted">Copyright &COPY 2015 to <%=year%> </p>
                    </div>
                </div>

            </footer>
        </div>

    </body>
</html>
