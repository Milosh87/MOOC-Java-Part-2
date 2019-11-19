
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
public class Box implements ToBeStored{
    private double maxWeight;
    private ArrayList<ToBeStored> stored;
    
    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        stored = new ArrayList<ToBeStored>();
    }
    
 public String toString(){
        return  "Box: " + stored.size() + " things, total weight " +  totalWeight() + " kg";
 }
 
 public double totalWeight(){
     double weight = 0;
     for(ToBeStored tb: stored){
         weight += tb.weight();
     }
     return weight;
 }
 public void add(ToBeStored tb){
     if((totalWeight() + tb.weight()) > maxWeight) {
     }
     else {
         stored.add(tb);
                 }
 }

    @Override
    public double weight() {
         double weight = 0;
     for(ToBeStored tb: stored){
         weight += tb.weight();
     }
     return weight;
    }
    
}
