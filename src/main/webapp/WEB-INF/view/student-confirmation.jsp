<%--
  Created by IntelliJ IDEA.
  User: 30045033
  Date: 18.02.2020
  Time: 8:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
    The student is confirmed: ${student.firstName} ${student.lastName} from ${student.country} and his(her) favourite language is ${student.favouriteLanguage}
    <br>
    Operating systems:
    <ul>
        <c:forEach var="temp" items="${student.operatingSystems}">
            <li>${temp}</li>
        </c:forEach>
    </ul>

</body>
</html>
