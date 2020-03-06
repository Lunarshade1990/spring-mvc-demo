<%--
  Created by IntelliJ IDEA.
  User: 30045033
  Date: 23.02.2020
  Time: 0:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Customer Confirmation</title>
</head>
<body>
The customer is confirmed: ${customer.firstName} ${customer.lastName}. <br>
    Free passes: ${customer.freePasses}. <br>
    Postal code: ${customer.postalCode}. <br>
    Course code: ${customer.courseCode}. <br>
</body>
</html>
