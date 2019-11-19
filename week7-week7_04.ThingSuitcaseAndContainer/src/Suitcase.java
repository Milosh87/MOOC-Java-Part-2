
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
public class Suitcase {
   private ArrayList<Thing> things = new ArrayList<Thing>();
   private int maxWeight;
   public Suitcase(int maxWeight) {
       this.maxWeight = maxWeight;
   }
   public void addThing(Thing x) {
       int currentWeight = totalWeight();
       if(currentWeight+x.getWeight() <= maxWeight) {
           things.add(x);
       } else return;
   }
   public String toString() {
       int counter=0;
       int totalWeight=0;
       for(Thing t: things) {
           if(t != null){
               counter++;
               totalWeight+=t.getWeight();
           }
       }
       if(counter == 0) {
           return "empty (0 kg)"; 
       } else if(counter == 1) {
           return counter+" thing (" + totalWeight + " kg)";
       } else return counter+" things (" + totalWeight + " kg)";
       
   }
   public int totalWeight(){
       int currentWeight = 0;
        for(int i=0;i<things.size(); i++) {
           if(things.get(i) != null){
               currentWeight += things.get(i).getWeight();
           }
       }
        return currentWeight;
   }
   public void printThings(){
       for(Thing t: things) {
           if(t!= null) {
               System.out.print(t + "\n");
           }
       }
   }
   public Thing heaviestThing() {
        int max;
        Thing z=null;
        boolean ima = false;
       for(int i=0;i<things.size(); i++) {
           if(things.get(i) != null) {
               z = things.get(i) ;
               ima = true;
               break;
           }
       }
       if(ima){
       max = z.getWeight();
       } else return null;
       for(int i=0; i<things.size(); i++) {
           if(things.get(i)!= null && things.get(i).getWeight() > max) {
               z = things.get(i);
                max = things.get(i).getWeight();
           }
       }
       return z;
   }
}
