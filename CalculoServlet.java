import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class CalculoServlet extends HttpServlet {
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        
        // Recuperar os números do formulário
        int numero1 = Integer.parseInt(request.getParameter("numero1"));
        int numero2 = Integer.parseInt(request.getParameter("numero2"));
        
        // Realizar as operações
        int soma = numero1 + numero2;
        int subtracao = numero1 - numero2;
        int multiplicacao = numero1 * numero2;
        double divisao = (double) numero1 / numero2;
        int resto = numero1 % numero2;
        
        // Enviar a resposta
        ServletOutputStream out = response.getOutputStream();
        out.println("<html>");
        out.println("<head><title>Resultados</title></head>");
        out.println("<body>");
        out.println("<p>Número 1: " + numero1 + "</p>");
        out.println("<p>Número 2: " + numero2 + "</p>");
        out.println("<p>Soma: " + soma + "</p>");
        out.println("<p>Subtração: " + subtracao + "</p>");
        out.println("<p>Multiplicação: " + multiplicacao + "</p>");
        out.println("<p>Divisão: " + divisao + "</p>");
        out.println("<p>Resto da Divisão: " + resto + "</p>");
        out.println("</body>");
        out.println("</html>");
    }
}
