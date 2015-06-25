<%@ page import="be.vdab.mvc.course.Film" %>
<%@ page import="java.util.List" %>
<%--
  Created by IntelliJ IDEA.
  User: jeansmits
  Date: 24/06/15
  Time: 15:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>"
<html>
<head>
    <title>Film3</title>
    <style>table{background-color: lightslategrey;
              color:azure;
              }
            td.name{width:160px;}
            td.title{width:1rem;}
            h1{font-family: "Helvetica Neue", Helvetica, Arial, sans-serif}
    </style>
</head>
<body>
<h1>FilmLijst</h1>

  <table><tr>
    <th>Title</th>
    <th>Year</th></tr>
    <%
      List<Film> filmList = (List<Film>) request.getAttribute("filmlijst");
      for (Film film : filmList) {
        out.println("<tr><td class='name'>" + film.getTitle() + "</td><td class='title'>" + film.getYear()+ "</td></tr>");
      }
    %>
  </table>


    <h1>Via JSTL</h1>
    <table>
        <tr>
            <th>title</th>
            <th>year</th>
        </tr>

        <c:forEach var="film" items="${filmlijst}">
            <tr>
                <td>${film.title}</td>
                <td>${film.year}</td>
            </tr>
        </c:forEach>
    </table>


</body>
</html>
