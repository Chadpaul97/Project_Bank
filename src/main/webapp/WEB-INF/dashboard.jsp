<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
  <link rel="stylesheet"
    href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
    integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
    crossorigin="anonymous">
</head>
<body class="bg-dark text-light">
    <div class="container d-flex justify-content-sm-between align-items-center">
        <h1>Cloud Bank</h1>
        <a href="/logout" class="text-decoration-none text-light h3">[ Logout ]</a>
    </div>
    <div class="">
        <div class="container mb-5 mt-3">
            <div class="border p-3">
                <a href="/details" class="text-decoration-none text-light">Account Details</a>
            </div>
            <div class="border p-3">
                <a href="/deposit" class="text-decoration-none text-light">Deposit Cash</a>
            </div>
            <div class="border p-3">
                <a href="/withdraw" class="text-decoration-none text-light">Withdraw Cash</a>
            </div>
            <div class="border p-3">
                <a href="/transfer" class="text-decoration-none text-light">Transfer Money</a>
            </div>
            <div class="border p-3">
                <a href="/history" class="text-decoration-none text-light">Transaction History</a>
            </div>
        </div>
        <div>
            <p class="bg-secondary container">Please Select an account first</p>
        </div>
        <div>
            <table class="container">
                <thead>
                    <tr class="border-bottom">
                        <th>Bank Account ID</th>
                        <th>Available Balance</th>
                        <th>Account Type</th>
                    </tr>
                </thead>
                <tbody>
                    <tr class="border-bottom pt-3">
                        <td>1001</td>
                        <td>$123,86.00</td>
                        <td>Checking Account</td>
                        <td><a href="details" class="text-decoration-none text-success">Select</a></td>
                    </tr>
                </tbody>
            </table>
        </div>
    </div>
</body>
</html>