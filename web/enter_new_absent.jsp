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
            .drop_course{
                padding: 6px 98px;
            }
        </style>
        <script>
            
            function myfunction()
            {
                var data_true=0;
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
              
             
           
              
                var  course= document.getElementById("course").value;
                if(course=="1")
                {
                    document.getElementById("c").innerHTML="Please Select A course";
                    data_true=1;             
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
            <div class="data">
                <center>
                    <form  action="enter_new_absent_into_db.jsp" onsubmit="return myfunction()" method="post">
                        <%
                        String semester = request.getParameter("semester");
                        String session_ = request.getParameter("session");
                        session.setAttribute("semester", semester);
                        session.setAttribute("session", session_);
                        %>
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
                                    <select name="course_id" class="drop_course" id="course">
                                        <option value="1" selected>Course Name</option>
                                        <%@ page import = "java.sql.*" %>  
                                        <%

                                            try {

                                                Class.forName("oracle.jdbc.driver.OracleDriver");
                                                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "pro", "sec");
                                                Statement st = con.createStatement();
                                                String sql = "SELECT * FROM course order by course_id";
                                                ResultSet rs = st.executeQuery(sql);


                                        %>
                                        <%
                                            while (rs.next()) {
                                        %>
                                        <%
                                            String course_id = rs.getString(1);

                                            out.println("<option value=" + course_id + ">" + course_id + "</option>");

                                        %>
                                        <% }
                                        } catch (Exception e) {
                                        %>

                                        <%}
                                        %>

                                    </select>
                                    <span style="color:red;list-style:none;font-size:12px;font-weight:bold;"></span><br>
                                    <div>
                                        <span id ="c" style="color: red;"> </span>
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
