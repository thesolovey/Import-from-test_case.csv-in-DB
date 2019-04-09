<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <style><%@include file="/resources/tablestyle.css"%></style>
    <title>Title</title>
</head>
<body>
<table sccClass = "tabe">
    <tr>
        <td colspan="1">
            Список форм:
        </td>
    </tr>
    <tr>
        <th>GRP</th>
    </tr>
    <c:forEach var="userData" items = "${fiveForms}">
        <tr>
    <td>${userData.grp}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>