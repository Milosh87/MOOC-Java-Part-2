package survey;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        // Create your app here
        frame = new JFrame("Survey");
        frame.setPreferredSize(new Dimension(2200, 2200));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
         createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS);
        container.setLayout(layout);
        
        container.add(new JLabel("Are you?"));
        container.add(new JCheckBox("Yes!"));
        container.add(new JCheckBox("No!"));
        container.add(new JLabel("Why?"));
        JRadioButton first = new JRadioButton("No reason.");
        JRadioButton second = new JRadioButton("Because it is fun!");
        ButtonGroup group = new ButtonGroup();
        group.add(first);
        group.add(second);
        container.add(first);
        container.add(second);
        container.add(new JButton("Done!"));
    }


    public JFrame getFrame() {
        return frame;
    }
}
