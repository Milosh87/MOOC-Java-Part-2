
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
public class Container {
    private  int maxWeight;
    private ArrayList<Suitcase> kont;
    public Container(int maxWeight) {
        this.maxWeight = maxWeight;
        this.kont = new ArrayList<Suitcase>();
    }
    public void addSuitcase(Suitcase suitcase) {
        int currentWeight = 0;
        for(Suitcase s: kont) {
            if(s != null){
                currentWeight += s.totalWeight();
            }
        }
        if (suitcase.totalWeight() + currentWeight <= maxWeight){
            kont.add(suitcase);
        };
    }
    public String toString(){
        int currentWeight = 0;
        for(Suitcase s: kont) {
            if(s != null){
                currentWeight += s.totalWeight();
            }
        }
        return kont.size() + "suitcases" + "(" + currentWeight + " kg)";
    }
    public void printThings() {
        for(Suitcase s: kont) {
            s.printThings();
        }
    }
}
