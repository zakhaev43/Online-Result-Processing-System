<%-- 
    Document   : stdinfo
    Created on : 9 Sep, 2015, 1:31:36 PM
    Author     : Tarequzzaman
--%>

<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student Information of SEC </title>
        <style>
         .header{
                background-color: #5EFB6E; 
                text-align: center;
                padding: 30px;
            }
            .mainmanu{
                margin-top: 50px;

                text-align: center;
                align: center;
            }
            .main1{
                margin-top: 200px;
                 width: 300px;
                 height: 300px;
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
            table{
                border-collapse: collapse;
                text-align: center;
            }
            td{
                padding: 2px;
            }
            .print{
                text-align: center;
            }
            .no{
                margin-top: 40px;
               width:70px;
               height: 64px;
                background-image: url(image/print.png);
               
  
            }
            
        </style>
        <link rel="stylesheet" type="text/css" href="css/text.css"/>
        <script>
            function myfunction(){
                document.getElementById("x").style.display="none";
                window.print();
                document.getElementById("x").style.display="initial";
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
                    
                    
                     <%@ page import = "java.sql.*" %>  
            <%
                try {

                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "pro", "sec");
                    Statement st = con.createStatement();
                  
                    String sql = "select * from student order by count_std desc";
                    ResultSet rs = st.executeQuery(sql);
            %>
        <table border="2px" padding="2px">
            <tr>
                <th>Reg No. </th>
                <th>Student Name</th>               
                <th>Session</th>
                
            </tr>

            <%
                while (rs.next()) {
            %>
            <tr>
                <% 
                  long reg_no = rs.getInt(1);
                  out.println("<td>"+reg_no+"</td>");
                  String std_name = rs.getString(2);
                  out.println("<td>"+std_name+"</td>");  
                  String year = rs.getString(3);
                 out.println("<td>"+year+"</td>");
                %>
            </tr>

            <%    }
                } catch (Exception e) {
                    e.printStackTrace();
                    out.println(e);
                    out.println("<center><h2 style='color:#009933;'>Please enter data accurately<h2></center> ");
                }
            %>
        </table> 
                </center>

            </div>
            <div class="footer">


            </div>
        <FORM  >
            <div class="print">  
                  <INPUT TYPE="button"  class="no" id="x" onclick="myfunction()">
            </div>
        </FORM>
        </div>

    </body>
</html>
