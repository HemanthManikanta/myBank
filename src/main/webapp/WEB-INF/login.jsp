<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
* {box-sizing: border-box;}

body { 
  margin: 0;
  font-family: Arial, Helvetica, sans-serif;
}

.header {
  overflow: hidden;
  background-color: #f1f1f1;
  padding: 20px 10px;
}
</style>
<title>login</title>
</head>
<body>
<form action="/validate" ></form>
UserName
<input type = "text" name= "username"/></br>
Password
<input type = "password" name ="password"/></br>

<input type="submit" />
<a href = "validate" >login</a>
<div class="header">
  <a href="logout">logout</a>
</div>
</body>
</html>