<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="UTF-8"%>

<%@ page import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
	<head>
		<meta http-equiv="Content-Language" content="zh-cn">
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <style>
		body
		{
			SCROLLBAR-ARROW-COLOR: #ffffff;  SCROLLBAR-BASE-COLOR: #dee3f7;
		}
    </style>
  </head>
 <%
	String username = request.getParameter("username");
	String Tid = request.getParameter("Tid");
%>
<frameset rows="103,*,43" frameborder=0 border="0" framespacing="0">
  <frame src="${pageContext.request.contextPath}/admin/top.jsp?username="+${username} name="topFrame" scrolling="NO" noresize>
  <frameset cols="159,*" frameborder="0" border="0" framespacing="0">
		<frame src="${pageContext.request.contextPath}/admin/left.jsp?username=${username}&Tid=${Tid}" 
		name="leftFrame" noresize scrolling="YES">
		<frame src="${pageContext.request.contextPath}/admin/welcome.jsp" name="mainFrame">
  </frameset>
  <frame src="${pageContext.request.contextPath}/admin/bottom.jsp" name="bottomFrame" scrolling="NO"  noresize>
</frameset>
</html>
