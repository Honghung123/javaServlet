package com.honghung.jsp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Config",urlPatterns = "/config", initParams = {
        @WebInitParam(name="JavaConfig",value="Demo test java config")
})
public class JavaConfig extends HttpServlet {
    @Override
    public void init() throws ServletException {
        super.init();
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = super.getServletConfig().getInitParameter("JavaConfig");
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.println("<h1>"+name+"</h1>");
        writer.println("Get servlet name: "+ getServletConfig().getServletName());
        writer.close();
    }
    @Override
    public void destroy() {
        super.destroy();
    }
}
