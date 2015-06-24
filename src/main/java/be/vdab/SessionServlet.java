package be.vdab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Evelyne on 24/06/15.
 */
@WebServlet(urlPatterns= "/testsession")
public class SessionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();

        //geef mij het attribuut count van de session, indien het niet bestaat, zet het op 1
        Integer count = (Integer) session.getAttribute("count");
        if(count != 0)  {
            session.setAttribute("count", count+1);
            resp.getWriter().print("Sample: "+ count);
        } else  {
            session.setAttribute("count", 1);
        }




//        String name = req.getParameter("name");
//
//        HttpSession session = req.getSession();
//        List<String> names = (List<String>) session.getAttribute("name");
//        if(names==null) {
//            names = new ArrayList<>();
//        }
//        names.add(name);
//        session.setAttribute("names", )

    }
}
