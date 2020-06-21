package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.firstServlet;
import java.io.*;
import java.util.*;

public final class update_005fpaper_005finfo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Update Student Info</title>\n");
      out.write("        <script>\n");
      out.write("            function myfunction()\n");
      out.write("            {\n");
      out.write("                var  paper_id = document.getElementById(\"x\").value;\n");
      out.write("                if (paper_id==\"\"|| paper_id==null){\n");
      out.write("                    document.getElementById(\"a\").innerHTML=\"Please enter paper Id\";\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                return true;\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        <style>\n");
      out.write("            \n");
      out.write("            .header{\n");
      out.write("                background-color: #5EFB6E; \n");
      out.write("                text-align: center;\n");
      out.write("                padding: 30px;\n");
      out.write("            }\n");
      out.write("             .mainmanu{\n");
      out.write("                 \n");
      out.write("                text-align: center;\n");
      out.write("                align: center;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("\n");
      out.write("            .main1{\n");
      out.write("                 margin-top: 150px;\n");
      out.write("                overflow:hidden; \n");
      out.write("                margin-bottom: 200px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class =\"main\">\n");
      out.write("            <div class=\"header\">\n");
      out.write("\n");
      out.write("                <h1>Welcome to result Processing System</h1>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"mainmanu\">\n");
      out.write("                <center>\n");
      out.write("                    <div class=\"main1\">\n");
      out.write("                        <form action=\"firstServlet\" onsubmit=\"return myfunction()\"  method=\"post\">\n");
      out.write("                             <input type=\"text\" name=\"paper_id\" id=\"x\" placeholder=\"Enter Paper ID\" style=\"width:300px;height: 25px;color: darkcyan; font-size: 15px ;\"><br>                             \n");
      out.write("                                        <span id =\"a\" style=\"color: red;\"> </span><br>                      \n");
      out.write("                             <input type=\"submit\" value=\"Submit\" style=\"padding-top: 5px;padding-bottom: 5px;padding-right: 8px;padding-left: 8px;margin-top: 5px; \">\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </center>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("             \n");
      out.write("            ");

            Calendar calendar = new GregorianCalendar();
            int year=calendar.get(Calendar.YEAR);
            
            
      out.write("\n");
      out.write("            <div class=\"footer\">\n");
      out.write("\n");
      out.write("                Copyright &COPY ");
      out.print(year);
      out.write(" \n");
      out.write("            </div>\n");
      out.write("            <FORM>\n");
      out.write("<INPUT TYPE=\"button\" onClick=\"window.print()\" value=\"Print\">\n");
      out.write("</FORM>\n");
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
