<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<style>
* {
	margin: 0;
	top: 0;
}

body {
	height: 100vh;
	background: url(image/background.jpg) no-repeat;
	background-size: cover;
	display: flex;
	justify-content: center;
	align-items: center;
}

.box {
	width: 350px;
	height: 350px;
	border-top: 1px solid rgba(255, 255, 255, 0.5);
	border-left: 1px solid rgba(255, 255, 255, 0.5);
	border-bottom: 1px solid rgba(255, 255, 255, 0.3);
	border-right: 1px solid rgba(255, 255, 255, 0.3);
	backdrop-filter: blur(1px);
	background: rgba(50, 50, 50, 0.4);
	display: flex;
	flex-direction: column;
	justify-content: center;
	align-items: center;
	border-radius: 6px;
}

.box>h2 {
	color: rgba(255, 255, 255, 0.9);
	margin-bottom: 30px;
}

.box .input-box {
	display: flex;
	flex-direction: column;
	box-sizing: border-box;
	margin-bottom: 10px;
}

.box .input-box label {
	font-size: 13px;
	color: rgba(255, 255, 255, 0.9);
	margin-bottom: 5px;
}

.box .input-box input, .box .input-box select {
	letter-spacing: 1px;
	font-size: 14px;
	box-sizing: border-box;
	width: 250px;
	height: 35px;
	border-radius: 5px;
	border: 1px solid rgba(255, 255, 255, 0.3);
	background: rgba(50, 50, 50, 0.3);
	outline: none;
	padding: 0 12px;
	color: rgba(255, 255, 255, 0.9);
	transition: 0.2s;
}

/* 输入框聚焦效果 */
.box .input-box input:focus, .box .input-box select:focus {
	border: 1px solid rgba(255, 255, 255, 0.8);
}

.box .btn-box {
	width: 250px;
	display: flex;
	flex-direction: column;
}

.box .btn-box>a {
	outline: none;
	display: block;
	width: 250px;
	text-align: end;
	text-decoration: none;
	font-size: 13px;
	color: rgba(255, 255, 255, 0.8);
}

.box .btn-box>a:hover {
	color: rgba(255, 255, 255, 1);
}

.box .btn-box>div {
	margin-top: 10px;
	display: flex;
	justify-content: center;
	align-items: center;
}

.box .btn-box>div>button {
	outline: none;
	margin-top: 10px;
	display: block;
	font-size: 14px;
	border-radius: 5px;
	transition: 0.2s;
}

.box .btn-box>div>button:nth-of-type(1) {
	width: 120px;
	height: 35px;
	color: rgba(255, 255, 255, 0.9);
	border: 1px solid rgba(00, 96, 96, 0.7);
	background: rgba(00, 96, 96, 0.5);
}

.box .btn-box>div>button:nth-of-type(2) {
	width: 120px;
	height: 35px;
	margin-left: 10px;
	color: rgba(255, 255, 255, 0.9);
	border: 1px solid rgba(00, 96, 96, 0.7);
	background: rgba(00, 96, 96, 0.5);
}

.box .btn-box>div>button:hover {
	border: 1px solid rgba(00, 96, 96);
	background: rgba(00, 96, 96);
}
</style>
</head>
<body>
	<div class="box">
		<h2>Login</h2>
		<form action="/student/LoginServlet" method="get">
			<div class="input-box">
				<label for="tid">账号</label> <input type="text" name="username" id=""username""
					placeholder="请输入学号" required>
			</div>
			<div class="input-box">
				<label for="password">密码</label> <input type="password"
					name="password" id="password" placeholder="请输入密码" required>
					<span style="color:red"><%=request.getAttribute("msg")!=null?request.getAttribute("msg"):""%></span>
			</div>
			<!-- 添加选择项 -->
			<div class="input-box">
				<label for="status">角色</label>
				<select name="status" id="status" required>
					<option value="">请选择角色</option>
					<option value="1">老师</option>
					<option value="2">学生</option>
				</select>
				<span style="color:red"><%=request.getAttribute("mag")!=null?request.getAttribute("mag"):""%></span>
			</div>
			<div class="btn-box">
				<a href="javascript:void(0)">忘记密码?</a>
				<div>
					<button type="submit">登录</button>
					<button type="button"
						onclick="window.location.href='/student/regist.jsp'">注册</button>
				</div>
			</div>
		</form>
	</div>
</body>
</html>