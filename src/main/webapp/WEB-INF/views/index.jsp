<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>3 Ways to download file using Spring MVC</title>
</head>
<body>

    <h1>3 Ways to download file using Spring MVC</h1>

    <li><a href="<c:url value='/download/servlet'/>">Click me to download file using servlet response.</a><br/></li>
    <li><a href="<c:url value='/download/entity'/>">Click me to download file using http entity.</a><br/></li>
    <li><a href="<c:url value='/download/resource'/>">Click me to download file using file system resource.</a><br/></li>

</body>
</html>
