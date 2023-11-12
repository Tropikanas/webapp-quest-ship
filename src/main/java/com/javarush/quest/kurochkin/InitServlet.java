package com.javarush.quest.kurochkin;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(name = "InitServlet", value = "/start")
public class InitServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession currentSession = req.getSession(true);

        // Обнуляем все переменные перед началом новой игры
        GameResult.showEndText = false;
        GameResult.fightText = "";
        GameResult.end = null;
        GameResult.endText = null;
        req.getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);
    }
}

