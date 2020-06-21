<%-- 
    Document   : result_published
    Created on : 11 Feb, 2016, 12:43:35 AM
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
         <link href="css/bootstrap.min.css" rel="stylesheet">
         <link href="css/style.css" rel="stylesheet">
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
                        <li> <a href="enter_new_published_result.jsp">Enter New For public View</a></li>
                        <li><a href="enter_for_delete_published.jsp">Delete Public View</a></li>
                         <li><a href="view_result_published.jsp">View</a></li>
                    </ul> 
                </div>
                    </center>

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

