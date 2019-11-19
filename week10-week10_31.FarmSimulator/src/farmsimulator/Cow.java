/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.Random;

/**
 *
 * @author Milos
 */
public class Cow implements Milkable, Alive {
    private Random r = new Random();
    private static final String[] NAMES = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};
    private double capacity;
    private String name;
    private double amount;
    public Cow(){
        capacity = 15 + new Random().nextInt(26);
        name = NAMES[r.nextInt(NAMES.length)];
    }
    public Cow(String name){
        capacity = 15 + new Random().nextInt(26);
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    public double getCapacity(){
        return capacity;
    }
    public double getAmount(){
        return amount;
    }
    
    @Override
    public double milk() {
        double milked = amount;
        amount = 0;
        return milked;
    }

    @Override
    public void liveHour() {
        double milkThisHour = 0.7 + (2.0 - 0.7)*r.nextDouble();
        if(milkThisHour > capacity - amount){
            amount = capacity;
            return;
        }
        amount = amount + milkThisHour;
    }
    public String toString(){
        return name + " " + Math.ceil(amount) + "/" + Math.ceil(capacity);
    }
    
}
