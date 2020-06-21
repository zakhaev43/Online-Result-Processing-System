<%-- 
    Document   : enterstdinfo
    Created on : 9 Sep, 2015, 2:16:43 PM
    Author     : Tarequzzaman
--%>



<%@page import="java.sql.Connection"%>
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
            .drop_part{
                padding: 6px 120px;
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
                    document.getElementById("c").innerHTML="Please Select a course";
                       data_true=1;             
                }
                    
                var sem = document.getElementById("semester").value;
                if(sem=="0")
                {
                    document.getElementById("d").innerHTML="Please Select a Semester";
                       data_true=1;                  
                }
                var session = document.getElementById("session").value;
                var len= session.length;
                var i,cou=0,count=0;
                 var sp =0;
                if(session==""|| session==null)
                 {
                     document.getElementById("e").innerHTML="Enter a Session" ;
                        data_true=1;
                       
                 }
                 else{
                     
                    
                     for(i=0;i<len;i++)
                     {
                        if(sp==0 && session[i]>='0' && session[i]<='9')  
                         {
                             count++;   
                         }
                         else if(session[i]=='-')
                          {
                              sp=1;   
                          }
                          else if(sp==1 &&  session[i]>='0' && session[i]<='9' )
                           {
                                cou++;   
                           }
                           else
                           {
                                 document.getElementById("e").innerHTML="Formet 2012-2013 no space or other charecter"; 
                                 data_true=1;
                       
                            }
                     }
                     
                     if(count!=4 && cou!=4 && sp!=1)
                      {
                          document.getElementById("e").innerHTML="Enter Correct Session";  
                           data_true=1;
                       
                      }
                 }
                 
                  var part = document.getElementById("select").value ;
         
                if(part=="3")
                    {
                        document.getElementById("px").innerHTML="Please Select Part-A or Part-B" 
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
                    
                    <%
                   
                   String paper_id = (String)request.getAttribute("paper_id");
                  
                     %>
                   
                   <form  action="enter_updated_paper_info_into_db.jsp" onsubmit="return myfunction()">
                      
                          <input type="hidden" name="paper_id" value="<%=paper_id%>">
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

                                                String sql = "SELECT * FROM course where course_type='Theory'";
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
                                     
                                        <%     }
                                        %>
                                       
                                    </select>
                                    <span style="color:red;list-style:none;font-size:12px;font-weight:bold;"></span><br>
                                    <div>
                                        <span id ="c" style="color: red;"> </span>
                                    </div>
                                </td>
                            </tr>
                            
                            <tr>
                                <td> 
                                 
                                        <select name="part" class="drop_part" id ="select">
                                            <option value="3" selected>Select</option>
                                            <option value="A">Part-A</option>
                                            <option value="B">Part-B</option>
                                        </select>
                                     <span style="color:red;list-style:none;font-size:12px;font-weight:bold;"></span><br>
                                    <div>
                                        <span id ="px" style="color: red;"> </span>
                                    </div>
                                </td>
                            </tr>
                              <tr>
                                <td>

                                    <input type="text" name="session" placeholder="Session" id="session" style="width: 300px;height: 25px">
                                    <span style="color:red;list-style:none;font-size:12px;font-weight:bold;"></span><br>
                                    <div>
                                        <span id ="e" style="color: red;"> </span>
                                    </div>
                                </td>

                            </tr>

                            <tr>
                                <td>  
                                    <select name="semester" class="drop_sem" id="semester">
                                        <option value="0" selected>Semester</option>
                                        <%@ page import = "java.sql.*" %>  
                                        <%

                                            try {

                                                Class.forName("oracle.jdbc.driver.OracleDriver");
                                                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "pro", "sec");
                                                Statement st = con.createStatement();

                                                String sql = "SELECT * FROM semester order by semester_id";
                                                ResultSet rs = st.executeQuery(sql);


                                        %>
                                        <%
                                            while (rs.next()) {
                                        %>
                                        <%
                                            String semester = rs.getString(1);
                                            String semister_id = rs.getString(2);
                                            out.println("<option value=" + semister_id + ">" + semester + "</option>");

                                        %>
                                        <% }
                                        } catch (Exception e) {
                                        %>
                                       
                                        <%    }
                                        %>

                                    </select>
                                    <span style="color:red;list-style:none;font-size:12px;font-weight:bold;"></span><br>
                                    <div>
                                        <span id ="d" style="color: red;"> </span>
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
