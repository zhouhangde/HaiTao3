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
      <form action="UpdatePro" method="post" enctype="multipart/form-data">
    	<table align="center" width="1200px " class="hovertable">
    		<tr align="center" onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';">
				<td colspan="12" ><h1>商品信息</h1></td>
			</tr>
    		<tr onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';">
     			<td>商品编号</td>
     			<td>品类编号</td>
     			<td>商店编号</td>
     			<td>商品名称</td>
     			<td>商品价格</td>
     			<td>折扣价格</td>
     			<td>商品数量</td>
     			<td>商品上面描述</td>
     			<td>商品图片</td>
     			<td>操作</td>
     		</tr>
     		<tr>
     			<td><input type="text" name="productId" readonly="readonly" value="${pr.productId }" style="width: 128px;border: none;background:#d4e3e5;"></td>
     			<td onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';"><input type="text" name="categoryId" value="${pr.categoryId }" style="width: 128px;"></td>
     			<td><input type="text" name="storeId" readonly="readonly" value="1" style="width: 128px;border: none;background:#d4e3e5;"></td>
     			<td onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';"><input type="text" name="productName"  value="${pr.productName }" style="width: 128px; "></td>
     			<td onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';"><input type="text" name="price"  value="${pr.price }" style="width: 128px; "></td>
     			<td onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';"><input type="text" name="productPrice"  value="${pr.productPrice }" style="width: 128px; "></td>
     			<td onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';"><input type="text" name="productNum"  value="${pr.productNum }" style="width: 128px; "></td>
     			<td onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';"><input type="text" name="productDescription" value="${pr.productDescription }" style="width: 128px; "></td>
     			<td onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';"><input type="file" name="productImage"  value="${pr.productImage }" style="width: 128px; "></td>
     			<td align="right" onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';"><input type="submit" value="确认" style="border: none;background-color: #d4e3e5;font-size: 15;"></td>
     		</tr>
    	</table>
    	</form> 
  </div> 
   
  </body>
</html>
