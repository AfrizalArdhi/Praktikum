/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myClass;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class RadioHandling extends JFrame implements ActionListener{
    private JRadioButton rbtn1;
    private JRadioButton rbtn2;
    private JTextField teks;
    private JPanel panel;
    
    
    
    public RadioHandling(){
        teks = new JTextField("asdads");
        
        panel = new JPanel(new FlowLayout());
        
        ButtonGroup group = new ButtonGroup();
        group.add(rbtn1);
        group.add(rbtn2);
        rbtn1.addActionListener(this);
        rbtn2.addActionListener(this);
        
        setLayout(new BorderLayout());
        add(teks, "North");
        add(panel, "West");
        panel.add(rbtn1);
        pack();
        setVisible(true);
        setLocation(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
                
    }
    public void itemStateChanged(ItemEvent event){
        if(event.getSource()== rbtn1){
            if(event.getStateChange()==ItemEvent.SELECTED)
                teks.setText("asdsaads");
        }
        
    }
    
    
    
}
/**
 *
 * @author Lab Informatika
 */
public class RadioButton {
    public static void main(String[] args) {
        new RadioHandling();
    }
    
}
