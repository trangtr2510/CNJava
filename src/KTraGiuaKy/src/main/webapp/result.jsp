<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.example.model.User" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Kết quả đăng nhập</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            background-color: #f5f5f5;
        }
        .result-container {
            background-color: white;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
            width: 400px;
            text-align: center;
        }
        h2 {
            color: #333;
        }
        .success-message {
            color: green;
            font-size: 18px;
            margin: 20px 0;
        }
        .user-info {
            background-color: #f9f9f9;
            padding: 15px;
            border-radius: 4px;
            text-align: left;
            margin-bottom: 20px;
        }
        .logout-button {
            padding: 10px 20px;
            background-color: #4CAF50;
            color: white;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            text-decoration: none;
            display: inline-block;
        }
        .logout-button:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
    <div class="result-container">
        <h2>Kết quả đăng nhập</h2>
        
        <% 
        User user = (User) session.getAttribute("user");
        if (user != null) { 
        %>
            <div class="success-message">
                <%= request.getAttribute("message") %>
            </div>
            <div class="user-info">
                <p><strong>Tên đăng nhập:</strong> <%= user.getUsername() %></p>
                <p><strong>Thời gian đăng nhập:</strong> <%= session.getAttribute("loginTime") %></p>
            </div>
            <a href="login?action=logout" class="logout-button">Đăng xuất</a>
        <% } else { %>
            <p>Bạn chưa đăng nhập. <a href="login.jsp">Quay lại trang đăng nhập</a></p>
        <% } %>
    </div>
</body>
</html>