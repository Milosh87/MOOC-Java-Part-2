
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Milos
 */
public class Hand implements Comparable<Hand> {
    private List<Card> ruka = new ArrayList<Card>();
    public void add(Card k){
        ruka.add(k);
    }
    public void print(){
        for(Card c: ruka){
            System.out.println(c);
        }
    }
    public void sort(){
      Collections.sort(ruka);
    }
    public List<Card> getRuka(){
        return ruka;
    }

    @Override
    public int compareTo(Hand o) {
        int hand1=0;
        int hand2=0;
        for(Card c: ruka){
            hand1 += c.getValue();
        }
        for(Card c: o.getRuka()){
            hand2 += c.getValue();
        }
        return hand1 - hand2;
    }
public void sortAgainstSuit() {
    Collections.sort(ruka, new SortAgainstSuitAndValue());
}


}
