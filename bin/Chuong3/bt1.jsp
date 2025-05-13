<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Giải phương trình bậc 2</title>
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
    .error {
        color: red;
    }
    label {
        display: inline-block;
        width: 30px;
    }
    input {
        margin-bottom: 10px;
        padding: 5px;
    }
</style>
</head>
<body>
    <div class="container">
        <h2>Giải phương trình bậc 2: ax² + bx + c = 0</h2>
        
        <form method="post">
            <div>
                <label for="a">a:</label>
                <input type="number" name="a" id="a" step="any" required value="${param.a != null ? param.a : ''}">
            </div>
            <div>
                <label for="b">b:</label>
                <input type="number" name="b" id="b" step="any" required value="${param.b != null ? param.b : ''}">
            </div>
            <div>
                <label for="c">c:</label>
                <input type="number" name="c" id="c" step="any" required value="${param.c != null ? param.c : ''}">
            </div>
            <div>
                <input type="submit" value="Giải">
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
                
                if (a == 0) {
                    // Phương trình bậc 1: bx + c = 0
                    if (b == 0) {
                        if (c == 0) {
                            out.println("<div class='result'>Phương trình có vô số nghiệm</div>");
                        } else {
                            out.println("<div class='result'>Phương trình vô nghiệm</div>");
                        }
                    } else {
                        double x = -c / b;
                        out.println("<div class='result'>Phương trình bậc 1 có nghiệm x = " + String.format("%.2f", x) + "</div>");
                    }
                } else {
                    // Phương trình bậc 2
                    double delta = b * b - 4 * a * c;
                    
                    if (delta < 0) {
                        out.println("<div class='result'>Phương trình vô nghiệm</div>");
                    } else if (delta == 0) {
                        double x = -b / (2 * a);
                        out.println("<div class='result'>Phương trình có nghiệm kép x = " + String.format("%.2f", x) + "</div>");
                    } else {
                        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                        out.println("<div class='result'>Phương trình có hai nghiệm:<br>");
                        out.println("x₁ = " + String.format("%.2f", x1) + "<br>");
                        out.println("x₂ = " + String.format("%.2f", x2) + "</div>");
                    }
                }
            } catch (NumberFormatException e) {
                out.println("<div class='result error'>Vui lòng nhập các hệ số là số hợp lệ</div>");
            }
        }
        %>
    </div>
</body>
</html>