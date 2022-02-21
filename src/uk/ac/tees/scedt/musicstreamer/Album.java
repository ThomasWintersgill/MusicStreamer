/*
* Author: J. Fairbairn
* Date: 09/02/2022
* Description: Original concept by Mark Truran (20/1/2009) 
*   A demonstration of class collaboration. The Album class is used by the
*   StreamingService class. This  version of the Album class does not have
*   any mutator methods; all the instance variables are set through the
*   constructor.
*/
package uk.ac.tees.scedt.musicstreamer;

public class Album {

    // Instance variables
    private final String artist;
    private final String titleOfAlbum;
    private final String[] listOfTracks;

    // Constructor for the Album object
    public Album(String a, String t, String[] l) {
        artist = a;
        titleOfAlbum = t;

        listOfTracks = new String[l.length];
        for (int counter = 0; counter < l.length; counter++) {
            listOfTracks[counter] = l[counter];
        }
    }

    // Accessor methods
    public String getArtist() {
        return artist;
    }

    public String getTitleOfAlbum() {
        return titleOfAlbum;
    }

    public int getNumberOfTracks() {
        return listOfTracks.length;
    }

    public String getListOfTracks() {
        String result = "";
        if (listOfTracks.length > 0) {
            for (int i = 0; i < listOfTracks.length; i++) {
                result = result + (i + 1) + ". " + listOfTracks[i] + "\n";
            }
        }
        return result;
    }

    public String getTrack(int trackno) {
        return listOfTracks[trackno - 1];
    }
} // end of class Album

