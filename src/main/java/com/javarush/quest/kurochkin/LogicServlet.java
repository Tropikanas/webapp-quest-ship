package com.javarush.quest.kurochkin;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LogicServlet", value = "/logic")
public class LogicServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Получаем текущую сессию
        HttpSession currentSession = request.getSession();
        // Получаем выбранное пользователем оружие
        // нужна ли эта строка?
        Object weapon = currentSession.getAttribute("weapon");

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/henry.jsp");
        dispatcher.forward(request, response);
    }

}