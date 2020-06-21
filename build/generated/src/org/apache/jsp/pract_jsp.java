package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.student_validity;

public final class pract_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <div class=\"container\"> \n");
      out.write("        <br>\n");
      out.write("        <div class=\"input-group\">\n");
      out.write("            <span class=\"input-group-addon glyphicon glyphicon-star\"></span>    \n");
      out.write("            <input type=\"text\" class=\"form-control\" placeholder=\"Username\">\n");
      out.write("        </div>\n");
      out.write("        <br>\n");
      out.write("        <div class=\"input-group input-group-sm\">\n");
      out.write("            <span class=\"input-group-addon glyphicon glyphicon-star\"></span>    \n");
      out.write("            <input type=\"text\" class=\"form-control\" placeholder=\"Username\">\n");
      out.write("        </div>\n");
      out.write("        <br>\n");
      out.write("        <div class=\"input-group input-group-lg\">\n");
      out.write("            <input type=\"text\" class=\"form-control\" placeholder=\"Username\">\n");
      out.write("            <span class=\"input-group-addon glyphicon glyphicon-star\"></span>    \n");
      out.write("        </div>\n");
      out.write("        <br>\n");
      out.write("        <div class=\"input-group\">\n");
      out.write("            <input type=\"text\" class=\"form-control\" placeholder=\"Username\">   \n");
      out.write("            <span class=\"input-group-addon glyphicon glyphicon-star\"></span>    \n");
      out.write("        </div>\n");
      out.write("        <br>\n");
      out.write("        <div class=\"input-group input-group-sm\">\n");
      out.write("            <input type=\"text\" class=\"form-control\" placeholder=\"Username\">\n");
      out.write("            <span class=\"input-group-addon glyphicon glyphicon-star\"></span>    \n");
      out.write("        </div>\n");
      out.write("        <br>\n");
      out.write("        <div class=\"input-group input-group-lg\">\n");
      out.write("            <input type=\"text\" class=\"form-control\" placeholder=\"Username\">\n");
      out.write("            <span class=\"input-group-addon glyphicon glyphicon-star\"></span>    \n");
      out.write("        </div>\n");
      out.write("        <br>\n");
      out.write("        <div class=\"input-group input-group-lg\">\n");
      out.write("            <input type=\"text\" class=\"form-control\" placeholder=\"Username\">\n");
      out.write("            <span class=\"input-group-addon\"><span class=\"glyphicon glyphicon-star\"></span></span>    \n");
      out.write("        </div>\n");
      out.write("        <br>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("</body>\n");
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
