/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uk.ac.tees.scedt.musicstreamer;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author thoma
 */
public class musicStreamerFrame extends JFrame{
    
    controlPanel controlPanel = new controlPanel();
    
    public musicStreamerFrame(){
        init();
    }
    
    private void init(){
        
        setTitle("Music Streamer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(800, 800));
        add(controlPanel, BorderLayout.NORTH);
        pack();
  
    }
}
