
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title>c:forEach Tag Example</title>
</head>
<body>
    <c:forEach var="temp" items="${msg}">
        <c:out value="${temp}"></c:out>
    </c:forEach>
</body>
</html>