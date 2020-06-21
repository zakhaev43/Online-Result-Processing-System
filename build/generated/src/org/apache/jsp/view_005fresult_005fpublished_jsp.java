package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;
import java.util.*;

public final class view_005fresult_005fpublished_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\">\n");
      out.write("        <style>\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("        <title>Published Result</title>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
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
      out.write("\n");
      out.write("                    <ul class=\"nav navbar-nav\" >\n");
      out.write("                        <li><a href=\"home.jsp\">Home</a>  </li>\n");
      out.write("                        <li><a href=\"#\">Photo Gallary</a>  </li>\n");
      out.write("                        <li><a href=\"#\">Student Profile</a>  </li>\n");
      out.write("                        <li><a href=\"templete.jsp\">Result</a>  </li>\n");
      out.write("                        <li><a href=\"#\">About us</a>  </li>\n");
      out.write("                        <li><a href=\"#\">Contact</a>  </li>\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <input type=\"hidden\" class=\"btn btn-info navbar-btn btn-sm navbar-right\">\n");
      out.write("                    ");
 if (session.getAttribute("logger") == null) {
      out.write("\n");
      out.write("                    <a href=\"login.jsp\" class=\"btn btn-info navbar-btn btn-sm navbar-right\">Sign In</a>\n");
      out.write("                    ");
} else {
      out.write("\n");
      out.write("\n");
      out.write("                    ");
 String name = (String) session.getAttribute("logger");
      out.write("\n");
      out.write("                    <a href=\"templete_1.jsp\" class=\"btn btn-info navbar-btn btn-sm navbar-right\">Sign Out</a>\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\" >\n");
      out.write("\n");
      out.write("                        <li><a href=\"profile.jsp\">");
      out.print(name);
      out.write("</a>  </li>\n");
      out.write("                    </ul>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <div class=\"jumbotron\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("                <hr>\n");
      out.write("                <div class=\"row\">\n");
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
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <diV class=\"text-center\">\n");
      out.write("\n");
      out.write("            <h3>These result  are published</h3>\n");
      out.write("        </div>\n");
      out.write("                <div class=\"col-lg-3\"></div>\n");
      out.write("        <div class=\"col-lg-5\">\n");
      out.write("            <table class=\"table table-bordered table-hover table-responsive text-center\">\n");
      out.write("                <tr class=\"danger\">\n");
      out.write("                    <th class=\"text-center\">Session</th>\n");
      out.write("                    <th class=\"text-center\">Semester</th>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                  \n");
      out.write("                ");

                    try {

                        Class.forName("oracle.jdbc.driver.OracleDriver");
                        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "pro", "sec");
                        Statement st = con.createStatement();
                        String sql = "select * from result_published";
                        ResultSet rs = st.executeQuery(sql);
                
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                ");

                    while (rs.next()) {
                
      out.write("\n");
      out.write("                <tr class=\"info\">\n");
      out.write("                    ");

                       String ses= rs.getString(1);
                       int sem = rs.getInt(2);
                       out.println("<td>"+ses+"</td>");
                       out.println("<td>"+sem+"</td>");
                    
      out.write("\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                ");
    }
                    } catch (Exception e) {
                        e.printStackTrace();
                        out.println(e);
                      
                    }
                
      out.write("\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <footer class=\"footer \">\n");
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
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
