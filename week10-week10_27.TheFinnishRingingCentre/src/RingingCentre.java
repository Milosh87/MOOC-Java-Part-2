
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Milos
 */
public class RingingCentre {
    private Map<Bird, List<String>> locations;
    public RingingCentre(){
        locations = new HashMap<Bird, List<String>>();
    }
    public void observe(Bird bird, String place){
         List<String> lista = locations.get(bird);
         if(lista == null){
             lista = new ArrayList<String>();
         }
         lista.add(place);
         locations.put(bird, lista);
       
    }
    public void observations(Bird b){
        int size;
            if(locations.get(b) == null){
                size = 0;
            } else size=locations.get(b).size();
            System.out.println(b + " observations: " + size);
            if(locations.get(b) == null){
                return;
            }
            for(String location: locations.get(b)){
                System.out.println(location);
            }
        }
    }

