package com.honghung.jsp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Session2",urlPatterns = "/session2", initParams = {
        @WebInitParam(name="JavaConfig",value="Demo test java config")
})
public class JavaSession2 extends HttpServlet {
    @Override
    public void init() throws ServletException {
        super.init();
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.println("Session get of this page : ");
        writer.println("<br>");
        String name ="";

        writer.println("<a href='/cookie2'>Go to cookie2</a>");
        HttpSession session = req.getSession();
        Object obj = session.getAttribute("name");
        if (obj != null) {
            name = String.valueOf(obj);
        } else {
            resp.sendRedirect("/session");
        }
        System.out.println(name);
        System.out.println((Integer) session.getAttribute("age"));

        String param = getServletContext().getInitParameter("jdbc");
        String param2 = (String) getServletContext().getAttribute("author");
        System.out.println(param+"   "+param2);
        writer.close();
    }
    @Override
    public void destroy() {
        super.destroy();
    }
}
