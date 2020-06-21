package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class enternewcourse_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Enter info</title>\n");
      out.write("        <style>\n");
      out.write("            .header{\n");
      out.write("                background-color: #5EFB6E; \n");
      out.write("                text-align: center;\n");
      out.write("                padding: 30px;\n");
      out.write("            }\n");
      out.write("            .into{\n");
      out.write("                margin-top: 150px;\n");
      out.write("                text-align: center;\n");
      out.write("                color: brown;\n");
      out.write("\n");
      out.write("            } \n");
      out.write("\n");
      out.write("            .dropdown{\n");
      out.write("                 padding: 6px 119px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <script>\n");
      out.write("            function myfunction(){\n");
      out.write("                var   xx = document.getElementById(\"x\").value;\n");
      out.write("              \n");
      out.write("                var len = xx.length;\n");
      out.write("                var i ,x ,cou=0;\n");
      out.write("                var num=0;\n");
      out.write("                var cha=0;\n");
      out.write("                var spa=0;\n");
      out.write("                for(i=0;i<len;i++)\n");
      out.write("                {\n");
      out.write("                    x =  xx.charCodeAt(i)   \n");
      out.write("                    if(x>=65 && x<=90 && num==0 && spa==0)\n");
      out.write("                    {\n");
      out.write("                      \n");
      out.write("                    }\n");
      out.write("                    else if(x==45)\n");
      out.write("                    {   \n");
      out.write("                        cha =1;\n");
      out.write("                        spa=1;\n");
      out.write("                    }\n");
      out.write("                    else if(x>=48 && x<=57 &&  spa==1 && cha==1)\n");
      out.write("                    {\n");
      out.write("                        num=1;  \n");
      out.write("                    }\n");
      out.write("                    \n");
      out.write("                    else{\n");
      out.write("                        document.getElementById(\"a\").innerHTML=\"Wrong formet!!! Example: CSE-501\";\n");
      out.write("                        cou=1;\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("                var y= document.getElementById(\"select\").value;\n");
      out.write("               \n");
      out.write("                \n");
      out.write("                 var count=0;\n");
      out.write("               if(y==\"3\")\n");
      out.write("                   {\n");
      out.write("                        document.getElementById(\"b\").innerHTML=\"Select Lab or Theory course\";\n");
      out.write("                        count=1;\n");
      out.write("                   }\n");
      out.write("                      \n");
      out.write("                if(cou==1 || count == 1)\n");
      out.write("                {\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                else{\n");
      out.write("                    return true;\n");
      out.write("                }\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"header\">\n");
      out.write("            <h1>Welcome to result Processing System</h1>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"main\">\n");
      out.write("            <div class=\"into\">\n");
      out.write("                <h2>Enter New Course</h2>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"data\">\n");
      out.write("                <center>\n");
      out.write("                    <form action=\"enter_course_into_db.jsp\"  onsubmit=\"return myfunction()\">\n");
      out.write("                        <table>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>\n");
      out.write("\n");
      out.write("                                    <input type=\"text\" name=\"course_id\" id=\"x\" placeholder=\"Course ID\" style=\"width: 300px;height: 25px\" required>\n");
      out.write("                                    <span style=\"color:red;list-style:none;font-size:12px;font-weight:bold;\"></span><br>\n");
      out.write("                                    <div>\n");
      out.write("                                        <span id =\"a\" style=\"color: red;\"> </span>\n");
      out.write("                                    </div>\n");
      out.write("                                </td>               \n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>\n");
      out.write("\n");
      out.write("                                    <input type=\"text\" name=\"course_title\" placeholder=\"Course Title\" style=\"width: 300px;height: 25px\" required>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            \n");
      out.write("                            <tr>\n");
      out.write("                                <td> \n");
      out.write("                                 \n");
      out.write("                                        <select name=\"course_type\" class=\"dropdown\" id =\"select\">\n");
      out.write("                                            <option value=\"3\" selected>Select</option>\n");
      out.write("                                            <option value=\"Theory\">Theory</option>\n");
      out.write("                                            <option value=\"Lab\">Lab</option>\n");
      out.write("                                        </select>\n");
      out.write("                                     <span style=\"color:red;list-style:none;font-size:12px;font-weight:bold;\"></span><br>\n");
      out.write("                                    <div>\n");
      out.write("                                        <span id =\"b\" style=\"color: red;\"> </span>\n");
      out.write("                                    </div>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>\n");
      out.write("                                    <input type=\"text\" name=\"cradit\" placeholder=\"Cradit\" style=\"width: 300px;height: 25px\" required>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            \n");
      out.write("                        </table>\n");
      out.write("                        <div class=\"entering\">\n");
      out.write("                            <center> \n");
      out.write("                                <input type=\"submit\" value=\"Submit\" style=\"padding: 3px; margin-top: 7px;\">\n");
      out.write("                            </center>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </form>\n");
      out.write("                </center>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
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
