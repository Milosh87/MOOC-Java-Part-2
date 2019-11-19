/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Milos
 */
public class Dungeon {
        public final char[] MOVES = new char[]{'w','s','a','d'};
    private int length;
    private int height;
    private int vampires;
    private int moves;
    private boolean vampiresMove;
    private List<Vampire> vampiri;
    private char[][] mapa;
    private Player player;
    private int playerMoved;
    private Scanner sc = new Scanner(System.in);
    public Dungeon(int length, int height, int vampires, int moves, boolean vampiresMove){
        this.player = new Player(sc);
        this.height = height;
        this.length = length;
        this.vampires = vampires;
        this.moves = moves;
        this.vampiresMove = vampiresMove;
        vampiri = new ArrayList<Vampire>();
        mapa = new char[length][height];
    }
    
    
    public void run(){
        createMap();
        populateMap();
        while(true){
        printMap();
        playerMove();
        if(vampires ==0){
            System.out.println("YOU WIN");
            break;
        }
        if(moves == 0){
            System.out.print("YOU LOSE");
            break;
        }
        if(vampiresMove){
            moveVampires();
        }
                updateGameStateAfterPlayerMoved();
        printMap();
        if(vampires ==0){
            System.out.println("YOU WIN");
            break;
        }
        if(moves == 0){
            System.out.print("YOU LOSE");
            break;
        }
        }
    }
    
    private void createMap(){
        for(int i=0; i<length; i++){
            for(int j=0; j<height; j++){
                mapa[i][j] = '.';
            }
        }
}
    private void populateMap(){
        int randomX;
        int randomY;
        boolean made;
           mapa[0][0] = player.getSymbol();
           for(int i=0; i<vampires; i++){
               made = false;
             do{
                 randomX = randomNumberVampirePosition();
                 randomY = randomNumberVampirePosition();
                 if(mapa[randomX][randomY] != '@' && mapa[randomX][randomY] !='v'){
                     vampiri.add(new Vampire(randomX, randomY));
                     mapa[randomX][randomY] = 'v';
                     made = true;
                 }
             } while(!made);
           
        }
    }
    private int randomNumberVampirePosition(){
        Random r = new Random();
        return r.nextInt((length - 1));   
    }
    
    private void printMap(){
        playerMoved =0;
        System.out.println(moves);
        System.out.println();
        System.out.println(player);
        for(Vampire v: vampiri){
            System.out.println(v);
        }
        System.out.println();
        for(int i=0; i<mapa.length; i++){
            for(int j=0; j<mapa[i].length; j++){
                System.out.print(mapa[i][j]);
            }
            System.out.println();
        }
    }
    private void playerMove(){
        mapa[player.getX()][player.getY()] = '.';
        String move = sc.nextLine();
        char [] moves = move.toCharArray();
        for(int i=0; i<move.length(); i++){
        playerMoved += player.move(length, length, moves[i]);
        checkIfVampireOnPlayerPosition();
        }
    }
    
    private void updateGameStateAfterPlayerMoved(){
        moves--;
        int x = player.getX();
        int y = player.getY();
        int index=0;
        if(mapa[x][y] == 'v'){
            for(Vampire v: vampiri){
                if(v.getX() == x && v.getY() == y){
                    break; 
                }
                                index++;
            }
            vampiri.remove(index);
            vampires--;
        }
        mapa[x][y] ='@';
    }
    private void moveVampires(){
        List<Vampire> removed = new ArrayList<Vampire>();
        for(Vampire v: vampiri){
                    boolean destroyed = false;
            if(mapa[v.getX()][v.getY()] != '@' && playerMoved != 0){
            mapa[v.getX()][v.getY()] = '.';
            }
            Random r = new Random();  
            for(int i=0; i<playerMoved; i++){
                while(true){
                    char potez = MOVES[r.nextInt(4)];
                    boolean possible = v.movePossible(height, length, potez);
                    if(possible){
                    int noveCoords [] = v.potentialMove(height, length, potez);
                    if(mapa[noveCoords[0]][noveCoords[1]] == '@'){
                        v.move(height, length, potez);
                        removed.add(v);
                        destroyed = true;
                        break;
                    }
                    else if(mapa[noveCoords[0]][noveCoords[1]]  != 'v'){
                        mapa[v.getX()][v.getY()] = '.';
                        v.move(height, length, potez);
                        mapa[v.getX()][v.getY()] = 'v';
                        break;
                    }
                    }
              
        }

                if(destroyed){
                    break;
                }
        }
       
    }
         for(Vampire v: removed){
            if(mapa[v.getX()][v.getY()] != '@'){
                mapa[v.getX()][v.getY()] = '.';
            }
        }
        vampires -= removed.size();
        vampiri.removeAll(removed);
    }
    private void checkIfVampireOnPlayerPosition(){
        int x = player.getX();
        int y = player.getY();
        int index=0;
        if(mapa[x][y] == 'v'){
            for(Vampire v: vampiri){
                if(v.getX() == x && v.getY() == y){
                    break; 
                }
                                index++;
            }
            vampiri.remove(index);
            vampires--;
            mapa[x][y] = '.';
    }
}
}
