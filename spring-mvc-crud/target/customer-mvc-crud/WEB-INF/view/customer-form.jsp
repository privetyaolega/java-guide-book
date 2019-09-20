<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
    <title>Save Customer</title>
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
Р
<div class="container">
<%--    justify-content-lg-center--%>
    <div class="row ">
        <h3>Save Customer</h3>
        <form:form action="saveCustomer" modelAttribute="customer" method="POST">

            <form:hidden path="id"/>

            <table class="table">
                <tbody>
                <tr>
                    <td><label>First Name:</label></td>
                    <td><form:input path="firstName"/></td>
                </tr>
                <tr>
                    <td><label>Last Name:</label></td>
                    <td><form:input path="lastName"/></td>
                </tr>
                <tr>
                    <td><label>Email:</label></td>
                    <td><form:input path="email"/></td>
                </tr>
                <tr>
                    <td><label></label></td>
                    <td>
<%--                        <input type="submit" value="Save" class="save"/>--%>
                        <button type="submit" class="btn btn-primary btn-lg">Save</button>
                    </td>
                </tr>
                </tbody>
            </table>
        </form:form>

        <%--    <div style="clear; both;"></div>--%>

        <p>
            <a href="${pageContext.request.contextPath}/customer/list">Back to List:</a>
        </p>
    </div>
</div>


</body>
</html>
