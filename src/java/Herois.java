import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * @author diego
 */
public class Herois extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String resposta = "";
        String imagem = "";
                
        try {
            String valor1, valor2, valor3, valor4, valor5, valor6, valor7, valor8;
            int val1 = 0;
            int val2 = 0;
            int val3 = 0; 
            int val4 = 0; 
            int val5 = 0; 
            int val6 = 0;
            int val7 = 0; 
            int val8 = 0;

            int soma;
                   
            valor1 = request.getParameter("questao1");
            valor2 = request.getParameter("questao2"); 
            valor3 = request.getParameter("questao3");
            valor4 = request.getParameter("questao4"); 
            valor5 = request.getParameter("questao5"); 
            valor6 = request.getParameter("questao6"); 
            valor7 = request.getParameter("questao7");
            valor8 = request.getParameter("questao8");
            
            // Atibuição de valores as opções do Quiz
            if (null != valor1) 
                switch (valor1) {
                    case "a":
                        val1 = 4;
                        break;
                    case "b":
                        val1 = 2;
                        break;
                    case "c":
                        val1 = 3;
                        break;
                    case "d":
                        val1 = 1;
                        break;
                    default:
                        break;
                }
            
            if (null != valor2)
                switch (valor2) {
                    case "a":
                        val2= 4;
                        break;
                    case "b":
                        val2= 3;
                        break;
                    case "c":
                        val2= 2;
                        break;
                    case "d":
                        val2= 1;
                        break;
                    default:
                        break;
                }

            if (null != valor3)
                switch (valor3){
                    case "a":
                        val3 = 3;
                        break;
                    case "b":
                        val3 = 4;
                        break;
                    case "c":
                        val3 = 1;
                        break;
                    case "d":
                        val3 = 2;
                        break;
                    default:
                        break;
                }
            
            if (null != valor4)
                switch (valor4) {
                    case "a":
                        val4 = 1;
                        break;
                    case "b":
                        val4= 4;
                        break;
                    case "c":
                        val4 = 2;
                        break;
                    case "d":
                        val4 = 3;
                        break;
                    default:
                        break;
                }
            
            if (null != valor5)
                switch (valor5) {
                    case "a":
                        val5 = 1;
                        break;
                    case "b":
                        val5 = 2;
                        break;
                    case "c":
                        val5 = 3;
                        break;
                    case "d":
                        val5 = 4;
                        break;
                    default:
                        break;
                }
            
            if (null != valor6)
                switch (valor6) {
                    case "a":
                        val6 = 2;
                        break;
                    case "b":
                        val6 = 1;
                        break;
                    case "c":
                        val6 = 4;
                        break;
                    case "d":
                        val6 = 3;
                        break;
                    default:
                        break;
                }
            
            if (null != valor7)
                switch (valor7) {
                    case "a":
                        val7 = 3;
                        break;
                    case "b":
                        val7 = 1;
                        break;
                    case "c":
                        val7 = 2;
                        break;
                    case "d":
                        val7 = 4;
                        break;
                    default:
                        break;
                }

            if (null != valor8)
                switch (valor8) {
                    case "a":
                        val8 = 2;
                        break;
                    case "b":
                        val8 = 1;
                        break;
                    case "c":
                        val8 = 3;
                        break;
                    case "d":
                        val8 = 4;
                        break;
                    default:
                        break;
                }
             
            
            soma = val1 + val2 + val3 + val4 + val5 + val6 + val7 + val8;
             
              if(soma >= 8 && soma <= 10){
                resposta = "O HOMEM-ARANHA";
                imagem = "<img src='img/aranha.png' alt='Imagem de personagem' width='450' height='380'>"; 
            } else if (soma >= 11 && soma <= 13) {
                resposta = "O DOUTOR ESTRANHO";
                imagem = "<img src='img/drEstranho.jpg' alt='Imagem de personagem' width='450' height='500'>";
            } else if (soma >= 14 && soma <= 16){
                resposta = "A FEITICEIRA ESCARLATE";
                imagem = "<img src= 'img/feiticeira.jpg' alt='Imagem de personagem' width='450' height='400'>"; 
            } else if (soma >= 17 && soma <= 19){
                resposta = "O THOR";
                imagem = "<img src='img/thor.jpg'alt='Imagem de personagem' width='450' height='380'>"; 
            } else if (soma >= 20 && soma <= 22){
                resposta = "O HULK";
                imagem = "<img src='img/hulk.jpg' alt='Imagem de personagem' width='450' height='380'>"; 
            } else if (soma >= 23 && soma <= 25){
                resposta = "A VIÚVA NEGRA";
                imagem = "<img src='img/viuvaNegra.jpg' alt='Imagem de personagem' width='450' height='400'>";
            } else if (soma >= 26 && soma <= 28){
                resposta = "O HOMEM DE FERRO";
               imagem = "<img src='img/homemFerro.jpg' alt='Imagem de personagem' width='450' height='380'>";
            } else if (soma >= 29 && soma <= 32){
                resposta = "O CAPITÃO AMÉRICA";
                imagem = "<img src='img/capitao.png' alt='Imagem de personagem' width='450' height='500'>";
            }
        } catch (NullPointerException e){
            resposta = "Não foi possível executar o programa. Tente novamente";
        } 
        catch(NumberFormatException e){
            resposta = "Dados invalidos. Impossível converter para números.";
        }
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<link rel='stylesheet' href='css/estilos.css'>");
            out.println("<title>Qual dos Vingadores é você?</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Você é: </h1><br/>");
            out.println("<h1>" + resposta + "</h1><br/>");
            out.println("<div><p>" + imagem + "</p></div>");
            out.println("<button id='botao'><a href='http://localhost:8080/Herois'>Voltar</a></button>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
