<%-- 
    Document   : stdinfo
    Created on : 9 Sep, 2015, 1:31:36 PM
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
         <link href="css/text.css" rel=" stylesheet" type="text/css" media="print">
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
                        <li> <a href="enterstdinfo.jsp">Enter New</a></li>
                        <li><a href="updatestdinfo.jsp">Update</a></li>
                         <li><a href="view_std_info.jsp">View</a></li>
                    </ul> 
                </div>
                    </center>

            </div>
            <div class="footer">


            </div>
        </div>

    </body>
</html>
