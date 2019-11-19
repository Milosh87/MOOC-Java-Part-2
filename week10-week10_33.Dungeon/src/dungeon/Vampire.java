/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Milos
 */
public class Vampire {

    private int x;
    private int y;
    private char symbol;
    public Vampire(int x, int y){
        this.x = x;
        this.y = y;
        this.symbol = 'v';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + this.x;
        hash = 17 * hash + this.y;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vampire other = (Vampire) obj;
        if (this.x != other.x) {
            return false;
        }
        if (this.y != other.y) {
            return false;
        }
        return true;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }
  
    public int move(int length, int width, char c){
       if(c == 'w' && x!=0){
            x--;
            return 1;
        }
        else if (c == 's' && x < length-1){
            x++;
            return 1;
        }
        else if (c == 'a' && y!=0){
            y--;
            return 1;
        }
        else if(c == 'd' &&  y < width-1){
            y++;
            return 1;
        }
        
        return 0;
    }
    public boolean movePossible(int length, int width, char c){
       if(c == 'w' && x!=0){
            return true;
        }
        else if (c == 's' && x < length-1){
            return true;
        }
        else if (c == 'a' && y!=0){
            return true;
        }
        else if(c == 'd' &&  y < width-1){
            return true;
        }
        
        return false;
    }
    public int[] potentialMove(int length, int width, char c){
        int [] novaPozicija = new int [2];
       if(c == 'w' && x!=0){
            novaPozicija[0] = x-1;
        }
        else if (c == 's' && x < length-1){
            novaPozicija[0] = x+1;
        }
        else if (c == 'a' && y!=0){
            novaPozicija[1] = y-1;
           
        }
        else if(c == 'd' &&  y < width-1){
            novaPozicija[1] = y+1;
        }
        
        return novaPozicija;
    }
    @Override
     public String toString(){
        return symbol + " " + y + " " + x;
    }
    }
    

