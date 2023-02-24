<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isErrorPage = "true" %> <!-- 다른 jsp 페이지에서 예외 발생시 예외를 처리하는 예외 페이지로 지정 (동의)-->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>에러 페이지</title>
</head>
<body>
1. toString() 내용 <br>
<h1><%= exception.toString() %></h1>
2. getMessage() 내용 <br>
<h1><%= exception.getMessage() %></h1>
3. printStackTrace() 내용 <br>
<h1><% exception.printStackTrace(); %></h1> <!-- 이클립스 콘솔로 예외 메세지 출력 -->

숫자만 입력 가능합니다. 다시 시도하세요.
<a href = 'add.html'> 다시 하기 </a>
</body>
</html>