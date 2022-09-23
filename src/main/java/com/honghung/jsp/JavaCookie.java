package com.honghung.jsp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Cookie",urlPatterns = "/cookie", initParams = {
        @WebInitParam(name="JavaConfig",value="Demo test java config")
})
public class JavaCookie extends HttpServlet {
    @Override
    public void init() throws ServletException {
        super.init();
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.println("TEST cookie of this page : ");
        writer.println("<br>");
        writer.println("<a href='/cookie2'>Go to cookie2</a>");

        Cookie cookie = new Cookie("name","Hong Hung");

        cookie.setMaxAge(5);
        resp.addCookie(cookie);
        System.out.println("add successfully");
        Cookie cookie1 = new Cookie("age","18");
        cookie1.setMaxAge(10);
        resp.addCookie(cookie1  );
        System.out.println("add successfully");
        writer.close();
    }
    @Override
    public void destroy() {
        super.destroy();
    }
}
