/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movable;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Milos
 */
public class Group implements Movable{
   private List<Movable> lista;
    public Group(){
        lista = new ArrayList<Movable>();
    }

    @Override
    public void move(int dx, int dy) {
        for(Movable m: lista){
            m.move(dx, dy);
        }
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(Movable mov: lista){
            sb.append(mov).append("\n");
        }
        return sb.toString();
    }
    public void addToGroup(Movable movable){
        lista.add(movable);
    }
}
