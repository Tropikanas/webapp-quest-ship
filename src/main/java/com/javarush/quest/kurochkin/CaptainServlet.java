package com.javarush.quest.kurochkin;

import java.io.IOException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "CaptainServlet", value = "/captain")
public class CaptainServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Получаем текущую сессию
        HttpSession currentSession = request.getSession();

        // Получаем решение пользователя помочь или нет Капитану
        String helpCaptain = request.getParameter("helpCaptain");
        currentSession.setAttribute("helpCaptain", helpCaptain);

        // Создаем окончание игры, чтобы нужные поля заполнить нужным текстом
      String game = new GameResult().checkGameResult(request, response, currentSession);

        // Проверяем решение игрока о помощи Кэпу. От этого зависит, какую страничку покажем
        if (helpCaptain.equals("yes")){
            response.sendRedirect(response.encodeRedirectURL("/captainFight.jsp"));
        } else{
            response.sendRedirect(response.encodeRedirectURL("/end.jsp"));
        }
    }

}