<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <link rel="stylesheet" href="${ pageContext.request.contextPath }/css/bootstrap.min.css"></link>
</head>
<body>
<div class="container mt-5">
    <h2>Edit Form</h2>
    <%--@elvariable id="user" type=""--%>
    <form:form
            modelAttribute="user"
       method="post"
       action="${pageContext.request.contextPath}/admin/user/update/3"
    >

        <div class="form-group">
            <label for="id" hidden="until-found">Id</label>
            <form:hidden  class="form-control" id="id"    path="id" />
            <form:errors path="id" element="span"  />
        </div>
        <div class="form-group">
            <label for="username">Username</label>
            <form:input  class="form-control" id="username"   path="username" />
            <form:errors path="username" element="span" cssClass="text-danger"  />
        </div>
        <div class="form-group">
            <label for="email">Email address</label>
            <form:input class="form-control" id="email"   path="email" />
            <form:errors path="email" element="span"  cssClass="text-danger" />
        </div>
        <div class="form-group">
            <label for="photo">Photo</label>
            <input type="file" class="form-control" id="photo"    />
<%--            <form:errors path="photo" element="span"  cssClass="text-danger" />--%>
        </div>
        <div class="form-group">
            <label for="password">Password</label>
            <form:password class="form-control"  id="password" readonly="true"   path="password" />
            <form:errors path="password" element="span" cssClass="text-danger"  />
        </div>

        <button type="submit" class="btn btn-primary">Submit</button>
        <button type="reset" class="btn btn-secondary">Reset</button>
    </form:form>
</div>
</body>
</html>