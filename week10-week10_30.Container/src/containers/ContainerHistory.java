/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Milos
 */
public class ContainerHistory {
   private  List<Double> history;
    public ContainerHistory(){
        history = new ArrayList<Double>();
    }
    public void add(double situation){
        history.add(situation);
    }
    public void reset(){
        history.clear();
    }
    public double maxValue() {
        double max = 0;
        if(history.isEmpty()){
            return max;
        } 
        for(Double broj: history){
            if(broj > max){
                max = broj;
            }
        }
        return max;
    }
     public double minValue() {
        double min = Double.MAX_VALUE;
        if(history.isEmpty()){
            return 0;
        } 
        for(Double broj: history){
            if(broj < min){
                min = broj;
            }
        }
        return min;
    }
     public double average() {
        double average = 0;
        int listSize = history.size();
        if(history.isEmpty()){
            return average;
        } 
        for(Double broj: history){
            average+= broj;
        }
        return average/listSize;
    }
     public double greatestFluctuation(){
         if(history.size() <=1){
             return 0;
         }
         double max = 0;
         for(int i=0; i<history.size()-1; i++){
             if(Math.abs(history.get(i)-history.get(i+1)) > max){
                 max = Math.abs(history.get(i)-history.get(i+1));
             }
         }
         return max;
     }
     public double variance() {
         if(history.size() <= 1){
             return 0;
         }
         double variance = 0;
         for(Double broj: history){
             variance += Math.pow((broj-average()), 2);
         }
        return variance/(history.size()-1);
     }
    @Override
    public String toString(){
        return history.toString();
    }
}
