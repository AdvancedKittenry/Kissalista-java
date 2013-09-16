<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<t:template pageTitle="Log in">
    <form action="${pageContext.request.contextPath}/Login" method="POST">
        <div class="form-group">
            <label for="inputName">Username</label>
            <input id="inputName" class="form-control" name="name" type="text">
        </div>
        <div class="form-group">
            <label for="inputPassword">Password</label>
            <input id="inputPassword" class="form-control" name="password" type="password">
        </div>
        <button type="submit" class="btn btn-default">Login</button>
    </form>
</t:template>