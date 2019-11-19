
import java.util.ArrayList;
import java.util.HashMap;

    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Milos
 */
public class Dictionary {
    private HashMap <String, String> prevodi = new HashMap <String, String>();
    
    public String translate(String word) {
        if (prevodi.get(word) == null){
            return null;
        }
        else  return prevodi.get(word);
    }
    public void add(String word, String translation){
        prevodi.put(word, translation);
    }
    public int amountOfWords() {
        int broj=0;
        for (String p: prevodi.keySet()) {
            broj++;
        }
        return broj;
    }
    public ArrayList<String> translationList() {
        ArrayList<String> trans = new ArrayList<String>();
        for (String i : prevodi.keySet()) {
            trans.add(i + " = " + prevodi.get(i));
        }
        return trans;
    }
    
}
