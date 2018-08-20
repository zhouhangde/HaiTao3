<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'ManagerLogin.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css">
	 .top1{
		width:100%;
		height:300px;
		margin:auto;
		background:url(./img/Managerlogin.png);
		}
	form{
	    width:523px; height:324px;
	     margin:auto; margin-top:100px;
	     background-image:url(images/login.png);
	     border:1px #FFF solid;
	     background-color: #9BD1FF;
	}
	table{
	    margin:0 auto;
	    margin-top:60px;
	    height: 150px; 
	    width: 250px;
	    font-size: 20px;
	    }
	select,#user,#pass,#ID{
	    width:120px;}
	.tip{
	    color:#F00;
	    font-size:12px;}
	</style>

  </head>
  
  <body bgcolor="#2571C5" >
  <div class="top1" align="left" ></div>
  		<form  action="ManagerLogin" method="post" >  
		<h1 align="center" >嗨淘网管理员登录</h1>
      
    <table align="center" bgcolor="">
     <tr><td>用户名:</td><td><input  name="adminName" id="user" style="height: 39px; width: 134px"/></td></tr>
     <tr><td>密       码:</td><td><input type="password"  name="adminPwd" id="pass" style="height: 39px; width: 134px" /></td></tr>
    <tr><td><input type="submit" value="登  录"  style="margin-top:10px; height: 40px; width: 72px"/></td><td><input type="reset"  value="清   空" style="margin-left:35px; margin-top:10px; height: 40px; width: 100px"/></td></tr>
   </table>
  </form>
  </body>
</html>
