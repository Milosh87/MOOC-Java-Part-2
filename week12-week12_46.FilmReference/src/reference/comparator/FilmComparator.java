/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference.comparator;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import reference.domain.Film;
import reference.domain.Rating;

/**
 *
 * @author Milos
 */
public class FilmComparator implements Comparator<Film>{
    
    private Map<Film, List<Rating>> ratings;
    
    public FilmComparator(Map<Film, List<Rating>> ratings){
        this.ratings = ratings;
    }
    @Override
    public int compare(Film o1, Film o2) {
        double o1Average=0;
        double o2Average=0;
        for(Rating r: ratings.get(o1)){
            o1Average+=r.getValue();
        }
        for(Rating r: ratings.get(o2)){
            o2Average+=r.getValue();
        }
        o1Average = o1Average/ratings.get(o1).size();
        o2Average = o2Average/ratings.get(o2).size();
        if(o1Average > o2Average){
            return -1;
        }
        else if(o1Average < o2Average){
            return 1;
        }
        else return 0;
    }
    
}
