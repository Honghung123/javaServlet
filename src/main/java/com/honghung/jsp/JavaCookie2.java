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

@WebServlet(name = "Cookie2",urlPatterns = "/cookie2", initParams = {
        @WebInitParam(name="JavaConfig",value="Demo test java config")
})
public class JavaCookie2 extends HttpServlet {
    @Override
    public void init() throws ServletException {
        super.init();
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.println("GET cookie from page : ");

        Cookie[] cookies = req.getCookies();
        for(Cookie c : cookies){
            writer.println(c.getName()+ " : " + c.getValue());
            writer.println("<br>");
        }
        writer.close();
    }
    @Override
    public void destroy() {
        super.destroy();
    }
}
