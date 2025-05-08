<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Bài 3 - Form đăng nhập</title>
    <!-- Nhúng Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font Awesome -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css">
    
    <style>
        body {
            background-color: #f8f9fa;
        }
        
        .login-container {
            max-width: 400px;
            margin: 0 auto;
            padding: 30px;
            background-color: #fff;
            border-radius: 10px;
            box-shadow: 0 0.5rem 1rem rgba(0, 0, 0, 0.15);
        }
        
        .login-header {
            text-align: center;
            margin-bottom: 30px;
        }
        
        .login-header i {
            font-size: 50px;
            color: #0d6efd;
        }
        
        .btn-login {
            font-weight: bold;
            padding: 10px;
        }
        
        .login-footer {
            text-align: center;
            margin-top: 20px;
        }
    </style>
</head>
<body class="d-flex align-items-center" style="min-height: 100vh;">
    <div class="container">
        <div class="login-container">
            <div class="login-header">
                <i class="fas fa-user-circle mb-3"></i>
                <h2>Đăng nhập</h2>
                <p class="text-muted">Nhập thông tin đăng nhập của bạn</p>
            </div>
            
            <form method="post" action="#">
                <!-- Email/Username -->
                <div class="mb-3">
                    <label for="username" class="form-label">Email hoặc tên đăng nhập</label>
                    <div class="input-group">
                        <span class="input-group-text">
                            <i class="fas fa-envelope"></i>
                        </span>
                        <input type="text" class="form-control" id="username" name="username" placeholder="Nhập email hoặc tên đăng nhập" required>
                    </div>
                </div>
                
                <!-- Password -->
                <div class="mb-3">
                    <label for="password" class="form-label">Mật khẩu</label>
                    <div class="input-group">
                        <span class="input-group-text">
                            <i class="fas fa-lock"></i>
                        </span>
                        <input type="password" class="form-control" id="password" name="password" placeholder="Nhập mật khẩu" required>
                    </div>
                </div>
                
                <!-- Remember me -->
                <div class="mb-3 form-check">
                    <input type="checkbox" class="form-check-input" id="remember" name="remember">
                    <label class="form-check-label" for="remember">Ghi nhớ đăng nhập</label>
                </div>
                
                <!-- Forgot password -->
                <div class="mb-3 text-end">
                    <a href="#" class="text-decoration-none">Quên mật khẩu?</a>
                </div>
                
                <!-- Login button -->
                <div class="d-grid gap-2">
                    <button type="submit" class="btn btn-primary btn-login">
                        <i class="fas fa-sign-in-alt me-2"></i>Đăng nhập
                    </button>
                </div>
            </form>
            
            <div class="login-footer">
                <p>Chưa có tài khoản? <a href="#" class="text-decoration-none">Đăng ký ngay</a></p>
                
                <div class="mt-4">
                    <p class="text-muted mb-2">Hoặc đăng nhập với</p>
                    <div class="d-flex justify-content-center gap-3">
                        <a href="#" class="btn btn-outline-primary"><i class="fab fa-facebook-f"></i></a>
                        <a href="#" class="btn btn-outline-danger"><i class="fab fa-google"></i></a>
                        <a href="#" class="btn btn-outline-dark"><i class="fab fa-github"></i></a>
                    </div>
                </div>
            </div>
        </div>
    </div>
    
    <!-- Nhúng Bootstrap JS -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>