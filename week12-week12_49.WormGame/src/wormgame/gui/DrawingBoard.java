/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wormgame.gui;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import wormgame.domain.Apple;
import wormgame.domain.Piece;
import wormgame.game.WormGame;

/**
 *
 * @author Milos
 */
public class DrawingBoard extends JPanel implements Updatable {
    private int pieceLength;
    private WormGame wg;
    public DrawingBoard(WormGame wg, int pieceLength){
        super.setBackground(Color.WHITE);
        this.pieceLength = pieceLength;
        this.wg = wg;
    }
    @Override
    public void paintComponent(Graphics graphics){
       super.paintComponent(graphics);
       for(Piece p: wg.getWorm().getPieces()){
           graphics.setColor(Color.black);
           graphics.fill3DRect(p.getX()*pieceLength, p.getY()*pieceLength, pieceLength, pieceLength, true);
       }
              graphics.setColor(Color.red);
       Apple apple = wg.getApple();
       graphics.fillOval(apple.getX()*pieceLength, apple.getY()*pieceLength, pieceLength, pieceLength);
       
    }

    @Override
    public void update() {
     super.repaint();   
    }
}
