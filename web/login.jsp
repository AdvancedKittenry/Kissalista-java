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