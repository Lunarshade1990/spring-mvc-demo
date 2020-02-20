<%--
  Created by IntelliJ IDEA.
  User: 30045033
  Date: 18.02.2020
  Time: 8:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Student registration form</title>
</head>
<body>
<%--@elvariable id="student" type="com.lunarshade.spring_mvc_demo.web.entity.Student"--%>
    <form:form action="processForm" modelAttribute="student">
        First Name <form:input path="firstName"/>
        <br><br>
        Last Name <form:input path="lastName"/>
        <br><br>
        <form:select path="country">
            <form:options items="${student.countries}"/>
        </form:select>
        <br><br>
        <input type="submit" value="Submit"/>
    </form:form>
</body>
</html>
