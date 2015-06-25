<%--
  Created by IntelliJ IDEA.
  User: jeansmits
  Date: 25/06/15
  Time: 10:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="mtable" tagdir="/WEB-INF/tags" %>

<html>
<head>
    <title>Multiplication Table Pt2</title>
    <style>td:hover{color:red;}
            table:hover{}
    </style>
</head>
<body>
    <h1>Multiplication table with parameters</h1>
    <h3>n=10</h3>
    <table>
        <mtable:multitable max="10"/>
    </table>

    <h3>n=20</h3>
    <table>
        <mtable:multitable max="20"/>
    </table>



</body>
</html>
