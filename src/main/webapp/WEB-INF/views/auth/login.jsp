<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <link rel="stylesheet" href="${ pageContext.request.contextPath }/css/bootstrap.min.css"></link>
</head>
<body>
 <div class="col-10 offset-1">
     <form method="post" action="${pageContext.request.contextPath}/login">
         <div>
             <label for="email">Email</label>
             <input type="email" name="email" id="email" class="form-control"/>
         </div>
         <div>
             <label for="password">Password</label>
             <input type="password" name="password" id="password" class="form-control"/>
         </div>
         <div>
             <button class="btn btn-primary">Login</button>
         </div>

     </form>
 </div>
</body>
</html>