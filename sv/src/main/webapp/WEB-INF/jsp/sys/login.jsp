<%--
  User: 帅气的txx创建
  Date: 2017/12/17 0017
  Time: 下午 23:35
  If I can put your destruction, I would like to with you fall in the abyss
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script type="text/javascript" src="/easyui/jquery.min.js"></script>
    <script type="text/javascript" src="/easyui/jquery.easyui.min.js"></script>
    <link rel="stylesheet" type="text/css" href="/easyui/themes/bootstrap/easyui.css">
    <link rel="stylesheet" type="text/css" href="/easyui/themes/bootstrap/calendar.css">
    <link rel="stylesheet" type="text/css" href="/easyui/themes/bootstrap/datebox.css">
    <link rel="stylesheet" type="text/css" href="/easyui/themes/icon.css">
    <script type="text/javascript" src="/js/common.js"></script>
    <script type="text/javascript">
        function login() {
            if($("#loginName").val()==''){
                $.messager.alert("提示信息","登录名不能为空!","error");
                $("#loginName").focus();
                return false;
            }
            if($("#password").val()==''){
                $.messager.alert("提示信息","密码不能为空!","error");
                $("#password").focus();
                return false;
            }
            $.ajax({
                type:"post",
                data:JSON.stringify($("#loginForm").serializeObject()),
                url:"/login/doLogin.do",
               contentType:"application/json",
                dataType:"json",
                success:function (data) {
                    if(data.code=="99"){
                        $.messager.alert("提示信息","登录成功！");
                    }else {
                        $.messager.alert("提示信息",data.info,"error");
                    }
                }
            })
        }

        function cleardata() {
            $("#loginName").val("");
            $("#password").val("");
        }
    </script>
    <title>登录</title>
</head>
<body>
<div id="loginWin" class="easyui-window" title="登录" style="width:350px;height:188px;padding:5px;"
     minimizable="false" maximizable="false" resizable="false" collapsible="false">
    <div class="easyui-layout" fit="true">
        <div region="center" border="false" style="padding:5px;background:#fff;border:1px solid #ccc;">
            <form id="loginForm" method="post">
                <div style="padding:5px 0;">
                   帐号
                    <input type="text" id="loginName" name="loginName" style="width:260px;"></input>
                </div>
                <div style="padding:5px 0;">
                    密码
                    <input type="password" id="password" name="password" style="width:260px;"></input>
                </div>
                <div style="padding:5px 0;text-align: center;color: red;" id="showMsg"></div>
            </form>
        </div>
        <div region="south" border="false" style="text-align:right;padding:5px 0;">
            <a class="easyui-linkbutton" iconCls="icon-ok" href="javascript:void(0)" onclick="login()">登录</a>
            <a class="easyui-linkbutton" iconCls="icon-cancel" href="javascript:void(0)" onclick="cleardata()">重置</a>
        </div>
    </div>
</div>
</body>
</html>
