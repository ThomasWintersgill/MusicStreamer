/*
* Author: J. Fairbairn
* Date: 09/02/2022
* Description: Original concept by Mark Truran (20/1/2009) 
*   A demonstration of class collaboration. The Album 
*   class is used by the StreamingService class.
*/
package uk.ac.tees.scedt.musicstreamer;

import java.util.ArrayList;
import java.util.Random;

public class StreamingService {

    // Instance variables
    private int currentTrackNumber;
    private int previousTrackPlayed;
    private boolean shuffleMode;
    //solution is within this can call methods on album to set current album
    private Album currentAlbum;
    private ArrayList<Album> albumList = new ArrayList<>();

    // Constructor for Streaming Service, sets all Instance variables 
    public StreamingService(Album album) {
        // Initialise the StreamingService
        // An alternative to writing the lines below is: changeAlbum(album);
        albumList.add(album);
        currentTrackNumber = 1;
        previousTrackPlayed = 1;
        shuffleMode = false;
        currentAlbum = albumList.get(0);
    }
    
    public StreamingService(){
        
    }
    
    void addAlbum(Album album){
        albumList.add(album);

    }

    // changeAlbum re-sets all the instance variables
    void changeAlbum(Album album) {
        
        currentTrackNumber = 1;
        previousTrackPlayed = 1;
        shuffleMode = false;
        
    }
    
    void playNextAlbum(){
        //locate the position of the current album in the array list
        int currentPos = albumList.indexOf(currentAlbum);
        //set the new current album to the current album position +1
        currentAlbum = albumList.get(currentPos+1);
        currentTrackNumber = 1;
        previousTrackPlayed = 1;
        shuffleMode = false;
        
    }

    // Change the current track to one selected by shuffle mode (a random number)
    // or the next. If the current track is the last on the album, then no change occurs.
    void playNext() {
        previousTrackPlayed = currentTrackNumber;
        if (shuffleMode) {
            Random r = new Random();
            currentTrackNumber = r.nextInt(currentAlbum.getNumberOfTracks()) + 1;
        } else if (currentTrackNumber < currentAlbum.getNumberOfTracks()) {
            currentTrackNumber++;
        }
    }

    void playPrevious() {
        currentTrackNumber = previousTrackPlayed;
    }

    void playTrack(int t) {
        if ((t >= 1) && (t <= currentAlbum.getNumberOfTracks())) {
            previousTrackPlayed = currentTrackNumber;
            currentTrackNumber = t;
        }
    }

    void setShuffleMode(boolean s) {
        shuffleMode = s;
    }

    String getStatusInfo() {
        String s = "STATUS"
                + "\nArtist: " + currentAlbum.getArtist()
                + "\nAlbum: " + currentAlbum.getTitleOfAlbum()
                + "\nTrack: " + currentAlbum.getTrack(currentTrackNumber)
                + "\nShuffle: ";

        if (shuffleMode) {
            s = s.concat("ON");
        } else {
            s = s.concat("OFF");
        }

        return s;
    }
} // end of class StreamingService

