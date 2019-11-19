/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Milos
 */
public class AverageSensor implements Sensor {
  private  List<Integer> readings = new ArrayList<Integer>();
    private List<Sensor> sensorList = new ArrayList<Sensor>();
    @Override
    public boolean isOn() {
        for(Sensor s: sensorList){
            if(!s.isOn()){
                return false;
            }
        }
        return true;
    }

    @Override
    public void on() {
        for(Sensor s: sensorList){
            s.on();
        }
    }

    @Override
    public void off() {
        for(Sensor s: sensorList){
            if(s.isOn()){
                s.off();
                return;
            }
        }
    }

    @Override
    public int measure() {
        if(isOn()){
            int total = 0;
            for(Sensor s: sensorList){
                total+=s.measure();
            }
            int result = total/sensorList.size();
            readings.add(result);
            return result;
        }
        else throw new IllegalStateException("Sensor is off");
    }
    public void addSensor(Sensor additional){
        sensorList.add(additional);
        isOn();
        
    }
    public List<Integer> readings()  {
       return readings;
    }
}
