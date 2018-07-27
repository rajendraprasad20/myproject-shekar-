<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

welcome to @ ${loginuser.name}
<form action="deleterecords">
<table border="2">
<tr>
<th>name</th>
<th>mobile</th>
<th>email</th>
</tr>
<c:forEach var="employee" items="${allrecords}" >
        <tr>
            <td><c:out value="${employee.name}"/></td>
            <td> <c:out value="${employee.mobile}"/></td>
             <td> <c:out value="${employee.email}"/></td>  
             <td><input type="button" value="delete" onclick="deleteEmp('${employee.email}')"/>
             <td><input type="button" value="edit" onclick="editviewEmp('${employee.email}')"/>
             <td><input type="checkbox" name="email"  value="${employee.email}"/>
        </tr>
    </c:forEach>
    </table>
    <input type="submit" value="deleteall"/>
    </form>
    
<script type="text/javascript">
function deleteEmp(email){
	alert(email);
	document.forms[0].action="deleteemp?deleteemp="+email;
	document.forms[0].method="post";
	document.forms[0].submit();
}
function editviewEmp(email){
	alert(email);
	document.forms[0].action="editviewEmp?editviewemp="+email;
	document.forms[0].method="post";
	document.forms[0].submit();
}


</script>

</body>
</html>