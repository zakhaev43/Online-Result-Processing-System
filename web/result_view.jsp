<%-- 
    Document   : result_view
    Created on : 3 Jan, 2016, 1:55:40 PM
    Author     : Tarequzzaman
--%>

<%@page import="java.text.DecimalFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="css/bootstrap.min.css" rel="stylesheet">

        <title>Result View</title>


    </head>

    <%
        session.setAttribute("log", "logged");
    %>
    <body >
        <nav class="navbar navbar-inverse navbar-fixed-top" id="mynavbar">
            <div class="container-fluid">
                <div class="navbar-header">

                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navbar-collapse">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a href="home.jsp" class="navbar-brand">SEC</a>
                </div>

                <div class="collapse navbar-collapse" id="navbar-collapse">
                    <ul class="nav navbar-nav" >
                        <li><a href="#">Home</a>  </li>
                        <li><a href="#">Photo Gallary</a>  </li>
                        <li><a href="#">Student Profile</a>  </li>
                        <li><a href="templete.jsp">Result</a>  </li>
                        <li><a href="#">About us</a>  </li>
                        <li><a href="#">Contact</a>  </li>

                    </ul>
                </div>
            </div>
        </nav>
        <div class="jumbotron">
            <header>
                <div class="container-fluid">

                    <hr>
                    <div class="row">
                    <div class="col-lg-12">
                        <div class="col-sm-1">
                            <div class="img-responsive">
                                <a href="templete.jsp"> <img src="image/bd_logo.png" /></a>
                            </div>  
                        </div>
                        <div class="col-sm-10">
                            <h1>Sylhet Engineering College</h1>
                        </div>
                    </div>
                </div>
                </div>
            </header> 
        </div>
        <%
            String name = (String) request.getAttribute("name");
            String reg_no = (String) request.getAttribute("reg");
            String session_ = (String) request.getAttribute("session");
            String semest = (String) request.getParameter("semester");
            int semester = Integer.parseInt(semest);
        %>



        <section>
            <div class="container">
                <div class="col-lg-2">

                </div>

                <div class="col-lg-8">

                    <div class="row text-center">


                        <br>
                        <br>
                    </div>
                    <div class="raw">
                        <div>
                            <label>Name :<%=name%></label>
                        </div>
                        <div>
                            <label>Registration No : <%=reg_no%></label>
                        </div>
                        <div>
                            <label>Semester : <%=semester%></label>
                        </div>

                        <div>
                            <label >session : <%=session_%> </label> 
                        </div>
                    </div>

                    <div>
                        <table class="table table-bordered table-hover table-responsive text-center">
                            <tr class="info">
                                <th class="text-center">Subject</th>
                                <th class="text-center">GPA</th>
                            </tr>
                            <%
                                double total_credit = 0;
                                double marks_credit = 0;
                            %>
                            <%!
                                double gpacalculate(double marks) {
                                    double cra = 0;
                                    if (marks >= 80) {
                                        cra = 4.00;
                                    } else if (marks >= 75 && marks <= 79) {
                                        cra = 3.75;
                                    } else if (marks >= 70 && marks <= 74) {
                                        cra = 3.50;
                                    } else if (marks >= 65 && marks <= 69) {
                                        cra = 3.25;
                                    } else if (marks >= 60 && marks <= 64) {
                                        cra = 3.00;
                                    } else if (marks >= 55 && marks <= 59) {
                                        cra = 2.75;
                                    } else if (marks >= 50 && marks <= 54) {
                                        cra = 2.50;
                                    } else if (marks >= 45 && marks <= 49) {
                                        cra = 2.25;
                                    } else if (marks >= 40 && marks <= 44) {
                                        cra = 2.00;
                                    }
                                    return cra;
                                }
                            %>          
                            <%@ page import ="java.sql.*" %>  
                            <%
                                try {
                                 
                                    Class.forName("oracle.jdbc.driver.OracleDriver");
                                    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "pro", "sec");
                                    long registration_no = Long.parseLong(reg_no);
                                    ResultSet rs, rs1, rs2;
                                    String sql1, sql2, sql3;
                                    sql1 = "select  course_id,marks_TT,marks_partB,marks_partA ,credit from partB  join partA using (course_id,registration_no,semester,session_)  join Termtest using (course_id,registration_no,semester,session_) join course using (course_id)where semester=" + semester + " and session_='" + session_ + "' and registration_no=" + registration_no + " order by course_id";

                                    Statement st = con.createStatement();
                                    rs = st.executeQuery(sql1);
                                    while (rs.next()) {
                                        out.println("<tr>");
                                        String course_id = rs.getString(1);
                                        out.println("<td>" + course_id + "</td>");
                                        float markstt = rs.getFloat(2);
                                        float markspb = rs.getFloat(3);
                                        float markspa = rs.getFloat(4);
                                        double marks = markstt + markspa + markspb;
                                        
                                        double gpa;
                                        if (marks >= 40) {
                                            gpa = gpacalculate(marks);
                                            float credit = rs.getFloat(5);
                                            total_credit += credit;
                                            marks_credit += credit * gpa;

                                        } else {
                                            gpa = 0.00;
                                        }
                                        out.println("<td>" + gpa + "</td>");

                                        out.println("</tr>");
                                    }
                                    sql2 = "select course_id ,marks_lab ,credit from Lab join course using (course_id) where registration_no=" + registration_no + " and semester=" + semester + " and session_='" + session_ + "' order by course_id";
                                    rs = st.executeQuery(sql2);


                                    while (rs.next()) {
                                        out.println("<tr>");
                                        String course_id = rs.getString(1);
                                        out.println("<td>" + course_id + "</td>");

                                        float markslb = rs.getFloat(2);
                                        double marks = markslb;
                                        double gpa;
                                        if (marks >= 40) {
                                            gpa = gpacalculate(marks);
                                            float credit = rs.getFloat(3);
                                            total_credit += credit;
                                            marks_credit += credit * gpa;

                                        } else {
                                            gpa = 0.00;
                                        }
                                        out.println("<td>" + gpa + "</td>");

                                        out.println("</tr>");
                                    }

                                    sql3 = "select course_id from absent where registration_no=" + registration_no + " and semester=" + semester + " and session_='" + session_ + "'";

                                    while (rs.next()) {
                                        out.println("<tr>");
                                        String course_id = rs.getString(1);
                                        out.println("<td>" + course_id + "</td>");


                                        double gpa = 0.00;

                                        out.println("<td>" + gpa + "</td>");

                                        out.println("</tr>");
                                    }
                                } catch (Exception e) {
                                    out.println("" + e);
                            %>

                            <%   }
                            %>
                            <tr class="active">

                                <td>CGPA </td>
                                <%
                                    double gpa = marks_credit / total_credit;
                                    DecimalFormat df = new DecimalFormat("#.##");
                                    df.format(gpa);
                                     
                                  
                                    out.println("<td>" +  df.format(gpa) + "</td>");

                                %>
                            </tr>

                            <tr class="info">

                                <td>Total CGPA </td>



                                <%
                                    semester = semester - 1;
                                    while (semester > 0) {


                                        try {

                                            Class.forName("oracle.jdbc.driver.OracleDriver");
                                            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "pro", "sec");
                                            long registration_no = Long.parseLong(reg_no);
                                            ResultSet rs;
                                            Statement st = con.createStatement();
                                            String sql = "select  course_id,marks_TT,marks_partB,marks_partA ,credit from partB  join partA using (course_id,registration_no,semester,session_)  join Termtest using (course_id,registration_no,semester,session_) join course using (course_id)where semester=" + semester + " and session_='" + session_ + "' and registration_no=" + registration_no + " order by course_id";
                                            rs = st.executeQuery(sql);
                                            while (rs.next()) {

                                                String course_id = rs.getString(1);

                                                float markstt = rs.getFloat(2);
                                                float markspb = rs.getFloat(3);
                                                float markspa = rs.getFloat(4);
                                                double marks = markstt + markspa + markspb;
                                                double gpa1;
                                                if (marks >= 40) {
                                                    gpa1 = gpacalculate(marks);
                                                    float credit = rs.getFloat(5);
                                                    total_credit += credit;
                                                    marks_credit += credit * gpa1;

                                                }

                                            }

                                            sql = "select course_id ,marks_lab ,credit from Lab join course using (course_id) where registration_no=" + registration_no + " and semester=" + semester + " and session_='" + session_ + "'";
                                            rs = st.executeQuery(sql);
                                            while (rs.next()) {

                                                String course_id = rs.getString(1);


                                                float markslb = rs.getFloat(2);
                                                double marks = markslb;
                                                double gpa2;
                                                if (marks >= 40) {
                                                    gpa2 = gpacalculate(marks);
                                                    float credit = rs.getFloat(3);
                                                    total_credit += credit;
                                                    marks_credit += credit * gpa2;

                                                }

                                            }

                                        } catch (Exception ex) {
                                        }
                                        semester = semester - 1;

                                    }
                                    double cgpa = marks_credit / total_credit;
                                   
                                   
                                    df.format(cgpa);
                                     
                                  
                                    out.println("<td>" +  df.format(cgpa) + "</td>");

                                %>
         </tr>
                        </table>
                    </div>
                </div>
            </div>

            <div class="col-lg-2">

            </div>



        </section>


    
  <footer class="footer ">
            <div class="text-center">
                <div class="container">
                    <%@ page import="java.io.*,java.util.*" %>
                    <%
                        Calendar calendar = new GregorianCalendar();
                        int year = calendar.get(Calendar.YEAR);
                    %>
                    <p class="text-muted">Copyright &COPY 2015 to <%=year%> <br><center>by Department Of CSE All rights reserved</center> </p>
                </div>
            </div>

        </footer>

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
    </body>
</html>
