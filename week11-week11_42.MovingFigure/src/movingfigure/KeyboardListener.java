/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingfigure;


import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author Milos
 */
public class KeyboardListener implements KeyListener{
    private Component component;
    private Figure f;
    
    public KeyboardListener(Component component, Figure f){
        this.component = component;
        this.f = f;
    }
    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_LEFT){
            f.move(-1, 0);
        }
        else if(e.getKeyCode() == KeyEvent.VK_RIGHT){
            f.move(1, 0);
        }
        else if(e.getKeyCode() == KeyEvent.VK_DOWN){
            f.move(0, 1);
        }
        else if(e.getKeyCode() == KeyEvent.VK_UP){
            f.move(0, -1);
        }
        component.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }
    
}
