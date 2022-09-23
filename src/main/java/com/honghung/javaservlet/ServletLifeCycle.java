package com.honghung.javaservlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletLifeCycle",urlPatterns = "/hello/servletLC")
public class ServletLifeCycle  extends  HelloServlet{
    @Override
    public void init() {
        System.out.println("Chay vao ham khoi tao");
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.println("<h1>Xin chao Servlet</h1>");
        writer.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Chay vao ham do post");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req,resp);
        System.out.println("Chay vao ham service" + req.getMethod());
    }

    @Override
    public void destroy() {
        System.out.println("Ham nay da bi huy roi");
    }
}
