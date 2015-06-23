package be.vdab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Evelyne on 23/06/15.
 */
@WebServlet(urlPatterns = "/multiply.html")
public class MultiplicationTableServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Multiplication table</title>");
        out.println("<style> #multiplication-table{background-color: rgb(200,200,200);" +
                "                                   padding: 1rem 1rem 1rem 1rem;} </style>");
        out.println("</head>");
        out.println("<body>");
        out.println("Multiplication Table: <br/>");
        getTable(out);
        out.println("</body>");
        out.println("</html>");

        }


    public static void getTable(PrintWriter out) {
        out.println("<table id='multiplication-table'>");
        for (int i = 1; i <= 10; i++) {
            out.println("<tr>");
            for (int j = 1; j <= 10; j++) {
                out.println("<td>" + i * j + "</td>");
            }
            out.println("</tr>");
        }
        out.println("</table>");
    }
    }

