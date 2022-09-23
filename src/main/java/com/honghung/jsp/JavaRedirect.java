package com.honghung.jsp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Redirect",urlPatterns = "/redirect", initParams = {
        @WebInitParam(name="JavaConfig",value="Demo test java config")
})
public class JavaRedirect extends HttpServlet {
    @Override
    public void init() throws ServletException {
        super.init();
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Cach 1
        //        resp.sendRedirect("https://facebook.com");
        // Cach 2
        resp.setStatus(resp.SC_MOVED_PERMANENTLY);
        resp.setHeader("Location","https://facebook.com");
    }
    @Override
    public void destroy() {
        super.destroy();
    }
}
