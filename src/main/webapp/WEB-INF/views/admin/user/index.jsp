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

 <nav class="navbar navbar-expand-lg navbar-light bg-light">
     <a class="navbar-brand" href="#">Navbar</a>
     <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
         <span class="navbar-toggler-icon"></span>
     </button>
     <div class="collapse navbar-collapse" id="navbarNav">
         <ul class="navbar-nav">
             <li class="nav-item active">
                 <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
             </li>
             <li class="nav-item">
                 <a class="nav-link" href="#">Features</a>
             </li>
             <li class="nav-item">
                 <a class="nav-link" href="#">Pricing</a>
             </li>
             <li class="nav-item">
                 <a class="nav-link disabled" href="#">Disabled</a>
             </li>
         </ul>
     </div>
 </nav>
 <a class="btn btn-outline-primary" href="${pageContext.request.contextPath}/admin/user/create">Create</a>
 <table class="table table-dark">
     <thead>
     <tr>
         <th scope="col">Id</th>
         <th scope="col">Name</th>
         <th scope="col">Email</th>
         <th scope="col">Tài khoản</th>
         <th colspan="2">Action</th>
     </tr>
     </thead>
     <tbody>
<c:forEach items="${listusers}" var="user">


     <tr>

         <th scope="row">${user.id}</th>
         <td>${user.username}</td>
         <td>${user.email}</td>
         <td>${user.admin==1 ?"Admin":"User"}</td>
         <td><a class="btn btn-light" href="${pageContext.request.contextPath}/admin/user/edit/1">Update</a> </td>
         <td>
             <form action="${pageContext.request.contextPath}/admin/user/delete/1" method="post">
                 <button class="btn btn-danger">Delete</button>
             </form>
         </td>
     </tr>
</c:forEach>


     </tbody>
 </table>
  <script src="${ pageContext.request.contextPath }/js/hello.js"></script>
</body>
</html>