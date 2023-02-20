package singleton;
/**
 * Song class for singleton project
 * @author Trevor Allison
 */
public class Song {
    private String title;
    private String artist;
    /**
    * Constructs a new Song object with the given title and artist.
    * @param title of the song and artist of the song
    */
    public Song(String title, String artist){
        this.title = title;
        this.artist = artist;
    }
    /**
     * Returns the title of the song.
     * @return this.title
    */
    public String getTitle(){
        return this.title;
    }
    /**
    * Returns a String representation of the Song object.
    * @return a String containing the title and artist of the song
    */
    public String toString(){
        return title+" by "+artist;
    }
}