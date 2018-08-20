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
   	margin:left;
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
     <div class="top3"><br><br>
     <form action="SelectCus" method="post">
     	<table style="height: 34px;" align="center" class="hovertable">
     		<tr>
     			<td style="font-size: 20px" onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';">查询类型</td>
		     	<td onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';"><select style="height: 34px; font-size: 20px" name="select">
		     		<option >账号</option>
		     		<option >姓名</option>
		     		<option >邮箱</option>
		     	</select>
		     	</td>
		     	<td onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';"><input type="text"  style="width: 257px; height: 38px" name="value"></td>
		     	<td onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';"><input type="submit" value="查   询" style="font-size: 20px; height: 35px; width: 88px;border: none;background-color: #d4e3e5;"></a></td>
     		</tr>
     	</table>
     </form>
     
     
     	
    <form action="GoServlet" method="post">
	<table style="width: 1200px;table-layout:fixed;" align="center" class="hovertable">
		<tr onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';">
					<td colspan="11" align="center"><h1>用户信息表</h1></td>
					<td><a href="insertCus.jsp" style="text-decoration: none; font-size: 18px; font-family: 楷体;">✙新增</a></td>
				</tr>
		<tr onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';">
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
		<c:forEach items="${list}" var="CustomerLogin" >
			<tr onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';">
				<td>${CustomerLogin.customerId}</td>
				<td>${CustomerLogin.customerName}</td>
				<td>${CustomerLogin.customerPwd}</td>
				<td>${CustomerLogin.name}</td>
				<td>${CustomerLogin.customerSex}</td>
				<td>${CustomerLogin.customerPhone}</td>
				<td>${CustomerLogin.customerAddress}</td>
				<td>${CustomerLogin.customerMail}</td>
				<td>${CustomerLogin.customerScore}</td>
				<td>${CustomerLogin.customerRank}</td>
				<td>${CustomerLogin.customerMoney}</td>
				<td><a href="loadCustomerById?id=${CustomerLogin.customerId}" style="text-decoration: none;">✎修改</a> 
					<a href="deleteCustomer?id=${CustomerLogin.customerId}" style="text-decoration: none;">✄删除</a>
					</td>
			</tr>
		</c:forEach>
		   <tr onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';">
     			<td colspan="2"><a href="PagingCus?pageIndex=1"><input type="button" value="首页"></a></td>
     			<td colspan="2"><a href="PagingCus?pageIndex=${NowIndex-1}"><input type="button" value="上一页"></a></td>
     			<td colspan="2"><a href="PagingCus?pageIndex=${NowIndex+1}"><input type="button" value="下一页"></a></td>
     			<td colspan="2"><a href="PagingCus?pageIndex=${pages }"><input type="button" value="尾页"></a></td>
     			<td colspan="4">第<input type="text" name="page" value="${NowIndex}" style="width: 30px">页 &nbsp
     			共${pages}页
     		    <input type="submit"  value="go" style="border: none;width: 40px;background-color: #2571c5">
     			</td>
     		</tr>
	    </table>
          </form>
       
       
       
   </div>    
       
  </body>
</html>
