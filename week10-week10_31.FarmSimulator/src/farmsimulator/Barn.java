/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.Collection;

/**
 *
 * @author Milos
 */
public class Barn {
    private BulkTank tank;
    private MilkingRobot robot;
    public Barn(BulkTank tank){
        this.tank = tank;
    }
    public BulkTank getBulkTank() {
        return tank;
    }
    public void installMilkingRobot(MilkingRobot milkingRobot) {
        robot = milkingRobot;
        robot.setBulkTank(tank);
    }
    public void takeCareOf(Cow cow) {
        if(robot == null){
            throw new IllegalStateException(); 
        }
        robot.milk(cow);
    }
    public void takeCareOf(Collection<Cow> cows){
        if(robot == null){
            throw new IllegalStateException(); 
        }
        for(Cow c: cows){
            robot.milk(c);
        }
    }
    public String toString() {
        return tank.toString();
    }
}
