/*
 * JSP generated by Resin-resin-3.1.15 (built Mon, 13 Oct 2014 03:54:20 PDT)
 */

package _jsp._customview._com._doublechaintech._his._secuser;
import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;

public class _CustomSecUser__jsp extends com.caucho.jsp.JavaPage
{
  private static final java.util.HashMap<String,java.lang.reflect.Method> _jsp_functionMap = new java.util.HashMap<String,java.lang.reflect.Method>();
  private boolean _caucho_isDead;
  
  public void
  _jspService(javax.servlet.http.HttpServletRequest request,
              javax.servlet.http.HttpServletResponse response)
    throws java.io.IOException, javax.servlet.ServletException
  {
    javax.servlet.http.HttpSession session = request.getSession(true);
    com.caucho.server.webapp.WebApp _jsp_application = _caucho_getApplication();
    javax.servlet.ServletContext application = _jsp_application;
    com.caucho.jsp.PageContextImpl pageContext = _jsp_application.getJspApplicationContext().allocatePageContext(this, _jsp_application, request, response, null, session, 8192, true, false);
    javax.servlet.jsp.PageContext _jsp_parentContext = pageContext;
    javax.servlet.jsp.JspWriter out = pageContext.getOut();
    final javax.el.ELContext _jsp_env = pageContext.getELContext();
    javax.servlet.ServletConfig config = getServletConfig();
    javax.servlet.Servlet page = this;
    response.setContentType("text/plain; charset=utf-8");
    request.setCharacterEncoding("UTF-8");
    com.caucho.jstl.rt.SetLocaleTag _jsp_SetLocaleTag_0 = null;
    try {
      out.write(_jsp_string0, 0, _jsp_string0.length);
      if (_jsp_SetLocaleTag_0 == null) {
        _jsp_SetLocaleTag_0 = new com.caucho.jstl.rt.SetLocaleTag();
        _jsp_SetLocaleTag_0.setPageContext(pageContext);
        _jsp_SetLocaleTag_0.setParent((javax.servlet.jsp.tagext.Tag) null);
        _jsp_SetLocaleTag_0.setValue("zh_CN");
      }

      _jsp_SetLocaleTag_0.doStartTag();
      out.write('\n');
      pageContext.defaultSetOrRemove("ignoreListAccessControl", java.lang.Boolean.TRUE);
      out.write(_jsp_string1, 0, _jsp_string1.length);
      _jsp_SetLocaleTag_0.doStartTag();
      out.write('\n');
      pageContext.requestSetOrRemove("ownerBeanName", "secUser");
      out.write('\n');
      pageContext.requestSetOrRemove("ownerClassName", "SecUser");
      out.write(_jsp_string2, 0, _jsp_string2.length);
      _caucho_expr_0.print(out, _jsp_env, false);
      out.write(_jsp_string3, 0, _jsp_string3.length);
      _caucho_expr_1.print(out, _jsp_env, false);
      out.write(_jsp_string4, 0, _jsp_string4.length);
      _caucho_expr_1.print(out, _jsp_env, false);
      out.write(_jsp_string5, 0, _jsp_string5.length);
      pageContext.include("../userapp/UserApp$Blocks.jsp", false);
      out.write(_jsp_string6, 0, _jsp_string6.length);
      _caucho_expr_2.print(out, _jsp_env, false);
      out.write(_jsp_string7, 0, _jsp_string7.length);
      _caucho_expr_3.print(out, _jsp_env, false);
      out.write(_jsp_string8, 0, _jsp_string8.length);
      _caucho_expr_4.print(out, _jsp_env, false);
      out.write(_jsp_string9, 0, _jsp_string9.length);
      _caucho_expr_5.print(out, _jsp_env, false);
      out.write(_jsp_string10, 0, _jsp_string10.length);
    } catch (java.lang.Throwable _jsp_e) {
      pageContext.handlePageException(_jsp_e);
    } finally {
      if (_jsp_SetLocaleTag_0 != null)
        _jsp_SetLocaleTag_0.release();
      _jsp_application.getJspApplicationContext().freePageContext(pageContext);
    }
  }

  private java.util.ArrayList _caucho_depends = new java.util.ArrayList();

