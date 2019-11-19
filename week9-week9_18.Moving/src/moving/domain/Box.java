/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Milos
 */
public class Box implements Thing {
    private int maximumCapacity;
    private List<Thing> boxList;
    public Box(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
        boxList = new ArrayList<Thing>();
    }
    public boolean addThing(Thing thing) {
        int total = getVolume();
        total+= thing.getVolume();
        if(total <= maximumCapacity){
            boxList.add(thing);
            return true;
        } else return false;
    }

    @Override
    public int getVolume() {
        int total = 0;
        for(Thing t: boxList){
            total += t.getVolume();
        }
        return total;
    }
    public String toString(){
        return "things in the box:  " + getVolume() + " dm^3";
    }
}
