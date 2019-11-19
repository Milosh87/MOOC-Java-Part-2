package noticeboard;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

public class NoticeBoard implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame();
        frame.setPreferredSize(new Dimension(400, 600));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        createComponents(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3, 1);
        JTextField emptyArea = new JTextField();
        JButton copyButton = new JButton("Copy!");
        JLabel copiedLocation  = new JLabel();
        ActionEventListener listener = new ActionEventListener(emptyArea, copiedLocation);
        container.setLayout(layout);
        copyButton.addActionListener(listener);
        container.add(emptyArea);
        container.add(copyButton);
        container.add(copiedLocation);
        
        
    }
}
