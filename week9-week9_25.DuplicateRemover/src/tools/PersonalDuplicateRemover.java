/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Milos
 */
public class PersonalDuplicateRemover implements DuplicateRemover{
    private Set<String> unikati;
    private Map<String, Integer> duplikati;
    public PersonalDuplicateRemover(){
        this.unikati = new HashSet<String>();
        this.duplikati = new HashMap<String, Integer>();
    }
    @Override
    public void add(String characterString) {
        unikati.add(characterString);
        if(duplikati.containsKey(characterString)){
            duplikati.put(characterString, duplikati.get(characterString)+1);
        }
        else duplikati.put(characterString, 0);
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
    int numberOfDuplicates = 0;
    for(String k: duplikati.keySet()){
        numberOfDuplicates+= duplikati.get(k);
    }
    return numberOfDuplicates;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        return unikati;
    }

    @Override
    public void empty() {
        unikati.clear();
        duplikati.clear();
    }
    
}
