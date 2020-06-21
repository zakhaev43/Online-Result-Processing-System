<%-- 
    Document   : updatestdinfo
    Created on : 9 Sep, 2015, 9:52:56 PM
    Author     : Tarequzzaman
--%>
<%@ page import="com.firstServlet" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Student Info</title>
        <script>
            function myfunction()
            {
                var  paper_id = document.getElementById("x").value;
                if (paper_id==""|| paper_id==null){
                    document.getElementById("a").innerHTML="Please enter paper Id";
                    return false;
                }
                return true;
            }
        </script>
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
                        <form action="firstServlet" onsubmit="return myfunction()"  method="post">
                             <input type="text" name="paper_id" id="x" placeholder="Enter Paper ID" style="width:300px;height: 25px;color: darkcyan; font-size: 15px ;"><br>                             
                                        <span id ="a" style="color: red;"> </span><br>                      
                             <input type="submit" value="Submit" style="padding-top: 5px;padding-bottom: 5px;padding-right: 8px;padding-left: 8px;margin-top: 5px; ">
                        </form>
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
            <FORM>
<INPUT TYPE="button" onClick="window.print()" value="Print">
</FORM>
        </div>

    </body>
</html>
