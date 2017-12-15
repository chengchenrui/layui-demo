<%--
  Created by IntelliJ IDEA.
  User: cheng
  Date: 2017.12.15
  Time: 11:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>table模块快速使用</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resource/js/layui/css/layui.css" media="all">
</head>
<body>

<table id="demo" lay-filter="test"></table>

<script src="${pageContext.request.contextPath}/resource/js/layui/layui.js"></script>
<script>
    // http://localhost:8080
    var curWwwPath = window.document.location.href;
    console.info(curWwwPath);
    // /ossapp/index.html
    var pathName = window.document.location.pathname;
    console.info(pathName);
    var pos = curWwwPath.indexOf(pathName);
    console.info(pos);
    var localhostPath = curWwwPath.substring(0, pos);
    console.info(localhostPath);
    var projectName = "";
    if (pathName.indexOf("layui-demo") != -1) {
        projectName = "/layui-demo";
    }
    console.info(localhostPath + projectName);

    layui.use('table', function () {
        var table = layui.table;

        //第一个实例
        table.render({
            elem: '#demo'
            , height: 315
            , method: 'POST'
            , url: localhostPath + projectName + '/user/list' //数据接口
            , page: true //开启分页
            , cols: [[ //表头
                {field: 'id', title: 'ID', width: 80, sort: true, fixed: 'left'}
                , {field: 'userName', title: '用户名', width: 80}
                , {field: 'sex', title: '性别', width: 80, sort: true}
                , {field: 'city', title: '城市', width: 80}
                , {field: 'sign', title: '签名', width: 177}
                , {field: 'experience', title: '积分', width: 80, sort: true}
                , {field: 'score', title: '评分', width: 80, sort: true}
                , {field: 'classify', title: '职业', width: 80}
                , {field: 'wealth', title: '财富', width: 135, sort: true}
            ]]
        });

    });
</script>
</body>
</html>