  public java.util.ArrayList _caucho_getDependList()
  {
    return _caucho_depends;
  }

  public void _caucho_addDepend(com.caucho.vfs.PersistentDependency depend)
  {
    super._caucho_addDepend(depend);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
  }

  public boolean _caucho_isModified()
  {
    if (_caucho_isDead)
      return true;
    if (com.caucho.server.util.CauchoSystem.getVersionId() != 3802963613949670813L)
      return true;
    for (int i = _caucho_depends.size() - 1; i >= 0; i--) {
      com.caucho.vfs.Dependency depend;
      depend = (com.caucho.vfs.Dependency) _caucho_depends.get(i);
      if (depend.isModified())
        return true;
    }
    return false;
  }

  public long _caucho_lastModified()
  {
    return 0;
  }

  public java.util.HashMap<String,java.lang.reflect.Method> _caucho_getFunctionMap()
  {
    return _jsp_functionMap;
  }

  public void init(ServletConfig config)
    throws ServletException
  {
    com.caucho.server.webapp.WebApp webApp
      = (com.caucho.server.webapp.WebApp) config.getServletContext();
    super.init(config);
    com.caucho.jsp.TaglibManager manager = webApp.getJspApplicationContext().getTaglibManager();
    manager.addTaglibFunctions(_jsp_functionMap, "c", "http://java.sun.com/jsp/jstl/core");
    manager.addTaglibFunctions(_jsp_functionMap, "fmt", "http://java.sun.com/jsp/jstl/fmt");
    manager.addTaglibFunctions(_jsp_functionMap, "fn", "http://java.sun.com/jsp/jstl/functions");
    com.caucho.jsp.PageContextImpl pageContext = new com.caucho.jsp.PageContextImpl(webApp, this);
    _caucho_expr_0 = com.caucho.jsp.JspUtil.createExpr(pageContext.getELContext(), "${baseURL}");
    _caucho_expr_1 = com.caucho.jsp.JspUtil.createExpr(pageContext.getELContext(), "${userContext.localeMap['@system_name']}");
    _caucho_expr_2 = com.caucho.jsp.JspUtil.createExpr(pageContext.getELContext(), "${userContext.localeMap['@home_page']}");
    _caucho_expr_3 = com.caucho.jsp.JspUtil.createExpr(pageContext.getELContext(), "${userContext.localeMap['@message']}");
    _caucho_expr_4 = com.caucho.jsp.JspUtil.createExpr(pageContext.getELContext(), "${userContext.localeMap['@account']}");
    _caucho_expr_5 = com.caucho.jsp.JspUtil.createExpr(pageContext.getELContext(), "${userContext.localeMap['@log_out']}");
  }

  public void destroy()
  {
      _caucho_isDead = true;
      super.destroy();
  }

