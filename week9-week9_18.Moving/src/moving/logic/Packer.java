            /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.logic;

import java.util.ArrayList;
import java.util.List;
import moving.domain.Box;
import moving.domain.Thing;

/**
 *
 * @author Milos
 */
public class Packer {
    private int boxesVolume;
    public Packer(int boxesVolume){
        this.boxesVolume = boxesVolume;
    }
    public List<Box> packThings(List<Thing> things) {
        List<Box> listBoxes = new ArrayList<Box>();
        Box firstBox = new Box(boxesVolume);
        boolean lastBox = false;
        int i =0;
        boolean last = false;
        for(Thing t: things){
            if(!firstBox.addThing(t)){
                listBoxes.add(firstBox);
                firstBox = new Box(boxesVolume);
                firstBox.addThing(t);
            }
            else {
                if(i == things.size()-1){
                    listBoxes.add(firstBox);
                }
            }
            i++;
        }
        return listBoxes;
        
        
    }
}
