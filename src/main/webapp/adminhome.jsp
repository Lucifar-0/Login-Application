<%@ page language="java" import="com.util.Utility" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Home</title>
</head>
<body bgcolor="pink">

<%
int noo=Utility.parse(request.getParameter("no"));
if(noo==1){
	
%>
<script type="text/javascript">

alert("Incorect Password")
</script>


<%

}

%>

<center>
<img src="cooltext463077285715495.png">
<h1 style="color: red">Admin Home</h1>

</center>

</body>
</html>