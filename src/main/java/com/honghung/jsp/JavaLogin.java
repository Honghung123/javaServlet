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

@WebServlet(name = "Login",urlPatterns = "/login", initParams = {
        @WebInitParam(name="JavaConfig",value="Demo test java config")
})
public class JavaLogin extends HttpServlet {
    @Override
    public void init() throws ServletException {
        super.init();
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.println("Form Login :<br> ");
        writer.println("<form action='' method='POST'>");
        writer.println("Username: <input type='text' placeholder='Enter username' name='username' >");
        writer.println("Password: <input type='password' placeholder='Enter password' name='password' >");
        writer.println("<input type='submit' value='Submit' name='submit'>");
        writer.println("</form>");

        writer.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        if(username.equals("honghung123") && password.equals("123")){
            Cookie cookie = new Cookie("username",username);
            cookie.setMaxAge(60);
            resp.addCookie(cookie);
            resp.sendRedirect("/anotation");
        }else{
            resp.sendRedirect("/login");
        }
    }

    @Override
    public void destroy() {
        super.destroy();
    }
}
