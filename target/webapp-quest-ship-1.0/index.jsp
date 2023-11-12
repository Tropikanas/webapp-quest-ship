<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
<head>
    <title>Пиратский квест</title>
    <link href="static/main.css" rel="stylesheet">
</head>
<body>
<div class="main-square">
    Вы просыпаетесь в трюме корабля «Queen Elizabeth», кругом дым, пахнет смолой, порохом и деревом. Голова раскалывается от боли, тело ломит. Немного придя в себя, вы поднимаетесь и видите вокруг полный бардак, тела собратьев-моряков, разбитые пушки и дыры в корпусе корабля.<br>
    - Пираты!<br>
    Вы вспоминаете, что перед тем, как отключиться, корабль попал под пушечный обстрел.<br>
    - Надо аккуратно подняться на палубу и осмотреться. Наверху подозрительно тихо.<br>
    Среди обломков вы видите разные вещи, но чтобы оставить хотя бы одну руку свободной, можете взять только что-то одно.<br>
    <span style="font-size: 2.5ex; text-align: center"><p style="margin-bottom: 5px;">Выберите, что возьмёте с собой</p></span><br>
</div>
<div class="buttons">
    <form action='/logic'>
        <div class="radio-button">
            <input id=radio-1" name="weapon" type="radio" value="candlestick">
            <label for=radio-1">Подсвечник</label>
        </div>
        <div class="radio-button">
            <input id=radio-2" name="weapon" type="radio" value="chain">
            <label for=radio-2">Металлическая цепь</label>
        </div>
        <div class="radio-button">
            <input id=radio-3" name="weapon" type="radio" value="saber">
            <label for=radio-3">Сабля</label>
        </div>
        <div class="radio-button">
            <input id=radio-4" name="weapon" type="radio" value="revolver">
            <label for=radio-4">Револьвер</label>
        </div>
        <input class="submit-button" type="submit" value="Выбрать" >
    </form>
</div>
</body>
</html>





