
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class GraphicCalculator implements Runnable {
    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("Calculator");
        frame.setPreferredSize(new Dimension(400, 700));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        createComponents(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3,1);
        container.setLayout(layout);
        JTextField result = new JTextField("0");       
        result.setEnabled(false);
        JTextField second = new JTextField("0");
         JPanel panel = new JPanel(new GridLayout(1, 3));
        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        JButton z = new JButton("Z");
        z.setEnabled(false);
        ActionEvent listener = new ActionEvent(result, second, z);
        plus.setActionCommand("plus"); 
        plus.addActionListener(listener);
        minus.setActionCommand("minus");
        minus.addActionListener(listener);
        z.setActionCommand("Z");
        z.addActionListener(listener);
        panel.add(plus);
        panel.add(minus);
        panel.add(z);
        
       
        container.add(result);
        container.add(second);
        container.add(panel, BorderLayout.SOUTH);

        
    }

    public JFrame getFrame() {
        return frame;
    }

}
