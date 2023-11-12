package com.javarush.quest.kurochkin;

import java.io.IOException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "HenryServlet", value = "/henry")
public class HenryServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Получаем текущую сессию
        HttpSession currentSession = request.getSession();
        // Получаем решение пользователя помочь или нет Генри
        String helpHenry = request.getParameter("helpHenry");
        currentSession.setAttribute("helpHenry", helpHenry);

        response.sendRedirect(response.encodeRedirectURL("/captain.jsp"));

    }

}