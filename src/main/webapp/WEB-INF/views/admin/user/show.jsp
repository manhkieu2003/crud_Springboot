<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%--// setfont chữ cho jsp--%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
    <link rel="stylesheet" href="${ pageContext.request.contextPath }/css/bootstrap.min.css"></link>
</head>
<body>
     <div class="col-10 offset-1">
         <div class="row col-12">
             <label class="col-4 col-6">Họ tên</label>
             <label  class="col-4 col-6">${user.username}</label>
         </div>
         <div class="row col-12">
             <label class="col-4 col-6">Email</label>
             <label  class="col-4 col-6">${user.email}</label>
         </div>
         <div class="row col-12">
             <label class="col-4 col-6">Trạng thái</label>
             <label  class="col-4 col-6">${user.activated == 1 ?"On":"Off"}</label>
         </div>
         <div class="row col-12">
             <label class="col-4 col-6">Tài khoản</label>
             <label  class="col-4 col-6">${user.admin==1 ?"Admin":"User"}</label>
         </div>
     </div>
</body>
</html>