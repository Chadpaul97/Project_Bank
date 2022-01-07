<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login and Registration</title>
  <link rel="stylesheet"
    href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
    integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
    crossorigin="anonymous">
</head>
<body class="bg-secondary">
	<h1 class="mt-4 p-3 text-center">Cloud Bank</h1>
    <div class="container bg-dark text-light mt-3 p-3">
    <h2>Register</h2>
    <form:form action="/register" method="post" modelAttribute="newUser">
        <div class="form-group">
            <label>User Name:</label>
            <form:input path="userName" class="form-control" />
            <form:errors path="userName" class="text-danger" />
        </div>
        <div class="form-group">
            <label>Email:</label>
            <form:input path="email" class="form-control" />
            <form:errors path="email" class="text-danger" />
        </div>
        <div class="form-group">
            <label>Password:</label>
            <form:password path="password" class="form-control" />
            <form:errors path="password" class="text-danger" />
        </div>
        <div class="form-group">
            <label>Confirm Password:</label>
            <form:password path="confirm" class="form-control" />
            <form:errors path="confirm" class="text-danger" />
        </div>
        <div class="form-group h5">
            <label>Choose an Account Type:</label>
              <select name="account">
			    <option value="checking">Checking</option>
			    <option value="savings">Savings</option>
			  </select>
            <form:errors path="account" class="text-danger" />
        </div>
        <input type="submit" value="Register" class="btn btn-primary mb-4" />
    </form:form>
   		<div class="text-right">
    	 	<p class="mt-3">Already have an account</p>
     		<a href="/" class="text-light h4 " >Login Page</a>
    	</div>
    </div>
</body>
</html>

