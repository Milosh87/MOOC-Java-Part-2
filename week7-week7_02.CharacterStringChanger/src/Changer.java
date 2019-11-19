
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Milos
 */
public class Changer {
    private ArrayList<Change> change;
    private String promena;
    public Changer() {
       this.change = new ArrayList<Change>();
    }
    void addChange(Change change) {
        if(change == null){
            return;
        }
        this.change.add(change);
    }
    public String change(String characterString){
        String word;
        if (characterString == null) {
            return null;
        }
        for (Change c: change) {
            characterString = c.change(characterString);
        }
        return characterString;
    }
}
