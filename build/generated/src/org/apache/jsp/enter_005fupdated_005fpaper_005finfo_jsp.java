package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Connection;
import java.sql.*;
import java.sql.*;

public final class enter_005fupdated_005fpaper_005finfo_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Enter info</title>\r\n");
      out.write("        <style>\r\n");
      out.write("            .header{\r\n");
      out.write("                background-color: #5EFB6E; \r\n");
      out.write("                text-align: center;\r\n");
      out.write("                padding: 30px;\r\n");
      out.write("            }\r\n");
      out.write("            .into{\r\n");
      out.write("                margin-top: 100px;\r\n");
      out.write("                text-align: center;\r\n");
      out.write("                color: brown;\r\n");
      out.write("\r\n");
      out.write("            }    \r\n");
      out.write("            .dropdown{\r\n");
      out.write("                padding: 6px 88px;\r\n");
      out.write("            }\r\n");
      out.write("            .drop_sem{\r\n");
      out.write("                padding: 6px 110px;\r\n");
      out.write("            }\r\n");
      out.write("            .drop_course{\r\n");
      out.write("                padding: 6px 98px;\r\n");
      out.write("            }\r\n");
      out.write("            .drop_part{\r\n");
      out.write("                padding: 6px 120px;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("        <script>\r\n");
      out.write("            \r\n");
      out.write("            function myfunction()\r\n");
      out.write("            {\r\n");
      out.write("                var data_true=0;\r\n");
      out.write("               \r\n");
      out.write("                var reg = document.getElementById(\"reg\").value;\r\n");
      out.write("                var length= reg.length;\r\n");
      out.write("\r\n");
      out.write("                if(reg==\"\"|| reg==null)\r\n");
      out.write("                {\r\n");
      out.write("                    document.getElementById(\"b\").innerHTML=\"Fill the Textfild by a Registration number\";\r\n");
      out.write("                          data_true=1;\r\n");
      out.write("                       \r\n");
      out.write("                }\r\n");
      out.write("                    \r\n");
      out.write("                else  if(length!=10)\r\n");
      out.write("                {\r\n");
      out.write("                    document.getElementById(\"b\").innerHTML=\"Invalid Registration Number\";\r\n");
      out.write("                         data_true=1;\r\n");
      out.write("                       \r\n");
      out.write("                }\r\n");
      out.write("                else{\r\n");
      out.write("                    for(var i =0;i<length;i++)\r\n");
      out.write("                    {\r\n");
      out.write("                        if(reg[i]>='0'&& reg[i]<=9)\r\n");
      out.write("                        {\r\n");
      out.write("                             \r\n");
      out.write("                        }\r\n");
      out.write("                        else\r\n");
      out.write("                        {\r\n");
      out.write("                            document.getElementById(\"b\").innerHTML=\"Invalid Charecter use,Plsease Use Correct Registration Number\";\r\n");
      out.write("                               data_true=1;\r\n");
      out.write("                       \r\n");
      out.write("                        }\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("                var  course= document.getElementById(\"course\").value;\r\n");
      out.write("                if(course==\"1\")\r\n");
      out.write("                {\r\n");
      out.write("                    document.getElementById(\"c\").innerHTML=\"Please Select a course\";\r\n");
      out.write("                       data_true=1;             \r\n");
      out.write("                }\r\n");
      out.write("                    \r\n");
      out.write("                var sem = document.getElementById(\"semester\").value;\r\n");
      out.write("                if(sem==\"0\")\r\n");
      out.write("                {\r\n");
      out.write("                    document.getElementById(\"d\").innerHTML=\"Please Select a Semester\";\r\n");
      out.write("                       data_true=1;                  \r\n");
      out.write("                }\r\n");
      out.write("                var session = document.getElementById(\"session\").value;\r\n");
      out.write("                var len= session.length;\r\n");
      out.write("                var i,cou=0,count=0;\r\n");
      out.write("                 var sp =0;\r\n");
      out.write("                if(session==\"\"|| session==null)\r\n");
      out.write("                 {\r\n");
      out.write("                     document.getElementById(\"e\").innerHTML=\"Enter a Session\" ;\r\n");
      out.write("                        data_true=1;\r\n");
      out.write("                       \r\n");
      out.write("                 }\r\n");
      out.write("                 else{\r\n");
      out.write("                     \r\n");
      out.write("                    \r\n");
      out.write("                     for(i=0;i<len;i++)\r\n");
      out.write("                     {\r\n");
      out.write("                        if(sp==0 && session[i]>='0' && session[i]<='9')  \r\n");
      out.write("                         {\r\n");
      out.write("                             count++;   \r\n");
      out.write("                         }\r\n");
      out.write("                         else if(session[i]=='-')\r\n");
      out.write("                          {\r\n");
      out.write("                              sp=1;   \r\n");
      out.write("                          }\r\n");
      out.write("                          else if(sp==1 &&  session[i]>='0' && session[i]<='9' )\r\n");
      out.write("                           {\r\n");
      out.write("                                cou++;   \r\n");
      out.write("                           }\r\n");
      out.write("                           else\r\n");
      out.write("                           {\r\n");
      out.write("                                 document.getElementById(\"e\").innerHTML=\"Formet 2012-2013 no space or other charecter\"; \r\n");
      out.write("                                 data_true=1;\r\n");
      out.write("                       \r\n");
      out.write("                            }\r\n");
      out.write("                     }\r\n");
      out.write("                     \r\n");
      out.write("                     if(count!=4 && cou!=4 && sp!=1)\r\n");
      out.write("                      {\r\n");
      out.write("                          document.getElementById(\"e\").innerHTML=\"Enter Correct Session\";  \r\n");
      out.write("                           data_true=1;\r\n");
      out.write("                       \r\n");
      out.write("                      }\r\n");
      out.write("                 }\r\n");
      out.write("                 \r\n");
      out.write("                  var part = document.getElementById(\"select\").value ;\r\n");
      out.write("         \r\n");
      out.write("                if(part==\"3\")\r\n");
      out.write("                    {\r\n");
      out.write("                        document.getElementById(\"px\").innerHTML=\"Please Select Part-A or Part-B\" \r\n");
      out.write("                          data_true=1;\r\n");
      out.write("                    }\r\n");
      out.write("                \r\n");
      out.write("                if(data_true==0)\r\n");
      out.write("                    {\r\n");
      out.write("                        return true;\r\n");
      out.write("                    }\r\n");
      out.write("                    else \r\n");
      out.write("                        {\r\n");
      out.write("                            return false;\r\n");
      out.write("                        }\r\n");
      out.write("            }\r\n");
      out.write("        </script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"header\">\r\n");
      out.write("            <h1>Welcome to result Processing System</h1>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"main\">\r\n");
      out.write("            <div class=\"into\">\r\n");
      out.write("                <h2>Enter information</h2>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"data\">\r\n");
      out.write("                <center>\r\n");
      out.write("                    \r\n");
      out.write("                    ");

                   
                   String paper_id = (String)request.getAttribute("paper_id");
                  
                     
      out.write("\r\n");
      out.write("                   \r\n");
      out.write("                   <form  action=\"enter_updated_paper_info_into_db.jsp\" onsubmit=\"return myfunction()\">\r\n");
      out.write("                      \r\n");
      out.write("                          <input type=\"hidden\" name=\"paper_id\" value=\"");
      out.print(paper_id);
      out.write("\">\r\n");
      out.write("                       <table>\r\n");
      out.write("                             \r\n");
      out.write("                           \r\n");
      out.write("                             <tr>\r\n");
      out.write("                                <td>\r\n");
      out.write("\r\n");
      out.write("                                    <input type=\"text\" name=\"registration\" id=\"reg\" placeholder=\"Registration no\" style=\"width: 300px;height: 25px\">\r\n");
      out.write("                                    <span style=\"color:red;list-style:none;font-size:12px;font-weight:bold;\"></span><br>\r\n");
      out.write("                                    <div>\r\n");
      out.write("                                        <span id =\"b\" style=\"color: red;\"> </span>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td>\r\n");
      out.write("                                    <select name=\"course_id\" class=\"drop_course\" id=\"course\">\r\n");
      out.write("                                        <option value=\"1\" selected>Course Name</option>\r\n");
      out.write("                                           \r\n");
      out.write("                                         ");


                                            try {

                                                Class.forName("oracle.jdbc.driver.OracleDriver");
                                                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "pro", "sec");
                                                Statement st = con.createStatement();

                                                String sql = "SELECT * FROM course where course_type='Theory'";
                                                ResultSet rs = st.executeQuery(sql);


                                        
      out.write("\r\n");
      out.write("                                        ");

                                            while (rs.next()) {
                                        
      out.write("\r\n");
      out.write("                                        ");

                                            String course_id = rs.getString(1);
                                          
                                            out.println("<option value=" + course_id + ">" + course_id + "</option>");

                                        
      out.write("\r\n");
      out.write("                                        ");
 }
                                        } catch (Exception e) {
                                        
      out.write("\r\n");
      out.write("                                     \r\n");
      out.write("                                        ");
     }
                                        
      out.write("\r\n");
      out.write("                                       \r\n");
      out.write("                                    </select>\r\n");
      out.write("                                    <span style=\"color:red;list-style:none;font-size:12px;font-weight:bold;\"></span><br>\r\n");
      out.write("                                    <div>\r\n");
      out.write("                                        <span id =\"c\" style=\"color: red;\"> </span>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            \r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td> \r\n");
      out.write("                                 \r\n");
      out.write("                                        <select name=\"part\" class=\"drop_part\" id =\"select\">\r\n");
      out.write("                                            <option value=\"3\" selected>Select</option>\r\n");
      out.write("                                            <option value=\"A\">Part-A</option>\r\n");
      out.write("                                            <option value=\"B\">Part-B</option>\r\n");
      out.write("                                        </select>\r\n");
      out.write("                                     <span style=\"color:red;list-style:none;font-size:12px;font-weight:bold;\"></span><br>\r\n");
      out.write("                                    <div>\r\n");
      out.write("                                        <span id =\"px\" style=\"color: red;\"> </span>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                              <tr>\r\n");
      out.write("                                <td>\r\n");
      out.write("\r\n");
      out.write("                                    <input type=\"text\" name=\"session\" placeholder=\"Session\" id=\"session\" style=\"width: 300px;height: 25px\">\r\n");
      out.write("                                    <span style=\"color:red;list-style:none;font-size:12px;font-weight:bold;\"></span><br>\r\n");
      out.write("                                    <div>\r\n");
      out.write("                                        <span id =\"e\" style=\"color: red;\"> </span>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </td>\r\n");
      out.write("\r\n");
      out.write("                            </tr>\r\n");
      out.write("\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td>  \r\n");
      out.write("                                    <select name=\"semester\" class=\"drop_sem\" id=\"semester\">\r\n");
      out.write("                                        <option value=\"0\" selected>Semester</option>\r\n");
      out.write("                                          \r\n");
      out.write("                                        ");


                                            try {

                                                Class.forName("oracle.jdbc.driver.OracleDriver");
                                                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "pro", "sec");
                                                Statement st = con.createStatement();

                                                String sql = "SELECT * FROM semester order by semester_id";
                                                ResultSet rs = st.executeQuery(sql);


                                        
      out.write("\r\n");
      out.write("                                        ");

                                            while (rs.next()) {
                                        
      out.write("\r\n");
      out.write("                                        ");

                                            String semester = rs.getString(1);
                                            String semister_id = rs.getString(2);
                                            out.println("<option value=" + semister_id + ">" + semester + "</option>");

                                        
      out.write("\r\n");
      out.write("                                        ");
 }
                                        } catch (Exception e) {
                                        
      out.write("\r\n");
      out.write("                                       \r\n");
      out.write("                                        ");
    }
                                        
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                    </select>\r\n");
      out.write("                                    <span style=\"color:red;list-style:none;font-size:12px;font-weight:bold;\"></span><br>\r\n");
      out.write("                                    <div>\r\n");
      out.write("                                        <span id =\"d\" style=\"color: red;\"> </span>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </td>\r\n");
      out.write("                            </tr>                      \r\n");
      out.write("                        </table>\r\n");
      out.write("                        <div class=\"entering\">\r\n");
      out.write("                            <center> \r\n");
      out.write("                                <input type=\"submit\" value=\"Submit\" style=\"padding: 3px; margin-top: 7px;\">\r\n");
      out.write("                            </center>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </form>\r\n");
      out.write("                </center>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"footer\">\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
