package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.DecimalFormat;
import java.sql.*;
import java.io.*;
import java.util.*;

public final class result_005fview_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


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
                            
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <title>Result View</title>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    ");

        session.setAttribute("log", "logged");
    
      out.write("\n");
      out.write("    <body >\n");
      out.write("        <nav class=\"navbar navbar-inverse navbar-fixed-top\" id=\"mynavbar\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#navbar-collapse\">\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                    </button>\n");
      out.write("                    <a href=\"home.jsp\" class=\"navbar-brand\">SEC</a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbar-collapse\">\n");
      out.write("                    <ul class=\"nav navbar-nav\" >\n");
      out.write("                        <li><a href=\"#\">Home</a>  </li>\n");
      out.write("                        <li><a href=\"#\">Photo Gallary</a>  </li>\n");
      out.write("                        <li><a href=\"#\">Student Profile</a>  </li>\n");
      out.write("                        <li><a href=\"templete.jsp\">Result</a>  </li>\n");
      out.write("                        <li><a href=\"#\">About us</a>  </li>\n");
      out.write("                        <li><a href=\"#\">Contact</a>  </li>\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <div class=\"jumbotron\">\n");
      out.write("            <header>\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("                    <hr>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-12\">\n");
      out.write("                        <div class=\"col-sm-1\">\n");
      out.write("                            <div class=\"img-responsive\">\n");
      out.write("                                <a href=\"templete.jsp\"> <img src=\"image/bd_logo.png\" /></a>\n");
      out.write("                            </div>  \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-10\">\n");
      out.write("                            <h1>Sylhet Engineering College</h1>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                </div>\n");
      out.write("            </header> \n");
      out.write("        </div>\n");
      out.write("        ");

            String name = (String) request.getAttribute("name");
            String reg_no = (String) request.getAttribute("reg");
            String session_ = (String) request.getAttribute("session");
            String semest = (String) request.getParameter("semester");
            int semester = Integer.parseInt(semest);
        
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <section>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"col-lg-2\">\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-lg-8\">\n");
      out.write("\n");
      out.write("                    <div class=\"row text-center\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <br>\n");
      out.write("                        <br>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"raw\">\n");
      out.write("                        <div>\n");
      out.write("                            <label>Name :");
      out.print(name);
      out.write("</label>\n");
      out.write("                        </div>\n");
      out.write("                        <div>\n");
      out.write("                            <label>Registration No : ");
      out.print(reg_no);
      out.write("</label>\n");
      out.write("                        </div>\n");
      out.write("                        <div>\n");
      out.write("                            <label>Semester : ");
      out.print(semester);
      out.write("</label>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div>\n");
      out.write("                            <label >session : ");
      out.print(session_);
      out.write(" </label> \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div>\n");
      out.write("                        <table class=\"table table-bordered table-hover table-responsive text-center\">\n");
      out.write("                            <tr class=\"info\">\n");
      out.write("                                <th class=\"text-center\">Subject</th>\n");
      out.write("                                <th class=\"text-center\">GPA</th>\n");
      out.write("                            </tr>\n");
      out.write("                            ");

                                double total_credit = 0;
                                double marks_credit = 0;
                            
      out.write("\n");
      out.write("                            ");
      out.write("          \n");
      out.write("                              \n");
      out.write("                            ");

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
                            
      out.write("\n");
      out.write("\n");
      out.write("                            ");
   }
                            
      out.write("\n");
      out.write("                            <tr class=\"active\">\n");
      out.write("\n");
      out.write("                                <td>CGPA </td>\n");
      out.write("                                ");

                                    double gpa = marks_credit / total_credit;
                                    DecimalFormat df = new DecimalFormat("#.##");
                                    df.format(gpa);
                                     
                                  
                                    out.println("<td>" +  df.format(gpa) + "</td>");

                                
      out.write("\n");
      out.write("                            </tr>\n");
      out.write("\n");
      out.write("                            <tr class=\"info\">\n");
      out.write("\n");
      out.write("                                <td>Total CGPA </td>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                ");

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

                                
      out.write("\n");
      out.write("         </tr>\n");
      out.write("                        </table>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-lg-2\">\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("\n");
      out.write("   <footer class=\"footer \">\n");
      out.write("            <div class=\"text-center\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    \n");
      out.write("                    ");

                        Calendar calendar = new GregorianCalendar();
                        int year = calendar.get(Calendar.YEAR);
                    
      out.write("\n");
      out.write("                    <p class=\"text-muted\">Copyright &COPY 2015 to ");
      out.print(year);
      out.write(" <br>by Department Of CSE All rights reserved </p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </footer>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
