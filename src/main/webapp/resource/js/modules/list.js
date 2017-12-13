/**
 * Created by cheng on 2017.12.13.
 */
/**
 项目JS主入口
 以依赖layui的layer和form模块为例
 **/
layui.define(['layer', 'form', 'table'], function (exports) {
    var layer = layui.layer
        , form = layui.form
        , table = layui.table;

    table.render({
        elem: '#test'
        , url: '/layui/list/user'
        , cellMinWidth: 80 //全局定义常规单元格的最小宽度，layui 2.2.1 新增
        , cols: [[
            {field: 'id', width: 80, title: 'ID', sort: true}
            , {field: 'username', width: 80, title: '用户名'}
            , {field: 'sex', width: 80, title: '性别', sort: true}
            , {field: 'city', width: 80, title: '城市'}
            , {field: 'sign', title: '签名', width: '30%', minWidth: 100} //minWidth：局部定义当前单元格的最小宽度，layui 2.2.1 新增
            , {field: 'experience', title: '积分', sort: true}
            , {field: 'score', title: '评分', sort: true}
            , {field: 'classify', title: '职业'}
            , {field: 'wealth', width: 137, title: '财富', sort: true}
        ]]
    });

    exports('list', {}); //注意，这里是模块输出的核心，模块名必须和use时的模块名一致
});