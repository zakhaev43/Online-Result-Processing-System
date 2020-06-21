<%-- 
    Document   : update_partB
    Created on : 21 Dec, 2015, 2:05:58 PM
    Author     : Tarequzzaman
--%>
<%@ page import="com.partB"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Student Info</title>

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

            <%

                String semester = request.getParameter("semester");
                String session_ = request.getParameter("session");
                out.println("<h3>" + "Session-" + session_ + "     Semester-" + semester + "</h3>");


            %>
            <div class="mainmanu">
                <center>
                    <div class="main1">
                        <form action="partB"  method="post">
                            <input type="hidden" name ="session" value= "<%=session_%>">
                            <input type="hidden" name ="semester" value="<%=semester%>">

                            <table>


                                <tr>
                                    <td>

                                        <input type="text" required name="paper_id" id="reg" placeholder="Paper Id" style="width: 300px;height: 25px">
                                        <span style="color:red;list-style:none;font-size:12px;font-weight:bold;"></span><br>
                                        <div>
                                            <span id ="b" style="color: red;"> </span>
                                        </div>
                                    </td>
                                </tr>                
                                <tr>
                                    <td>

                                        <input type="text" required name="marks" id="marks" placeholder="Marks" style="width: 300px;height: 25px">
                                        <span style="color:red;list-style:none;font-size:12px;font-weight:bold;"></span><br>
                                        <div>
                                            <span id ="c" style="color: red;"> </span>
                                        </div>
                                    </td>
                                </tr>

                            </table>
                            <div class="entering">
                                <center> 
                                    <input type="submit" value="Submit" style="padding: 3px; margin-top: 7px; ">
                                </center>
                            </div>      


                        </form>
                    </div>
                </center>

            </div>
            <%@ page import="java.io.*,java.util.*" %>
            <%
                Calendar calendar = new GregorianCalendar();
                int year = calendar.get(Calendar.YEAR);

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
