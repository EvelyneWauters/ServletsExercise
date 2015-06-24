<%--
  Created by IntelliJ IDEA.
  User: jeansmits
  Date: 24/06/15
  Time: 13:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Multiplication Table</title>
    <style>table{border: groove;
                   background-color: darkgrey }
            td{border: 1px solid darkgrey;

            }</style>
</head>
<body>

<table>
<%
    int maxlength = 10;
    if(request.getParameter("max")!=null)  {
        maxlength = Integer.parseInt(request.getParameter("max"));
    }

    for (int i = 1; i <= maxlength; i++) {
        out.print("<tr>");
        for (int j = 1; j <= maxlength; j++) {
            out.print("<td style = 'background-color: rgb(" + 255*i*j/(maxlength*maxlength) +","
                    +255*i*j/(maxlength*maxlength)+","+255*i*j/(maxlength*maxlength)
                    +"); color: rgb(" + (255-255*i*j/(maxlength*maxlength))  + ","
                    +(255-255*i*j/(maxlength*maxlength))+ "," +(255-255*i*j/(maxlength*maxlength))+ ")'>" + i*j + "</td>");
        }
        out.println();
    }
%>
    </table>
</body>
</html>
