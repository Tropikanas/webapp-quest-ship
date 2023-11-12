package com.javarush.quest.kurochkin;

public enum Ends {

    ENDTEXT("Вы спускаете на воду шлюпку, и, оттолкнувшись от вашего славного корабля, отталкиваетесь от борта навстречу неизвестности."),
    END1("Вы с Капитаном спаслись, Генри погиб."),
    END2("Вы, Генри спаслись, Капитан остался на корабле."),
    END3("Вы погибли, Генри и Капитан остались на корабле."),
    END4("Вы спаслись, Генри и Капитан остались на корабле."),
    END5("Вы, Генри, Капитан спаслись."),
    END6("Вы погибли, Генри и Капитан спаслись."),
    END7("Вы с Капитаном спаслись, Генри остался на корабле.");

    private final String end;

    Ends(String end) {
        this.end = end;
    }

    public String getEnd() {
        return end;
    }

}