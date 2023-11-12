<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.javarush.quest.kurochkin.Ends" %>
<%@ page import="com.javarush.quest.kurochkin.GameResult" %>


<!DOCTYPE html>
<html>
<head>
    <title>Пиратский квест</title>
    <link href="static/main.css" rel="stylesheet">
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <script src="<c:url value="/static/jquery-3.6.0.min.js"/>"></script>

</head>

<body>

<div class="main-square">
<% GameResult gameResult = new GameResult();%>
<%
    if (gameResult.getFightText() != null){
%>
        <%= gameResult.getFightText()%>
<%  }
%>

<%
    if (gameResult.getShowEndText()){
%>
<%--        <p><%= gameResult.endText%></p>--%>
        <p><%= Ends.ENDTEXT.getEnd()%></p>
<%  }
%>

    <span style="font-size: 2.5ex; text-align: center"><p style="margin-bottom: 5px;">ИТОГ ИГРЫ:</p></span><br>
<div style="text-align: center"><%= gameResult.getEnd() %></div>
</div>


<div class="buttons">
    <button class="button" onclick="window.location.href = '/restart'">Сыграть ещё раз</button>
</div>

</body>

</html>
