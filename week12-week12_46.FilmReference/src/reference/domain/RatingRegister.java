/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Milos
 */
public class RatingRegister {
    private Map<Film, List<Rating>> ratings;
    private Map<Person , Map<Film, List<Rating>>> personalRatings;
    public RatingRegister(){
        ratings = new HashMap<Film, List<Rating>>();
        personalRatings = new HashMap<Person, Map<Film, List<Rating>>>();
    }
    public void addRating(Film film, Rating rating){
        List filmRatings = ratings.get(film);
        if(filmRatings == null){
            filmRatings = new ArrayList<Rating>();
        }
        filmRatings.add(rating);
        ratings.put(film, filmRatings);
    }
    public List<Rating> getRatings(Film film){
        return ratings.get(film);
    }
    public Map<Film, List<Rating>> filmRatings(){
        return ratings;
    }
    public void addRating(Person person, Film film, Rating rating){
        
    }
}
