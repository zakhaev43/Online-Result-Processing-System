package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.student_validity;
import java.io.*;
import java.util.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Home</title>\n");
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
      out.write("                    <a href=\"templete_1.jsp\" class=\"btn btn-info navbar-btn btn-sm navbar-right\">Sign Out</a>\n");
      out.write("                    ");
 String name = (String) session.getAttribute("logger");
      out.write("\n");
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
      out.write("\n");
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
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"text-center\">\n");
      out.write("\n");
      out.write("                <div class=\"col-md-offset-2 col-md-8\">\n");
      out.write("                    <div class=\"carousel slide\" id=\"myCarosel\">\n");
      out.write("                        <ol class=\"carousel-indicators\">\n");
      out.write("                            <li data-target=\"#myCarosel\" data-slide-to=\"0\"></li>\n");
      out.write("                            <li data-target=\"#myCarosel\" data-slide-to=\"1\" class=\"active\"></li>\n");
      out.write("                            <li data-target=\"#myCarosel\" data-slide-to=\"2\"></li>\n");
      out.write("                        </ol>\n");
      out.write("                        <div class=\"carousel-inner\">\n");
      out.write("                            <div class=\"item active img-thumbnail\">\n");
      out.write("                                <img src=\"image/1.jpg\" alt=\"problem with loading ......\" class=\"image-resposive\">\n");
      out.write("                                <div class=\"carousel-caption\">\n");
      out.write("                                    <h4>The beautiful Campus</h4>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"item img-thumbnail\">\n");
      out.write("                                <img src=\"image/2.jpg\" alt=\"problem with loading ......\" class=\"image-resposive\">\n");
      out.write("                                <div class=\"carousel-caption\">\n");
      out.write("                                    <h4>Shaheed Minar</h4>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"item img-thumbnail\">\n");
      out.write("                                <img src=\"image/3.JPG\" alt=\"problem with loading ......\" class=\"image-resposive\">\n");
      out.write("                                <div class=\"carousel-caption\">\n");
      out.write("                                    <h4>Boy's Hostel</h4>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <a class=\"carousel-control left\" href=\"#myCarosel\" data-slide=\"prev\">\n");
      out.write("\n");
      out.write("                            <span class=\"icon-prev\"></span>\n");
      out.write("                        </a>\n");
      out.write("                        <a class=\"carousel-control right\" href=\"#myCarosel\" data-slide=\"next\">\n");
      out.write("\n");
      out.write("                            <span class=\"icon-next\"></span>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                </div>  \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <hr>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-xs-1\">\n");
      out.write("                    <a class=\"btn btn-success btn-lg\"> <span class=\"glyphicon glyphicon-hand-right\"> </span> </a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-xs-11\">\n");
      out.write("                    <h2>Sylhet Engineering College</h2>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <p>Sylhet Engineering College (SEC) established in the year 2007 under the School of Applied Sciences & Technology, Shahjalal University of Science and Technology, is best of its kind with a motto to produce the best in class engineers for the 21st century. As a divisional city of Bangladesh, Sylhet had no full fledged undergraduate level engineering institute. So the Government of Peoples Republic of Bangladesh has established Sylhet Engineering College as an engineering faculty section of Shahjalal University of Science and Technology. \n");
      out.write("\n");
      out.write("With a state-of-the-art facilities and a marvelous landscape of campus, Sylhet Engineering College has become an engineering educational hub of Bangladesh.The campus includes three large academic buildings, library and computer center, admin building, the principal's quarter, teachers and stuff quarters. There are two male students' dormitories and a female students' dormitory.\n");
      out.write("\n");
      out.write("There are currently three departments offering B.Sc in Engineering degree , that includes:\n");
      out.write("\n");
      out.write("- Department of Computer Science and Engineering\n");
      out.write("- Department of Electrical and Electronics Engineering\n");
      out.write("- Department of Civil Engineering\n");
      out.write("\n");
      out.write("It is expected that, Sylhet Engineering College will be upgraded to a full-fledged public university and will be named Sylhet University of Engineering and Technology (SUET).</p>\n");
      out.write("        </div>       \n");
      out.write("        <footer class=\"footer\">\n");
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
