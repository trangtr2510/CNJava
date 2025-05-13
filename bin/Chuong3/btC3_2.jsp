<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Bài 2 - Tạo bảng với Bootstrap</title>
    <!-- Nhúng Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
    
    <style>
        /* Tùy chỉnh màu sắc bảng */
        .table-custom {
            color: #212529; /* Màu chữ */
            background-color: #f8f9fa; /* Màu nền */
            border: 2px solid #0d6efd; /* Màu viền */
        }
        
        .table-custom thead {
            background-color: #0d6efd;
            color: white;
        }
        
        .table-custom th, .table-custom td {
            border: 1px solid #6c757d;
        }
        
        /* Tùy chỉnh hàng có màu nền khác nhau */
        .table-custom tbody tr:nth-child(odd) {
            background-color: #e2e3e5;
        }
        
        .table-custom tbody tr:hover {
            background-color: #cff4fc;
        }
    </style>
</head>
<body class="container mt-5">
    <h1>Bài 2 - Tạo bảng danh sách sinh viên</h1>
    
    <div class="row mt-4">
        <div class="col-md-12">
            <h3>Bảng với định dạng tùy chỉnh:</h3>
            <table class="table table-custom">
                <thead>
                    <tr>
                        <th scope="col">STT</th>
                        <th scope="col">Mã SV</th>
                        <th scope="col">Họ và tên</th>
                        <th scope="col">Quê quán</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>1</td>
                        <td>SV001</td>
                        <td>Nguyễn Văn A</td>
                        <td>Hà Nội</td>
                    </tr>
                    <tr>
                        <td>2</td>
                        <td>SV002</td>
                        <td>Trần Thị B</td>
                        <td>Hồ Chí Minh</td>
                    </tr>
                    <tr>
                        <td>3</td>
                        <td>SV003</td>
                        <td>Lê Văn C</td>
                        <td>Đà Nẵng</td>
                    </tr>
                    <tr>
                        <td>4</td>
                        <td>SV004</td>
                        <td>Phạm Thị D</td>
                        <td>Cần Thơ</td>
                    </tr>
                    <tr>
                        <td>5</td>
                        <td>SV005</td>
                        <td>Hoàng Văn E</td>
                        <td>Hải Phòng</td>
                    </tr>
                </tbody>
            </table>
        </div>
    </div>
    
    <div class="row mt-5">
        <div class="col-md-12">
            <h3>Bảng với các lớp có sẵn của Bootstrap:</h3>
            <table class="table table-striped table-hover table-bordered border-primary">
                <thead class="table-primary">
                    <tr>
                        <th scope="col">STT</th>
                        <th scope="col">Mã SV</th>
                        <th scope="col">Họ và tên</th>
                        <th scope="col">Quê quán</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>1</td>
                        <td>SV001</td>
                        <td>Nguyễn Văn A</td>
                        <td>Hà Nội</td>
                    </tr>
                    <tr>
                        <td>2</td>
                        <td>SV002</td>
                        <td>Trần Thị B</td>
                        <td>Hồ Chí Minh</td>
                    </tr>
                    <tr>
                        <td>3</td>
                        <td>SV003</td>
                        <td>Lê Văn C</td>
                        <td>Đà Nẵng</td>
                    </tr>
                    <tr>
                        <td>4</td>
                        <td>SV004</td>
                        <td>Phạm Thị D</td>
                        <td>Cần Thơ</td>
                    </tr>
                    <tr>
                        <td>5</td>
                        <td>SV005</td>
                        <td>Hoàng Văn E</td>
                        <td>Hải Phòng</td>
                    </tr>
                </tbody>
            </table>
        </div>
    </div>
    
    <!-- Nhúng Bootstrap JS -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>