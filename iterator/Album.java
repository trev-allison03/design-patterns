package iterator;
/**
 * Album class for iterator project
 * @author Trevor Allison
 */
public class Album {
    static final int MAX_SONGS = 20;
    private Song[] songs;
    private int count = 0;
    private String name;
    /**
     * constructor for album, intializes array and sets name
     * @param name
     */
    public Album(String name){
        this.name = name; 
        songs = new Song[MAX_SONGS];  
    }
    /**
     * addSong method to add a song to the end of the array.
     * @param name
     * @param artist
     * @param length
     * @param genre
     * @return true if add was successful, false if not
     */
    public boolean addSong(String name, String artist, double length, Genre genre){
        boolean check;
        Song song = new Song(name, artist, length, genre);
        if(count >= MAX_SONGS){
            check = false;
        } else {
            songs[count] = song;
            count++;
            check = true;
        }
        return check;
    }
    /**
     * creates new albumIterator
     * @return new AlbumIterator
     */
    public AlbumIterator createIterator(){
        return new AlbumIterator(songs);
    }
    /**
     * getter for name variable
     * @return name
     */
    public String getName(){
         return this.name;
    }

}
