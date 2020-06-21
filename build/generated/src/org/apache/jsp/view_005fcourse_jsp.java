package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;
import java.util.*;

public final class view_005fcourse_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Update Course</title>\n");
      out.write("        <style>\n");
      out.write("\n");
      out.write("            .header{\n");
      out.write("                background-color: #5EFB6E; \n");
      out.write("                text-align: center;\n");
      out.write("                padding: 30px;\n");
      out.write("            }\n");
      out.write("            .mainmanu{\n");
      out.write("\n");
      out.write("                text-align: center;\n");
      out.write("                align: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            .main1{\n");
      out.write("                margin-top: 150px;\n");
      out.write("                overflow:hidden; \n");
      out.write("                margin-bottom: 200px;\n");
      out.write("            }\n");
      out.write("            #x{\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            .footer{\n");
      out.write("                text-align: center;\n");
      out.write("                margin-top: 150px;\n");
      out.write("            }\n");
      out.write("            .sub{\n");
      out.write("                align: center;\n");
      out.write("                margin-top: 100px;\n");
      out.write("            }\n");
      out.write("            table{\n");
      out.write("                border-collapse: collapse;\n");
      out.write("            }\n");
      out.write("            th{\n");
      out.write("                background-color: bisque;\n");
      out.write("            }\n");
      out.write("            tr{\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class =\"main\">\n");
      out.write("            <div class=\"header\">\n");
      out.write("\n");
      out.write("                <h1>Welcome to result Processing System</h1>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"mainmanu\">\n");
      out.write("\n");
      out.write("                <div  class=\"sub\" >\n");
      out.write("                    <center>\n");
      out.write("                        <table border=\"2px\" padding=\"2px\" >\n");
      out.write("                            <tr>\n");
      out.write("                                <th>Course Id</th>\n");
      out.write("                                <th>Course Name</th>\n");
      out.write("                                <th>Course Type</th>\n");
      out.write("                                <th>Credit</th>\n");
      out.write("                            </tr>\n");
      out.write("                            \n");
      out.write("                            ");

                                try {
                                    Class.forName("oracle.jdbc.driver.OracleDriver");
                                    Connection con;
                                    Statement st;
                                    ResultSet rs;
                                    con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "pro", "sec");
                                    st = con.createStatement();
                                    String sql = "select * from course order by course_id";
                                    rs = st.executeQuery(sql);
                            
      out.write("\n");
      out.write("                            ");

                                while (rs.next()) {

                            
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                            ");

                            String course_id=rs.getString(1);
                            out.println("<td>"+course_id+"</td>");
                            String Course_Title=rs.getString(2);
                            out.println("<td>"+Course_Title+"</td>");
                            String course_type=rs.getString(3);
                            out.println("<td>"+course_type+"</td>");
                            String credit = rs.getString(4);
                            out.println("<td>"+credit+"</td>");
                            
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                            ");
     }
                                } catch (Exception e) {
                                    out.println("Error occure");
                                }
                            
      out.write("\n");
      out.write("                        </table>\n");
      out.write("                    </center>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            ");

                Calendar calendar = new GregorianCalendar();
                int year = calendar.get(Calendar.YEAR);
            
      out.write("\n");
      out.write("            <div class=\"footer\">\n");
      out.write("\n");
      out.write("                Copyright &COPY ");
      out.print(year);
      out.write(" \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
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
