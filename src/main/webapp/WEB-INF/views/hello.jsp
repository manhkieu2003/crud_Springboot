<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>
<h1>đây là thanh hi nè,${message}</h1>
<form action="${pageContext.request.contextPath}/admin/upload" method="post" enctype="multipart/form-data">
   <input type="file" name="upload"/>
    <button>Submit</button>
</form>
</body>
</html>