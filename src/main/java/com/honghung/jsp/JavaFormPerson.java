package com.honghung.jsp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Form",urlPatterns = "/form" )
public class JavaFormPerson extends HttpServlet {
    @Override
    public void init() throws ServletException {
        super.init();
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.println("<form action='addPerson' method='GET'>");
        writer.println("Name: <input type='text' name='name' placeholder='Vui long nhap ten'>");
        writer.println("Age: <input type='text' name='age' placeholder='Vui long nhap tuoi'>");
        writer.println("Address: <input type='text' name='address' placeholder='Vui long nhap dia chi'>");
        writer.println("<input type='submit' value='Add' name='submit'>");
        writer.println("</form>");
        writer.close();
    }
    @Override
    public void destroy() {
        super.destroy();
    }
}
