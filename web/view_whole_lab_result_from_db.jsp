<%-- 
    Document   : view_whole_lab_result_from_db
    Created on : 29 Dec, 2015, 11:01:13 AM
    Author     : Tarequzzaman
--%>

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
        
        <%
        String semester = request.getParameter("semester");
        String session_ = request.getParameter("session");

%>
        <div class ="main">
            <div class="header">

                <h1>Welcome to result Processing System</h1>
            </div>
            <div>
                <center>
                    <h2>Lab result</h2>
                    <h2>Session : <%=session_%>    Semester :<%=semester%> </h2>
                
                </center>
            </div>
            <div class="mainmanu">
                <center>

                    <%@ page import ="java.sql.*" %>  
                    <%
                        try {

                            Class.forName("oracle.jdbc.driver.OracleDriver");
                            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "pro", "sec");
                            Statement st = con.createStatement();

                            String sql = "select registration_no,course_id,marks_lab from Lab  where semester="+semester+" and session_='"+session_+"' order by course_id";
                            ResultSet rs;
                            rs = st.executeQuery(sql);
                    %>
                    <table border="2px" padding="2px">
                        <tr>

                            <th>Registration No</th>                           
                            <th>Course ID</th>
                            
                            <th>Marks</th>

                        </tr>

                        <%
                            while (rs.next()) {
                        %>
                        <tr>
                            <%

                                long reg = rs.getInt(1);
                                out.println("<td>" + reg + "</td>");

                                String course_id = rs.getString(2);
                                out.println("<td>" + course_id + "</td>");

                                float marks= rs.getFloat(3);
                                out.println("<td>" + marks + "</td>");

                              
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

        </div>

    </body>
</html>
