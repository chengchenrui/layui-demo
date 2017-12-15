/**
 * 项目JS主入口
 * 以依赖layui的layer和form模块为例
 * http://www.layui.com/demo/table/user
 * Created by cheng on 2017.12.13.
 */
layui.define(['layer', 'form', 'table'], function (exports) {
    var layer = layui.layer
        , form = layui.form
        , table = layui.table;

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

    table.render({
        elem: '#test'
        , method: 'POST'
        , url: '/user/list'
        , page: true
        , cols: [[
            {field: 'id', width: 80, title: 'ID', sort: true}
            , {field: 'username', width: 80, title: '用户名'}
            , {field: 'sex', width: 80, title: '性别', sort: true}
            , {field: 'city', width: 80, title: '城市'}
            , {field: 'sign', title: '签名', minWidth: 150}
            , {field: 'experience', width: 80, title: '积分', sort: true}
            , {field: 'score', width: 80, title: '评分', sort: true}
            , {field: 'classify', width: 80, title: '职业'}
            , {field: 'wealth', width: 135, title: '财富', sort: true}
        ]]
    });

    exports('list', {}); //注意，这里是模块输出的核心，模块名必须和use时的模块名一致
});