<%-- 
    Document   : update_course
    Created on : 30 Oct, 2015, 4:00:05 PM
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
            }
            
        </style>
            <script>
            function myfunction(){
              var   xx = document.getElementById("x").value;
              if(xx=="")
                  {
                     document.getElementById("a").innerHTML="Fill the blanks"; 
                     return false;
                  }
                  
               var len = xx.length;
               var i ,x ,cou=0;
               var num=0;
               var cha=0;
               var spa=0;
              for(i=0;i<len;i++)
              {
                x =  xx.charCodeAt(i)   
                if(x>=65 && x<=90 && num==0 && spa==0)
                {
                      
                }
                else if(x==45)
                  {   
                        cha =1;
                        spa=1;
                  }
                else if(x>=48 && x<=57 &&  spa==1 && cha==1)
                 {
                      num=1;  
                 }
                    
                else{
                    document.getElementById("a").innerHTML="Wrong formet!!! Example: CSE-501";
                   cou=1;
                }
              }
               if(cou==1)
                   {
                       return false;
                   }
                   else 
                       return true;
            }
        </script>
    </head>
    <body>
        <div class ="main">
            <div class="header">

                <h1>Welcome to result Processing System</h1>
            </div>
            <div class="mainmanu">
                <center>
                    <div class="main1">
                        <form action="enter_updated_course.jsp" onsubmit="return myfunction()">
                          
                            <input type="text" name="updatecourse" id="x" placeholder="Course ID" style="width:300px;height: 25px;color: darkcyan; font-size: 15px ;"><br>
                                  <span style="color:red;list-style:none;font-size:12px;font-weight:bold;"></span><br>
                                  <div>
                                        <span id ="a" style="color: red;"> </span>
                                  </div>
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
        </div>

    </body>
</html>

