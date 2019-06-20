<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="css/bootstrap.min.css" rel="stylesheet" >
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript">
//验证
function check(){
	var author =$("#author").val() ;
	var title =$("#title").val() ;
	var summary =$("#summary").val();
	if(title.trim()==""){
		alert("标题不能为空");
		return false;
	};
	if(summary.trim()==""){
		alert("概要不能为空");
		return false;
	};
	if(author.trim()==""){
		alert("作者不能为空");
		return false;
	};

	document.getElementById("form1").submit();
}

</script>
</head>
<body>
	<div style="width: 100%">
		<div style="width: 30%; margin: 10% auto">
			<form  id="form1" class="form-horizontals" action="insert.action" method="post">
				<table>
					<tr>
						<td>标题：</td>
						<td><input type="text" id="title" name="title" placeholder="帖子标题"></td>
					</tr>
					<tr>
						<td>概要：</td>
						<td><textarea name="summary" id="summary" placeholder="概要"></textarea></td>
					</tr>
					<tr>
						<td>作者：</td>
						<td><input type="text" name="author" id="author" placeholder="作者名字"></td>
					</tr>
					<tr>
						<td colspan="2"><button type="button" onclick="check()">提交</button></td>
					</tr>
				</table>
			</form>
		</div>
	</div>
</body>
</html>