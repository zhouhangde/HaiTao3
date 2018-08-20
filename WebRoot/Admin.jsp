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
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  <style type="text/css">	
	   .top3{
	   	width:900px;
	   	height:650px; 
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
	    .tdtop{
	    font-family:'黑体';
	    font-size: 18px;
	    width:150px;
	    }
	    table.hovertable {
			font-family: verdana,arial,sans-serif;
			font-size:11px;
			color:#333333;
			border-width: 1px;
			border-color: #999999;
			border-collapse: collapse;
		}
		table.hovertable th {
			background-color:#c3dde0;
			border-width: 1px;
			padding: 8px;
			border-style: solid;
			border-color: #a9c6c9;
		}
		table.hovertable tr {
			background-color:#d4e3e5;
		}
		table.hovertable td {
			border-width: 1px;
			padding: 8px;
			border-style: solid;
			border-color: #a9c6c9;
		}
   
  </style>
  </head>
  
  <body>
     <div class="top3"><br><br><br><br><br><br><br><br>
     <form action="UpdateAdmin" method="post"  target="_blank">
     	<table align="center" class="hovertable">
     		<tr onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';"><td colspan="5" align="center"><h1>当前用户信息</h1></td></tr>
     		<tr align="center" onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';">
     			<td class="tdtop" height="23px">管理员编号</td>
     			<td class="tdtop">角色名称</td>
     			<td class="tdtop">用户账号</td>
     			<td class="tdtop" >用户密码</td>
     			<td class="tdtop" >操作</td>
     		</tr>
     		
     		<c:forEach items="${list}" var="ad">
     			<tr height="23px">
	     			<td><input type="text" readonly="readonly" name="adminId" value="${ad.adminId }" style="border: none;background:#d4e3e5;"></td>
	     			<td><input type="text" readonly="readonly" value="${ad.rol.roleName }" style="border: none;background:#d4e3e5;"></td>
	     			<td><input type="text" readonly="readonly" name="adminName" value="${ad.adminName }" style="border: none;background:#d4e3e5;"></td>
	     			<td onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';"><input type="text" name="adminPwd" value="${ad.adminPwd }"></td>
	     			<td align="center" onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';"><input type="submit" value="修改" style="border: none;background-color: #d4e3e5;font-size: 15"></td>
	     		</tr>
     		</c:forEach>
     	</table>
     </form>
  </div>   
  </body>
</html>
