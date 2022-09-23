package com.honghung.jsp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet(name = "ServletResponse",urlPatterns = "/servletResp")
public class MyHttpServletResponse extends HttpServlet {
    @Override
    public void init() throws ServletException {
        super.init();
    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.println("<h2>XML course</h2>");
        writer.println("<h1>Servlet rat la hay nha cac ban toi oi</h1>");
        writer.close();
    }

    @Override
    public void destroy() {
        super.destroy();
    }
}
