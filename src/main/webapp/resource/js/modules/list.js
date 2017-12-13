/**
 * Created by cheng on 2017.12.13.
 */
/**
 项目JS主入口
 以依赖layui的layer和form模块为例
 **/
layui.define(['layer', 'form', 'table', 'jquery', 'laypage'], function (exports) {
    var layer = layui.layer
        , form = layui.form
        , table = layui.table
        , laypage = layui.laypage
        , $ = layui.jquery;

    var usersData = '';
    $.ajax({
        url: '/layui/list/user.do',
        type: 'POST',
        async: false,
        cache: false,
        data: '',
        dataType: 'json',
        timeout: 60000,
        success: function (result) {
            usersData = result;
            if (usersData.success()) {
                usersList();
            }
        }
    });

    function usersList() {
        //渲染数据
        function renderDate(data, curr) {
            var dataHtml = '';
            currData = usersData.concat().splice(curr * nums - nums, nums);
            if (currData.length != 0) {
                for (var i = 0; i < currData.length; i++) {
                    dataHtml += '<tr>'
                        + '<td><input type="checkbox" name="checked" lay-skin="primary" lay-filter="choose"></td>'
                        + '<td>' + currData[i].userName + '</td>'
                        + '<td>' + currData[i].userEmail + '</td>'
                        + '<td>' + currData[i].userSex + '</td>'
                        + '<td>' + currData[i].userGrade + '</td>'
                        + '<td>' + currData[i].userStatus + '</td>'
                        + '<td>' + currData[i].userEndTime + '</td>'
                        + '<td>'
                        + '<a class="layui-btn layui-btn-mini users_edit"><i class="iconfont icon-edit"></i> 编辑</a>'
                        + '<a class="layui-btn layui-btn-danger layui-btn-mini users_del" data-id="' + data[i].usersId + '"><i class="layui-icon">&#xe640;</i> 删除</a>'
                        + '</td>'
                        + '</tr>';
                }
            } else {
                dataHtml = '<tr><td colspan="8">暂无数据</td></tr>';
            }
            return dataHtml;
        }

        //分页
        var nums = 13; //每页出现的数据量
        laypage({
            cont: "page",
            pages: Math.ceil(usersData.length / nums),
            jump: function (obj) {
                $(".users_content").html(renderDate(usersData, obj.curr));
                $('.users_list thead input[type="checkbox"]').prop("checked", false);
                form.render();
            }
        })
    }


    // table.render({
    //     elem: '#test'
    //     , url: 'http://www.layui.com/demo/table/user'
    //     , cellMinWidth: 80 //全局定义常规单元格的最小宽度，layui 2.2.1 新增
    //     , cols: [[
    //         {field: 'id', width: 80, title: 'ID', sort: true}
    //         , {field: 'username', width: 80, title: '用户名'}
    //         , {field: 'sex', width: 80, title: '性别', sort: true}
    //         , {field: 'city', width: 80, title: '城市'}
    //         , {field: 'sign', title: '签名', width: '30%', minWidth: 100} //minWidth：局部定义当前单元格的最小宽度，layui 2.2.1 新增
    //         , {field: 'experience', title: '积分', sort: true}
    //         , {field: 'score', title: '评分', sort: true}
    //         , {field: 'classify', title: '职业'}
    //         , {field: 'wealth', width: 137, title: '财富', sort: true}
    //     ]]
    // });

    exports('list', {}); //注意，这里是模块输出的核心，模块名必须和use时的模块名一致
});