package be.vdab.mvc.course;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Evelyne on 24/06/15.
 */
public class FilmRepository {

    public List<Film> findFilm()  {
        List<Film> films = new ArrayList<>();
        films.add(new Film("Inception", 2011));
        films.add(new Film("The Fall", 2008));
        films.add(new Film("The Dark Knight", 2010));
        films.add(new Film("Pulp Fiction", 2003));
        films.add(new Film("Django Unchained", 2013));
        return films;

    }

}
