package be.vdab.mvc.course;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Evelyne on 24/06/15.
 */

@WebServlet(urlPatterns = "/film.html")
public class FilmServlet extends HttpServlet{
    private FilmRepository repository = new FilmRepository();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Film> films = repository.findFilm();

        //Model
        req.setAttribute("filmlijst", films);

        req.getRequestDispatcher("/film.jsp").forward(req,resp);



    }
}
