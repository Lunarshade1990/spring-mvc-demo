<%--
  Created by IntelliJ IDEA.
  User: 30045033
  Date: 22.02.2020
  Time: 23:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Customer registration form</title>
    <style>
        .error{color: red}
    </style>
</head>
<body>

    Fill out the form.
    <br><br>
    <%--@elvariable id="customer" type="com.lunarshade.spring_mvc_demo.web.entity.Customer"--%>
    <form:form action="processForm" modelAttribute="customer">
        First Name <form:input path="firstName"/>
        <br><br>
        Last Name (*) <form:input path="lastName"/>
        <form:errors path="lastName" cssClass="error"/>
        <br><br>
        Free passes (*) <form:input path="freePasses"/>
        <form:errors path="freePasses" cssClass="error"/>
        <br><br>
        Postal code (*) <form:input path="postalCode"/>
        <form:errors path="postalCode" cssClass="error"/>
        <br><br>
        Course code (*) <form:input path="courseCode"/>
        <form:errors path="courseCode" cssClass="error"/>
        <br><br>
        <input type="submit" value="Submit">
    </form:form>
</body>
</html>
