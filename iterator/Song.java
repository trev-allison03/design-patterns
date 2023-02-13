package iterator;
/**
 * Song Class for iterator project
 * @author Trevor Allison
 */
public class Song {
    private String name;
    private String artist;
    private double length;
    private Genre genre;
    /**
     * constructor for Song class
     * @param name
     * @param artist
     * @param length
     * @param genre
     */
    public Song(String name, String artist, double length, Genre genre){
        this.name = name;
        this.artist = artist;
        this.length = length;
        this.genre = genre;
    }
    /**
     * to string method for song class, returns aspects to a string
     * @return string
     */
    public String toString(){
        String result = name+" by "+artist+" category: "+genre+" length: "+length+" min";
        return result;
    }
}
