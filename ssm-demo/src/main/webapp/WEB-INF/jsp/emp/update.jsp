<%--
  Created by IntelliJ IDEA.
  User: guo
  Date: 2018/11/8
  Time: 9:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
    <form action="/emp/submit.do" method="post" >
        <input type="hidden" name="empno" value="${emp.EMPNO}" ><br>
        姓&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;名:<input type="text" name="ename" value="${emp.ENAME}" ><br>
        工&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;作:<input type="text" name="job" value="${emp.JOB}" ><br>
        上司编号:<input type="text" name="mgr" value="${emp.MGR}" ><br>
        工&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;资:<input type="text" name="sal" value="${emp.SAL}" ><br>
        奖&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;金:<input type="text" name="comm" value="${emp.COMM}" ><br>
        部门编号:<input type="text" name="deptno" value="${emp.DEPTNO}" ><br>
        <input type="submit" value="修改">
    </form>
</center>
</body>
</html>
