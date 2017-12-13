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
    <script type="text/javascript" src="${pageContext.request.contextPath}/resource/js/layui/layui.js"></script>
</head>
<body>

<!-- 你的HTML代码 -->
<%--<table class="layui-hide" id="test"></table>--%>


<div class="layui-form users_list">
    <table class="layui-table">
        <colgroup>
            <col width="50">
            <col>
            <col width="18%">
            <col width="8%">
            <col width="12%">
            <col width="12%">
            <col width="18%">
            <col width="15%">
        </colgroup>
        <thead>
        <tr>
            <th><input type="checkbox" name="" lay-skin="primary" lay-filter="allChoose" id="allChoose"></th>
            <th>登录名</th>
            <th>邮箱</th>
            <th>性别</th>
            <th>会员等级</th>
            <th>会员状态</th>
            <th>最后登录时间</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody class="users_content"></tbody>
    </table>
</div>





<script>
    layui.config({
        base: '/resource/js/modules/' //你存放新模块的目录，注意，不是layui的模块目录
    }).use('list'); //加载入口
</script>

</body>
</html>
