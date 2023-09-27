<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Formulário de Cálculos</title>
</head>
<body>
<form action="CalculoServlet" method="post">
    <label for="numero1">Número 1:</label>
    <input type="number" name="numero1" required><br><br>
    
    <label for="numero2">Número 2:</label>
    <input type="number" name="numero2" required><br><br>
    
    <input type="submit" value="Calcular">
</form>
</body>
</html>
