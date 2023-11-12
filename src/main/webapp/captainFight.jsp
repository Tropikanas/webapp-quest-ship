<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.javarush.quest.kurochkin.Texts" %>

<!DOCTYPE html>
<html>
<head>
    <title>Пиратский квест</title>
    <link href="static/main.css" rel="stylesheet">
</head>

<body>
<div class="main-square">
    <%= new Texts().beforeFightForCaptainText()%>
</div>
<div class="buttons">
    <button class="button" style="float: right" onclick="window.location='/end.jsp'">Далее</button>
</div>
</body>
</html>
