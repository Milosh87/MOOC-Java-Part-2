
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Milos
 */
public class ActionEvent implements ActionListener{
    private int value = 0;
    private JTextField result;
    private JTextField input;
    private JButton z;
    public ActionEvent(JTextField result, JTextField input, JButton z){
        this.result = result;
        this.input = input;
        this.z = z;
    }
    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        if(e.getActionCommand().equals("plus")){
            add();
        }
        else if(e.getActionCommand().equals("Z")){
            reset();
        }
        else if(e.getActionCommand().equals("minus")){
            minus();
        }
    }
    
    public void reset(){
        value = 0;
        z.setEnabled(false);
        result.setText(Integer.toString(value));
        input.setText("");
    }
    
    
    public void add(){
                if(!input.getText().matches("-?(0|[1-9]\\d*)")){
            input.setText("");
            return;
        }
        value+=Integer.parseInt(input.getText());
        result.setText(Integer.toString(value));
        input.setText("");
        if(!result.getText().equals("0")){
            z.setEnabled(true);
        }
    }
    public void minus(){
         if(!input.getText().matches("-?(0|[1-9]\\d*)")){
            input.setText("");
            return;
        }
        value-=Integer.parseInt(input.getText());
        result.setText(Integer.toString(value));
        input.setText("");
           if(!result.getText().equals("0")){
            z.setEnabled(true);
        }
    }
    
}
