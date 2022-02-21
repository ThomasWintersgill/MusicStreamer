/*
* Author: J. Fairbairn
* Date: 09/02/2022
* Description: Original concept by Mark Truran (20/1/2009) 
*   A demonstration of class collaboration. The Album 
*   class is used by the StreamingService class.
 */
package uk.ac.tees.scedt.musicstreamer;

public class TestStreamingService {

    public static void main(String[] args) {
        // Create array of String objects to hold names of tracks
        String[] trackList = new String[13];

        // Populate array with track names
        trackList[0] = "Like Eating Glass";
        trackList[1] = "Helicopter";
        trackList[2] = "Positive Tension";
        trackList[3] = "Banquet";
        trackList[4] = "Blue Light";
        trackList[5] = "Shes Hearing Voices";
        trackList[6] = "This Modern Love";
        trackList[7] = "The Pioneers";
        trackList[8] = "Price Of Gasoline";
        trackList[9] = "So Here We Are";
        trackList[10] = "Luno";
        trackList[11] = "Plans";
        trackList[12] = "Compliments";
        
         String[] trackListTwo = new String[13];

        // Populate array with track names
        trackListTwo[0] = "Give life Back to Music";
        trackListTwo[1] = "The Game Of Love";
        trackListTwo[2] = "Giorgio by Moroder";
        trackListTwo[3] = "Within";
        trackListTwo[4] = "Instant Crush";
        trackListTwo[5] = "Lose Yourself to Dance";
        trackListTwo[6] = "Touch";
        trackListTwo[7] = "Get Lucky";
        trackListTwo[8] = "Beyond";
        trackListTwo[9] = "Motherboard";
        trackListTwo[10] = "Fragements";
        trackListTwo[11] = "Doin` it Right";
        trackListTwo[12] = "Contact";

        // Create new Album object passing ARTIST, TITLE, GENRE, ARRAY OF TRACKS
       // Album myDisc = new Album("Bloc Party", "Silent Alarm", trackList);
        
        //Album myDiscTwo = new Album("Daft Punk", "Random Access Memories", trackListTwo);

        // Create new StreamingService object, passing the Album object as an argument to the constructor
        // myPlayer = new StreamingService(myDisc);
        //StreamingService myPlayer = new StreamingService();
        //Test the object
        //System.out.println(myPlayer.getStatusInfo());
        //myPlayer.addAlbum(myDiscTwo);
        //myPlayer.playNextAlbum();
        //System.out.println(myPlayer.getStatusInfo());
        //myPlayer.playNext();
        //System.out.println(myPlayer.getStatusInfo());
        new musicStreamerFrame().setVisible(true);
        
        
        
    }   // end of the main method
}   //end of the class
