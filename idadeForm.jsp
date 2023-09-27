<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calcular Idade</title>
</head>
<body>
<form action="IdadeServlet" method="get">
    <label for="anoNascimento">Ano de Nascimento:</label>
    <input type="number" name="anoNascimento" required><br><br>
    
    <label for="jaFezAniversario">Já fez aniversário este ano?</label>
    <select name="jaFezAniversario">
        <option value="sim">Sim</option>
        <option value="nao">Não</option>
    </select><br><br>
    
    <input type="submit" value="Calcular Idade">
</form>
</body>
</html>
