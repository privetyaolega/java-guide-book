<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title>List Customers</title>
    <%--    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css"/>--%>
    <link type="text/css" rel="stylesheet"
    <%--          href="${pageContext.request.contextPath}/resources/css/add-customer-style.css"/>--%>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.css"/>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap-grid.css"/>
    <link type="text/css" rel="stylesheet"
          href="${pageContext.request.contextPath}/resources/css/bootstrap-grid.min.css"/>
    <link type="text/css" rel="stylesheet"
          href="${pageContext.request.contextPath}/resources/css/bootstrap-reboot.css"/>
    <link type="text/css" rel="stylesheet"
          href="${pageContext.request.contextPath}/resources/css/bootstrap-reboot.min.css"/>
</head>
<body>


<div class="container justify-content-center">
    <br>
    <div class="alert alert-info" role="alert">
        CRM - Customer Relationship manager
    </div>
    <br>

    <input type="button"
           value="Add Customer"
           onclick="window.location.href='showFormForAdd'; return false"
           class="btn btn-secondary btn-lg"/>

    <br>

    <div class="row justify-content-center">



        <table class="table">
            <thead class="thead-dark">
            <tr>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Email</th>
                <th>Action</th>
            </tr>
            </thead>

            <c:forEach var="tempCustomer" items="${customers}">

                <c:url var="updateLink" value="/customer/showFormForUpdate">
                    <c:param name="customerId" value="${tempCustomer.id}"/>
                </c:url>

                <c:url var="deleteLink" value="/customer/delete">
                    <c:param name="customerId" value="${tempCustomer.id}"/>
                </c:url>

                <tr>
                    <td> ${tempCustomer.firstName}</td>
                    <td> ${tempCustomer.lastName}</td>
                    <td> ${tempCustomer.email}</td>
                    <td>
                        <a href="${updateLink}">Update</a>
                        <a href="${deleteLink}"
                           onclick="if (!confirm('Are you sure you want to delete this customer?')) return false">Delete</a>

                    </td>
                </tr>

            </c:forEach>
        </table>

    </div>
</div>
</body>

</html>