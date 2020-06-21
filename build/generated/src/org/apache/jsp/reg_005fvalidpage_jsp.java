package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class reg_005fvalidpage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\n");
      out.write("        <title>my firs bootstrap</title>\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("      \n");
      out.write("\n");
      out.write("    ");

        String s = request.getParameter("val");
        if (s == null || s.trim().equals("")) {
            out.print("Please enter id");
        } else {
            int id = Integer.parseInt(s);
            try {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "pro", "sec");
                Statement st = con.createStatement();
                PreparedStatement ps = con.prepareStatement("select Registration_no from student where Registration_no=?");
                ps.setInt(1, id);
                ResultSet rs = ps.executeQuery();
                int cou = 0;
                while (rs.next()) {

                    int reg = rs.getInt(1);
                    if (id == reg) {
                        cou = 1;
                    }

                }
                PreparedStatement ps1 = con.prepareStatement("select Registration_no from logger_info where Registration_no=?");
                ps1.setInt(1, id);
                ResultSet rs1 = ps1.executeQuery();
                int count = 0;
                while (rs1.next()) {
                    int reg_no = rs1.getInt(1);
                    if (id == reg_no) {
                        count = 1;
                    }
                }

                if (cou == 1 && count == 0) {
                    out.println("glyphicon glyphicon-ok form-control-feedback pp");
                    
                }else if(cou==0 && count==0){
                
                }
                else{
                    out.println("danger glyphicon glyphicon-remove form-control-feedback xx");
                }
                con.close();
            } catch (Exception e) {
                out.println("danger glyphicon glyphicon-remove form-control-feedback xx");
            }
        }
    
      out.write("  \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
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
