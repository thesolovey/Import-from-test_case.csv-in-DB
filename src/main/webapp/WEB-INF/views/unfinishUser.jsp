<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <style><%@include file="/resources/tablestyle.css"%></style>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <td colspan="2">
            Список пользователей, не закончивших процесс:
        </td>
    </tr>
    <tr>
        <th>SSOID</th>
        <th>FORMID</th>
    </tr>
    <c:forEach var="userData" items = "${unfinishedUsers}">
        <tr>
            <td>${userData.ssoid}</td>
            <td>${userData.subtype}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>