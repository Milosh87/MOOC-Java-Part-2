/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import gameoflife.GameOfLifeBoard; 
import java.util.Random;
/**
 *
 * @author Milos
 */
public class PersonalBoard extends GameOfLifeBoard {
    public PersonalBoard(int width, int height) {
        super(width, height);
    }

    @Override
    public void initiateRandomCells(double d) {
        Random r = new Random();
        
        for(int i=0; i<getBoard().length; i++){
            for(int j=0; j<getBoard()[i].length; j++){
                int chance = r.nextInt(100);
                 if(chance < d*100){
                    getBoard()[i][j] = true;
                 } else  getBoard()[i][j] = false;
            }
        }
       

    }

    @Override
    public boolean isAlive(int i, int i1) {
        if(i >= getHeight() || i1 >= getWidth() || i< 0 || i1 < 0){
            return false;
        }
        else return getBoard()[i][i1];
    }

    @Override
    public void turnToLiving(int i, int i1) {
        if(i > getHeight() || i1 > getWidth() || i< 0 || i1 < 0){
            return;
        }
        getBoard()[i][i1] = true;
    }

    @Override
    public void turnToDead(int i, int i1) {
          if(i >= getHeight() || i1 >= getWidth() || i< 0 || i1 < 0){
            return;
        }
          getBoard()[i][i1] = false;
    }

    @Override
    public int getNumberOfLivingNeighbours(int i, int i1) {
        int living = 0;
        int rowStart  = Math.max( i - 1, 0   );
int rowFinish = Math.min( i + 1, getBoard().length - 1 );
int colStart  = Math.max( i1 - 1, 0   );
int colFinish = Math.min( i1 + 1, getBoard()[i].length - 1 );


// See how many are alive
for (int curRow =rowStart; curRow <=rowFinish; curRow++) {
    for (int curCol=colStart; curCol<=colFinish; curCol++) {
        // All the neighbors will be grid[rowNum][colNum]
        if(getBoard()[curRow][curCol] == true){
            if(curRow == i && curCol == i1){
                continue;
            }
            living++;
        }
    }
}
return living;
    }

    @Override
    public void manageCell(int i, int i1, int i2) {
        if(i2 < 2){
            if(getBoard()[i][i1]){
                getBoard()[i][i1] = false;
            }
            return;
        }
        if(i2 == 2 || i2 == 3){
            if(getBoard()[i][i1]){
            return;
            }
        }
        if(i2 > 3){
            if(getBoard()[i][i1]){
            getBoard()[i][i1] = false;
            }
            return;
        }
        if(i2 == 3){
            if(!getBoard()[i][i1]){
                getBoard()[i][i1] = true;
            }
        }
        
        
    }
    
}
