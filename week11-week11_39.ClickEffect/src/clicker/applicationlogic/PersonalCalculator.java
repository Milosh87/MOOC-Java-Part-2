/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker.applicationlogic;

/**
 *
 * @author Milos
 */
public class PersonalCalculator implements Calculator{
    private int clicks = 0;
    @Override
    public int giveValue() {
        return clicks;
    }

    @Override
    public void increase() {
        clicks++;
    }
    
}
