<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isELIgnored="false"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  <c:choose>
      <c:when test="${!empty jobList}">
         <table border="1" text-align="center">
             <tr><th>EMPNO</th><th>ENAME</th><th>JOB</th><th>SAL</th></tr>
             <c:forEach var="map" items="${jobList}">
                <tr>
                   <td>${map.EMPNO} </td>
                   <td>${map.ENAME} </td>
                   <td>${map.JOB} </td>
                   <td>${map.SAL} </td>
                </tr>
             </c:forEach>
         </table>
      </c:when>
      <c:otherwise>
           <b><i>Employee Not found </i></b>
      </c:otherwise>
  </c:choose>
  
  
 
 
