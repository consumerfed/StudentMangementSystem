<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Course details</title>
</head>
<body>
<spring:url value="/course/save" var="saveURL" />
<form:form action="${saveURL }" method="POST" modelAttribute="courseForm">
  <form:hidden path="id"/>
  <table>
   <tr>
    <td>Course Name</td>
    <td><form:input path="coursename"/></td>
   </tr>
   <tr>
    <td>Description</td>
    <td><form:input path="courseDescription"/></td>
   </tr> 
    <tr>
    <td>Eligibility</td>
    <td><form:input path="courseEligiblity"/></td>
   </tr>
       <tr>
    <td>Age</td>
    <td><form:input path="courseMinAge"/></td>
   </tr> 
   
        <tr>
    <td>Strengh</td>
    <td><form:input path="courseStrength"/></td>
   </tr>     

   <tr>
    <td>Duration (Months)</td>
    <td><form:textarea path="courseDuration"/></td>
   </tr>
   <tr>
    <td></td>
    <td><button type="submit">Save</button></td>
   </tr>
  </table>
 </form:form>
</body>
</html>