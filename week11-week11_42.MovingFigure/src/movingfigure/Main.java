package movingfigure;

import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {
         UserInterface ui = new UserInterface(new Box(50, 50, 100, 300));
        SwingUtilities.invokeLater(ui);
    }
}
