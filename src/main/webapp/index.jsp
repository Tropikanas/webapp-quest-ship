<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
<head>
    <title>Пиратский квест</title>
    <link href="static/main.css" rel="stylesheet">
</head>
<body>

<form action='/logic'>
    <p><b>Выберите, что возьмёте с собой</b></p>
    <p><input name="weapon" type="radio" value="candlestick"> Подсвечник</p>
    <p><input name="weapon" type="radio" value="chain"> Металлическая цепь</p>
    <p><input name="weapon" type="radio" value="saber"> Сабля</p>
    <p><input name="weapon" type="radio" value="revolver"> Револьвер</p>
    <p><input type="submit" value="Выбрать"></p>
</form>
<button onclick="window.location='/logic'">Тестовая кнопка</button>

</body>
</html>
