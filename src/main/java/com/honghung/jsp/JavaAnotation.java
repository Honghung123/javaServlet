package com.honghung.jsp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Annotation",urlPatterns = "/anotation")
public class JavaAnotation extends HttpServlet {
    @Override
    public void init() throws ServletException {
        super.init();
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.println("<h1>Welcome to my page. You has logged</h1>");
        String name = "";
        Cookie[] cookies = req.getCookies();
        for(Cookie c : cookies){
            if(c.getName().equals("username")){
                name = c.getValue();
            }
            if(c.getName().equals("")){
                resp.sendRedirect("/login");
            }
        }
        System.out.println(name);
        writer.close();
    }
    @Override
    public void destroy() {
        super.destroy();
    }
}
