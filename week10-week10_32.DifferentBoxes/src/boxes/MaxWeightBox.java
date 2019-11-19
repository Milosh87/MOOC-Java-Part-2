/*+
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Milos
 */
public class MaxWeightBox extends Box {
    private int maxWeight;
    private Collection<Thing> stvari;
    public MaxWeightBox(int maxWeight){
        super();
        this.maxWeight = maxWeight;
        stvari = new ArrayList<Thing>(); 
    }
    @Override
    public void add(Thing thing) {
        int totalWeight = 0;
        for(Thing t: stvari){
            totalWeight += t.getWeight();
        }
        if(totalWeight + thing.getWeight() <= maxWeight){
            stvari.add(thing);
            totalWeight += thing.getWeight();
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return stvari.contains(thing);
    }
    
}
