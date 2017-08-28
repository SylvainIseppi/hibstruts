<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Accueil</title>
</head>
<body>
	<s:form action="insert" method="post">
			<s:textfield label="Prénom" name="employe.firstname" />
			<s:textfield label="Nom" name="employe.lastname" />
			<s:textfield label="Age" name="employe.email" />
			<s:submit name="Valider" value="Employee" />
	</s:form>
	
</body>
</html>