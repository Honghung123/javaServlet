package com.honghung.jsp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Session",urlPatterns = "/session", initParams = {
        @WebInitParam(name="JavaConfig",value="Demo test java config")
})
public class JavaSession extends HttpServlet {
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
        writer.println("<a href='/session2'>Go to session2</a>");
        HttpSession session = req.getSession();
        session.setAttribute("name", "hong hung");
        session.setAttribute("age",  14);
        String name = getServletContext().getInitParameter("jdbc");
        System.out.println(name);
        getServletContext().setAttribute("author","Hong Hung");
        writer.close();
    }
    @Override
    public void destroy() {
        super.destroy();
    }
}
