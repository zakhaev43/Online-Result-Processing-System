package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class absent_005fsession_005fsemester_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        \n");
      out.write("         <style>\n");
      out.write("            .header{\n");
      out.write("                background-color: #5EFB6E; \n");
      out.write("                text-align: center;\n");
      out.write("                padding: 30px;\n");
      out.write("            }\n");
      out.write("            .into{\n");
      out.write("                 margin-top: 150px;\n");
      out.write("                margin-left: 530px;\n");
      out.write("                color: brown;\n");
      out.write("\n");
      out.write("            }  \n");
      out.write("            .drop_sem{\n");
      out.write("                padding: 6px 110px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("        <script>\n");
      out.write("          function myfunction()\n");
      out.write("            {\n");
      out.write("                var data_true=0;\n");
      out.write("         \n");
      out.write("                    \n");
      out.write("                var sem = document.getElementById(\"semester\").value;\n");
      out.write("                if(sem==\"0\")\n");
      out.write("                {\n");
      out.write("                    document.getElementById(\"d\").innerHTML=\"Please Select a Semester\";\n");
      out.write("                       data_true=1;\n");
      out.write("                       \n");
      out.write("                  \n");
      out.write("                }\n");
      out.write("                var session = document.getElementById(\"session\").value;\n");
      out.write("                var len= session.length;\n");
      out.write("                var i,cou=0,count=0;\n");
      out.write("                 var sp =0;\n");
      out.write("                if(session==\"\"|| session==null)\n");
      out.write("                 {\n");
      out.write("                     document.getElementById(\"e\").innerHTML=\"Enter a Session\" ;\n");
      out.write("                        data_true=1;\n");
      out.write("                       \n");
      out.write("                 }\n");
      out.write("                 else{\n");
      out.write("                     \n");
      out.write("                    \n");
      out.write("                     for(i=0;i<len;i++)\n");
      out.write("                     {\n");
      out.write("                        if(sp==0 && session[i]>='0' && session[i]<='9')  \n");
      out.write("                         {\n");
      out.write("                             count++;   \n");
      out.write("                         }\n");
      out.write("                         else if(session[i]=='-')\n");
      out.write("                          {\n");
      out.write("                              sp=1;   \n");
      out.write("                          }\n");
      out.write("                          else if(sp==1 &&  session[i]>='0' && session[i]<='9' )\n");
      out.write("                           {\n");
      out.write("                                cou++;   \n");
      out.write("                           }\n");
      out.write("                           else{\n");
      out.write("                                 document.getElementById(\"e\").innerHTML=\"Formet 2012-2013 no space or other charecter\"; \n");
      out.write("                             data_true=1;\n");
      out.write("                       \n");
      out.write("                      }\n");
      out.write("                     }\n");
      out.write("                     \n");
      out.write("                     if(count!=4 && cou!=4 && sp!=1)\n");
      out.write("                      {\n");
      out.write("                          document.getElementById(\"e\").innerHTML=\"Enter Correct Session\";  \n");
      out.write("                           data_true=1;\n");
      out.write("                       \n");
      out.write("                      }\n");
      out.write("                 }\n");
      out.write("                \n");
      out.write("                if(data_true==0)\n");
      out.write("                    {\n");
      out.write("                        return true;\n");
      out.write("                    }\n");
      out.write("                    else \n");
      out.write("                        {\n");
      out.write("                            return false;\n");
      out.write("                        }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("         <div class=\"header\">\n");
      out.write("            <h1>Welcome to result Processing System</h1>\n");
      out.write("        </div>\n");
      out.write("       \n");
      out.write("\n");
      out.write("\n");
      out.write("   <div class=\"main\">\n");
      out.write("            <div class=\"into\">\n");
      out.write("                <h2>Enter information</h2>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"data\">\n");
      out.write("                <center>\n");
      out.write("                  \n");
      out.write("                    <form action=\"enter_new_absent.jsp\"  onsubmit=\"return myfunction()\" metod=\"post\">\n");
      out.write("                    \n");
      out.write("                        <table>\n");
      out.write("                             <tr>\n");
      out.write("                                <td>  \n");
      out.write("                                    <select name=\"semester\" class=\"drop_sem\" id=\"semester\">\n");
      out.write("                                        <option value=\"0\" selected>Semester</option>\n");
      out.write("                                          \n");
      out.write("                                        ");


                                            try {

                                                Class.forName("oracle.jdbc.driver.OracleDriver");
                                                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "pro", "sec");
                                                Statement st = con.createStatement();

                                                String sql = "SELECT * FROM semester order by semester_id";
                                                ResultSet rs = st.executeQuery(sql);


                                        
      out.write("\n");
      out.write("                                        ");

                                            while (rs.next()) {
                                        
      out.write("\n");
      out.write("                                        ");

                                            String semester = rs.getString(1);
                                            String semister_id = rs.getString(2);
                                            out.println("<option value=" + semister_id + ">" + semester + "</option>");

                                        
      out.write("\n");
      out.write("                                        ");
 }
                                        } catch (Exception e) {
                                        
      out.write("\n");
      out.write("                                       \n");
      out.write("                                        ");
    }
                                        
      out.write("\n");
      out.write("\n");
      out.write("                                    </select>\n");
      out.write("                                    <span style=\"color:red;list-style:none;font-size:12px;font-weight:bold;\"></span><br>\n");
      out.write("                                    <div>\n");
      out.write("                                        <span id =\"d\" style=\"color: red;\"> </span>\n");
      out.write("                                    </div>\n");
      out.write("                                </td>\n");
      out.write("                                \n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>\n");
      out.write("                                    <input type=\"text\" name=\"session\" placeholder=\"Session\" id=\"session\" style=\"width: 300px;height: 25px\">\n");
      out.write("                                    <span style=\"color:red;list-style:none;font-size:12px;font-weight:bold;\"></span><br>\n");
      out.write("                                    <div>\n");
      out.write("                                        <span id =\"e\" style=\"color: red;\"> </span>\n");
      out.write("                                    </div>\n");
      out.write("                                </td>\n");
      out.write("\n");
      out.write("                            </tr>\n");
      out.write("                        </table>\n");
      out.write("                      <div class=\"entering\">\n");
      out.write("                <center> \n");
      out.write("                    <input type=\"submit\" value=\"Submit\" style=\"padding: 3px; margin-top: 7px; \">\n");
      out.write("                </center>\n");
      out.write("            </div>\n");
      out.write("                    </form>\n");
      out.write("                </center>\n");
      out.write("            </div>\n");
      out.write("           \n");
      out.write("        </div>\n");
      out.write("    \n");
      out.write("\n");
      out.write("        <div class=\"footer\">\n");
      out.write("\n");
      out.write("        </div>\n");
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
