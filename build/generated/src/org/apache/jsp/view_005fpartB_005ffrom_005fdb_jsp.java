package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Connection;
import java.sql.*;

public final class view_005fpartB_005ffrom_005fdb_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Student Information of SEC </title>\n");
      out.write("        <style>\n");
      out.write("            .header{\n");
      out.write("                background-color: #5EFB6E; \n");
      out.write("                text-align: center;\n");
      out.write("                padding: 30px;\n");
      out.write("            }\n");
      out.write("            .mainmanu{\n");
      out.write("                margin-top: 50px;\n");
      out.write("\n");
      out.write("                text-align: center;\n");
      out.write("                align: center;\n");
      out.write("            }\n");
      out.write("            .main1{\n");
      out.write("                margin-top: 200px;\n");
      out.write("                width: 300px;\n");
      out.write("                height: 300px;\n");
      out.write("                overflow:hidden; \n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .main1 ul{\n");
      out.write("\n");
      out.write("                margin: 0;\n");
      out.write("                padding:0;\n");
      out.write("                list-style:none;\n");
      out.write("            }\n");
      out.write("            .main1 ul li{\n");
      out.write("\n");
      out.write("                float:none;\n");
      out.write("                border:2px solid #ddd;\n");
      out.write("            }\n");
      out.write("            .main1 ul li a{\n");
      out.write("                text-decoration: none;\n");
      out.write("                color:#000;\n");
      out.write("                display: block;\n");
      out.write("                padding: 10px 20px;\n");
      out.write("            }\n");
      out.write("            .main1 ul li a:hover{\n");
      out.write("                background-color: darkorange;\n");
      out.write("            }\n");
      out.write("            table{\n");
      out.write("                border-collapse: collapse;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            td{\n");
      out.write("                padding: 2px;\n");
      out.write("            }\n");
      out.write("            .print{\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            .no{\n");
      out.write("                margin-top: 40px;\n");
      out.write("                width:70px;\n");
      out.write("                height: 64px;\n");
      out.write("                background-image: url(image/print.png);\n");
      out.write("\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/text.css\"/>\n");
      out.write("        <script>\n");
      out.write("            function myfunction(){\n");
      out.write("                document.getElementById(\"x\").style.display=\"none\";\n");
      out.write("                window.print();\n");
      out.write("                document.getElementById(\"x\").style.display=\"initial\";\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class =\"main\">\n");
      out.write("            <div class=\"header\">\n");
      out.write("\n");
      out.write("                <h1>Welcome to result Processing System</h1>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"mainmanu\">\n");
      out.write("                <center>\n");
      out.write("                    ");

                      String sem= request.getParameter("semester");
                      int semester= Integer.parseInt(sem);
                      String session_ = request.getParameter("session");
                    
      out.write("\n");
      out.write("\n");
      out.write("                      \n");
      out.write("                    ");

                        try {

                            Class.forName("oracle.jdbc.driver.OracleDriver");
                            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "pro", "sec");
                            Statement st = con.createStatement();

                            String sql = "select  paper_id,registration_no,course_id,marks_partB from partB where session_='"+session_+"' and semester="+semester+"order by count_partA desc";
                            ResultSet rs = st.executeQuery(sql);
                    
      out.write("\n");
      out.write("                    <table border=\"2px\" padding=\"2px\">\n");
      out.write("                        <tr>\n");
      out.write("                            <th>Paper ID </th>\n");
      out.write("                            <th>Registration No</th>               \n");
      out.write("                           \n");
      out.write("                            \n");
      out.write("                            <th>Course ID</th>\n");
      out.write("                            <th>Marks</th>\n");
      out.write("\n");
      out.write("                        </tr>\n");
      out.write("\n");
      out.write("                        ");

                            while (rs.next()) {
                        
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            ");

                                long paper_id = rs.getInt(1);
                                out.println("<td>" + paper_id + "</td>");
                                long reg = rs.getInt(2);
                                out.println("<td>" + reg + "</td>");
                               
                                String course_id= rs.getString(3);
                                out.println("<td>" + course_id + "</td>");
                                float marks= rs.getFloat(4);
                                out.println("<td>" + marks + "</td>");
                            
      out.write("\n");
      out.write("                        </tr>\n");
      out.write("\n");
      out.write("                        ");
    }
                            } catch (Exception e) {
                                e.printStackTrace();
                                out.println(e);
                                out.println("<center><h2 style='color:#009933;'>Please enter data accurately<h2></center> ");
                            }
                        
      out.write("\n");
      out.write("                    </table> \n");
      out.write("                </center>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"footer\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
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
