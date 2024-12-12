<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="zh">
<head>
<meta http-equiv="Content-Language" content="zh-cn">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改密码</title>
<style>
body {
	font-family: 'Arial', sans-serif;
	background-color: #f4f4f4;
	margin: 0;
	padding: 20px;
}

.form-container {
	background-color: #ffffff;
	padding: 20px;
	border-radius: 8px;
	box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
	max-width: 600px;
	margin: 20px auto;
}

table {
	width: 100%;
	border-collapse: collapse;
}

th, td {
	padding: 12px;
	text-align: left;
	border-bottom: 1px solid #ddd;
}

th {
	background-color: #4CAF50;
	color: white;
}

.button_ok, .button_cancel {
	padding: 10px 15px;
	margin: 5px;
	border: none;
	border-radius: 5px;
	cursor: pointer;
	font-size: 16px;
}

.button_ok {
	background-color: #4CAF50;
	color: white;
}

.button_cancel {
	background-color: #f44336;
	color: white;
}

input[type="text"], input[type="password"] {
	width: 100%;
	padding: 8px;
	margin: 5px 0;
	border: 1px solid #ccc;
	border-radius: 4px;
}

input[type="submit"], input[type="button"] {
	cursor: pointer;
}

.error {
	color: red;
	font-size: 14px;
	margin-top: 5px;
}

.error-input {
	border-color: red;
}
</style>
<script>
        function validatePasswordForm() {
            var newPassword = document.getElementsByName("newPassword")[0].value;
            var confirmPassword = document.getElementsByName("confirmNewPassword")[0].value;
            var errorMessage = document.getElementById("errorMessage");
            var newPasswordInput = document.getElementsByName("newPassword")[0];
            var confirmPasswordInput = document.getElementsByName("confirmNewPassword")[0];

            if (newPassword !== confirmPassword) {
                errorMessage.style.display = "block";
                newPasswordInput.classList.add("error-input");
                confirmPasswordInput.classList.add("error-input");
                confirmPasswordInput.value = ""; // 清空确认密码框
                return false;
            } else {
                errorMessage.style.display = "none";
                newPasswordInput.classList.remove("error-input");
                confirmPasswordInput.classList.remove("error-input");
                return true;
            }
        }
    </script>
</head>
<body>
	<div class="form-container">
		<h2>修改密码</h2>
		<form
			action="${pageContext.request.contextPath}/ChangePasswordServlet?username="+${username}
			method="get" onsubmit="return validatePasswordForm()">
			<input type="hidden" name="username" value="${username}">
			<!-- 假设username由后端提供 -->
			<table>
				<tr>
					<th colspan="2">修改密码</th>
				</tr>
				<tr>
					<td width="30%" align="center">旧密码：</td>
					<td><input type="password" name="oldPassword" required></td>
				</tr>
				<tr>
					<td align="center">新密码：</td>
					<td><input type="password" name="newPassword" required></td>
				</tr>
				<tr>
					<td align="center">确认新密码：</td>
					<td><input type="password" name="confirmNewPassword" required></td>

				</tr>
				<tr>
					<td colspan="2" align="center">
						<button type="submit" class="button_ok">确定</button>
						<button type="reset" class="button_cancel">重置</button> <input
						class="button_ok" type="button" onclick="history.go(-1)"
						value="返回">
					</td>
				</tr>
			</table>
			<span id="error" style="" class="errorMI"><%=request.getAttribute("msg")!=null?request.getAttribute("msg"):"" %></span>
		</form>
	</div>
</body>
</html>