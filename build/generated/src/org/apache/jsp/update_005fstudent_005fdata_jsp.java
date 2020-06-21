package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.util.*;
import java.sql.*;

public final class update_005fstudent_005fdata_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <style>\n");
      out.write("            .header{\n");
      out.write("                background-color: #5EFB6E; \n");
      out.write("                text-align: center;\n");
      out.write("                padding: 30px;\n");
      out.write("            }\n");
      out.write("            .mainmanu{\n");
      out.write("                text-align: center;\n");
      out.write("                align: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            .main1{\n");
      out.write("\n");
      out.write("                overflow:hidden; \n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .main1 ul{\n");
      out.write("\n");
      out.write("                margin: 0;\n");
      out.write("                padding:0;\n");
      out.write("\n");
      out.write("                list-style:none;\n");
      out.write("            }\n");
      out.write("            .main1 ul li{\n");
      out.write("\n");
      out.write("                float:left;\n");
      out.write("                border-left:1px solid #ddd;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .main1 ul li a{\n");
      out.write("                text-decoration: none;\n");
      out.write("                color:#000;\n");
      out.write("                background-color:bisque;\n");
      out.write("                display: block;\n");
      out.write("                padding: 10px 20px;\n");
      out.write("            }\n");
      out.write("            .main1 ul li a:hover{\n");
      out.write("                background-color: crimson;\n");
      out.write("            }\n");
      out.write("            .main1 ul li a:active {\n");
      out.write("                color: #0000FF;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Data update Page</title>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class =\"main\">\n");
      out.write("            <div class=\"header\">\n");
      out.write("\n");
      out.write("                <h1>Welcome to result Processing System</h1>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"mainmanu\">\n");
      out.write("                <div class=\"main1\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li> <a href=\"index.jsp\">Home</a></li>\n");
      out.write("\n");
      out.write("                    </ul> \n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            ");

                Calendar calendar = new GregorianCalendar();
                int year1 = calendar.get(Calendar.YEAR);
            
      out.write("\n");
      out.write("\n");
      out.write("            ");


                String student, father, mother, year;
                student = request.getParameter("std_name");
                if (student.compareTo("") == 0) {
            
      out.write("\n");
      out.write("            ");
      if (true) {
        _jspx_page_context.forward("Errorpage.jsp");
        return;
      }
      out.write("\n");
      out.write("            ");
}
                father = request.getParameter("father_name");
                if (father.compareTo("") == 0) {
            
      out.write("\n");
      out.write("            ");
      if (true) {
        _jspx_page_context.forward("Errorpage.jsp");
        return;
      }
      out.write("\n");
      out.write("            ");
}

                mother = request.getParameter("mother_name");
                if (mother.compareTo("") == 0) {
            
      out.write("\n");
      out.write("            ");
      if (true) {
        _jspx_page_context.forward("Errorpage.jsp");
        return;
      }
      out.write("\n");
      out.write("            ");
}
                year = request.getParameter("session");
                if (year.compareTo("") == 0) {
            
      out.write("\n");
      out.write("            ");
      if (true) {
        _jspx_page_context.forward("Errorpage.jsp");
        return;
      }
      out.write("\n");
      out.write("            ");
}
            
      out.write("\n");
      out.write("            ");


                String registration = request.getParameter("test");

            
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("              \n");
      out.write("            ");

                try {

                  //  Class.forName("oracle.jdbc.driver.OracleDriver");
                  ///  Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "room", "sec");
                  
                   // Statement st = con.createStatement();
                     out.print("<p>'"+registration+"'");
                  //  PreparedStatement ps = con.prepareStatement("");
                   // ps.executeUpdate();
                  
                  //  out.println("<center><h1> Data has been updated succesfully </h1></center>");
                   //   ps.close();
                    //  st.close();
                     // con.close();

            
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            ");


            } catch (Exception e) {
            
      out.write("\n");
      out.write("            ");
      if (true) {
        _jspx_page_context.forward("Errorpage.jsp");
        return;
      }
      out.write("\n");
      out.write("            ");
                       }
            
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"footer\">\n");
      out.write("\n");
      out.write("                Copyright &COPY ");
      out.print(year1);
      out.write(" \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
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
