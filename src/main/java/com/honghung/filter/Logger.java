package com.honghung.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.util.logging.LogRecord;

@WebFilter(urlPatterns = "/*" , initParams = {
        @WebInitParam(name="count",value ="100")
})
public class Logger implements Filter {
    private  int count = 0;
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
//        String c = filterConfig.getInitParameter("count");
//        count = Integer.parseInt(c);
        count =0;

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        count ++;
        System.out.println(count);
        chain.doFilter(request,response);
        response.setContentType("text/html");
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
