package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Herois - Vingadores</title>\n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                background-image:url(img/simbolo.jpg);\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("     </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Qual dos Vingadores é você?</h1>\n");
      out.write("        <form name=\"quiz\" id=\"quiz\">\n");
      out.write("            <div>\n");
      out.write("            <p id=\"questao1\">1. Quem é você em uma festa de amigos?</p>\n");
      out.write("            <p><input type=\"radio\" name=\"questao1\" value=4>a) A pessoa que controla a música e agita a festa.</p>\n");
      out.write("            <p><input type=\"radio\" name=\"questao1\" value=2>b) Alguém entre os que estão dançando.</p>\n");
      out.write("            <p><input type=\"radio\" name=\"questao1\" value=3>c) Está sempre perto da mesa de comida.</p>\n");
      out.write("            <p><input type=\"radio\" name=\"questao1\" value=1>d) Está em casa, longe da festa.</p>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div>\n");
      out.write("            <p id=\"questao2\">2. Em uma decisão difícil, com seus amigos, você:</p>\n");
      out.write("            <p><input type=\"radio\" name=\"questao2\" value=4>a) Faz o que é certo, acima de tudo.</p>\n");
      out.write("            <p><input type=\"radio\" name=\"questao2\" value=3>b) Decide em conjunto e faz o que todos acharem melhor.</p>\n");
      out.write("            <p><input type=\"radio\" name=\"questao2\" value=2>c) Calcula as alternativas e mostra para todo mundo onde há menos danos.</p>\n");
      out.write("            <p><input type=\"radio\" name=\"questao2\" value=1>d) Espera alguém decidir e vai na onda.</p>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div>\n");
      out.write("            <p id=\"questao3\">3. Sua maior habilidade no meio da crise:</p>\n");
      out.write("            <p><input type=\"radio\" name=\"questao3\" value=3>a) Força.</p>\n");
      out.write("            <p><input type=\"radio\" name=\"questao3\" value=4>b) Lealdade.</p>\n");
      out.write("            <p><input type=\"radio\" name=\"questao3\" value=1>c) Pensamento Lógico.</p>\n");
      out.write("            <p><input type=\"radio\" name=\"questao3\" value=2>d) Abordagem criativa.</p>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div>\n");
      out.write("            <p id=\"questao4\">4. Qual dessas frases se aplica mais a você?</p>\n");
      out.write("            <p><input type=\"radio\" name=\"questao4\" value=1>a) \"Se eu tivesse oito horas para derrubar uma árvore, passaria seis afiando meu machado\" (Abraham Linconl).</p>\n");
      out.write("            <p><input type=\"radio\" name=\"questao4\" value=4>b) \"Mil vidas eu tivesse, mil vidas eu daria pela libertação da minha pátria\" (Tiradentes).</p>\n");
      out.write("            <p><input type=\"radio\" name=\"questao4\" value=2>c) \"Lutar pelo amor é bom, mas alcançá-lo sem luta é melhor\" (William Shakespeare).</p>\n");
      out.write("            <p><input type=\"radio\" name=\"questao4\" value=3>d) \"O verdadeiro homem mede a sua força quando se defronta com o obstáculo\" (Antonie de Saint-Exupéry).</p>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div>\n");
      out.write("            <p id=\"questao5\">5. Como se faz para que os outros realizem uma tarefa?</p>\n");
      out.write("            <p><input type=\"radio\" name=\"questao5\" value=1>a) Cria um passo a passo para a realização da tarefa.</p>\n");
      out.write("            <p><input type=\"radio\" name=\"questao5\" value=2>b) Explica a tarefa e apresenta os motivos pelos quais deveriam fazer.</p>\n");
      out.write("            <p><input type=\"radio\" name=\"questao5\" value=3>c) Dá ordem de forma firme e direta.</p>\n");
      out.write("            <p><input type=\"radio\" name=\"questao5\" value=4>d) Faz primeiro e chama para seguirem seu exemplo.</p>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div>\n");
      out.write("            <p id=\"questao6\">6. Um colega seu está fazendo algo errado para prejudicar alguém. Você:</p>\n");
      out.write("            <p><input type=\"radio\" name=\"questao6\" value=2>a) Monta um plano para expôr o que o colega está fazendo de errado.</p>\n");
      out.write("            <p><input type=\"radio\" name=\"questao6\" value=1>b) Apronta algo para que ele se dê mal.</p>\n");
      out.write("            <p><input type=\"radio\" name=\"questao6\" value=4>c) Conta para alguém que é autoridade sobre ele.</p>\n");
      out.write("            <p><input type=\"radio\" name=\"questao6\" value=3>d) Confronta ele para tirar satisfações.</p>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div>\n");
      out.write("            <p id=\"questao7\">7. Qual desses objetivos as outras pessoas usariam pra te descrever melhor?</p>\n");
      out.write("            <p><input type=\"radio\" name=\"questao7\" value=3>a) Forte.</p>\n");
      out.write("            <p><input type=\"radio\" name=\"questao7\" value=1>b) Inteligente.</p>\n");
      out.write("            <p><input type=\"radio\" name=\"questao7\" value=2>c) Sem medo.</p>\n");
      out.write("            <p><input type=\"radio\" name=\"questao7\" value=4>d) Habilidoso/a.</p>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div>\n");
      out.write("            <p id=\"questao8\">8. Sua maior habilidade no meio da crise:</p>\n");
      out.write("            <p><input type=\"radio\" name=\"questao8\" value=2>a) Força.</p>\n");
      out.write("            <p><input type=\"radio\" name=\"questao8\" value=1>b) Lealdade.</p>\n");
      out.write("            <p><input type=\"radio\" name=\"questao8\" value=3>c) Pensamento Lógico.</p>\n");
      out.write("            <p><input type=\"radio\" name=\"questao8\" value=4>d) Abordagem criativa.</p>\n");
      out.write("            </div>\n");
      out.write("            <button id=\"botao\">Resultado</button>\n");
      out.write("            \n");
      out.write("           \n");
      out.write("        </form>\n");
      out.write("    </body>\n");
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
