import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class InformacoesServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        // Recuperar os dados do formulário
        String nome = request.getParameter("nome");
        String estadoCivil = request.getParameter("estadoCivil");
        String faixaEtaria = request.getParameter("faixaEtaria");

        // Concatenar as informações
        String informacoesConcatenadas = String.format("Nome: %s<br>Estado Civil: %s<br>Faixa Etária: %s",
                nome, estadoCivil, faixaEtaria);

        // Enviar a resposta
        ServletOutputStream out = response.getOutputStream();
        out.println("<html>");
        out.println("<head><title>Informações Concatenadas</title></head>");
        out.println("<body>");
        out.println("<p>" + informacoesConcatenadas + "</p>");
        out.println("</body>");
        out.println("</html>");
    }
}
