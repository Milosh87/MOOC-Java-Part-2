/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference;

import reference.domain.*;
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
    private Map<Person , Map<Film, Rating>> personalRatings;
    public RatingRegister(){
        ratings = new HashMap<Film, List<Rating>>();
        personalRatings = new HashMap<Person, Map<Film, Rating>>();
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
        Map<Film,Rating> mapa = personalRatings.get(person);
        if(mapa == null){
            mapa = new HashMap<Film, Rating>();
    }
        if(!mapa.containsKey(film)){
            mapa.put(film, rating);
            List<Rating> filmRating =  ratings.get(film);
            if(filmRating == null){
                filmRating = new ArrayList<Rating>();
            } 
           filmRating.add(rating);
           ratings.put(film, filmRating);
        }
        personalRatings.put(person, mapa);
}
    public Rating getRating(Person person, Film film){
        if(personalRatings.get(person) == null) {
            return Rating.NOT_WATCHED;
        }
        if(personalRatings.get(person).get(film) == null){
             return Rating.NOT_WATCHED;
        }
        return personalRatings.get(person).get(film);
    }
    public Map<Film, Rating> getPersonalRatings(Person person){
        if(personalRatings.get(person) == null){
            return new HashMap<Film, Rating>();
        }
        return personalRatings.get(person);
    }
    public List<Person> reviewers(){
        List<Person> reviewers = new ArrayList<Person>();
        for(Person p: personalRatings.keySet()){
            reviewers.add(p);
        }
        return reviewers;
    }
}
