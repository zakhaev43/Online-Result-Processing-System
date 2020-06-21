<%-- 
    Document   : show_to_update
    Created on : 9 Sep, 2015, 10:10:56 PM
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
            .into{
                 margin-top: 150px;
                margin-left: 490px;
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
                <h2>Edit information</h2>
            </div>
            <div class="data">
                <center>
                    <%
                     String reg = request.getParameter("updatereg");
                    
                     %>
                    <form action="update_student_data.jsp">
                        <input type="hidden" name="test" value="<%=reg%>">
                        <table>
                            <tr>
                                <td>
                                    <label>Student Name</label>
                                </td>
                                <td>
                                    <input type="text" name="std_name"  style="width: 300px; height: 25px">
                                </td>               
                            </tr>
                               <td>
                                    <label>Session</label>
                                </td>
                                <td>

                                    <input type="text" name="session"  style="width: 300px;height: 25px">
                                </td>
                            </tr>
                        </table>
                      <div class="entering">
                <center> 
                    <input type="submit" value="Submit" style="padding: 3px; margin-top: 7px; ">
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
