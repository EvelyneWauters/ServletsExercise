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

@WebServlet(urlPatterns = "/form.html")
public class RegistrationForm extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        startDocument(out);

        out.println("<body>");
        out.println("Registration form: <br/>");
        out.println("<form action='form.html' method='post'> First name: <input type='text' name='firstName'/> <br/>");
        out.println("Last name: <input type='text' name='lastName'/> <br/> Age: <input type='number' name='age'/> ");
        out.println("<input type='submit' value='Registreer nu!'/></form>");
        out.println("</body>");
        out.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        startDocument(out);

        out.println("<body>");
        out.println("<h1>You're in! </h1> <br/>");
        out.println("Hello ");
        out.println("<em>" + req.getParameter("firstName") + " " + req.getParameter("lastName") + "</em>");
        out.println(" and thanks for registering. Have a nice stay!");
        ageComment(out, req);
        out.println("</body>");
        out.println("</html>");
    }

    public static void startDocument(PrintWriter out)  {
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>You're in!</title>");
        out.println("<style> em{color:rgb(255,0,255);}  div{color: #669900}</style>");
        out.println("</head>");
    }

    public static void ageComment(PrintWriter out, HttpServletRequest req)  {
        int i = Integer.parseInt(req.getParameter("age"));
        if (i<21)   {
            out.println("And no alcohol for you!");
        } else  {
            out.println("<br/><br/> <div>\"Fifteen men on a dead man's chest, yo-ho-ho and a bottle of rum... " +
                    "Drink and the devil had done for the rest, yo-ho-ho and a bottle of rum!\"</div>");
        }
    }
}
