package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;
import java.awt.*;
import java.io.*;

public final class picview_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 String id;

                void setID(String ID) {
                    id = ID;
              
                }
            
 String DomainName = "jdbc:oracle:thin:@localhost:1521:xe";
                String UserName = "pro";
                String PassWord = "sec";

                private byte[] getReturnInvoiceDetails() {

                    byte[] image = new byte[300000];
                    try {

                        int n = 0;
                        n = System.in.available();
                        int reg= Integer.parseInt(id);
                        System.out.println(""+reg);
                        image = new byte[n];
                        String QS = "select photo from logger_info where registration_no=" + reg + "";

                        Class.forName("oracle.jdbc.OracleDriver");
                        Connection cn = DriverManager.getConnection(DomainName, UserName, PassWord);
                        Statement st = cn.createStatement();
                        ResultSet rs = st.executeQuery(QS);

                        while (rs.next()) {
                            image = rs.getBytes(1);

                        }

                    } catch (Exception e) {
                        System.out.println(e);
                    }

                    return image;
                }
            
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
      out.write("        <title></title>\n");
      out.write("    </head>\n");
      out.write("    <body >\n");
      out.write("\n");
      out.write("        <form name=\"Form1\">\n");
      out.write("\n");
      out.write("            \n");
      out.write("\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("            ");

                try {
                   String ID = request.getParameter("registration_no");
                    
                    setID(ID);
                    byte[] Pic = getReturnInvoiceDetails();
                    response.setContentType("image/png");
                    OutputStream o = response.getOutputStream();
                    o.write(Pic);
                    o.flush();
                    o.close();
                    out.close();
                    return;
                } catch (Exception e) {
                }
            
      out.write("\n");
      out.write("        </form>\n");
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
