package com.honghung.jsp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet(name = "Refresh",urlPatterns = "/refresh", initParams = {
        @WebInitParam(name="JavaConfig",value="Demo test java config")
})
public class JavaRefresh extends HttpServlet {
    @Override
    public void init() throws ServletException {
        super.init();
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setHeader("Refresh","10"); // Chi dinh thoi gian refresh lai trang - tinh theo second
        PrintWriter writer = resp.getWriter();
        writer.println("Thoi gian hien tai "+ new Date());
    }
    @Override
    public void destroy() {
        super.destroy();
    }
}
