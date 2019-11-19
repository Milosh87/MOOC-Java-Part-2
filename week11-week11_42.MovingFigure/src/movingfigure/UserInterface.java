package movingfigure;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;
    private Figure f;
    public UserInterface(Figure f){
        this.f = f;
    }

    @Override
    public void run() {
        frame = new JFrame();
        frame.setPreferredSize(new Dimension(400, 400));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());
        addListeners();

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        DrawingBoard db = new DrawingBoard(f);
        KeyboardListener kb = new KeyboardListener(db, f);
        frame.addKeyListener(kb);
        container.add(db);
    }

    private void addListeners() {
        
    }

    public JFrame getFrame() {
        return frame;
    }
}
