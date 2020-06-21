package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.util.*;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>");
      out.print(session.getAttribute("logger"));
      out.write(" </title>\n");
      out.write("\n");
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
      out.write("                ");

                String registration = (String) session.getAttribute("reg");
               
               
      out.write("\n");
      out.write("        <div class=\"col-lg-offset-2 col-lg-8\">\n");
      out.write("            <div class=\"row image thumbnail\">\n");
      out.write("                <div class=\"col-lg-9\">\n");
      out.write("                    <h3>");
      out.print(session.getAttribute("logger"));
      out.write("</h3>\n");
      out.write("                    <h5>Hometown : Kulaura</h5>\n");
      out.write("                    <h5>Session : 2012-2013</h5>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-3\">\n");
      out.write("                    <img src=\"picview.jsp?id=");
      out.print(registration);
      out.write("\" style=\"width:140px; height:140px\"/>\n");
      out.write("                   \n");
      out.write("                </div>\n");
      out.write("            </div> \n");
      out.write("        </div>\n");
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
