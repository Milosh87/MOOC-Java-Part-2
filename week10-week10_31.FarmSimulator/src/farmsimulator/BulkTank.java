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
public class BulkTank {
    private double capacity;
    private double volume;
    public BulkTank(){
        capacity = 2000;
        volume = 0;
    }
    public BulkTank(double capacity){
        this.capacity = capacity;
        volume = 0;
    }
    public double getCapacity(){
        return capacity;
    }
    public double getVolume(){
        return volume;
    }
    public void addToTank(double amount){
        if(amount > capacity - volume){
            volume = capacity;
            return;
        }
        volume = volume + amount;
    }
    public double getFromTank(double amount){
        double result;
        if(amount >= volume){
            result = volume;
            volume = 0;
            return result;
        }
        volume -= amount;
        return amount;
    }
    public double howMuchFreeSpace(){
        return capacity - volume;
    }
    public String toString(){
        return Math.ceil(volume) + "/" + Math.ceil(capacity);
    }
    
}
