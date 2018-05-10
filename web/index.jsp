<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/10
  Time: 19:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h1>尊敬的管理员，您好！</h1>
  <form action="login" method="post">
    <br>管理员名称:<input name="username" type="text" id="username"/>
    <br>管理员密码:<input name="password" type="password" id="password"/>
    <br><input type="submit" name="Submit" value="提交" >
    <input type=reset value="复位">
  </form>
  </body>
</html>
