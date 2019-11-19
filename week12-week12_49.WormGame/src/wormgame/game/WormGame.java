package wormgame.game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.Timer;
import wormgame.Direction;
import wormgame.domain.Apple;
import wormgame.domain.Piece;
import wormgame.domain.Worm;
import wormgame.gui.Updatable;

public class WormGame extends Timer implements ActionListener {

    private int width;
    private int height;
    private boolean continues;
    private Updatable updatable;
    private Worm worm;
    private Apple apple;
    private Random r;
    public WormGame(int width, int height) {
        super(1000, null);
        this.width = width;
        this.height = height;
        this.continues = true;
        r = new Random();
        this.worm = new Worm(width/2, height/2, Direction.DOWN);
       while(true){
            int x = r.nextInt(width);
            int y = r.nextInt(height);
            apple = new Apple(x, y);
            if(!worm.runsInto(apple)) break;
                }
        addActionListener(this);
        setInitialDelay(2000);

    }


    public boolean continues() {
        return continues;
    }
    public Worm getWorm(){
        return worm;
    }
    public Apple getApple(){
        return apple;
    }
    public void setApple(Apple apple){
        this.apple = apple;
    }
    public void setWorm(Worm w){
        worm = w;
    }
    public void setUpdatable(Updatable updatable) {
        this.updatable = updatable;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (!continues) {
            return;
        }
        worm.move();
        if(worm.runsInto(apple)){
            Apple noviApple = null;
            while(true){
            int x = r.nextInt(width);
            int y = r.nextInt(height);
            noviApple = new Apple(x, y);
            if(!worm.runsInto(noviApple)) break;
                }
            setApple(noviApple);
            worm.grow();
        }
        if(worm.runsIntoItself()){
            continues = false;
        }
        Piece head = worm.getPieces().get(worm.getLength()-1);
        if (head.getY() == height || head.getX() == width || head.getX() == -1 || head.getY() == -1) {
            continues = false;
        }

 
        updatable.update();
        setDelay(1000/worm.getLength());
    }

}
