<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Пиратский квест</title>
    <link href="static/main.css" rel="stylesheet">
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>

<% String word = "";%>
<c:if test="${weapon.equals('candlestick')}">
    <% word = "подсвечник";%>
</c:if>
<c:if test="${weapon.equals('chain')}">
    <% word = "металлическую цепь";%>
</c:if>
<c:if test="${weapon.equals('saber')}">
    <% word = "саблю";%>
</c:if>
<c:if test="${weapon.equals('revolver')}">
    <% word = "револьвер";%>
</c:if>


<div class="main-square">
    Держа <%= word%> в руках, вы аккуратно поднимаетесь по лестнице к выходу на палубу. Вдруг вас кто-то хватает за ногу. Вы вглядываетесь в темноту и видите, что это ваш друг Генри.<br>
    - Пираты захватили судно, наших всех перебили. Надо спасаться, но как? Я еле передвигаюсь.<br>
    Похоже, Генри серьёзно ранен.
    <span style="font-size: 2.5ex; text-align: center"><p style="margin-bottom: 5px;">Помочь ему встать и пойти дальше вместе или разведать обстановку и вернуться за Генри позже?</p></span><br>
</div>
<div class="buttons">
    <button class="button" onclick="window.location='/henry?helpHenry=yes'">Помочь сейчас</button>
    <button class="button" onclick="window.location='/henry?helpHenry=no'">Вернуться позже</button>
</div>
</body>
</html>





