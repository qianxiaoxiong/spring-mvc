<%--
  Created by IntelliJ IDEA.
  User: xiaokaibo
  Date: 2018/9/9
  Time: 18:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/hello/show19.do" method="post">
    用户名：<input type="text" name="username"><br>
    年龄：<input type="text" name="age"><br>
    婚否：<input type="radio" name="isMarry" value="1" checked="checked">已婚<input type="radio" name="isMarry"
                                                                               value="0">未婚<br>
    收入：<input type="text" name="income"><br>
    爱好：<input type="checkbox" name="hobby" value="football">足球
    <input type="checkbox" name="hobby" value="basketball">篮球
    <input type="checkbox" name="hobby" value="yuball">羽毛球
    <br>
    <input type="submit" value="提交">
</form>


</body>
</html>
