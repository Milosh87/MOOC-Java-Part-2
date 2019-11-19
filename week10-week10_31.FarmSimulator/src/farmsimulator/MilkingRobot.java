/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

/**
 *
 * @author Milos
 */
public class MilkingRobot {
    private BulkTank tank;
    public MilkingRobot() {
        
    }
public void setBulkTank(BulkTank tank) {
    this.tank = tank;
}
public BulkTank getBulkTank(){
    return tank;
}
public void milk(Milkable milkable) {
    if(tank ==null){
         throw  new IllegalStateException();
    }
    tank.addToTank(milkable.milk());
}

}
