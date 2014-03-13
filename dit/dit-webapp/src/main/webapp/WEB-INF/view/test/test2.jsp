<%@ include file="/base/common/taglibs.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
	<head>
		<meta charset="utf-8">
		<title>Welcome</title>
	</head> 
	<body>
		<h2>111</h2>
		<table>
			<c:forEach var="rslt" items="${rslt}" varStatus="status">
				<tr>
					<td>${rslt.EXCEPTIONAL_CASE_CODE}</td>
					<td>${rslt.EXCEPTIONAL_CASE_VALUE}</td>
					<td>${rslt.DESCRIPTION}</td>
				</tr>
			</c:forEach>
		</table>
	</body>
</html>