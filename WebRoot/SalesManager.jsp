<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'SalesManager.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css">
	.top3 {
		width: 900px;
		height: 650px float: 
	}
	
	#a a:link,#a a:visited {
		color: white;
		text-decoration: underline;
	}
	
	#a a:hover,#a a:active {
		color: #000000;
		text-decoration: none;
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
		<form action="SelectSal" method="post">
			<table style="height: 34px; " align="center" class="hovertable">
				<tr>
					<td style="font-size: 20px" onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';">查询类型</td>
					<td onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';"><select style="height: 34px; font-size: 20px"
						name="select">
							<option>订单编号</option>
							<option>会员名称</option>
							<option>商品名称</option>
					</select></td>
					<td onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';"><input type="text" style="width: 257px; height: 38px"
						name="value"></td>
					<td onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';"><input type="submit" value="查   询"
						style="font-size: 20px; height: 35px; width: 88px;border: none;background-color: #d4e3e5;"></a></td>
				</tr>
			</table>
		</form>
		<form action="goSal" method="post">
			<table style="width: 1200px;table-layout:fixed;" align="center" class="hovertable">
				<tr onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';">
					<td colspan="9" align="center"><h1>订单详情表</h1></td>
				</tr>
				<tr onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';">
					<td width="80px" height="23px">订单编号</td>
					<td width="80px">会员名称</td>
					<td width="80px">商品名称</td>
					<td width="80px">商品价格</td>
					<td width="80px">购买价格</td>
					<td width="80px">商品折扣</td>
					<td width="80px">销售数量</td>
					<td width="130px">销售时间</td>
					<td width="100px">操作</td>
				</tr>

				<c:forEach items="${list}" var="sal">

					<tr height="23px" onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';">
						<td>${sal.saleId }</td>
						<td>${sal.customerName }</td>
						<td>${sal.productName }</td>
						<td>${sal.productPrice }</td>
						<td>${sal.buyPrice }</td>
						<td>${sal.discount }</td>
						<td>${sal.saleCount }</td>
						<td>${sal.saleTime }</td>
						<td><a href="SelectSalById?id=${sal.saleId }" style="text-decoration: none;">✎修改</a> <a
							href="DeleteSalServlet?id=${sal.saleId }" style="text-decoration: none;">✄删除</a></td>
					</tr>


				</c:forEach>
				<tr height="23px" onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';">
					<td colspan="2"><a href="PagingSal?pageIndex=1"><input
							type="button" value="首页"></a></td>
					<td colspan="2"><a href="PagingSal?pageIndex=${NowIndex-1}"><input
							type="button" value="上一页"></a></td>
					<td colspan="2"><a href="PagingSal?pageIndex=${NowIndex+1}"><input
							type="button" value="下一页"></a></td>
					<td colspan="1"><a href="PagingSal?pageIndex=${pages }"><input
							type="button" value="尾页"></a></td>
					<td colspan="2">第<input type="text" name="page"
						value="${NowIndex}" style="width: 30px">页 共${pages}页 <input
						type="submit" value="go"
						style="border: none;width: 40px;background-color: #2571c5">
					</td>
				</tr>
			</table>
		</form>


	</div>
</body>
</html>