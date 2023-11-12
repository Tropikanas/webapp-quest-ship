package com.javarush.quest.kurochkin;

import java.io.IOException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



@WebServlet(name = "LogicServlet", value = "/logic")
public class LogicServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Получаем текущую сессию
        HttpSession currentSession = request.getSession();
        // Получаем выбранное пользователем оружие
        // нужна ли эта строка?
        String weapon = request.getParameter("weapon");
        currentSession.setAttribute("weapon", weapon);

        response.sendRedirect(response.encodeRedirectURL("/henry.jsp"));

    }
}