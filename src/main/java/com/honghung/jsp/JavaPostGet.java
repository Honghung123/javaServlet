package com.honghung.jsp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Get",urlPatterns = "/addPerson" )
public class JavaPostGet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        super.init();
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.println("TEST : ");
        String ten = req.getParameter("name");
        int age = Integer.parseInt(req.getParameter("age"));
        String address = req.getParameter("address");
        writer.println("Xin chao name:  "+ten+" age: "+age+" address: "+address);
        writer.println("<br>");
        writer.println("<a href='/form'>Back to form data</a>");
        writer.println("<br>");
        writer.println("<a href='/redirect'>Redirect to Facebook</a>");
        writer.close();
    }
    @Override
    public void destroy() {
        super.destroy();
    }
}
