/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Milos
 */
public class Farm implements Alive {
    private Barn barn;
    private String owner;
    private Collection<Cow> herd;
    
    public Farm(String owner, Barn barn){
        this.barn = barn;
        this.owner = owner;
        herd = new ArrayList<Cow>();
    }
    
    public void addCow(Cow cow){
        herd.add(cow);
    }
    public void manageCows(){
        barn.takeCareOf(herd);
    }
    
    @Override
    public void liveHour() {
        for(Cow c: herd){
            c.liveHour();
        }
    }
    public String getOwner(){
        return owner;
    }
    public void installMilkingRobot(MilkingRobot milkingRobot){
        barn.installMilkingRobot(milkingRobot);
    }
}
