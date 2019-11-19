/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;

/**
 *
 * @author Milos
 */
public class OneThingBox extends Box {
    private Thing stvar;
    public OneThingBox(){
        
    }

    @Override
    public void add(Thing thing) {
        if(stvar == null){
            stvar = thing;
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        if(stvar == null){
            return false;
        }
        return stvar.equals(thing);
    }
}
