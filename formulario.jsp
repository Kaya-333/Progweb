<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Formulário de Informações Pessoais</title>
</head>
<body>
<form action="InformacoesServlet" method="post">
    <label for="nome">Nome:</label>
    <input type="text" name="nome" required><br><br>
    
    <label for="estadoCivil">Estado Civil:</label>
    <select name="estadoCivil">
        <option value="Solteiro(a)">Solteiro(a)</option>
        <option value="Casado(a)">Casado(a)</option>
        <option value="Divorciado(a)">Divorciado(a)</option>
        <option value="Viúvo(a)">Viúvo(a)</option>
    </select><br><br>
    
    <label for="faixaEtaria">Faixa Etária:</label>
    <select name="faixaEtaria">
        <option value="3 a 10 anos">3 a 10 anos</option>
        <option value="11 a 25 anos">11 a 25 anos</option>
        <option value="36 a 55 anos">36 a 55 anos</option>
        <option value="56 a 100 anos">56 a 100 anos</option>
    </select><br><br>
    
    <input type="submit" value="Enviar">
</form>
</body>
</html>
