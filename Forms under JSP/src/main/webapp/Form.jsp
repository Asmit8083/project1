<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form Demo</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/Controller" method="get">
    Full Name: <input type="text" name="name" required/> <br/>
    Gender: <input type="radio" name="gender" value="male" checked="checked"/>Male
            <input type="radio" name="gender" value="female"/>Female <br/>
    Languages Known: <input type="checkbox" name="language" value="English"> English
                     <input type="checkbox" name="language" value="Hindi"> Hindi
                     <input type="checkbox" name="language" value="Hinglish"> Hinglish <br/>
    Country: <select name="country">
             <option value="INDIA">INDIA 
             <option value="USA">USA
    	     <option value="CHINA">China
             <option value="Europe">Europe
             <option value="Australia">Australia
             <option value="Africa">Africa
             <option value="Canada">Canada
         </select><br/>
         <input type="submit" value="submit"/>
    
</form>
</body>
</html>