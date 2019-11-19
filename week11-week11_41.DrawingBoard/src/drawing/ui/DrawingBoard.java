package drawing.ui;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawingBoard extends JPanel {

    public DrawingBoard() {
        super.setBackground(Color.WHITE);
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        graphics.fillRect(90, 50, 60, 60);
        graphics.fillRect(240, 50, 60, 60);
         graphics.fillRect(40, 190, 60, 60);
        graphics.fillRect(290, 190, 60, 60);
        graphics.fillRect(90, 240, 200, 60);
        
    }
}
