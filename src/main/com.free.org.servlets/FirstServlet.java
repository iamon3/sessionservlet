package com.free.org.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        execute(req, resp);
    }
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        execute(req, resp);
    }
    private void execute(HttpServletRequest req, HttpServletResponse resp)
            throws IOException, ServletException {
        String nb = (String)req.getParameter("nb");
        req.setAttribute("nb", "You entered: " + nb);
        req.getRequestDispatcher("page2.jsp").forward(req, resp);
    }
}