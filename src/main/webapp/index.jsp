<%--
  Created by IntelliJ IDEA.
  User: cheng
  Date: 2017.12.12
  Time: 13:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>开始使用layui</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resource/js/layui/css/layui.css">
    <script src="${pageContext.request.contextPath}/resource/js/layui/layui.js"></script>
</head>
<body>

<!-- 你的HTML代码 -->
<p>${pageContext.request.contextPath}</p>

<script>
    layui.config({
        base: '${pageContext.request.contextPath}/resource/js/modules/' //你存放新模块的目录，注意，不是layui的模块目录
    }).use('index'); //加载入口
</script>

</body>
</html>
