/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import reference.comparator.FilmComparator;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

/**
 *
 * @author Milos
 */
public class Reference {
    private RatingRegister ratingRegister;
    public Reference(RatingRegister  ratingRegister){
        this.ratingRegister = ratingRegister;
    }
    public Film recommendFilm(Person person){
       Map<Film, Rating> personalMovies = ratingRegister.getPersonalRatings(person);
       Map<Film, List<Rating>> allMovies = ratingRegister.filmRatings();
       List<Film> sviFilmovi = new ArrayList<Film>();
       for(Film f: allMovies.keySet()){
           sviFilmovi.add(f);
       }
       FilmComparator fc = new FilmComparator(allMovies);
       Collections.sort(sviFilmovi, fc);
       for(Film f: sviFilmovi){
           if(!personalMovies.containsKey(f)){
               return f;
           }
       }
       return null;
    }
}
