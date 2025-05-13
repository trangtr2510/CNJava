package com.example.listener;

import java.util.Date;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class SessionListener implements HttpSessionListener {
    
    public SessionListener() {
    }
    
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        HttpSession session = se.getSession();
        
        // Ghi log khi session được tạo
        System.out.println("Session created - ID: " + session.getId() + 
                           " at " + new Date() + 
                           ", Max inactive interval: " + session.getMaxInactiveInterval() + " seconds");
    }
    
    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        HttpSession session = se.getSession();
        
        // Ghi log khi session bị hủy
        System.out.println("Session destroyed - ID: " + session.getId() + 
                           " at " + new Date());
        
        // Thông tin về người dùng nếu có
        Object userObj = session.getAttribute("user");
        if (userObj != null) {
            System.out.println("User logged out: " + userObj);
        }
    }
}