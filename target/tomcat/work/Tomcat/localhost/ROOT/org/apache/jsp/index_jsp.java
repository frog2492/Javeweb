/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.14
 * Generated at: 2022-06-06 12:59:08 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/D:/y'x'y/Spring/petshop/target/petshop-1.0-SNAPSHOT/WEB-INF/lib/jstl-impl-1.2.jar!/META-INF/c.tld", Long.valueOf(1308098170000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-impl-1.2.jar", Long.valueOf(1654520063678L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>商品列表</title>\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\" href=\"css/bootstrap.css\">\n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("    <script type=\"text/javascript\" src=\"js/jquery.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"layer/layer.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"js/cart.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<!--header-->\n");
      out.write("\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/pages/common/head.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("flag", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("1", request.getCharacterEncoding()), out, false);
      out.write("\n");
      out.write("\n");
      out.write("<!--header-->\n");
      out.write("\n");
      out.write("<!--//header--\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-banner-->\n");
      out.write("\n");
      out.write("<div class=\"banner\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <h2 class=\"hdng\"><a href=\"book_detail.action?bid=100002\">增广贤文</a><span></span></h2>\n");
      out.write("        <p>今日精选推荐</p>\n");
      out.write("        <a class=\"banner_a\" href=\"javascript:;\" onclick=\"buy(100002)\">立刻查看</a>\n");
      out.write("        <div class=\"banner-text\">\n");
      out.write("            <a href=\"book_detail.action?bid=100002\">\n");
      out.write("                <img src=\"images/9787547715543_0.jpg\" alt=\"增广贤文\" width=\"350\" height=\"350\">\n");
      out.write("            </a>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>`1\n");
      out.write("\n");
      out.write("<!--//banner-->\n");
      out.write("\n");
      out.write("<!--gallery-->\n");
      out.write("<div class=\"gallery\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("\n");
      out.write("        <div class=\"alert alert-danger\">\n");
      out.write("            <img src=\"images/dog.png\"width=\"56\" height=\"46\">\n");
      out.write("            <span class=\"dog\" style=\"position: absolute; top: 665px; font-size: 30px\">汪星人</span>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"gallery-grids\">\n");
      out.write("\n");
      out.write("            <div class=\"col-md-4 gallery-grid glry-two\">\n");
      out.write("                <a href=\"book_detail.action?bid=100001\">\n");
      out.write("                    <img src=\"images/9787559609274_0.jpg\" class=\"img-responsive\" alt=\"风格的要素\" width=\"350\" height=\"350\"/>\n");
      out.write("                </a>\n");
      out.write("                <div class=\"gallery-info galrr-info-two\">\n");
      out.write("                    <p>\n");
      out.write("                        <span class=\"glyphicon glyphicon-eye-open\" aria-hidden=\"true\"></span>\n");
      out.write("                        <a href=\"book_detail.action?bid=100001\">查看详情</a>\n");
      out.write("                    </p>\n");
      out.write("                    <a class=\"shop\" href=\"javascript:;\" onclick=\"buy(100001)\">立刻购买</a>\n");
      out.write("                    <div class=\"clearfix\"> </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"galy-info\">\n");
      out.write("                    <p>教育学 > 风格的要素</p>\n");
      out.write("                    <div class=\"galry\">\n");
      out.write("                        <div class=\"prices\">\n");
      out.write("                            <h5 class=\"item_price\">¥ 27.4</h5>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"clearfix\"></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-md-4 gallery-grid glry-two\">\n");
      out.write("                <a href=\"book_detail.action?bid=100007\">\n");
      out.write("                    <img src=\"images/9787300202105_0.jpg\" class=\"img-responsive\" alt=\"逻辑学导论\" width=\"350\" height=\"350\"/>\n");
      out.write("                </a>\n");
      out.write("                <div class=\"gallery-info galrr-info-two\">\n");
      out.write("                    <p>\n");
      out.write("                        <span class=\"glyphicon glyphicon-eye-open\" aria-hidden=\"true\"></span>\n");
      out.write("                        <a href=\"book_detail.action?bid=100007\">查看详情</a>\n");
      out.write("                    </p>\n");
      out.write("                    <a class=\"shop\" href=\"javascript:;\" onclick=\"buy(100007)\">立刻购买</a>\n");
      out.write("                    <div class=\"clearfix\"> </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"galy-info\">\n");
      out.write("                    <p>教育学 > 逻辑学导论</p>\n");
      out.write("                    <div class=\"galry\">\n");
      out.write("                        <div class=\"prices\">\n");
      out.write("                            <h5 class=\"item_price\">¥ 76.7</h5>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"clearfix\"></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-md-4 gallery-grid glry-two\">\n");
      out.write("                <a href=\"book_detail.action?bid=100009\">\n");
      out.write("                    <img src=\"images/9787117270137_0.jpg\" class=\"img-responsive\" alt=\"人格心理学\" width=\"350\" height=\"350\"/>\n");
      out.write("                </a>\n");
      out.write("                <div class=\"gallery-info galrr-info-two\">\n");
      out.write("                    <p>\n");
      out.write("                        <span class=\"glyphicon glyphicon-eye-open\" aria-hidden=\"true\"></span>\n");
      out.write("                        <a href=\"book_detail.action?bid=100009\">查看详情</a>\n");
      out.write("                    </p>\n");
      out.write("                    <a class=\"shop\" href=\"javascript:;\" onclick=\"buy(100009)\">立刻购买</a>\n");
      out.write("                    <div class=\"clearfix\"> </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"galy-info\">\n");
      out.write("                    <p>教育学 > 人格心理学</p>\n");
      out.write("                    <div class=\"galry\">\n");
      out.write("                        <div class=\"prices\">\n");
      out.write("                            <h5 class=\"item_price\">¥ 44.1</h5>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"clearfix\"></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-md-4 gallery-grid glry-two\">\n");
      out.write("                <a href=\"book_detail.action?bid=100018\">\n");
      out.write("                    <img src=\"images/9787558603600_0.jpg\" class=\"img-responsive\" alt=\"中国画白描基础\" width=\"350\" height=\"350\"/>\n");
      out.write("                </a>\n");
      out.write("                <div class=\"gallery-info galrr-info-two\">\n");
      out.write("                    <p>\n");
      out.write("                        <span class=\"glyphicon glyphicon-eye-open\" aria-hidden=\"true\"></span>\n");
      out.write("                        <a href=\"book_detail.action?bid=100018\">查看详情</a>\n");
      out.write("                    </p>\n");
      out.write("                    <a class=\"shop\" href=\"javascript:;\" onclick=\"buy(100018)\">立刻购买</a>\n");
      out.write("                    <div class=\"clearfix\"> </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"galy-info\">\n");
      out.write("                    <p>教育学 > 中国画白描基础</p>\n");
      out.write("                    <div class=\"galry\">\n");
      out.write("                        <div class=\"prices\">\n");
      out.write("                            <h5 class=\"item_price\">¥ 28.4</h5>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"clearfix\"></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-md-4 gallery-grid glry-two\">\n");
      out.write("                <a href=\"book_detail.action?bid=100021\">\n");
      out.write("                    <img src=\"images/9787500940449_0.jpg\" class=\"img-responsive\" alt=\"运动生理学\" width=\"350\" height=\"350\"/>\n");
      out.write("                </a>\n");
      out.write("                <div class=\"gallery-info galrr-info-two\">\n");
      out.write("                    <p>\n");
      out.write("                        <span class=\"glyphicon glyphicon-eye-open\" aria-hidden=\"true\"></span>\n");
      out.write("                        <a href=\"book_detail.action?bid=100021\">查看详情</a>\n");
      out.write("                    </p>\n");
      out.write("                    <a class=\"shop\" href=\"javascript:;\" onclick=\"buy(100021)\">立刻购买</a>\n");
      out.write("                    <div class=\"clearfix\"> </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"galy-info\">\n");
      out.write("                    <p>教育学 > 运动生理学</p>\n");
      out.write("                    <div class=\"galry\">\n");
      out.write("                        <div class=\"prices\">\n");
      out.write("                            <h5 class=\"item_price\">¥ 67.5</h5>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"clearfix\"></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-md-4 gallery-grid glry-two\">\n");
      out.write("                <a href=\"book_detail.action?bid=100036\">\n");
      out.write("                    <img src=\"images/9787213080708_0.jpg\" class=\"img-responsive\" alt=\"明朝那些事儿\" width=\"350\" height=\"350\"/>\n");
      out.write("                </a>\n");
      out.write("                <div class=\"gallery-info galrr-info-two\">\n");
      out.write("                    <p>\n");
      out.write("                        <span class=\"glyphicon glyphicon-eye-open\" aria-hidden=\"true\"></span>\n");
      out.write("                        <a href=\"book_detail.action?bid=100036\">查看详情</a>\n");
      out.write("                    </p>\n");
      out.write("                    <a class=\"shop\" href=\"javascript:;\" onclick=\"buy(100036)\">立刻购买</a>\n");
      out.write("                    <div class=\"clearfix\"> </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"galy-info\">\n");
      out.write("                    <p>中国古代史 > 明朝那些事儿</p>\n");
      out.write("                    <div class=\"galry\">\n");
      out.write("                        <div class=\"prices\">\n");
      out.write("                            <h5 class=\"item_price\">¥ 147.0</h5>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"clearfix\"></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"clearfix\"></div>\n");
      out.write("        <div class=\"alert alert-info\">\n");
      out.write("            <img src=\"images/cat.png\"width=\"56\" height=\"46\">\n");
      out.write("            <span class=\"dog\" style=\"position: absolute; top: 1540px; font-size: 30px\">喵星人\n");
      out.write("                </span>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"gallery-grids\">\n");
      out.write("\n");
      out.write("            <div class=\"col-md-3 gallery-grid \">\n");
      out.write("                <a href=\"book_detail.action?bid=100005\">\n");
      out.write("                    <img src=\"images/9787117266611_0.jpg\" class=\"img-responsive\" alt=\"病理生理学\"/>\n");
      out.write("                </a>\n");
      out.write("                <div class=\"gallery-info\">\n");
      out.write("                    <p>\n");
      out.write("                        <span class=\"glyphicon glyphicon-eye-open\" aria-hidden=\"true\"></span>\n");
      out.write("                        <a href=\"book_detail.action?bid=100005\">查看详情</a>\n");
      out.write("                    </p>\n");
      out.write("                    <a class=\"shop\" href=\"javascript:;\" onclick=\"buy(100005)\">立刻购买</a>\n");
      out.write("                    <div class=\"clearfix\"> </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"galy-info\">\n");
      out.write("                    <p>教育学 > 病理生理学</p>\n");
      out.write("                    <div class=\"galry\">\n");
      out.write("                        <div class=\"prices\">\n");
      out.write("                            <h5 class=\"item_price\">¥ 52.2</h5>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"clearfix\"></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-md-3 gallery-grid \">\n");
      out.write("                <a href=\"book_detail.action?bid=100012\">\n");
      out.write("                    <img src=\"images/9787111554783_0.jpg\" class=\"img-responsive\" alt=\"攻读研究生必知必会\"/>\n");
      out.write("                </a>\n");
      out.write("                <div class=\"gallery-info\">\n");
      out.write("                    <p>\n");
      out.write("                        <span class=\"glyphicon glyphicon-eye-open\" aria-hidden=\"true\"></span>\n");
      out.write("                        <a href=\"book_detail.action?bid=100012\">查看详情</a>\n");
      out.write("                    </p>\n");
      out.write("                    <a class=\"shop\" href=\"javascript:;\" onclick=\"buy(100012)\">立刻购买</a>\n");
      out.write("                    <div class=\"clearfix\"> </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"galy-info\">\n");
      out.write("                    <p>教育学 > 攻读研究生必知必会</p>\n");
      out.write("                    <div class=\"galry\">\n");
      out.write("                        <div class=\"prices\">\n");
      out.write("                            <h5 class=\"item_price\">¥ 52.4</h5>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"clearfix\"></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-md-3 gallery-grid \">\n");
      out.write("                <a href=\"book_detail.action?bid=100017\">\n");
      out.write("                    <img src=\"images/9787302273288_0.jpg\" class=\"img-responsive\" alt=\"色彩构成\"/>\n");
      out.write("                </a>\n");
      out.write("                <div class=\"gallery-info\">\n");
      out.write("                    <p>\n");
      out.write("                        <span class=\"glyphicon glyphicon-eye-open\" aria-hidden=\"true\"></span>\n");
      out.write("                        <a href=\"book_detail.action?bid=100017\">查看详情</a>\n");
      out.write("                    </p>\n");
      out.write("                    <a class=\"shop\" href=\"javascript:;\" onclick=\"buy(100017)\">立刻购买</a>\n");
      out.write("                    <div class=\"clearfix\"> </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"galy-info\">\n");
      out.write("                    <p>教育学 > 色彩构成</p>\n");
      out.write("                    <div class=\"galry\">\n");
      out.write("                        <div class=\"prices\">\n");
      out.write("                            <h5 class=\"item_price\">¥ 42.0</h5>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"clearfix\"></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-md-3 gallery-grid \">\n");
      out.write("                <a href=\"book_detail.action?bid=100022\">\n");
      out.write("                    <img src=\"images/9787500919919_0.jpg\" class=\"img-responsive\" alt=\"运动训练学\"/>\n");
      out.write("                </a>\n");
      out.write("                <div class=\"gallery-info\">\n");
      out.write("                    <p>\n");
      out.write("                        <span class=\"glyphicon glyphicon-eye-open\" aria-hidden=\"true\"></span>\n");
      out.write("                        <a href=\"book_detail.action?bid=100022\">查看详情</a>\n");
      out.write("                    </p>\n");
      out.write("                    <a class=\"shop\" href=\"javascript:;\" onclick=\"buy(100022)\">立刻购买</a>\n");
      out.write("                    <div class=\"clearfix\"> </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"galy-info\">\n");
      out.write("                    <p>教育学 > 运动训练学</p>\n");
      out.write("                    <div class=\"galry\">\n");
      out.write("                        <div class=\"prices\">\n");
      out.write("                            <h5 class=\"item_price\">¥ 33.8</h5>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"clearfix\"></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-md-3 gallery-grid \">\n");
      out.write("                <a href=\"book_detail.action?bid=100037\">\n");
      out.write("                    <img src=\"images/9787101052978_0.jpg\" class=\"img-responsive\" alt=\"三国志\"/>\n");
      out.write("                </a>\n");
      out.write("                <div class=\"gallery-info\">\n");
      out.write("                    <p>\n");
      out.write("                        <span class=\"glyphicon glyphicon-eye-open\" aria-hidden=\"true\"></span>\n");
      out.write("                        <a href=\"book_detail.action?bid=100037\">查看详情</a>\n");
      out.write("                    </p>\n");
      out.write("                    <a class=\"shop\" href=\"javascript:;\" onclick=\"buy(100037)\">立刻购买</a>\n");
      out.write("                    <div class=\"clearfix\"> </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"galy-info\">\n");
      out.write("                    <p>中国古代史 > 三国志</p>\n");
      out.write("                    <div class=\"galry\">\n");
      out.write("                        <div class=\"prices\">\n");
      out.write("                            <h5 class=\"item_price\">¥ 38.7</h5>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"clearfix\"></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-md-3 gallery-grid \">\n");
      out.write("                <a href=\"book_detail.action?bid=100038\">\n");
      out.write("                    <img src=\"images/9787553807430_0.jpg\" class=\"img-responsive\" alt=\"资治通鉴\"/>\n");
      out.write("                </a>\n");
      out.write("                <div class=\"gallery-info\">\n");
      out.write("                    <p>\n");
      out.write("                        <span class=\"glyphicon glyphicon-eye-open\" aria-hidden=\"true\"></span>\n");
      out.write("                        <a href=\"book_detail.action?bid=100038\">查看详情</a>\n");
      out.write("                    </p>\n");
      out.write("                    <a class=\"shop\" href=\"javascript:;\" onclick=\"buy(100038)\">立刻购买</a>\n");
      out.write("                    <div class=\"clearfix\"> </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"galy-info\">\n");
      out.write("                    <p>中国古代史 > 资治通鉴</p>\n");
      out.write("                    <div class=\"galry\">\n");
      out.write("                        <div class=\"prices\">\n");
      out.write("                            <h5 class=\"item_price\">¥ 260.0</h5>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"clearfix\"></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-md-3 gallery-grid \">\n");
      out.write("                <a href=\"book_detail.action?bid=100039\">\n");
      out.write("                    <img src=\"images/9787514352894_0.jpg\" class=\"img-responsive\" alt=\"山海经\"/>\n");
      out.write("                </a>\n");
      out.write("                <div class=\"gallery-info\">\n");
      out.write("                    <p>\n");
      out.write("                        <span class=\"glyphicon glyphicon-eye-open\" aria-hidden=\"true\"></span>\n");
      out.write("                        <a href=\"book_detail.action?bid=100039\">查看详情</a>\n");
      out.write("                    </p>\n");
      out.write("                    <a class=\"shop\" href=\"javascript:;\" onclick=\"buy(100039)\">立刻购买</a>\n");
      out.write("                    <div class=\"clearfix\"> </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"galy-info\">\n");
      out.write("                    <p>中国古代史 > 山海经</p>\n");
      out.write("                    <div class=\"galry\">\n");
      out.write("                        <div class=\"prices\">\n");
      out.write("                            <h5 class=\"item_price\">¥ 34.0</h5>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"clearfix\"></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-md-3 gallery-grid \">\n");
      out.write("                <a href=\"book_detail.action?bid=100047\">\n");
      out.write("                    <img src=\"images/9787553474694_0.jpg\" class=\"img-responsive\" alt=\"福尔摩斯探案全集\"/>\n");
      out.write("                </a>\n");
      out.write("                <div class=\"gallery-info\">\n");
      out.write("                    <p>\n");
      out.write("                        <span class=\"glyphicon glyphicon-eye-open\" aria-hidden=\"true\"></span>\n");
      out.write("                        <a href=\"book_detail.action?bid=100047\">查看详情</a>\n");
      out.write("                    </p>\n");
      out.write("                    <a class=\"shop\" href=\"javascript:;\" onclick=\"buy(100047)\">立刻购买</a>\n");
      out.write("                    <div class=\"clearfix\"> </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"galy-info\">\n");
      out.write("                    <p>悬疑推理小说 > 福尔摩斯探案全集</p>\n");
      out.write("                    <div class=\"galry\">\n");
      out.write("                        <div class=\"prices\">\n");
      out.write("                            <h5 class=\"item_price\">¥ 110.0</h5>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"clearfix\"></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<!--//gallery-->\n");
      out.write("<!--subscribe-->\n");
      out.write("<div class=\"subscribe\"></div>\n");
      out.write("<!--//subscribe-->\n");
      out.write("\n");
      out.write("\n");
      out.write("<!--footer-->\n");
      out.write("\n");
      out.write("<!--footer-->\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "pages/common/footer.jsp", out, false);
      out.write("\n");
      out.write("<!--//footer-->\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}