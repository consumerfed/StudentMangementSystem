<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>course details</title>
</head>
<body>
<spring:url value="/course/add" var="addURL" />
 <a href="${addURL }">Add new Customer</a>
 <table width="100%" border="1">
  <tr>
   <td>ID</td>
   <td>Course Name</td>
   <td>Course Duration</td>
   <td>Course Eligiblity</td>
   <td>Course Strength</td>
   <td colspan="2">Action</td>
  </tr>  
  <c:forEach items="${list }" var="courseDetail" >
   <tr>
    <td>${course.courseId }</td>
    <td>${course.courseName }</td>
    <td>${course.courseDuration }</td>
    <td>${course.courseEligiblity }</td>
    <td>${course.courseStrength }</td>
    <td>
     <spring:url value="/course/update/${customer.id }" var="updateURL" />
     <a href="${updateURL }">Update</a>
    </td>
    <td>
     <spring:url value="/course/delete/${customer.id }" var="deleteURL" />
     <a href="${deleteURL }">Delete</a>
    </td>
   </tr>
  </c:forEach>
 </table>

</body>
</html>