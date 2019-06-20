<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<style type="text/css">
div {
	float: right;
}
div.a{
   text-align: center;
}
</style>
</head>
<body>


	<div style="width: 100%" class="a"><h1>帖子列表展示</h1></div>
	<div>
		<form action="search.action" method="post">
			<input type="text" name="title" placeholder="热搜">
			<button>搜索</button>
		</form>
	</div>
	<div>
		<form action="delete.action" method="post">
			<table class="table">
				<tr>
					<th>选择</th>
					<th>编号</th>
					<th>标题</th>
					<th>概要</th>
					<th>作者</th>
					<th>创建时间</th>
					<th>操作</th>
				</tr>
				<c:forEach items="${ins }" var="in">
					<tr>
						<th><input type="checkbox" name="ids" value="${in.id }"></th>
						<td>${in.id }</td>
						<td>${in.title }</td>
						<td style="width: 50%;">${in.summary }</td>
						<td>${in.author }</td>
						<td>${in.createdate }</td>
						<td><a href="toupdate.action?id=${in.id }">修改</a></td>
					</tr>
				</c:forEach>
			</table>
			<button type="button" class="btn-danger" value="删除帖子">删除帖子</button>
		
		</form>

		<button type="button"  class="btn-success" onclick="javascript:window.location.href='toinsert.action'"
			value="增加帖子">增加帖子</button>
		&nbsp;&nbsp;&nbsp;
	</div>
</body>
</html>