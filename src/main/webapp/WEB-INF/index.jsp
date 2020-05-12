<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MyBank</title>
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

.header a {
  float: left;
  color: black;
  text-align: center;
  padding: 12px;
  text-decoration: none;
  font-size: 18px; 
  line-height: 25px;
  border-radius: 4px;
}

.header a.logo {
  font-size: 25px;
  font-weight: bold;
}

.header a:hover {
  background-color: #ddd;
  color: black;
}

.header a.active {
  background-color: dodgerblue;
  color: white;
}

.header-right {
  float: right;
}

@media screen and (max-width: 500px) {
  .header a {
    float: none;
    display: block;
    text-align: left;
  }
  
  .header-right {
    float: none;
  }
}
</style>
</head>
<body background="C:\Users\Hemanth\eclipse\Downloads\information-sign-on-paper-317356.jpg">
<div style="background-image: url('C:\Users\Hemanth\eclipse\Downloads\black-building-under-white-sky-1837605.jpg');"></div>

<form action="/saveDetails" method="post">

<div class="header">
  <a href="#default" class="logo">My Bank</a>
  <div class="header-right">
    <a class="active" href="welcome.jsp">Home</a>
    <a href="#contact">contact</a>
    <a href="about">logout</a>
  </div>
</div>
<h2 align="center">Create New Account Here</h2>
<table>
<tr>
FirstName:</br>
<input type ="text" name="firstname" placeholder="ex:john"/></br>
LastName</br>
<input type ="text" name="lastname" placeholder="ex:john"/></br>
PhoneNumber</br>
<input type ="number" name="phonenumber" placeholder="ex:999999999"/></br>
SSN</br>
<input type ="number" name="ssn" placeholder="ex:0111011001100"/></br>
Address</br>
<input type ="text" name="address" placeholder="ex:county-2001"/></br>
State</br>
<input type ="text" name="State" placeholder="ex:GA"/></br>
Gender</br>
<input type ="text" name="Gender" placeholder="ex:male"/></br>
UserName</br>
<input type ="text" name="username" placeholder="ex:john"/></br>
Password</br>
<input type ="password" name="password" /></br>
</tr>
</table>
<div class="header">
<input type="submit" value = "Submit"/>
</div>
<div class="header">
<button type = "reset">Reset</button></br>
</div>

<div class="header">
  <a href="login">Already a User Login here</a>
</div>


</form>

</body>
</html>