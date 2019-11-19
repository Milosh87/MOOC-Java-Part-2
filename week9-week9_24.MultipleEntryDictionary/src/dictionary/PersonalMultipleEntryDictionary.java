/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Milos
 */
public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary {
    private Map<String, Set<String>> reci;
    public PersonalMultipleEntryDictionary(){
        this.reci  = new HashMap<String, Set<String>>();
    }
    
    @Override  
    public void add(String word, String entry) {
        if(!reci.containsKey(word)){
            reci.put(word, new HashSet<String>());
        }
        Set<String> words = reci.get(word);
        words.add(entry);
    }

    @Override
    public Set<String> translate(String word) {
        if(reci.containsKey(word)){
            return reci.get(word);
        } else return null;
    }

    @Override
    public void remove(String word) {
        reci.remove(word);
    }
    
}
