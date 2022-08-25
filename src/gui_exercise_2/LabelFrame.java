/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_exercise_2;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;
/**
 *
 * @author Kidus
 */
public class LabelFrame extends JFrame{
 
    public  final JLabel label1;
     public final JLabel label2;
    public  final JLabel label3;
  
    
 
     
     public LabelFrame(){
     
         super("This is super");
         
         setLayout(new FlowLayout());
         
         label1 = new JLabel("Next Robotics");
         label1.setToolTipText("label1 tooltip");
         add(label1);
         
         
         Icon javalogo = new ImageIcon(getClass().getResource("next.png"));
         label2 = new JLabel("We are learning Java", javalogo, SwingConstants.LEFT);
         label2.setToolTipText("label2 tooltip");
         add(label2);
         
         
         label3 = new JLabel();
         label3.setText("Label 3 text is here");
         label3.setToolTipText("This is Label 3");
         
         
         label3.setHorizontalTextPosition(SwingConstants.CENTER);
         label3.setVerticalTextPosition(SwingConstants.BOTTOM);
         
         
         add(label3);
     } 
   

    
}
    
  

