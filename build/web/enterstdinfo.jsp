<%-- 
    Document   : enterstdinfo
    Created on : 9 Sep, 2015, 2:16:43 PM
    Author     : Tarequzzaman
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Enter info</title>
        <style>
            .header{
                background-color: #5EFB6E; 
                text-align: center;
                padding: 30px;
            }
            .into{
                 margin-top: 150px;
                text-align: center;
                color: brown;

            }            
        </style>
    </head>
    <body>
        <div class="header">
            <h1>Welcome to result Processing System</h1>
        </div>
        <div class="main">
            <div class="into">
             <h2>Enter information</h2>
            </div>
            <div class="data">
                <center>
                    <form  action="enterstdintodatabase.jsp">
                        <table>
                            <tr>
                                <td>

                                    <input type="text" name="std_name" placeholder="Student Name" style="width: 300px;height: 25px">
                                </td>               
                            </tr>
                            <tr>
                                <td>

                                    <input type="text" name="reg" placeholder="Registration Number" style="width: 300px;height: 25px">
                                </td>
                            </tr>
                            <tr>
                                <td>

                                    <input type="text" name="session" placeholder="Session" style="width: 300px;height: 25px">
                                </td>
                            </tr>
                        </table>
                         <div class="entering">
                <center> 
                    <input type="submit" value="Submit" style="padding: 3px; margin-top: 7px;">
                </center>
            </div>

                    </form>
                </center>
            </div>
           
        </div>
        <div class="footer">

        </div>
    </body>
</html>
