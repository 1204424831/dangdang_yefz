<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false"%>
<html>
	<head>
		<link rel="stylesheet" href="../css/btn.css" />
	</head>
	<body style="background-color: #f0f9fd;text-align: center;">
	
		<div style="font-size:25px">类别管理</div><hr/>
		<div style="margin-bottom: 10px;">
			<div class="button btn-p" onclick="location.href='add-first.jsp'">添加一级类别&raquo;</div>
			<div class="button btn-p" onclick="location.href='add-second.jsp'">添加二级类别&raquo;</div>
		</div>
		<table bordercolor='#898E90' align='center' border='3px' cellpadding='10px' cellspacing="0px" >
			<tr bgcolor='lightblue'>
				<td>Id</td>
				<td>类别名</td>
				<td>所属类别</td>
				<td>级别</td>
				<td>操作</td>
			</tr>
			
			<tr>
				<td>1001</td>
				<td>科技</td>
				<td></td>
				<td>1</td>
				<td>
					<div class="button" onclick="location.href='' ">删除 &raquo;</div>	
				</td>
			</tr>
			<tr>
				<td>1002</td>
				<td>小说</td>
				<td></td>
				<td>1</td>
				<td>
					<div class="button" onclick="location.href='' ">删除 &raquo;</div>	
				</td>
			</tr>
			<tr>
				<td>1003</td>
				<td>教育</td>
				<td></td>
				<td>1</td>
				<td>
					<div class="button" onclick="location.href='' ">删除 &raquo;</div>	
				</td>
			</tr>
			<tr>
				<td>1004</td>
				<td>古典小说</td>
				<td>小说</td>
				<td>2</td>
				<td>
					<div class="button" onclick="location.href='' ">删除 &raquo;</div>	
				</td>
			</tr>
			<tr>
				<td>1005</td>
				<td>近现代小说</td>
				<td>小说</td>
				<td>2</td>
				<td>
					<div class="button" onclick="location.href='' ">删除 &raquo;</div>	
				</td>
			</tr>
			<tr>
				<td>1005</td>
				<td>四大名著</td>
				<td>小说</td>
				<td>2</td>
				<td>
					<div class="button" onclick="location.href='' ">删除 &raquo;</div>	
				</td>
			</tr>
			
			
		</table><br/>
		
	</body>  
</html>



