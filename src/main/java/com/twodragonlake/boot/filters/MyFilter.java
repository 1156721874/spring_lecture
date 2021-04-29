package com.twodragonlake.boot.filters;

import javax.servlet.*;
import java.io.IOException;

/**
 * Description.
 *
 * @author : CeaserWang
 * @version : 1.0
 * @since : 2019/11/16 10:52
 */
public class MyFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("MyFilter Invoked");
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
