package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class listProduct_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <title>Hot Food</title>\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n");
      out.write("        <meta name=\"description\" content=\"Hot Food Template\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\n");
      out.write("        <!-- Tạo logo ở title -->\n");
      out.write("        <link\n");
      out.write("            rel=\"shortcut icon\"\n");
      out.write("            href=\"images/logo-title4.png\"\n");
      out.write("            type=\"image/x-icon\"\n");
      out.write("            />\n");
      out.write("\n");
      out.write("        <link\n");
      out.write("            rel=\"stylesheet\"\n");
      out.write("            type=\"text/css\"\n");
      out.write("            href=\"styles/bootstrap4/bootstrap.min.css\"\n");
      out.write("            />\n");
      out.write("        <link\n");
      out.write("            href=\"plugins/font-awesome-4.7.0/css/font-awesome.min.css\"\n");
      out.write("            rel=\"stylesheet\"\n");
      out.write("            type=\"text/css\"\n");
      out.write("            />\n");
      out.write("        <link\n");
      out.write("            rel=\"stylesheet\"\n");
      out.write("            type=\"text/css\"\n");
      out.write("            href=\"plugins/OwlCarousel2-2.2.1/owl.carousel.css\"\n");
      out.write("            />\n");
      out.write("        <link\n");
      out.write("            rel=\"stylesheet\"\n");
      out.write("            type=\"text/css\"\n");
      out.write("            href=\"plugins/OwlCarousel2-2.2.1/owl.theme.default.css\"\n");
      out.write("            />\n");
      out.write("        <link\n");
      out.write("            rel=\"stylesheet\"\n");
      out.write("            type=\"text/css\"\n");
      out.write("            href=\"plugins/OwlCarousel2-2.2.1/animate.css\"\n");
      out.write("            />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"styles/main_styles.css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"styles/responsive.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"styles/myCss.css\" /> \n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"new_arrivals\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row align-items-center\">\n");
      out.write("                    <div class=\"col text-center\">\n");
      out.write("                        <div class=\"new_arrivals_sorting\">\n");
      out.write("                            <ul\n");
      out.write("                                class=\"arrivals_grid_sorting clearfix button-group filters-button-group\"\n");
      out.write("                                >\n");
      out.write("                             \n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                <!--                                     <li\n");
      out.write("                                                                        class=\"grid_sorting_button button d-flex flex-column justify-content-center align-items-center\"\n");
      out.write("                                                                        data-filter=\".accessories\"\n");
      out.write("                                                                        >\n");
      out.write("                                                                        fried chicken\n");
      out.write("                                                                    </li>\n");
      out.write("                                                                    <li\n");
      out.write("                                                                        class=\"grid_sorting_button button d-flex flex-column justify-content-center align-items-center\"\n");
      out.write("                                                                        data-filter=\".men\"\n");
      out.write("                                                                        >\n");
      out.write("                                                                        hamburger\n");
      out.write("                                                                    </li>\n");
      out.write("                                                                    <li\n");
      out.write("                                                                        class=\"grid_sorting_button button d-flex flex-column justify-content-center align-items-center\"\n");
      out.write("                                                                        data-filter=\".men\"\n");
      out.write("                                                                        >\n");
      out.write("                                                                        pizza\n");
      out.write("                                                                    </li>\n");
      out.write("                                                                    <li\n");
      out.write("                                                                        class=\"grid_sorting_button button d-flex flex-column justify-content-center align-items-center\"\n");
      out.write("                                                                        data-filter=\".men\"\n");
      out.write("                                                                        >\n");
      out.write("                                                                        water\n");
      out.write("                                                                    </li>\n");
      out.write("                                                                    <li\n");
      out.write("                                                                        class=\"grid_sorting_button button d-flex flex-column justify-content-center align-items-center\"\n");
      out.write("                                                                        data-filter=\".men\"\n");
      out.write("                                                                        >\n");
      out.write("                                                                        other\n");
      out.write("                                                                    </li>-->\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col\">\n");
      out.write("                        <div\n");
      out.write("                            class=\"product-grid\"\n");
      out.write("                            data-isotope='{ \"itemSelector\": \".product-item\", \"layoutMode\": \"fitRows\" }'\n");
      out.write("                            >\n");
      out.write("                            <!-- Product 1 -->\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("    \n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <script src=\"js/jquery-3.2.1.min.js\"></script>\n");
      out.write("        <script src=\"styles/bootstrap4/popper.js\"></script>\n");
      out.write("        <script src=\"styles/bootstrap4/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"plugins/Isotope/isotope.pkgd.min.js\"></script>\n");
      out.write("        <script src=\"plugins/OwlCarousel2-2.2.1/owl.carousel.js\"></script>\n");
      out.write("        <script src=\"plugins/easing/easing.js\"></script>\n");
      out.write("        <script src=\"js/custom.js\"></script>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cate}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("c");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    <li\n");
          out.write("                                        class=\"grid_sorting_button button d-flex flex-column justify-content-center align-items-center\"\n");
          out.write("                                        data-filter=\".hh");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.cId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"> <!-- Women change to CateName là lum. -->\n");
          out.write("                                        ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.cName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                    </li>\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("p");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <div class=\"product-item hh");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getCateID()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"> <!-- fix name \"men\" to CateName -->\n");
          out.write("                                    <div class=\"product discount product_filter\">\n");
          out.write("                                        <div class=\"product_image\">\n");
          out.write("                                            <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.pImg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\" /> <!-- img -->\n");
          out.write("                                        </div>\n");
          out.write("                                        <div class=\"favorite favorite_left\"></div>\n");
          out.write("                                        <!--                                            <div\n");
          out.write("                                                                                        class=\"product_bubble product_bubble_right product_bubble_red d-flex flex-column align-items-center\"\n");
          out.write("                                                                                        >\n");
          out.write("                                                                                        <span>-$20</span>   \n");
          out.write("                                                                                    </div>--> <!-- Giam gia -->\n");
          out.write("                                        <div class=\"product_info\">\n");
          out.write("                                            <h6 class=\"product_name\">\n");
          out.write("                                                <a href=\"detail?pId=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.pId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"\n");
          out.write("                                                   >");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.pName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a \n");
          out.write("                                                > <!-- Pname -->\n");
          out.write("                                            </h6>\n");
          out.write("                                            <div class=\"product_price\">\n");
          out.write("                                                ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.pPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" VNÐ \n");
          out.write("                                                <!--                                                    <span>$590.00</span>-->\n");
          out.write("                                            </div>\n");
          out.write("                                        </div>\n");
          out.write("                                    </div>\n");
          out.write("                                    <div class=\"red_button add_to_cart_button\">\n");
          out.write("                                        <a href=\"#\">add to cart</a>\n");
          out.write("                                    </div>\n");
          out.write("                                </div>\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }
}
