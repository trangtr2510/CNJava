<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Bài 1 - Định dạng chữ</title>
    <!-- Nhúng Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
    
    <style>
        /* Tạo class căn chỉnh chữ ra chính giữa */
        .text-center-custom {
            text-align: center;
        }
        
        /* Tạo class chuyển thành chữ hoa */
        .text-uppercase-custom {
            text-transform: uppercase;
        }
        
        /* Tạo class căn chỉnh màu chữ */
        .text-color-custom {
            color: #0d6efd; /* Màu xanh Bootstrap */
        }
        
        /* Tạo class chỉnh màu nền của chữ */
        .bg-color-custom {
            background-color: #ffc107; /* Màu vàng Bootstrap */
            padding: 10px;
            border-radius: 5px;
        }
    </style>
</head>
<body class="container mt-5">
    <h1>Bài 1 - Định dạng chữ với Bootstrap</h1>
    
    <!-- Ghi họ và tên trong thẻ h2 -->
    <h2 class="mb-4">Nguyễn Văn A</h2>
    
    <!-- Áp dụng các class tự tạo -->
    <div class="row">
        <div class="col-md-6 mb-3">
            <h3>Căn chỉnh chữ ra chính giữa:</h3>
            <p class="text-center-custom border p-2">Nguyễn Văn A</p>
        </div>
        
        <div class="col-md-6 mb-3">
            <h3>Chuyển thành chữ hoa:</h3>
            <p class="text-uppercase-custom border p-2">Nguyễn Văn A</p>
        </div>
        
        <div class="col-md-6 mb-3">
            <h3>Căn chỉnh màu chữ:</h3>
            <p class="text-color-custom border p-2">Nguyễn Văn A</p>
        </div>
        
        <div class="col-md-6 mb-3">
            <h3>Chỉnh màu nền của chữ:</h3>
            <p class="bg-color-custom">Nguyễn Văn A</p>
        </div>
    </div>
    
    <h3 class="mt-4">Kết hợp các định dạng:</h3>
    <p class="text-center-custom text-uppercase-custom text-color-custom bg-color-custom">
        Nguyễn Văn A
    </p>
    
    <!-- Sử dụng các class có sẵn của Bootstrap -->
    <div class="mt-5">
        <h3>Các lớp định dạng có sẵn của Bootstrap:</h3>
        <p class="text-center text-uppercase text-primary bg-warning p-2">
            Nguyễn Văn A (Sử dụng class của Bootstrap)
        </p>
    </div>
    
    <!-- Nhúng Bootstrap JS -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>