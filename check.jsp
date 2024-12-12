<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="com.model.Student"%>
<!DOCTYPE html>
<html lang="zh">
<head>
<meta http-equiv="Content-Language" content="zh-cn">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>学生信息与成绩</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
        }
        .container {
            max-width: 800px;
            margin: auto;
        }
        h1 {
            text-align: center;
        }
        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
        }
        th, td {
            border: 1px solid #ddd;
            padding: 8px;
            text-align: left;
        }
        th {
            background-color: #f2f2f2;
        }
        tr:nth-child(even) {
            background-color: #f9f9f9;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>学生信息与成绩</h1>
        <table>
            <tr>
                <th>学生姓名</th>
                <td>${student.sname}</td>
            </tr>
            <tr>
                <th>学号</th>
                <td>${student.sid}</td>
            </tr>
            <tr>
                <th>班级</th>
                <td>${student.department}</td>
            </tr>
            <tr>
                <th>联系方式</th>
                <td>${student.phone}</td>
            </tr>
             <tr>
                <th>地址</th>
                <td>${student.address}</td>
            </tr>
             <tr>
                <th>专业</th>
                <td>${student.major}</td>
            </tr>
        </table>
    </div>
</body>
<script>
</script>
</html>