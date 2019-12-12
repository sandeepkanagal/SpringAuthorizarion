<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Authorization Info</title>
</head>
<body>
	<h3 style="color: red;">Authorization Info</h3>

	<div id="clientCredentials">
		<form:form action="http://localhost:8080/oauth/authorize"
			method="post" modelAttribute="orderservice">
			<p>
				 Code <input type="text" name="response_type" value="code" /> 
				 Client_id <input type="text" name="client_id" value="clientapp" />
				 Redirect URI <input type="text" name="redirect_uri" value="http://localhost:8090/showOrder" />
				 Scope <input type="text" name="scope" value="read" /> 
				 <input type="SUBMIT" value="Get Order info" />
		</form:form>
	</div>
</body>
</html>
