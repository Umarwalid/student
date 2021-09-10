<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3> register student</h3>
 <form action="addstd">
 <b>enter first name</b>
 <input type= "text" name="Firstname"><br>
 <b>enter Last name</b>
 <input type= "text" name="Lastname"><br>
 <b>enter Other name</b>
 <input type= "text" name="Othername"><br>
 <b>enter Gender</b>
 <input type= "text" name="Gender"><br>
 <b>enter date of birth</b>
 <input type= "text" name="DOB"><br>
 <b>enter Department</b>
 <input type= "text" name="Department"><br>
 <input type= "submit"><br>
 </form>
 
 <h3> retrieve student</h3>
  <form action="getstd">
  <b>enter matrix number</b>
 <input type= "text" name="matrix"><br>
 <input type= "submit"><br>
 </form>
 <h3> update student information</h3>
  <form action="upstd">
 <input type= "text" name="name"><br>
 <input type= "text" name="number"><br>
 <input type= "submit"><br>
 </form>
</body>
</html>