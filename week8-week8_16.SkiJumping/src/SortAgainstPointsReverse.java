
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Milos
 */
public class SortAgainstPointsReverse implements Comparator<Jumper>{

    @Override
    public int compare(Jumper o1, Jumper o2) {
       if(o1.getPoints() > o2.getPoints()){
           return 1;
       }
       else if (o1.getPoints() < o2.getPoints()){
           return -1;
       }
       else return 0;
    }
    
}
