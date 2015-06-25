<%@attribute name="max" type="java.lang.Integer"%>



<%

    for (int i = 1; i <= max; i++) {
        out.print("<tr>");
        for (int j = 1; j <= max; j++) {
            out.print("<td style = 'background-color: rgb(" + 255*i*j/(max*max) +","
                    +255*i*j/(max*max)+","+255*i*j/(max*max)
                    +"); color: rgb(" + (255-255*i*j/(max*max))  + ","
                    +(255-255*i*j/(max*max))+ "," +(255-255*i*j/(max*max))+ ")'>"
                    + i*j
                    + "</td>");
        }
        out.println();
    }
%>