package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class welcomeStruts_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhtml_005flocale;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fbase_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fnotPresent_005fscope_005fname;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fhtml_005fhtml_005flocale = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fbase_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fnotPresent_005fscope_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fhtml_005fhtml_005flocale.release();
    _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fbase_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fnotPresent_005fscope_005fname.release();
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_html_005fhtml_005f0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_html_005fhtml_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:html
    org.apache.struts.taglib.html.HtmlTag _jspx_th_html_005fhtml_005f0 = (org.apache.struts.taglib.html.HtmlTag) _005fjspx_005ftagPool_005fhtml_005fhtml_005flocale.get(org.apache.struts.taglib.html.HtmlTag.class);
    _jspx_th_html_005fhtml_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhtml_005f0.setParent(null);
    // /welcomeStruts.jsp(8,0) name = locale type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fhtml_005f0.setLocale(true);
    int _jspx_eval_html_005fhtml_005f0 = _jspx_th_html_005fhtml_005f0.doStartTag();
    if (_jspx_eval_html_005fhtml_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("    <head>\r\n");
        out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
        out.write("        <title>");
        if (_jspx_meth_bean_005fmessage_005f0(_jspx_th_html_005fhtml_005f0, _jspx_page_context))
          return true;
        out.write("</title>\r\n");
        out.write("        <link rel=\"stylesheet\" href=\"CSS/style.css\">\r\n");
        out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"mos-css/mos-style.css\">\r\n");
        out.write("        ");
        if (_jspx_meth_html_005fbase_005f0(_jspx_th_html_005fhtml_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("    </head>\r\n");
        out.write("    <body style=\"background-color: white\">\r\n");
        out.write("        \r\n");
        out.write("        ");
        if (_jspx_meth_logic_005fnotPresent_005f0(_jspx_th_html_005fhtml_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("        <div id=\"header\">\r\n");
        out.write("            <div class=\"inHeader\">\r\n");
        out.write("                <div class=\"mosAdmin\">\r\n");
        out.write("                    Hallo, Mas Administrator<br>\r\n");
        out.write("                    <a href=\"\">Lihat website</a> | <a href=\"\">Help</a> | <a href=\"login.html\">Keluar</a>\r\n");
        out.write("                </div>\r\n");
        out.write("                <div class=\"clear\"></div>\r\n");
        out.write("            </div>\r\n");
        out.write("        </div>\r\n");
        out.write("        \r\n");
        out.write("        <div id=\"wrapper\">\r\n");
        out.write("            <div id=\"leftBar\">\r\n");
        out.write("                <ul>\r\n");
        out.write("                    <!--<li><a href=\"index.html\">Dashboard</a></li>-->\r\n");
        out.write("                    <li><a href=\"tabel.html\">Complaint</a></li>\r\n");
        out.write("                    <li><a href=\"form.html\">Staff</a></li>\r\n");
        out.write("                    <li><a href=\"form.html\">Department</a></li>\r\n");
        out.write("                    <li><a href=\"form.html\">Solution</a></li>\r\n");
        out.write("                    <li><a href=\"form.html\">Article</a></li>\r\n");
        out.write("                    <li><a href=\"form.html\">Statistic</a></li>\r\n");
        out.write("                </ul>\r\n");
        out.write("            </div>\r\n");
        out.write("            <div id=\"rightContent\">\r\n");
        out.write("                <h3>Statistic</h3>\r\n");
        out.write("                <div class=\"quoteOfDay\">\r\n");
        out.write("                    <b>Quote of the day :</b><br>\r\n");
        out.write("                    <i style=\"color: #5b5b5b;\">\"If you think you can, you really can\"</i>\r\n");
        out.write("                </div>\r\n");
        out.write("               \r\n");
        out.write("                <div class=\"clear\"></div>\r\n");
        out.write("                \r\n");
        out.write("                <div id=\"smallRight\"><h3>Complaint</h3>\r\n");
        out.write("                    <table style=\"border: none;font-size: 12px;color: #5b5b5b;width: 100%;margin: 10px 0 10px 0;\">\r\n");
        out.write("                        <tr><td style=\"border: none;padding: 4px;\">Jumlah posting</td><td style=\"border: none;padding: 4px;\"><b>12</b></td></tr>\r\n");
        out.write("                        <tr><td style=\"border: none;padding: 4px;\">Jumlah kategori</td><td style=\"border: none;padding: 4px;\"><b>12</b></td></tr>\r\n");
        out.write("                        <tr><td style=\"border: none;padding: 4px;\">Jumlah komentar diterbitkan</td><td style=\"border: none;padding: 4px;\"><b>12</b></td></tr>\r\n");
        out.write("                        <tr><td style=\"border: none;padding: 4px;\">Jumlah komentar belum diterbitkan</td><td style=\"border: none;padding: 4px;\"><b>12</b></td></tr>\r\n");
        out.write("                        <tr><td style=\"border: none;padding: 4px;\">Jumlah foto dalam galeri</td><td style=\"border: none;padding: 4px;\"><b>12</b></td></tr>\r\n");
        out.write("                        <tr><td style=\"border: none;padding: 4px;\">Jumlah data buku tamu</td><td style=\"border: none;padding: 4px;\"><b>12</b></td></tr>\r\n");
        out.write("                    </table>\r\n");
        out.write("                </div>\r\n");
        out.write("                \r\n");
        out.write("                <div id=\"smallRight\"><h3>Staff</h3>\r\n");
        out.write("                    <table style=\"border: none;font-size: 12px;color: #5b5b5b;width: 100%;margin: 10px 0 10px 0;\">\r\n");
        out.write("                        <tr><td style=\"border: none;padding: 4px;\">Jumlah posting</td><td style=\"border: none;padding: 4px;\"><b>12</b></td></tr>\r\n");
        out.write("                        <tr><td style=\"border: none;padding: 4px;\">Jumlah kategori</td><td style=\"border: none;padding: 4px;\"><b>12</b></td></tr>\r\n");
        out.write("                        <tr><td style=\"border: none;padding: 4px;\">Jumlah komentar diterbitkan</td><td style=\"border: none;padding: 4px;\"><b>12</b></td></tr>\r\n");
        out.write("                        <tr><td style=\"border: none;padding: 4px;\">Jumlah komentar belum diterbitkan</td><td style=\"border: none;padding: 4px;\"><b>12</b></td></tr>\r\n");
        out.write("                        <tr><td style=\"border: none;padding: 4px;\">Jumlah foto dalam galeri</td><td style=\"border: none;padding: 4px;\"><b>12</b></td></tr>\r\n");
        out.write("                        <tr><td style=\"border: none;padding: 4px;\">Jumlah data buku tamu</td><td style=\"border: none;padding: 4px;\"><b>12</b></td></tr>\r\n");
        out.write("                    </table>\r\n");
        out.write("                </div>\r\n");
        out.write("                <div id=\"smallRight\"><h3>Department</h3>\r\n");
        out.write("                    <table style=\"border: none;font-size: 12px;color: #5b5b5b;width: 100%;margin: 10px 0 10px 0;\">\r\n");
        out.write("                        <tr><td style=\"border: none;padding: 4px;\">Jumlah posting</td><td style=\"border: none;padding: 4px;\"><b>12</b></td></tr>\r\n");
        out.write("                        <tr><td style=\"border: none;padding: 4px;\">Jumlah kategori</td><td style=\"border: none;padding: 4px;\"><b>12</b></td></tr>\r\n");
        out.write("                        <tr><td style=\"border: none;padding: 4px;\">Jumlah komentar diterbitkan</td><td style=\"border: none;padding: 4px;\"><b>12</b></td></tr>\r\n");
        out.write("                        <tr><td style=\"border: none;padding: 4px;\">Jumlah komentar belum diterbitkan</td><td style=\"border: none;padding: 4px;\"><b>12</b></td></tr>\r\n");
        out.write("                        <tr><td style=\"border: none;padding: 4px;\">Jumlah foto dalam galeri</td><td style=\"border: none;padding: 4px;\"><b>12</b></td></tr>\r\n");
        out.write("                        <tr><td style=\"border: none;padding: 4px;\">Jumlah data buku tamu</td><td style=\"border: none;padding: 4px;\"><b>12</b></td></tr>\r\n");
        out.write("                    </table>\r\n");
        out.write("                </div>\r\n");
        out.write("                <div id=\"smallRight\"><h3>Article</h3>\r\n");
        out.write("                    \r\n");
        out.write("                    <table style=\"border: none;font-size: 12px;color: #5b5b5b;width: 100%;margin: 10px 0 10px 0;\">\r\n");
        out.write("                        <tr><td style=\"border: none;padding: 4px;\">Pengunjung online</td><td style=\"border: none;padding: 4px;\"><b>12</b></td></tr>\r\n");
        out.write("                        <tr><td style=\"border: none;padding: 4px;\">Pengunjung hari ini</td><td style=\"border: none;padding: 4px;\"><b>12</b></td></tr>\r\n");
        out.write("                        <tr><td style=\"border: none;padding: 4px;\">Total pengunjung</td><td style=\"border: none;padding: 4px;\"><b>12</b></td></tr>\r\n");
        out.write("                        <tr><td style=\"border: none;padding: 4px;\">Hit hari ini</td><td style=\"border: none;padding: 4px;\"><b>12</b></td></tr>\r\n");
        out.write("                        <tr><td style=\"border: none;padding: 4px;\">Total hit</td><td style=\"border: none;padding: 4px;\"><b>12</b></td></tr>\r\n");
        out.write("                    </table>\r\n");
        out.write("                </div>\r\n");
        out.write("            </div>\r\n");
        out.write("            <div class=\"clear\"></div>\r\n");
        out.write("            <div id=\"footer\">\r\n");
        out.write("                &copy; 2012 MOS css template | <a href=\"#\">Nama Website Anda</a> | design <a href=\"http://arirusmanto.com\" target=\"_blank\">arirusmanto.com</a><br>\r\n");
        out.write("                redesign <a href=\"#\">Tulis nama anda disini</a> | Silahkan baca <a href=\"lisensi.txt\" target=\"_blank\">Lisensi</a>\r\n");
        out.write("            </div>\r\n");
        out.write("        </div>\r\n");
        out.write("        \r\n");
        out.write("    </body>\r\n");
        int evalDoAfterBody = _jspx_th_html_005fhtml_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_html_005fhtml_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhtml_005flocale.reuse(_jspx_th_html_005fhtml_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhtml_005flocale.reuse(_jspx_th_html_005fhtml_005f0);
    return false;
  }

  private boolean _jspx_meth_bean_005fmessage_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fhtml_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_005fmessage_005f0 = (org.apache.struts.taglib.bean.MessageTag) _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_005fmessage_005f0.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fmessage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
    // /welcomeStruts.jsp(11,15) name = key type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fmessage_005f0.setKey("welcome.title");
    int _jspx_eval_bean_005fmessage_005f0 = _jspx_th_bean_005fmessage_005f0.doStartTag();
    if (_jspx_th_bean_005fmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005fbase_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fhtml_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:base
    org.apache.struts.taglib.html.BaseTag _jspx_th_html_005fbase_005f0 = (org.apache.struts.taglib.html.BaseTag) _005fjspx_005ftagPool_005fhtml_005fbase_005fnobody.get(org.apache.struts.taglib.html.BaseTag.class);
    _jspx_th_html_005fbase_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005fbase_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
    int _jspx_eval_html_005fbase_005f0 = _jspx_th_html_005fbase_005f0.doStartTag();
    if (_jspx_th_html_005fbase_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fbase_005fnobody.reuse(_jspx_th_html_005fbase_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fbase_005fnobody.reuse(_jspx_th_html_005fbase_005f0);
    return false;
  }

  private boolean _jspx_meth_logic_005fnotPresent_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fhtml_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:notPresent
    org.apache.struts.taglib.logic.NotPresentTag _jspx_th_logic_005fnotPresent_005f0 = (org.apache.struts.taglib.logic.NotPresentTag) _005fjspx_005ftagPool_005flogic_005fnotPresent_005fscope_005fname.get(org.apache.struts.taglib.logic.NotPresentTag.class);
    _jspx_th_logic_005fnotPresent_005f0.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fnotPresent_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
    // /welcomeStruts.jsp(18,8) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_logic_005fnotPresent_005f0.setName("org.apache.struts.action.MESSAGE");
    // /welcomeStruts.jsp(18,8) name = scope type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_logic_005fnotPresent_005f0.setScope("application");
    int _jspx_eval_logic_005fnotPresent_005f0 = _jspx_th_logic_005fnotPresent_005f0.doStartTag();
    if (_jspx_eval_logic_005fnotPresent_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("            <div  style=\"color: red\">\r\n");
        out.write("                ERROR:  Application resources not loaded -- check servlet container\r\n");
        out.write("                logs for error messages.\r\n");
        out.write("            </div>\r\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_logic_005fnotPresent_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fnotPresent_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fnotPresent_005fscope_005fname.reuse(_jspx_th_logic_005fnotPresent_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fnotPresent_005fscope_005fname.reuse(_jspx_th_logic_005fnotPresent_005f0);
    return false;
  }
}
