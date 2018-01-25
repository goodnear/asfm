<%--
  User: 帅气的txx创建
  Date: 2018/1/25 0025
  Time: 下午 23:24
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
    <title>成绩分析总表</title>
    <script type="text/javascript">

    </script>
</head>
<body>
    <div class="easyui-layout" style="height: 1000px">
        <div region="north" style="height: 100px;">
            <div style="float: left;margin: 10px">
                <strong>班级</strong>
                <select class="easyui-combobox" id="txxclass" name="txxclass"></select>
            </div>
            <div style="float: left;margin: 10px">
                <strong>考试期数</strong>
                <select class="easyui-combobox" id="exam" name="exam"></select>
            </div>
            <div style="float: left;margin: 10px">
                <strong>排序方式</strong>
                <select class="easyui-combobox" id="rankType" name="rankType"></select>
            </div>
            <div style="float: left;margin: 10px">
                <input type="button" value="上传成绩表" class="easyui-linkbutton c6" onclick="toUpload()">
            </div>
            <div style="float: left;margin: 10px">
                <input type="button" value="图形分析" class="easyui-linkbutton c6" onclick="toImage()">
            </div>
        </div>
        <div region="center">
            <table class="easyui-datagrid" title="学生成绩表" style="width:700px;height:250px"
                   data-options="singleSelect:true,collapsible:true">
                <thead>
                <tr>
                    <th data-options="field:'studentName',width:80">学生姓名</th>
                    <th data-options="field:'chinese',width:100">语文</th>
                    <th data-options="field:'math',width:80,align:'right'">数学</th>
                    <th data-options="field:'english',width:80,align:'right'">英语</th>
                    <th data-options="field:'politics',width:250">政治</th>
                    <th data-options="field:'history',width:60,align:'center'">历史</th>
                    <th data-options="field:'geography',width:60,align:'center'">地理</th>
                    <th data-options="field:'physics',width:60,align:'center'">物理</th>
                    <th data-options="field:'chemistry',width:60,align:'center'">化学</th>
                    <th data-options="field:'biology',width:60,align:'center'">生物</th>
                    <th data-options="field:'totalScore',width:60,align:'center'">总分</th>
                    <th data-options="field:'classRank',width:60,align:'center'">班级排名</th>
                    <th data-options="field:'schoolRank',width:60,align:'center'">学校排名</th>
                </tr>
                </thead>
            </table>
        </div>
    </div>
    <div id="txxcjb" class="easyui-window" title="上传成绩表" data-options="modal:true,closed:true,iconCls:'icon-save'"
         style="width:500px;height:200px;padding:10px;">
        <form action="">
        <div style="margin: 10px">
            <strong>班级</strong>
            <input value="">
        </div>
        <div style="margin: 10px">
            <strong>考试期数</strong>
            <input value="">
        </div>
        <div style="margin:20px">
            <div>上传成绩表:</div>
            <input class="easyui-filebox" name="file1" data-options="prompt:'选择一个文件'" style="width:100%">
        </div>
        </form>
    </div>
</body>
</html>
