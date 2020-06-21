<%-- 
    Document   : view_whole_result
    Created on : 28 Dec, 2015, 7:44:01 PM
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
                    <h2>Theory Result  </h2>
                    <h2>Session : <%=session_%>  Semester :<%=semester%> </h2>
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

                            String sql = "select registration_no,course_id,marks_partA,marks_partB,marks_TT from partB full outer join partA using (course_id,registration_no,semester,session_) full outer join Termtest using (course_id,registration_no,semester,session_) where semester="+semester+" and session_='"+session_+"' order by course_id";
                            ResultSet rs;
                            rs = st.executeQuery(sql);
                    %>
                    <table border="2px" padding="2px">
                        <tr>

                            <th>Registration No</th>                           
                            <th>Course ID</th>
                            <th>Part A</th>
                            <th>Part B</th>
                            <th>Term test</th>
                            <th>Total</th>

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

                                float markpartA = rs.getFloat(3);
                                out.println("<td>" + markpartA + "</td>");

                                float markpartB = rs.getFloat(4);
                                out.println("<td>" + markpartB + "</td>");

                                float marktt = rs.getFloat(5);
                                out.println("<td>" + marktt + "</td>");

                                float total = markpartA + markpartB + marktt;
                                out.println("<td>" + total + "</td>");

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
