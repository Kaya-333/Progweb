import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.Calendar;

public class IdadeServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        // Recuperar os dados do formulário
        int anoNascimento = Integer.parseInt(request.getParameter("anoNascimento"));
        String jaFezAniversario = request.getParameter("jaFezAniversario");

        // Obter o ano atual
        int anoAtual = Calendar.getInstance().get(Calendar.YEAR);

        // Calcular a idade
        int idade = anoAtual - anoNascimento;
        if ("nao".equals(jaFezAniversario)) {
            idade--; // Subtrai 1 se a pessoa ainda não fez aniversário este ano
        }

        // Enviar a resposta
        ServletOutputStream out = response.getOutputStream();
        out.println("<html>");
        out.println("<head><title>Idade</title></head>");
        out.println("<body>");
        out.println("<p>Ano de Nascimento: " + anoNascimento + "</p>");
        out.println("<p>Já fez aniversário este ano? " + jaFezAniversario + "</p
