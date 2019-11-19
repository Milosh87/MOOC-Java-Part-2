/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingfigure;

import java.awt.Graphics;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Milos
 */
public class CompoundFigure extends Figure {
    private List<Figure> lista = new ArrayList<Figure>();
    public CompoundFigure(int x, int y) {
        super(x, y);
    }
    public CompoundFigure(){
        
    }
    public void add(Figure f){
        lista.add(f);
    }
    @Override
    public void draw(Graphics graphics) {
        for(Figure f: lista){
            f.draw(graphics);
        }
      
    }
    public void move(int x, int y){
        for(Figure f: lista){
            f.move(1, 0);
        }
    }
    
}
