<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>

    <link rel="stylesheet" href="${ pageContext.request.contextPath }/css/bootstrap.min.css"></link>

</head>
<body>
<div class="container mt-5">
    <h2>Thêm</h2>
    <form>
        <div class="form-group">
            <label for="productName">Id:</label>
            <input type="text" class="form-control" id="id" placeholder="Nhập id">
        </div>
        <div class="form-group">
            <label for="productName">Tên Sản Phẩm:</label>
            <input type="text" class="form-control" id="productName" placeholder="Nhập tên sản phẩm">
        </div>
        <div class="form-group">
            <label for="email">Email:</label>
            <input type="text" class="form-control" id="email" placeholder="Nhập email">
        </div>
        <div class="form-group">
            <label for="date">Date of birth:</label>
            <input type="text" class="form-control" id="date" placeholder="Nhập date of birth">
        </div>



        <button type="submit" class="btn btn-primary">Thêm Sản Phẩm</button>
        <button type="reset" class="btn btn-light">Clear</button>
    </form>
</div>
</body>
</html>