<%--
  Created by IntelliJ IDEA.
  User: guo
  Date: 2018/11/7
  Time: 18:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>add</title>
</head>
<body>
    <center>
        <form action="/emp/add.do" method="post" >
            姓&nbsp;&nbsp;名:<input type="text" name="ename" required="required" ><br>
            工&nbsp;&nbsp;作:<input type="text" name="job" required="required" ><br>
            上司编号:<input type="text" name="mgr" required="required" ><br>
            工&nbsp;&nbsp;资:<input type="text" name="sal" required="required" ><br>
            奖&nbsp;&nbsp;金:<input type="text" name="comm" required="required" ><br>
            部门编号:<input type="text" name="deptno" required="required" ><br>
            <input type="submit" value="提交">
        </form>
    </center>
</body>
</html>
