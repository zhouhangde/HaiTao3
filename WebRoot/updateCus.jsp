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
    float: left; 
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
		overflow:hidden; 
		white-space:nowrap; 
	}       
   
    
   
  </style>
  </head>
  
  <body>
      <div class="top3"><br><br><br><br>
     	 <form action="updateCustom" method="post">
		<br><br><br><br><br><br><br><br><br>
	<table align="center" class="hovertable">
		<tr align="center" onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';">
			<td colspan="12" ><h1>用户信息</h1></td>
		</tr>
	    <tr align="center" height="30px" onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';">
	    	<td>编号</td>
	    	<td>账号</td>
	    	<td>密码</td>
	    	<td>姓名</td>
	    	<td>性别</td>
	    	<td>手机号</td>
	    	<td>住址</td>
	    	<td>邮箱</td>
	    	<td>积分</td>
	    	<td>等级</td>
	    	<td>余额</td>
	    	<td>操作</td>
	    </tr>
		<tr  height="30px">
		  <td>	<input type="text" name="customerId" readonly="readonly" value="${customer.customerId}" style="width: 60px;border: none;background:#d4e3e5;"/></td>
		  <td onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';">	<input type="text" name="customerName"  value="${customer.customerName}" style="width: 60px; "/></td>
          <td onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';"> <input type="text" name="customerPwd"  value="${customer.customerPwd}" style="width: 60px; "/></td>
		  <td onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';"> <input type="text" name="name"  value="${customer.name}" style="width: 90px; "/></td>
		  <td onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';">	<input type="text" name="customerSex"  value="${customer.customerSex}" style="width: 100px; "/></td>
	      <td onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';"> <input type="text" name="customerPhone"  value="${customer.customerPhone}" style="width: 100px; "/></td>
		  <td onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';">	<input type="text" name="customerAddress"  value="${customer.customerAddress}" style="width: 110px; "/></td>
		  <td onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';"> <input type="text" name="customerMail"  value="${customer.customerMail}" style="width: 100px; "/></td>
		  <td onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';">	<input type="text" name="customerScore"  value="${customer.customerScore}" style="width: 100px; "/></td>
		  <td onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';">	<input type="text" name="customerRank"  value="${customer.customerRank}" style="width: 100px; "/></td>
		  <td>	<input type="text" name="customerMoney" readonly="readonly" value="${customer.customerMoney}" style="width: 100px;border: none;background:#d4e3e5;"/></td>
		  	<!-- 学生图片<input type="file" name="studentPic"/> -->
		  <td onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';">	<input type="submit" value="确定" style="border: none;background-color: #d4e3e5;font-size: 15;"/></td>
	  	</tr>
	  	<tr  height="30px" >
	  		<td colspan="12" align="right">请输入充值金额：<input type="text" name="addMoney"  value="0" style="width: 100px; "/></td>
	  	</tr>
	  	</table>
	</form>
     </div>
  
  
  </body>
</html>
