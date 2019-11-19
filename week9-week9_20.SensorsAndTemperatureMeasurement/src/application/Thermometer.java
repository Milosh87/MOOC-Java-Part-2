/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Milos
 */
public class Thermometer implements Sensor {
   private boolean isOn;
    
    @Override
    public boolean isOn() {
        return isOn;
    }

    @Override
    public void on() {
        if(!isOn){
        isOn = true;
        }
    }

    @Override
    public void off() {
        if(isOn()){
            isOn =false;
        }
    }

    @Override
    public int measure() {
       if(isOn()){
           ArrayList<Integer> randomNum = new ArrayList<Integer>();
           for(int i=-30; i<31; i++){
               randomNum.add(i);
           }
           Random r = new Random();
           int result = r.nextInt(59 +1);
           return randomNum.get(result);
       } 
       else throw new IllegalStateException("Theromemter is off");
    }
    
}
