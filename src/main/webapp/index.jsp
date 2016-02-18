<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<html> 
	<head> 
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
		<title>JSP Page</title> 
	</head> 
	<body> 
		<center> <h1>Login de Usu&aacute;rios</h1> </center>
		<center> <h2>Informe sua credencial</h2> 
			<form action="/java-web-sample/login" method="post"> 
				<br/>Login:<input type="text" name="login"> 
				<br/>Senha:<input type="password" name="password"> 
				<br/><input type="submit" value="Ok"> 
			</form> 
		</center> 
		<br/>
		<center>
			<h4><font color="red">
			 <%
			 	String message = request.getParameter("m");
			 	if (message != null && !message.isEmpty()) {
			 		out.println(message);
			 	}
			 %>
			</font></h4>
		</center> 
	</body> 
</html>

