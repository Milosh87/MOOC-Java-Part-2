/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author Milos
 */
public class ConstantSensor implements Sensor{
    private int measure;
    public ConstantSensor(int measure){
        this.measure = measure;
    }
    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void on() {
        return;
    }

    @Override
    public void off() {
       return ;
    }

    @Override
    public int measure() {
        return measure;
    }
    
}