  public void init(com.caucho.vfs.Path appDir)
    throws javax.servlet.ServletException
  {
    com.caucho.vfs.Path resinHome = com.caucho.server.util.CauchoSystem.getResinHome();
    com.caucho.vfs.MergePath mergePath = new com.caucho.vfs.MergePath();
    mergePath.addMergePath(appDir);
    mergePath.addMergePath(resinHome);
    com.caucho.loader.DynamicClassLoader loader;
    loader = (com.caucho.loader.DynamicClassLoader) getClass().getClassLoader();
    String resourcePath = loader.getResourcePathSpecificFirst();
    mergePath.addClassPath(resourcePath);
    com.caucho.vfs.Depend depend;
    depend = new com.caucho.vfs.Depend(appDir.lookup("customview/com/doublechaintech/his/secuser/CustomSecUser.jsp"), -4519205536707327498L, false);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
    depend = new com.caucho.vfs.Depend(mergePath.lookup("jar:file:/opt/resin-3.1.12/lib/resin.jar!/com/caucho/jstl/fmt.tld"), 8594578285720415164L, false);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, new com.caucho.make.ClassDependency(com.caucho.jstl.rt.SetLocaleTag.class, -5807438068488217094L));
  }

  static {
    try {
    } catch (Exception e) {
      e.printStackTrace();
      throw new RuntimeException(e);
    }
  }
  private static com.caucho.el.Expr _caucho_expr_0;
  private static com.caucho.el.Expr _caucho_expr_1;
  private static com.caucho.el.Expr _caucho_expr_2;
  private static com.caucho.el.Expr _caucho_expr_3;
  private static com.caucho.el.Expr _caucho_expr_4;
  private static com.caucho.el.Expr _caucho_expr_5;

  private final static char []_jsp_string0;
  private final static char []_jsp_string5;
  private final static char []_jsp_string7;
  private final static char []_jsp_string8;
  private final static char []_jsp_string10;
  private final static char []_jsp_string4;
  private final static char []_jsp_string2;
  private final static char []_jsp_string1;
  private final static char []_jsp_string9;
  private final static char []_jsp_string6;
  private final static char []_jsp_string3;
  static {
    _jsp_string0 = "\n\n\n\n\n\n\n".toCharArray();
    _jsp_string5 = "</h1>\n        \n        </div>\n       </div>\n    \n		\n      ".toCharArray();
    _jsp_string7 = "</a>\n    </div>\n    <div class=\"col-xs-3 text-center\">\n    	<a href=\"./secUserManager/home/\"><i class=\"glyphicon glyphicon-envelope\"></i><br/>".toCharArray();
    _jsp_string8 = "</a>\n    </div>\n\n    <div class=\"col-xs-3 text-center\"><a href=\"./secUserManager/manage//\">\n    	<i class=\"glyphicon glyphicon-user\"></i><br/>".toCharArray();
    _jsp_string10 = "</a>\n    </div>\n  </div>\n  </div>\n</div><!-- /.footer -->\n\n\n    <!-- jQuery -->\n    <script src=\"./scripts/jquery-1.9.1.js\"></script>\n\n    <!-- Bootstrap Core JavaScript -->\n    <script src=\"./bootstrap/bootstrap.min.js\"></script>\n   \n \n\n</body>\n\n</html>\n\n".toCharArray();
    _jsp_string4 = "</title>\n\n    <!-- Bootstrap Core CSS -->\n    <link href=\"./bootstrap/bootstrap.min.css\" rel=\"stylesheet\">\n\n    <!-- Custom styles for this template -->\n    <link href=\"./bootstrap/signin.css\" rel=\"stylesheet\">\n    <!-- Custom CSS -->\n     <link href=\"./bootstrap/sec-user.css\" rel=\"stylesheet\">\n     <link href=\"./bootstrap/font-awesome.min.css\" rel=\"stylesheet\">\n    <script src=\"./scripts/modernizr.min.js\" type=\"text/javascript\"></script>\n\n    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\n    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n    <!--[if lt IE 9]>\n        <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n        <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\n    <![endif]-->\n\n</head>\n\n<body>\n\n    \n\n    <!-- Page Content -->\n    <div class=\"container\">\n    \n    	\n    	<div class=\"row\">\n        <div class=\"col-xs-12 col-lg-12 col-lm-12 col-xm-12 text-center sysname\">\n       \n        <h1>".toCharArray();
    _jsp_string2 = "\n\n<!DOCTYPE html>\n<html lang=\"en\">\n\n<head>\n	<base href=\"".toCharArray();
    _jsp_string1 = "\n\n".toCharArray();
    _jsp_string9 = "</a>\n    </div>\n    <div class=\"col-xs-3 text-center\"><a href=\"./secUserManager/showlogin/\">\n    	<i class=\"glyphicon glyphicon-user\"></i><br/>".toCharArray();
    _jsp_string6 = "\n\n \n\n\n    </div>\n    <!-- /.container -->\n    \n    \n <div id=\"footer\">\n  <div class=\"col-xs-12 navbar-inverse navbar-fixed-bottom\">\n  <div class=\"row\" id=\"bottomNav\">\n   <div class=\"col-xs-3 text-center\">\n    	<a href=\"./secUserManager/home/\"><i class=\"glyphicon glyphicon-home\"></i><br/>".toCharArray();
    _jsp_string3 = "/\" />\n    <meta charset=\"utf-8\">\n    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n    <meta name=\"description\" content=\"\">\n    <meta name=\"author\" content=\"\">\n\n    <title>".toCharArray();
  }
}
