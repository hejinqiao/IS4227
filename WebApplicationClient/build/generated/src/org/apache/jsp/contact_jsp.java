package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contact_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!--\r\n");
      out.write("Author: W3layouts\r\n");
      out.write("Author URL: http://w3layouts.com\r\n");
      out.write("License: Creative Commons Attribution 3.0 Unported\r\n");
      out.write("License URL: http://creativecommons.org/licenses/by/3.0/\r\n");
      out.write("-->\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>BOX SHOP an E-Commerce online Shopping Category Flat Bootstarp responsive Website Template| Contact :: w3layouts</title>\r\n");
      out.write("<link href=\"css/bootstrap.css\" rel='stylesheet' type='text/css' />\r\n");
      out.write("<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\r\n");
      out.write("<script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("<!-- Custom Theme files -->\r\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("<!-- Custom Theme files -->\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<meta name=\"keywords\" content=\"BOX SHOP Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, \r\n");
      out.write("Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design\" />\r\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\r\n");
      out.write("<!--webfont-->\r\n");
      out.write("<link href='http://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>\r\n");
      out.write("<link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>\r\n");
      out.write("<!-- start menu -->\r\n");
      out.write("<link href=\"css/megamenu.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/megamenu.js\"></script>\r\n");
      out.write("<script>$(document).ready(function(){$(\".megamenu\").megamenu();});</script>\r\n");
      out.write("<!-- start slider -->\r\n");
      out.write("<script src=\"js/responsiveslides.min.js\"></script>\r\n");
      out.write(" <script>\r\n");
      out.write("    $(function () {\r\n");
      out.write("      $(\"#slider\").responsiveSlides({\r\n");
      out.write("      \tauto: true,\r\n");
      out.write("      \tspeed: 500,\r\n");
      out.write("        namespace: \"callbacks\",\r\n");
      out.write("        pager: true,\r\n");
      out.write("      });\r\n");
      out.write("    });\r\n");
      out.write("  </script>\r\n");
      out.write("<!--end slider -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/flexslider.css\" type=\"text/css\" media=\"screen\" />\r\n");
      out.write("\t\t\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t$(window).load(function() {\r\n");
      out.write("\t\t\t\t$(\"#flexiselDemo\").flexisel({\r\n");
      out.write("\t\t\t\t\tvisibleItems: 5,\r\n");
      out.write("\t\t\t\t\tanimationSpeed: 1000,\r\n");
      out.write("\t\t\t\t\tautoPlay: true,\r\n");
      out.write("\t\t\t\t\tautoPlaySpeed: 3000,    \t\t\r\n");
      out.write("\t\t\t\t\tpauseOnHover: true,\r\n");
      out.write("\t\t\t\t\tenableResponsiveBreakpoints: true,\r\n");
      out.write("\t\t\t    \tresponsiveBreakpoints: { \r\n");
      out.write("\t\t\t    \t\tportrait: { \r\n");
      out.write("\t\t\t    \t\t\tchangePoint:480,\r\n");
      out.write("\t\t\t    \t\t\tvisibleItems: 1\r\n");
      out.write("\t\t\t    \t\t}, \r\n");
      out.write("\t\t\t    \t\tlandscape: { \r\n");
      out.write("\t\t\t    \t\t\tchangePoint:640,\r\n");
      out.write("\t\t\t    \t\t\tvisibleItems: 2\r\n");
      out.write("\t\t\t    \t\t},\r\n");
      out.write("\t\t\t    \t\ttablet: { \r\n");
      out.write("\t\t\t    \t\t\tchangePoint:768,\r\n");
      out.write("\t\t\t    \t\t\tvisibleItems: 3\r\n");
      out.write("\t\t\t    \t\t}\r\n");
      out.write("\t\t\t    \t}\r\n");
      out.write("\t\t\t    });\r\n");
      out.write("\t\t\t    \r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"js/jquery.flexisel.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<!-- header-section-starts -->\r\n");
      out.write("\t<div class=\"header\">\r\n");
      out.write("\t\t<div class=\"top-header\">\r\n");
      out.write("\t\t\t<div class=\"wrap\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"header-right\">\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"user\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"account.html\">My Account</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"login\">\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"lock\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"login.html\">Login</a>|\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"cart\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">Shopping Cart</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"last\">5</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t<div class=\"sign-up-right\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"login.html\">Sign Up</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"wrap\">\r\n");
      out.write("\t\t\t<div class=\"header-bottom\">\r\n");
      out.write("\t\t\t\t<div class=\"logo\">\r\n");
      out.write("\t\t\t\t\t<a href=\"index.jsp\"><img src=\"images/logo-4227.png\" class=\"img-responsive\" alt=\"\" /></a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- header-section-ends -->\r\n");
      out.write("\t<div class=\"wrap\">\r\n");
      out.write("\t\t<div class=\"navigation-strip\">\r\n");
      out.write("\t\t\t<h4>Your professional wine provider<i class=\"arrow\"></i></h4>\r\n");
      out.write("\t\t\t<div class=\"top-menu\">\r\n");
      out.write("\t\t\t\t<!-- start header menu -->\r\n");
      out.write("\t\t<ul class=\"megamenu skyblue\">\r\n");
      out.write("\t\t\t\t<li><a class=\"color9\" href=\"#\">Wine</a>\r\n");
      out.write("\t\t\t\t<div class=\"megapanel\">\r\n");
      out.write("\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col2\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"h_nav\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h4>Color</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Red</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Rose</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">White</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\t\r\n");
      out.write("\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col2\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"h_nav\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h4>Body</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Full</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Medium</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Light</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\t\r\n");
      out.write("\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col2\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"h_nav\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h4>Flavor</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Vanilla</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Butter</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Green apple</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Red apple</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\t\r\n");
      out.write("\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col1\"></div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col1\"></div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col1\"></div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("    \t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li><a class=\"color5\" href=\"#\">Pairings</a>\r\n");
      out.write("\t\t\t\t\t<div class=\"megapanel\">\r\n");
      out.write("\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col2\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"h_nav\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h4>Western</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"sarees.html\">Burgers</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"sarees.html\">Pasta</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"sarees.html\">Grilled fish</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\t\r\n");
      out.write("\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col2\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"h_nav\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h4>Asian</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"sarees.html\">Naan</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"sarees.html\">Chinese food</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"sarees.html\">Japanese salad</a></li>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\t\r\n");
      out.write("\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col2\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"h_nav\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h4>Snacks</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"sarees.html\">Fries</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"sarees.html\">Peanuts</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"sarees.html\">Bread</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\t\r\n");
      out.write("\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col1\"></div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col1\"></div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col1\"></div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("    \t\t\t  </div>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li><a class=\"color1\" href=\"#\">Bundles</a>\r\n");
      out.write("\t\t\t\t\t<div class=\"megapanel\">\r\n");
      out.write("\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col2\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"h_nav\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h4>Super value bundle</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">bundle1</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">bundle2</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">bundle3</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\t\r\n");
      out.write("\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col2\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"h_nav\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h4>Business bundle</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Business1</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Business2</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Business3</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\t\r\n");
      out.write("\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col2\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"h_nav\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h4>Party    bundle</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Party bundle1</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Party bundle2</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Party bundle3</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\t\r\n");
      out.write("\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col1\"></div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col1\"></div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col1\"></div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("    \t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li><a class=\"color10\" href=\"#\">General</a>\r\n");
      out.write("\t\t\t\t\t<div class=\"megapanel\">\r\n");
      out.write("\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col2\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"h_nav\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h4>Account</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Register</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Login</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\t\r\n");
      out.write("\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col2\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"h_nav\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h4>help</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Contact us</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\t\r\n");
      out.write("\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col2\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"h_nav\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h4>About us</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Company info</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Location</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\t\r\n");
      out.write("\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col1\"></div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col1\"></div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col1\"></div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("    \t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li><a class=\"color2\" href=\"#\"></a>\r\n");
      out.write("                                    <div class=\"megapanel\" hidden=\"true\" >\r\n");
      out.write("\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col1\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"h_nav\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h4>shop</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">new arrivals</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">men</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">women</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">accessories</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">kids</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">brands</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\t\r\n");
      out.write("\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col1\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"h_nav\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h4>help</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">trends</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">sale</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">style videos</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">accessories</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">kids</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">style videos</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\t\r\n");
      out.write("\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col1\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"h_nav\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h4>my company</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">trends</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">sale</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">style videos</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">accessories</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">kids</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">style videos</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\t\r\n");
      out.write("\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col1\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"h_nav\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h4>account</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">login</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">create an account</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">create wishlist</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">my shopping bag</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">brands</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">create wishlist</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\t\r\n");
      out.write("\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col1\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"h_nav\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h4>my company</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">trends</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">sale</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">style videos</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">accessories</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">kids</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">style videos</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\t\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col1\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"h_nav\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h4>popular</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">new arrivals</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">men</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">women</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">accessories</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">kids</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">style videos</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\t\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col2\"></div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col1\"></div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col1\"></div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col1\"></div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col1\"></div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("    \t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t </ul> \r\n");
      out.write("\t</div>\r\n");
      out.write("\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- start login -->\r\n");
      out.write("\t\t<section id=\"main\">\r\n");
      out.write("\t<div class=\"new-product\">\r\n");
      out.write("\t\t\t\t<div class=\"new-product-top\">\r\n");
      out.write("\t\t\t\t<div class=\"pag-nav\">\r\n");
      out.write("\t\t\t\t\t<ul class=\"p-list\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"index.jsp\">Home</a></li> &nbsp;&nbsp;/&nbsp;\r\n");
      out.write("\t\t\t\t\t\t<li class=\"act\">&nbsp;Contact</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"coats\">\r\n");
      out.write("\t\t\t        <h3 class=\"c-head\">contact-us</h3>\r\n");
      out.write("\t\t        </div>\r\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"singel_right\">\r\n");
      out.write("\t\t\t     <div class=\"lcontact span_1_of_contact\">\r\n");
      out.write("                                 (Please login before you submit inquiry)\r\n");
      out.write("                                 <div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t      <div class=\"contact-form\">\r\n");
      out.write("\t\t\t\t  \t        <form method=\"post\" action=\"contact-post.html\">\r\n");
      out.write("\t\t\t\t\t    \t    <p class=\"comment-form-author\"><label for=\"author\">Your Name:</label>\r\n");
      out.write("\t\t\t\t\t    \t    \t<input type=\"text\" class=\"textbox\" value=\"Enter your name here...\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {this.value = 'Enter your name here...';}\">\r\n");
      out.write("\t\t\t\t\t\t    \t</p>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\t\t\t        <p class=\"comment-form-author\"><label for=\"author\">Message:</label>\r\n");
      out.write("\t\t\t\t\t\t    \t  <textarea value=\"Enter your message here...\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {this.value = 'Message';}\">Enter your message here...</textarea>\r\n");
      out.write("\t\t\t\t\t\t        </p>\r\n");
      out.write("\t\t\t\t\t\t        <input name=\"submit\" type=\"submit\" id=\"submit\" value=\"Submit\">\r\n");
      out.write("\t\t\t\t\t        </form>\r\n");
      out.write("\t\t\t\t       </div>\r\n");
      out.write("\t\t\t     </div>\r\n");
      out.write("\t\t\t     <div class=\"contact_grid span_2_of_contact_right\">\r\n");
      out.write("\t\t\t\t\t<h3>Address</h3>\r\n");
      out.write("\t\t\t\t    <div class=\"address\">\r\n");
      out.write("\t\t\t\t\t\t<i class=\"pin_icon\"></i>\r\n");
      out.write("\t\t\t\t\t    <div class=\"contact_address\">\r\n");
      out.write("\t\t\t\t\t\t  Nam liber tempor cum soluta nobis eleifend option congue nihil imperdiet doming id quod mazim placerat facer possim assum. Typi non\r\n");
      out.write("\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"address\">\r\n");
      out.write("\t\t\t\t\t\t<i class=\"phone\"></i>\r\n");
      out.write("\t\t\t\t\t    <div class=\"contact_address\">\r\n");
      out.write("\t\t\t\t\t\t   1-25-2568-897\r\n");
      out.write("\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"address\">\r\n");
      out.write("\t\t\t\t\t\t<i class=\"mail\"></i>\r\n");
      out.write("\t\t\t\t\t    <div class=\"contact_email\">\r\n");
      out.write("\t\t\t\t\t\t  <a href=\"mailto:example@gmail.com\">info(at)company.com</a>\r\n");
      out.write("\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t        </div>\r\n");
      out.write("\t\t        <div class=\"clearfix\"></div>\r\n");
      out.write("\t\t    </div>\r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t <div class=\"footer\">\r\n");
      out.write("\t\t<div class=\"wrap\">\r\n");
      out.write("\t\t\t<div class=\"contact-section\">\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4 follow text-left\">\r\n");
      out.write("\t\t\t\t\t<h3>Follow Us</h3>\r\n");
      out.write("\t\t\t\t\t<p>Lorem ipsum dolor sit amet</p>\r\n");
      out.write("\t\t\t\t\t<div class=\"social-icons\">\r\n");
      out.write("\t\t\t\t\t\t<i class=\"twitter\"></i>\r\n");
      out.write("\t\t\t\t\t\t<i class=\"facebook\"></i>\r\n");
      out.write("\t\t\t\t\t\t<i class=\"googlepluse\"></i>\r\n");
      out.write("\t\t\t\t\t\t<i class=\"pinterest\"></i>\r\n");
      out.write("\t\t\t\t\t\t<i class=\"linkedin\"></i>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4 subscribe text-left\">\r\n");
      out.write("\t\t\t\t\t<h3>Subscribe Us</h3>\r\n");
      out.write("\t\t\t\t\t<p>Get the latest updates & Offers right in your inbox.</p>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"text\" value=\"\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {this.value = '';}\">\r\n");
      out.write("\t\t\t\t\t<input type=\"submit\" value=\"Subscribe\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4 help text-right\">\r\n");
      out.write("\t\t\t\t\t<h3>Need Help?</h3>\r\n");
      out.write("\t\t\t\t\t<p>Lorem ipsum dolor sit amet</p>\r\n");
      out.write("\t\t\t\t\t<a href=\"contact.html\">Contact us</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"footer-middle\">\r\n");
      out.write("\t\t\t\t<div class=\"col-md-6 different-products\">\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"first\"> Shop </li> -\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"\"> Mobiles </a></li> |\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"\"> Laptops </a></li> |\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"\"> Cameras </a></li> |\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"\"> Clothing </a></li> |\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"\"> Footwear </a></li> |\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"\"> Jewellery </a></li> \r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"first\"> Help </li> -\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"\"> Faqs </a></li> |\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"\"> shipping </a></li> |\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"\"> payments </a></li> |\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"\"> cancellation&returns </a></li> \r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"first\"> account <li> -\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"\"> log in </a></li> |\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"\"> sign up </a></li> |\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"\"> My WhishList </a></li> |\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"\"> My cart </a></li> \r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"first\"> boxshop </li> -\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"\"> contact us </a></li> |\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"\"> about us </a></li> |\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"\"> careers </a></li> |\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"\"> blog </a></li> |\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"\"> press </a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"first\"> policies</li> -\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"\"> terms of use </a></li> |\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"\"> security </a></li> |\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"\"> privacy policy</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-6 about-text text-right\">\r\n");
      out.write("\t\t\t\t\t<h4>About BoxShop</h4>\r\n");
      out.write("\t\t\t\t\t<p>The fashion never alters, and as it is neither disagreeable nor uneasy, so it is suited to the climate, and calculated both for their summers and winters. Every family makes their own clothes; but all among them, women as well as men, learn one or other of the trades formerly mentioned.</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"cards text-center\">\r\n");
      out.write("\t\t\t\t<img src=\"images/cards.jpg\" alt=\"\" />\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"copyright text-center\">\r\n");
      out.write("\t\t\t\t<p>Copyright &copy; 2015 All rights reserved | Template by  <a href=\"http://w3layouts.com\">  W3layouts</a></p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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