/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reader.criteria;

import java.util.List;

/**
 *
 * @author Milos
 */
public class AtLeastOne implements Criterion {
    private Criterion[] lista;
    public AtLeastOne(Criterion... c){
        this.lista = c;
    }
    @Override
    public boolean complies(String line) {
        for(Criterion c: lista){
            if(c.complies(line)){
                return true;
            }
        }
        return false;
    }
    
}
