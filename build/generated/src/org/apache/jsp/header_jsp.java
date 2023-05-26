package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <title>Hot Food</title>\r\n");
      out.write("    <meta charset=\"utf-8\" />\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\r\n");
      out.write("    <meta name=\"description\" content=\"Hot Food Template\" />\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\r\n");
      out.write("    <!-- Tạo logo ở title -->\r\n");
      out.write("    <link\r\n");
      out.write("      rel=\"shortcut icon\"\r\n");
      out.write("      href=\"images/logo-title4.png\"\r\n");
      out.write("      type=\"image/x-icon\"\r\n");
      out.write("    />\r\n");
      out.write("\r\n");
      out.write("    <link\r\n");
      out.write("      rel=\"stylesheet\"\r\n");
      out.write("      type=\"text/css\"\r\n");
      out.write("      href=\"styles/bootstrap4/bootstrap.min.css\"\r\n");
      out.write("    />\r\n");
      out.write("    <link\r\n");
      out.write("      href=\"plugins/font-awesome-4.7.0/css/font-awesome.min.css\"\r\n");
      out.write("      rel=\"stylesheet\"\r\n");
      out.write("      type=\"text/css\"\r\n");
      out.write("    />\r\n");
      out.write("    <link\r\n");
      out.write("      rel=\"stylesheet\"\r\n");
      out.write("      type=\"text/css\"\r\n");
      out.write("      href=\"plugins/OwlCarousel2-2.2.1/owl.carousel.css\"\r\n");
      out.write("    />\r\n");
      out.write("    <link\r\n");
      out.write("      rel=\"stylesheet\"\r\n");
      out.write("      type=\"text/css\"\r\n");
      out.write("      href=\"plugins/OwlCarousel2-2.2.1/owl.theme.default.css\"\r\n");
      out.write("    />\r\n");
      out.write("    <link\r\n");
      out.write("      rel=\"stylesheet\"\r\n");
      out.write("      type=\"text/css\"\r\n");
      out.write("      href=\"plugins/OwlCarousel2-2.2.1/animate.css\"\r\n");
      out.write("    />\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"styles/main_styles.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"styles/responsive.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"styles/myCss.css\" />\r\n");
      out.write("  </head>\r\n");
      out.write("\r\n");
      out.write("  <body>\r\n");
      out.write("    <div class=\"super_container\">\r\n");
      out.write("      <!-- Header -->\r\n");
      out.write("\r\n");
      out.write("      <header class=\"header trans_300\">\r\n");
      out.write("        <!-- Top Navigation -->\r\n");
      out.write("\r\n");
      out.write("        <!-- Main Navigation -->\r\n");
      out.write("\r\n");
      out.write("        <div class=\"main_nav_container\">\r\n");
      out.write("          <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("              <div class=\"col-lg-12 text-right\">\r\n");
      out.write("                <div class=\"logo_container\">\r\n");
      out.write("                  <a href=\"home\">hot<span>food</span></a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <nav class=\"navbar\">\r\n");
      out.write("                  <ul class=\"navbar_menu\">\r\n");
      out.write("                    <li><a href=\"home\">home</a></li>\r\n");
      out.write("                    <li><a href=\"#\">Promotional</a></li>\r\n");
      out.write("                    <li><a href=\"#\">Combo</a></li>\r\n");
      out.write("                    <li><a href=\"categories.jsp\">categories</a></li>\r\n");
      out.write("                    <li><a href=\"#\">best seller</a></li>\r\n");
      out.write("                    \r\n");
      out.write("                  </ul>\r\n");
      out.write("                  <ul class=\"navbar_user\">\r\n");
      out.write("                    <li>\r\n");
      out.write("                      <a href=\"search.jsp\"\r\n");
      out.write("                        ><i class=\"fa fa-search\" aria-hidden=\"true\"></i\r\n");
      out.write("                      ></a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                      <a href=\"login.jsp\"\r\n");
      out.write("                        ><i class=\"fa fa-user\" aria-hidden=\"true\"></i\r\n");
      out.write("                      ></a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"checkout\">\r\n");
      out.write("                      <a href=\"#\">\r\n");
      out.write("                        <i class=\"fa fa-shopping-cart\" aria-hidden=\"true\"></i>\r\n");
      out.write("                        <span id=\"checkout_items\" class=\"checkout_items\"\r\n");
      out.write("                          >2</span\r\n");
      out.write("                        >\r\n");
      out.write("                      </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                  </ul>\r\n");
      out.write("                  <div class=\"hamburger_container\">\r\n");
      out.write("                    <i class=\"fa fa-bars\" aria-hidden=\"true\"></i>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </nav>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </header>\r\n");
      out.write("\r\n");
      out.write("      <div class=\"fs_menu_overlay\"></div>\r\n");
      out.write("      <div class=\"hamburger_menu\">\r\n");
      out.write("        <div class=\"hamburger_close\">\r\n");
      out.write("          <i class=\"fa fa-times\" aria-hidden=\"true\"></i>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"hamburger_menu_content text-right\">\r\n");
      out.write("          <ul class=\"menu_top_nav\">\r\n");
      out.write("            <!-- <li class=\"menu_item has-children\">\r\n");
      out.write("\t\t\t\t\t<a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\tusd\r\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-angle-down\"></i>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t<ul class=\"menu_selection\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">cad</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">aud</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">eur</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">gbp</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</li> -->\r\n");
      out.write("            <!-- <li class=\"menu_item has-children\">\r\n");
      out.write("\t\t\t\t\t<a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\tEnglish\r\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-angle-down\"></i>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t<ul class=\"menu_selection\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">French</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Italian</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">German</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Spanish</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</li> -->\r\n");
      out.write("            <li class=\"menu_item has-children\">\r\n");
      out.write("              <a href=\"#\">\r\n");
      out.write("                My Account\r\n");
      out.write("                <i class=\"fa fa-angle-down\"></i>\r\n");
      out.write("              </a>\r\n");
      out.write("              <ul class=\"menu_selection\">\r\n");
      out.write("                <li>\r\n");
      out.write("                  <a href=\"#\"\r\n");
      out.write("                    ><i class=\"fa fa-sign-in\" aria-hidden=\"true\"></i>Sign In</a\r\n");
      out.write("                  >\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                  <a href=\"#\"\r\n");
      out.write("                    ><i class=\"fa fa-user-plus\" aria-hidden=\"true\"></i\r\n");
      out.write("                    >Register</a\r\n");
      out.write("                  >\r\n");
      out.write("                </li>\r\n");
      out.write("              </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"menu_item\"><a href=\"home\">home</a></li>\r\n");
      out.write("            <li class=\"menu_item\"><a href=\"#\">Promotional</a></li>\r\n");
      out.write("            <li class=\"menu_item\"><a href=\"#\">Combo</a></li>\r\n");
      out.write("            <li class=\"menu_item\"><a href=\"#\">Categories</a></li>\r\n");
      out.write("            <li class=\"menu_item\"><a href=\"#\">Best Seller</a></li>\r\n");
      out.write("           \r\n");
      out.write("          </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
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
