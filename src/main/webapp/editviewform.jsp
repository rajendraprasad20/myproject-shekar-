<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="update">
Name:<input type="text" name="name" value="${editview.getName()}"/><br>
Email:<input type="text" name="email" value="${editview.getEmail()}"/><br>
Mobile:<input type="text" name="mobile" value="${editview.getMobile()}"/><br>
Password:<input type="text" name="password" value="${editview.getPassword()}"/><br>
<input type="submit" value="update">

</form>

</body>
</html>