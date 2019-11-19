/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

/**
 *
 * @author Milos
 */
public class Student extends Person{
    private int credits;
    public Student(String name, String address) {
        super(name, address);
        credits = 0;
    }
    public int credits(){
        return credits;
    }
    public void study(){
        credits++;
    }
    @Override
    public String toString(){
        return super.toString() + "\n" + "  " + "credits " + credits;
    }
    
}
