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
    
    <title>My JSP 'updateSales.jsp' starting page</title>
    
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
      <form action="UpdateSal" method="post">
    	<table align="center" width="1200px " class="hovertable">
    		<tr align="center" onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';">
				<td colspan="12" ><h1>订单信息</h1></td>
			</tr>
    		<tr onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';">
     			<td>订单编号</td>
     			<td>会员名称</td>
     			<td>商品名称</td>
     			<td>商品价格</td>
     			<td>购买价格</td>
     			<td>商品折扣</td>
     			<td>销售数量</td>
     			<td>销售时间</td>
     			<td>操作</td>
     		</tr>
     		<tr>
     			<td><input type="text" name="saleId" readonly="readonly" value="${sa.saleId }" style="width: 128px;border: none;background:#d4e3e5;"></td>
     			<td onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';"><input type="text" name="customerName"  value="${sa.customerName }" style="width: 128px; "></td>
     			<td onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';"><input type="text" name="productName"  value="${sa.productName }" style="width: 128px; "></td>
     			<td onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';"><input type="text" name="productPrice"  value="${sa.productPrice }" style="width: 128px; "></td>
     			<td onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';"><input type="text" name="buyPrice"  value="${sa.buyPrice }" style="width: 128px; "></td>
     			<td onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';"><input type="text" name="discount"  value="${sa.discount }" style="width: 128px; "></td>
     			<td onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';"><input type="text" name="saleCount"  value="${sa.saleCount }" style="width: 128px; "></td>
     			<td><input type="text" name="saleTime" readonly="readonly" value="${sa.saleTime }" style="width: 128px;border: none;background:#d4e3e5;"></td>
     			<td align="right" onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';"><input type="submit" value="确认" style="border: none;background-color: #d4e3e5;font-size: 15;"></td>
     		</tr>
    	</table>
    	</form> 
    
  </div> 
   
  </body>
</html>
