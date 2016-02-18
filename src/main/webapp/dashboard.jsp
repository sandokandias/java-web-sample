<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<html> 
	<head> 
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
		<title>Dashboard</title> 
	</head> 
	<body> 
		<center> <h2>Bem vindo <% out.println(request.getParameter("u")); %></h2> </center>
	</body> 
</html>

