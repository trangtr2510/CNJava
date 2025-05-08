<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Kiểm tra tam giác</title>
<style>
    body {
        font-family: Arial, sans-serif;
        margin: 20px;
    }
    .container {
        max-width: 600px;
        margin: 0 auto;
        padding: 20px;
        border: 1px solid #ccc;
        border-radius: 5px;
    }
    .result {
        margin-top: 20px;
        padding: 10px;
        background-color: #f0f0f0;
        border-radius: 5px;
    }
    .valid {
        color: green;
    }
    .invalid {
        color: red;
    }
    label {
        display: inline-block;
        width: 60px;
    }
    input {
        margin-bottom: 10px;
        padding: 5px;
    }
</style>
</head>
<body>
    <div class="container">
        <h2>Kiểm tra 3 cạnh của tam giác</h2>
        
        <form method="post">
            <div>
                <label for="a">Cạnh a:</label>
                <input type="number" name="a" id="a" required min="1" step="any" value="${param.a != null ? param.a : ''}">
            </div>
            <div>
                <label for="b">Cạnh b:</label>
                <input type="number" name="b" id="b" required min="1" step="any" value="${param.b != null ? param.b : ''}">
            </div>
            <div>
                <label for="c">Cạnh c:</label>
                <input type="number" name="c" id="c" required min="1" step="any" value="${param.c != null ? param.c : ''}">
            </div>
            <div>
                <input type="submit" value="Kiểm tra">
            </div>
        </form>
        
        <% 
        String aStr = request.getParameter("a");
        String bStr = request.getParameter("b");
        String cStr = request.getParameter("c");
        
        if (aStr != null && bStr != null && cStr != null) {
            try {
                double a = Double.parseDouble(aStr);
                double b = Double.parseDouble(bStr);
                double c = Double.parseDouble(cStr);
                
                boolean isTriangle = false;
                String triangleType = "";
                
                // Kiểm tra điều kiện tam giác: tổng 2 cạnh lớn hơn cạnh còn lại
                if (a > 0 && b > 0 && c > 0 && 
                    a + b > c && a + c > b && b + c > a) {
                    isTriangle = true;
                    
                    // Kiểm tra loại tam giác
                    if (a == b && b == c) {
                        triangleType = "tam giác đều";
                    } else if (a == b || b == c || a == c) {
                        // Kiểm tra tam giác vuông cân
                        if ((a == b && a*a + b*b == c*c) || 
                            (a == c && a*a + c*c == b*b) || 
                            (b == c && b*b + c*c == a*a)) {
                            triangleType = "tam giác vuông cân";
                        } else {
                            triangleType = "tam giác cân";
                        }
                    } else if (a*a + b*b == c*c || a*a + c*c == b*b || b*b + c*c == a*a) {
                        triangleType = "tam giác vuông";
                    } else {
                        triangleType = "tam giác thường";
                    }
                }
                
                if (isTriangle) {
                    out.println("<div class='result valid'>Ba cạnh " + a + ", " + b + ", " + c + 
                               " tạo thành một " + triangleType + ".</div>");
                } else {
                    out.println("<div class='result invalid'>Ba cạnh " + a + ", " + b + ", " + c + 
                               " không thể tạo thành một tam giác.</div>");
                }
                
            } catch (NumberFormatException e) {
                out.println("<div class='result invalid'>Vui lòng nhập các cạnh là số dương hợp lệ.</div>");
            }
        }
        %>
    </div>
</body>
</html>