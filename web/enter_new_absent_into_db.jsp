<%-- 
    Document   : course
    Created on : 29 Oct, 2015, 5:45:16 PM
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
    </head>
     <body>
        <div class ="main">
            <div class="header">

                <h1>Welcome to result Processing System</h1>
            </div>
            <div class="mainmanu">
                
                
                
                <%
                String sem =(String) session.getAttribute("semester");
                int semester= Integer.parseInt(sem);
                String session_= (String) session.getAttribute("session");
                
                %>
               <%
                
                  long registration_no = Long.parseLong(request.getParameter("registration"));
                  String course_id = request.getParameter("course_id");
                  
               %>
               
                <%@ page import = "java.sql.*" %>  
            <%
                try {

                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "pro", "sec");
                    Statement st = con.createStatement();
                    String sql = "insert into absent(registration_no,course_id,session_,semester)values("+registration_no+",'"+course_id+"','"+session_+"',"+semester+")";
                    PreparedStatement ps = con.prepareStatement(sql);
                    ps.execute();
                   out.println("<center><h1> Data has been inserted succesfully </h1></center>");
                    
            %>
   
             
            
            <%
        
                } catch (Exception e) {
                    out.println(e);
                    %>
                  
                   <%
                                      }
            %>

            </div>
            <div class="footer">


            </div>
        </div>

    </body>
</html>
