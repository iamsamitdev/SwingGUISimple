package com.mycompany.swingguisimple;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Main  {

    // ตัวอย่างการเขียน Java GUI Swing
    public static void main(String[] args)  {
        
        // JFrame = a GUI Window to add component to
        
        // Step 1: Create a frame object
        JFrame frame = new JFrame();
        
        // Step 2:  Make frame visible
        frame.setVisible(true);
        
        // Step 3: Set size of frame with the x-dimension , and y-dimension
        frame.setSize(420, 420);
        
        // Step 4: Set title of frame
        frame.setTitle("This is my title");
        
        // Step 5: Prevent frame from being resize
        frame.setResizable(false);
        
        // Step 6: Set when exit to out of application
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Default is  HIDE_ON_CLOSE
        
        // Step 7: Set postion frame to center of screen
        frame.setLocationRelativeTo(null);
        
        // Step 8: Change Favicon
        ImageIcon image = new ImageIcon("logo.png");
        frame.setIconImage(image.getImage());
        
        // Step 9: chang color background
        // frame.getContentPane().setBackground(Color.red);
        //   frame.getContentPane().setBackground(new Color(0,0,255));
           frame.getContentPane().setBackground(new Color(0x123456));
        
    }
    
    
    

    
}
