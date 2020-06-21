<%-- 
    Document   : enterstdinfo
    Created on : 9 Sep, 2015, 2:16:43 PM
    Author     : Tarequzzaman
--%>



<%@ page import="com.termtest_update"%>
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
                margin-top: 100px;
                text-align: center;
                color: brown;

            }    
            .dropdown{
                padding: 6px 88px;
            }
            .drop_sem{
                padding: 6px 110px;
            }

            .drop_part{
                padding: 6px 120px;
            }
        </style>
        <script>
            
            function myfunction()
            {
                var data_true=0;
                
                
    var marks= document.getElementById("mark").value;
    if(marks=="" || marks==null)
        {
            document.getElementById("a").innerHTML="Enter marks between 0 to 30";
            data_true=1;
        }
                var reg = document.getElementById("reg").value;
                var length= reg.length;

                if(reg==""|| reg==null)
                {
                    document.getElementById("b").innerHTML="Fill the Textfild by a Registration number";
                    data_true=1;
                       
                }
                    
                else  if(length!=10)
                {
                    document.getElementById("b").innerHTML="Invalid Registration Number";
                    data_true=1;
                       
                }
                else{
                    for(var i =0;i<length;i++)
                    {
                        if(reg[i]>='0'&& reg[i]<=9)
                        {
                             
                        }
                        else
                        {
                            document.getElementById("b").innerHTML="Invalid Charecter use,Plsease Use Correct Registration Number";
                            data_true=1;
                       
                        }
                    }
                }
                    
               
               
                 
                
                if(data_true==0)
                {
                    return true;
                }
                else 
                {
                    return false;
                }
            }
        </script>
    </head>
    <body>
        <div class="header">
            <h1>Welcome to result Processing System</h1>
        </div>
        <div class="main">
            <div class="into">
                <h2>Enter information</h2>
            </div>

            <%
                String session_ = request.getParameter("session");
                String semester = request.getParameter("semester");
                String course_id = request.getParameter("course_id");
            %>
            <div class="data">
                <center>
                    <form  action="termtest_update" onsubmit="return myfunction()" method="post">
                        <input type="hidden" name="session" value="<%=session_%>">
                        <input type="hidden" name="semester" value="<%=semester%>">
                        <input type="hidden" name="course_id" value="<%=course_id%>">
                        <table>


                            <tr>
                                <td>
                                    <input type="text" name="registration" id="reg" placeholder="Registration no" style="width: 300px;height: 25px">
                                    <span style="color:red;list-style:none;font-size:12px;font-weight:bold;"></span><br>
                                    <div>
                                        <span id ="b" style="color: red;"> </span>
                                    </div>
                                </td>
                            </tr>

                            <tr>
                                <td>
                                    <input type="text" name="marks" id="mark" placeholder="Enter updated mark" style="width: 300px;height: 25px">
                                    <span style="color:red;list-style:none;font-size:12px;font-weight:bold;"></span><br>
                                    <div>
                                        <span id ="a" style="color: red;"> </span>
                                    </div>
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
