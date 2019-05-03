package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"pt-br\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("        <title>Home</title>\n");
      out.write("\n");
      out.write("        <!-- Bootstrap core CSS -->\n");
      out.write("        <link href=\"vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Custom fonts for this template -->\n");
      out.write("        <link href=\"vendor/fontawesome-free/css/all.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Varela+Round\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Custom styles for this template -->\n");
      out.write("        <link href=\"css/grayscale.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/grayscale.css\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body id=\"page-top\">\n");
      out.write("\n");
      out.write("        <!-- Navigation -->\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-light fixed-top\" id=\"mainNav\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <a class=\"navbar-brand js-scroll-trigger\" href=\"#page-top\">Projeto 5</a>\n");
      out.write("                <button class=\"navbar-toggler navbar-toggler-right\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarResponsive\" aria-controls=\"navbarResponsive\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                    Menu\n");
      out.write("                    <i class=\"fas fa-bars\"></i>\n");
      out.write("                </button>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarResponsive\">\n");
      out.write("                    <ul class=\"navbar-nav ml-auto\">\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link js-scroll-trigger\" href=\"#clientes\">Clientes</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link js-scroll-trigger\" href=\"#fornecedores\">Fornecedores</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link js-scroll-trigger\" href=\"#signup\">Informações</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <!-- Header -->\n");
      out.write("        <header class=\"masthead\">\n");
      out.write("            <div class=\"container d-flex h-100 align-items-center\">\n");
      out.write("                <div class=\"mx-auto text-center\">\n");
      out.write("                    <h1 class=\"mx-auto my-0 text-uppercase\">Projeto 5</h1>\n");
      out.write("                    <h2 class=\"text-white-50 mx-auto mt-2 mb-5\">Consulta a um servidor de Banco de Dados JavaDB.</h2>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("        <!-- Clientes -->\n");
      out.write("        <section id=\"clientes\" class=\"projects-section bg-light\" style=\"margin-top: -50px\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("\n");
      out.write("                <!-- Featured Project Row -->\n");
      out.write("                <div class=\"row align-items-center no-gutters mb-4 mb-lg-5\">\n");
      out.write("                    <div class=\"col-xl-8 col-lg-7\">\n");
      out.write("                        <img class=\"img-fluid mb-3 mb-lg-0\" src=\"img/clientes2.jpg\" alt=\"\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-xl-4 col-lg-5\">\n");
      out.write("                        <div class=\"featured-text text-center text-lg-left\">\n");
      out.write("                            <h4>Clientes</h4>\n");
      out.write("                            <p class=\"text-black-50 mb-0\">Nossos clientes são fundamentais para o progresso de nossa organização. A cada nova parceria, um novo laço de amizade e confiança!</p>\n");
      out.write("                            <button type=\"button\" class=\"btn btn-dark\">Consultar</button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>      \n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <!-- Fornecedores -->\n");
      out.write("        <section id=\"fornecedores\" class=\"projects-section bg-light\">\n");
      out.write("            <div class=\"container\" style=\" margin-top: -150px;\">\n");
      out.write("\n");
      out.write("                <!-- Featured Project Row -->\n");
      out.write("                <div class=\"row align-items-center no-gutters mb-4 mb-lg-5\">\n");
      out.write("                    <div class=\"col-xl-8 col-lg-7\">\n");
      out.write("                        <img class=\"img-fluid mb-3 mb-lg-0\" src=\"img/fornecedores.png\" alt=\"\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-xl-4 col-lg-5\">\n");
      out.write("                        <div class=\"featured-text text-center text-lg-left\">\n");
      out.write("                            <h4>Fornecedores</h4>\n");
      out.write("                            <p class=\"text-black-50 mb-0\">Os fornecedores são os que nos ajudam a estar em dia com nossos clientes, sem eles não seríamos o mesmo. Sempre atribuímos parte do nosso sucesso a eles.</p>\n");
      out.write("                            <button type=\"button\" class=\"btn btn-dark\">Consultar</button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>      \n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Informações Section -->\n");
      out.write("        <section id=\"signup\" class=\"signup-section bg-black\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("\n");
      out.write("                <div class=\"row\">\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-4 mb-3 mb-md-0\">\n");
      out.write("                        <div class=\"card py-4 h-100\">\n");
      out.write("                            <div class=\"card-body text-center\">\n");
      out.write("                                <i class=\"fas fa-map-marked-alt text-primary mb-2\"></i>\n");
      out.write("                                <h4 class=\"text-uppercase m-0\">Manoel Victor</h4>\n");
      out.write("                                <hr class=\"my-4\">\n");
      out.write("                                <center>\n");
      out.write("                                    <div class=\"circle\">\n");
      out.write("                                        <a href=\"https://github.com/ManoelRodriguez\"><img src=\"img/Manoel.jpeg\"></a>\n");
      out.write("                                    </div>\n");
      out.write("                                </center>\n");
      out.write("                                <div class=\"small text-black-50\">Análise e Desenvolvimento de Sistemas, Fatec</div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-4 mb-3 mb-md-0\">\n");
      out.write("                        <div class=\"card py-4 h-100\">\n");
      out.write("                            <div class=\"card-body text-center\">\n");
      out.write("                                <i class=\"fas fa-map-marked-alt text-primary mb-2\"></i>\n");
      out.write("                                <h4 class=\"text-uppercase m-0\">Jefferson V.</h4>\n");
      out.write("                                <hr class=\"my-4\">\n");
      out.write("                                <center>\n");
      out.write("                                    <div class=\"circle\">\n");
      out.write("                                        <a href=\"https://github.com/JVasconcelosSilva\"><img src=\"img/Jefferson-Foto.jpg\"></a>\n");
      out.write("                                    </div>\n");
      out.write("                                </center>\n");
      out.write("                                <div class=\"small text-black-50\">Análise e Desenvolvimento de Sistemas, Fatec</div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-4 mb-3 mb-md-0\">\n");
      out.write("                        <div class=\"card py-4 h-100\">\n");
      out.write("                            <div class=\"card-body text-center\">\n");
      out.write("                                <i class=\"fas fa-mobile-alt text-primary mb-2\"></i>\n");
      out.write("                                <h4 class=\"text-uppercase m-0\">Telefone</h4>\n");
      out.write("                                <hr class=\"my-4\">\n");
      out.write("                                <div class=\"small text-black-50\">+55 (13) 99902-8832</div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <!-- Footer -->\n");
      out.write("        <footer class=\"bg-black small text-center text-white-50\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                Copyright &copy; Fatec 2019\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("\n");
      out.write("        <!-- Bootstrap core JavaScript -->\n");
      out.write("        <script src=\"vendor/jquery/jquery.min.js\"></script>\n");
      out.write("        <script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Plugin JavaScript -->\n");
      out.write("        <script src=\"vendor/jquery-easing/jquery.easing.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Custom scripts for this template -->\n");
      out.write("        <script src=\"js/grayscale.min.js\"></script>\n");
      out.write("\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\" integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\" integrity=\"sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
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
