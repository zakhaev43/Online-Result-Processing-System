package org.apache.jsp.practice;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<form data-toggle=\"validator\" role=\"form\">\n");
      out.write("  <div class=\"form-group\">\n");
      out.write("    <label for=\"inputName\" class=\"control-label\">Name</label>\n");
      out.write("    <input type=\"text\" class=\"form-control\" id=\"inputName\" placeholder=\"Cina Saffary\" required>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"form-group has-feedback\">\n");
      out.write("    <label for=\"inputTwitter\" class=\"control-label\">Twitter</label>\n");
      out.write("    <div class=\"input-group\">\n");
      out.write("      <span class=\"input-group-addon\">@</span>\n");
      out.write("      <input type=\"text\" pattern=\"^[_A-z0-9]{1,}$\" maxlength=\"15\" class=\"form-control\" id=\"inputTwitter\" placeholder=\"1000hz\" required>\n");
      out.write("    </div>\n");
      out.write("    <span class=\"glyphicon form-control-feedback\" aria-hidden=\"true\"></span>\n");
      out.write("    <span class=\"help-block with-errors\">Hey look, this one has feedback icons!</span>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"form-group\">\n");
      out.write("    <label for=\"inputEmail\" class=\"control-label\">Email</label>\n");
      out.write("    <input type=\"email\" class=\"form-control\" id=\"inputEmail\" placeholder=\"Email\" data-error=\"Bruh, that email address is invalid\" required>\n");
      out.write("    <div class=\"help-block with-errors\"></div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"form-group\">\n");
      out.write("    <label for=\"inputPassword\" class=\"control-label\">Password</label>\n");
      out.write("    <div class=\"form-group col-sm-6\">\n");
      out.write("      <input type=\"password\" data-minlength=\"6\" class=\"form-control\" id=\"inputPassword\" placeholder=\"Password\" required>\n");
      out.write("      <span class=\"help-block\">Minimum of 6 characters</span>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group col-sm-6\">\n");
      out.write("      <input type=\"password\" class=\"form-control\" id=\"inputPasswordConfirm\" data-match=\"#inputPassword\" data-match-error=\"Whoops, these don't match\" placeholder=\"Confirm\" required>\n");
      out.write("      <div class=\"help-block with-errors\"></div>\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"form-group\">\n");
      out.write("    <div class=\"radio\">\n");
      out.write("      <label>\n");
      out.write("        <input type=\"radio\" name=\"underwear\" required>\n");
      out.write("        Boxers\n");
      out.write("      </label>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"radio\">\n");
      out.write("      <label>\n");
      out.write("        <input type=\"radio\" name=\"underwear\" required>\n");
      out.write("        Briefs\n");
      out.write("      </label>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"form-group\">\n");
      out.write("    <div class=\"checkbox\">\n");
      out.write("      <label>\n");
      out.write("        <input type=\"checkbox\" id=\"terms\" data-error=\"Before you wreck yourself\" required>\n");
      out.write("        Check yourself\n");
      out.write("      </label>\n");
      out.write("      <div class=\"help-block with-errors\"></div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"form-group\">\n");
      out.write("    <button type=\"submit\" class=\"btn btn-primary\">Submit</button>\n");
      out.write("  </div>\n");
      out.write("</form>\n");
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
