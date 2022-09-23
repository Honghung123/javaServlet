package com.honghung.jsp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet(name = "JavaServletDemo",urlPatterns = "/demo")
public class JavaServletDemo extends HttpServlet {
    @Override
    public void init() throws ServletException {
        super.init();
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.println("Phuong thuc request: "+ req.getMethod());
        writer.println("Server name: "+ req.getServerName());
        writer.println("Servlet Path: "+ req.getServletPath());
        System.out.println("Get content type: " + req.getContentType());
        System.out.println("Get context path: "+ req.getContextPath());
        Enumeration<String> keys = req.getHeaderNames();
        while(keys.hasMoreElements()){
            String key = keys.nextElement();
            System.out.println("Key: " + key+ " <-----> "+ req.getHeader(key));
        }
        writer.close();
    }
    @Override
    public void destroy() {
        super.destroy();
    }
}
