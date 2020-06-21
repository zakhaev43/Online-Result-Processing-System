<%-- 
    Document   : updatestdinfo
    Created on : 9 Sep, 2015, 9:52:56 PM
    Author     : Tarequzzaman
--%>
<%@ page import="com.update_registration"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Student Info</title>
        <script>
            function myfunction()
            {
                var   xx = document.getElementById("x").value;
                if(xx==0|| xx==null)
                    {
                        document.getElementById("a").innerHTML="Fill the Textfild by a Registration number";
                        return false;
                    }
                    
                var length= xx.length;
                if(length!=10)
                    {
                         document.getElementById("a").innerHTML="Invalid Registration Number";
                        return false;
                    }
                 for(var i =0;i<length;i++)
                  {
                         if(xx[i]>='0'&& xx[i]<=9)
                         {
                             
                         }
                         else{
                              document.getElementById("a").innerHTML="Invalid Charecter use,Plsease Use Correct Registration Number";
                             return false;
                         }
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
                        <form action="update_registration" onsubmit="return myfunction()" method="post">
                             <input type="text" name="updatereg" id="x" placeholder="Registration Number" style="width:300px;height: 25px;color: darkcyan; font-size: 15px ;"><br>
                              
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
