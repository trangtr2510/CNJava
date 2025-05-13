package com.example.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter("/login")
public class InputFilter implements Filter {
    
    public InputFilter() {
    }
    
    public void init(FilterConfig filterConfig) throws ServletException {
    }
    
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) 
            throws IOException, ServletException {
        
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;
        
        // Chỉ kiểm tra với phương thức POST (form đăng nhập)
        if ("POST".equalsIgnoreCase(httpRequest.getMethod())) {
            String username = request.getParameter("username");
            
            // Kiểm tra tên người dùng không được để trống
            if (username == null || username.trim().isEmpty()) {
                // Nếu tên người dùng trống, thông báo lỗi và chuyển hướng về trang đăng nhập
                request.setAttribute("error", "Tên người dùng không được để trống!");
                request.getRequestDispatcher("login.jsp").forward(request, response);
                return;
            }
        }
        
        // Nếu dữ liệu hợp lệ, tiếp tục chuỗi Filter
        chain.doFilter(request, response);
    }
    
    public void destroy() {
    }
}