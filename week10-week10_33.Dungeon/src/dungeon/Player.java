/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

import java.util.Scanner;

/**
 *
 * @author Milos
 */
public class Player {
    private int x;
    private int y;
    private char symbol;
    private Scanner sc;
    public Player(Scanner sc){
        this.x = 0;
        this.y = 0;
        this.symbol = '@';
        this.sc = sc;
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

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    
    public int move(int length, int width, char c) {
        int moved=1;
       if(c == 'w' && x!=0){
            x--;
        }
        else if (c == 's' && x < length-1){
            x++;
        }
        else if (c == 'a' && y!=0){
            y--;
        }
        else if(c == 'd' &&  y < width-1){
            y++;
        }
        
        return moved;
    }
    public String toString(){
        return symbol + " " + y + " " + x;
    }
}
