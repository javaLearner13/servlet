<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%!
    	String name = "이순신";
    public String getName(){return name;}
    %>
    <% String age = request.getParameter("age"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Hello <%=name %> 님</h1>
<h1>your age is <%=age %></h1>
<h1>your height is <%=182.6 %> CM</h1>
<h1>your age + 10 equals to <%=Integer.parseInt(age)+10 %></h1>

<!-- http://localhost:8090/pro12/hello3.jsp?age=23 -->

</body>
</html>

