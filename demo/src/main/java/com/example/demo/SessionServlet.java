package com.example.demo;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/session-save")
public class SessionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        String name = req.getParameter("username");
        HttpSession session = req.getSession();
        session.setAttribute("user", name);

        res.sendRedirect("welcome.jsp");
    }
}
