<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Пиратский квест</title>
    <link href="static/main.css" rel="stylesheet">
</head>
<body>
<div class="main-square">
    Вы поднялись на палубу. В нос ударил морской воздух, звёзды на небе тускло озарили корабль. На палубе никого не видно, но вы замечаете, что к кораблю пришвартован пиратский бриг. Видимо, пираты разграбили ваш корабль и самодовольно легли спать. Но пусть они и пираты, вряд ли не оставили сторожевых. Аккуратно вглядываясь в темноту, вы замечаете вашего капитана, лежащего связанным на мостике, и неподалёку от него дремлющего на мешках пирата.
    <span style="font-size: 2.5ex; text-align: center"><p style="margin-bottom: 5px;">Попытаться спасти капитана или спустить на воду шлюпку и спастись бегством?</p></span><br>
</div>
    <div class="buttons">
        <button class="button" onclick="window.location='/captain?helpCaptain=yes'">Попытаться спасти капитана</button>
        <button class="button" onclick="window.location='/captain?helpCaptain=no'">Спастись самому</button>
    </div>
</body>
</html>



