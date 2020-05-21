<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<html>
<head>
    <title><spring:message code="global.title" /></title>
</head>

<body>
<table style=" width: 100%; border: 4px double black;">
    <tr>
        <th><spring:message code="global.car.brand"/></th>
        <th><spring:message code="global.car.model"/></th>
        <th><spring:message code="global.car.price"/></th>
    </tr>
    <c:forEach var="car" items="${listCars}">
        <tr>
            <td><c:out value="${car.brand}"/></td>
            <td><c:out value="${car.model}"/></td>
            <td><c:out value="${car.price}"/></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>