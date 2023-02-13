package iterator;
import java.util.Iterator;
/**
 * Iterator class album iterator for project
 * @author Trevor Allison
 */
public class AlbumIterator implements Iterator{
    private Song[] song;
    private int position = 0;
    /**
     * Constructor for AlbumIterator
     * @param song
     */
    public AlbumIterator(Song[] song){
        this.song = song;
    }
    /**
     * Has next method for iterator
     * @return boolean that is true if there is a song in the next index, and false if there is not
     */
    public boolean hasNext(){
        if(position >= song.length || song[position] == null){
            return false;
        } else {
            return true;
        }
    }
    /**
     * next method for album iterator
     * @return the next song
     */
    public Song next(){
        if(!hasNext()){
            return null;
        }
        Song songs = song[position];
        position = position + 1;
        return songs;
    }
}
