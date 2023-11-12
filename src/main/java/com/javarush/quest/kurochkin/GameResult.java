package com.javarush.quest.kurochkin;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

public class GameResult extends HttpServlet {
    public static boolean showEndText;
    public static String fightText;
    public static Ends end;
    public static Ends endText = Ends.ENDTEXT;

    public boolean getShowEndText(){
        return showEndText;
    }
    public String getFightText(){
        return fightText;
    }
    public String getEnd(){
        return end.getEnd();
    }


    public String checkGameResult(HttpServletRequest request, HttpServletResponse response, HttpSession currentSession) throws ServletException, IOException {
        String weapon = currentSession.getAttribute("weapon").toString();
        String helpHenry = currentSession.getAttribute("helpHenry").toString();
        String helpCaptain = currentSession.getAttribute("helpCaptain").toString();


        if (helpCaptain.equals("no")) {
            if (helpHenry.equals("no")) {
                showEndText = true;
                end = Ends.END4;
            } else if (helpHenry.equals("yes")) {
                showEndText = true;
                end = Ends.END2;
            }
        } else if (helpCaptain.equals("yes")){
            if (weapon.equals("candlestick")){      //Концовки с подсвечником
                if (helpHenry.equals("yes")){
                    fightText = new Texts().candlestickAndHenry();
                    showEndText = true;
                    end = Ends.END1;
                } else if (helpHenry.equals("no")){
                    fightText = new Texts().candlestickWithoutHenry();
                    end = Ends.END3;
                }
            }

            if (weapon.equals("saber")) {      //Концовки с саблей
                if (helpHenry.equals("yes")){
                    //С не самым "стабильным" оружием (сабля, цепь) концовка отчасти зависит от удачи, проверяем удачу
                    double num = Math.random();
                    if (num < 0.80){
                        fightText = new Texts().saberAndHenryWin();
                        showEndText = true;
                        end = Ends.END5;
                    } else {
                        fightText = new Texts().saberAndHenryDefeat();
                        end = Ends.END6;
                    }
                } else if (helpHenry.equals("no")) {
                    //С не самым "стабильным" оружием (сабля, цепь) концовка отчасти зависит от удачи, проверяем удачу
                    double num = Math.random();
                    if (num < 0.65) {
                        fightText = new Texts().saberWithoutHenryWin();
                        showEndText = true;
                        end = Ends.END7;
                    } else {
                        fightText = new Texts().saberWithoutHenryDefeat();
                        end = Ends.END3;
                    }
                }
            }

            if (weapon.equals("chain")){    //Концовки с цепью
                if (helpHenry.equals("yes")){
                    //С не самым "стабильным" оружием (сабля, цепь) концовка отчасти зависит от удачи, проверяем удачу
                    double num = Math.random();
                    if (num < 0.65){
                        fightText = new Texts().chainAndHenryWin();
                        showEndText = true;
                        end = Ends.END5;
                    } else {
                        fightText = new Texts().chainAndHenryDefeat();
                        end = Ends.END6;
                    }
                } else if (helpHenry.equals("no")) {
                    //С не самым "стабильным" оружием (сабля, цепь) концовка отчасти зависит от удачи, проверяем удачу
                    double num = Math.random();
                    if (num < 0.45) {
                        fightText = new Texts().chainWithoutHenryWin();
                        showEndText = true;
                        end = Ends.END7;
                    } else {
                        fightText = new Texts().chainWithoutHenryDefeat();
                        end = Ends.END3;
                    }
                }
            }

            if (weapon.equals("revolver")) {    //Концовки с револьвером
                fightText = new Texts().revolver(); // Одинаково для револьвера что с генри, что без него
                showEndText = true;
                if (helpHenry.equals("yes")){
                    end = Ends.END5;
                } else if (helpHenry.equals("no")) {
                    end = Ends.END7;
                }
            }
        }
    return "";
    }
}
