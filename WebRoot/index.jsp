<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript" src="${pageContext.request.contextPath }/front/js/jquery-1.8.3.min.js"></script>
	<script type="text/javascript">
	$(function(){
	    window.parent.location.href="${pageContext.request.contextPath }/front/login.jsp"
		$("#aaa").mouseover(function(e){
		    //1.获取原图片大小
		    var width=this.width*2;
		    var height=this.height*2;
		    //2.获取鼠标的坐标
		    var x=e.pageX;
		    var y=e.pageY;
		    //3.创建div
		    var div=$("<div id='bigDiv'/>").css({
		                                     "position":"absolute", 
		                                     "display":"none",
		                                     "width":width,
		                                     "height":height,
		                                     "left":x+10,
		                                     "top":y+10,
		                                     "border":"2px solid red"
		                                  });
		    //4.获取放大的图片
		    var img=$("<img/>").css({
		    						"width":width,
		                            "height":height
		                          }).attr({
		                            "src":this.src  
		                          })
		    //5.将图片放入div
		    div.append(img);
		    //6.将div放入body
		    $("body").append(div);
		    div.show(1000)
		}).mousemove(function(e){
			 var x=e.pageX;
		     var y=e.pageY;
		     $("#bigDiv").css({
		         "left":x+10,
		         "top":y+10
		     })
		}).mouseout(function(e){
			$("#bigDiv").remove();
		})	
	})
    </script>
  </head>
  <body>
    This is my JSP page.欢迎光临后台管理系统 <br>
    <img id="aaa" src="${pageContext.request.contextPath }/back/img/1.jpg"/>
  </body>
</html>
