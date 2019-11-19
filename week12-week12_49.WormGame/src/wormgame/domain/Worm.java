/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wormgame.domain;


import java.util.ArrayList;
import java.util.List;
import wormgame.Direction;

/**
 *
 * @author Milos
 */
public class Worm {
    private int x;
    private int y;
    private Direction direction;
    private int length;
    private List<Piece> pieces;
    private boolean mature;
    private boolean grow = false;
   public Worm(int x, int y, Direction direction){
        this.direction = direction;
        length = 1;
        mature = false;
        pieces = new ArrayList<Piece>();
        pieces.add(new Piece(x, y));
    }

    public Direction getDirection() {
        return direction;
    }
    

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
    public int getLength(){
        return length;
    }
    public List<Piece> getPieces(){
        return pieces;
    }
    public void move(){
             Piece glava = pieces.get(pieces.size()-1);      
        if(direction == Direction.UP){
            pieces.add(new Piece(glava.getX(), glava.getY()-1));
        }
        if(direction == Direction.DOWN){
            pieces.add(new Piece(glava.getX(), glava.getY()+1));
        }
        if(direction == Direction.RIGHT){
            pieces.add(new Piece(glava.getX()+1, glava.getY()));
        }
        if(direction == Direction.LEFT){
            pieces.add(new Piece(glava.getX()-1, glava.getY()));
        }
        length++;
        if(grow == false){     
            if(length>3){
        pieces.remove(0);
        length--;
            }
        }
    grow = false;
            
    }
    public void grow(){
        grow = true;
    }

    public Worm getWorm(){
        return this;
    }
    public boolean runsInto(Piece piece){
        for(Piece p: pieces){
            if(p.runsInto(piece)){
                return true;
            }
        }
        return false;
    }
     public boolean runsIntoItself(){
         for(int i=0; i<pieces.size()-2; i++){
             if(pieces.get(i).runsInto(pieces.get(length-1))){
                 return true;
             }
         }
         return false;
     }
     public int getX(){
         return x;
     }
     public int getY(){
         return y;
     }
}
