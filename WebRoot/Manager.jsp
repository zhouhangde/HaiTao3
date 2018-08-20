<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Manager.jsp' starting page</title>
    
     <!-- 不缓存页面 -->
	<meta http-equiv="pragma" content="no-cache">
	<!-- 可重复访问服务器 -->
	<meta http-equiv="cache-control" content="no-cache">
	<!-- 设置为0，表示立即过期，可重复访问 -->
	<meta http-equiv="expires" content="0">   
	<!-- keywords用来告诉搜索引擎你网页的关键字是什么  -->
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<!-- description用来告诉搜索引擎你的网站主要内容 -->
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  <style type="text/css">
  .top1{
	width:100%;
	height:300px;
	margin:auto;
	background:url(./img/manager.png);
	}
	.top{
	width:1920px;
	height:650px;
	margin:auto;
	}
   .top2{
   	width:120px;
   	height:650px;
   	background-color:#256AB8;
   	float:left;
   }	
   .top3{
   	width:900px;
   	height:650px;
    float: left; 
   }
   .top4{
    height:400px;
    font-size: 24px;
    font-family: '微软雅黑';
    color: white
   }
    
    #a a:link, 
	#a a:visited { 
	color:white;
	text-decoration:underline; 
	} 
	#a a:hover, 
	#a a:active { 
	color:#000000; 
	text-decoration:none; 
	} 
	a{
	  font-size:15px;
	}
    a span{
       font-size:15px;
    }
    
   
  </style>
   <script type="text/javascript" src="js/jquery.js">
 </script>
  <script type="text/javascript">
  function iframe1() {
	$("#lianjie").attr("src","PagingPro");
}
  function iframe2() {
	$("#lianjie").attr("src","PagingCus");

}
  function iframe3() {
	$("#lianjie").attr("src","PagingSal");

}
  function iframe4() {
	$("#lianjie").attr("src","SelectAdmin");

}
  </script>
  </head>
  
  <body>
     <div class="top1" align="left" ></div>
     <div class="top" align="left" >
     <div class="top2" id="a">
     	<table align="center" class="top4" >
     		<tr><td align="center" ><a href="../HaiTao" style="text-decoration:none;"  >进入首页</a></td></tr>
     		<tr><td align="center" ><a><span  onclick="iframe1()">商品管理</span></a></td></tr>
     		<tr><td align="center" ><a><span  onclick="iframe2()">用户管理</span></a></td></tr>
     		<tr><td align="center" ><a><span  onclick="iframe3()">订单管理</span></a></td></tr>
     		<tr><td align="center" ><a><span  onclick="iframe4()">个人信息管理</span></a></td></tr>
     	</table>
     </div>
     <div class="top3">
     <iframe id="lianjie" scrolling="no" src="PagingPro" style="width:1560px;height:650px;border: none;position:absolute;"></iframe>
     </div>
  </div>
  </body>
</html>
