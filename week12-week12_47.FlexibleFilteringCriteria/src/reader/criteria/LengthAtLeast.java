/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reader.criteria;

/**
 *
 * @author Milos
 */
public class LengthAtLeast implements Criterion {
    private int lineSize;
    public LengthAtLeast(int lineSize){
        this.lineSize = lineSize;
    }
    @Override
    public boolean complies(String line) {
        return line.length() >= lineSize;
    }
    
}
