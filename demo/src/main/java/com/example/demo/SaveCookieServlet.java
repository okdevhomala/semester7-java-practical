package com.example.demo;

import java.io.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import java.net.URLEncoder;

@WebServlet("/save")
public class SaveCookieServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        String name = req.getParameter("username");
        String encodedName = URLEncoder.encode(name, "UTF-8");
        Cookie c = new Cookie("user", encodedName);
        c.setMaxAge(60*60); // 1 hour
        res.addCookie(c);
        res.sendRedirect("show.jsp");
    }
}
