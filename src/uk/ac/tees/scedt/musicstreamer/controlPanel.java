/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uk.ac.tees.scedt.musicstreamer;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author thoma
 */

//how can i get this class to know about streamingService class
public class controlPanel extends JPanel {
    JButton startMusicStreamer = new JButton("Start");
    JButton nextTrackButton = new JButton("Play Next");
    JButton previousTrackButton = new JButton("Play Previous");
    JButton shuffleButton = new JButton("shuffle");
    
    public controlPanel(){
        super();
        init();
    }
    
    private void init(){
        this.setPreferredSize(new Dimension(400, 400));
        this.setBorder(BorderFactory.createTitledBorder("Music Controls"));
        nextTrackButton.setFont( new Font("Arial", Font.BOLD, 50));
        previousTrackButton.setFont( new Font("Arial", Font.BOLD, 50));
        shuffleButton.setFont( new Font("Arial", Font.BOLD, 50));
        startMusicStreamer.setFont( new Font("Arial", Font.BOLD, 50));
        this.add(previousTrackButton);
        this.add(nextTrackButton);
        this.add(shuffleButton);
        this.add(startMusicStreamer);
        theHandler handler = new theHandler();
        startMusicStreamer.addActionListener(handler);
        
    }
    
    private class theHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String string = "";
            
            
            if(e.getSource() == startMusicStreamer){
                StreamingService myPlayer = new StreamingService();
                
                System.out.println(myPlayer);
            }
            
            
        }
        
    }

    
}
