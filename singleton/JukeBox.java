package singleton;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
/**
 * Jukebox class for singleton project
 * @author Trevor Allison
 */
public class JukeBox {
    private static JukeBox jukeBox;
    private ArrayList<Song> songs = new ArrayList<Song>();
    private Queue<String> songQueue = new LinkedList<String>();
    /**
     * Private constructor for jukebox, setting songs arraylist to values found by dataloader
     */
    private JukeBox(){
        songs = DataLoader.getSongs();
    }
    /**
    * makes sure only one instance of JukeBox can be created
    * @return the single instance of the JukeBox class
    */
    public static JukeBox getInstance(){
        if(jukeBox == null){
            System.out.println("Creating a juke box");
            jukeBox = new JukeBox();
        }
        return jukeBox;
    }
    /**
    * Plays the next song in the song queue. If there are no songs in the queue, a message is returned indicating that more songs need to be added.
    * @return String of either next song or message saying that they need to queue a song
    */
    public String playNextSong(){
        String result = "";
        if(hasMoreSongs()){
            Song nextSong = null;
            for (Song song : songs){
                if(song.getTitle().equalsIgnoreCase(songQueue.peek())){
                    nextSong = song;
                    break;
                }
            }
            result = "Let's jam to "+nextSong.toString();
            songQueue.poll();
        } else {
            result = "You need to add more songs to the list";
        }
        return result;
    }/**
    * Adds a song to the song queue if it exists in the arraylist
    * @param title of the song to be added to the queue
    * @return a message that the song has been added to the queue, or that the song cannot be played
    */
    public String requestSong(String title){
        String result = "Sorry we do not have the song "+title;
        for(Song song : songs){
            if(song.getTitle().equalsIgnoreCase(title)){
                songQueue.add(title);
                result = title+" is now number "+songQueue.size()+" on the list";
            }
        }
        return result;
    }
    /**
     * checks whether there are more songs in the que
     * @return true if there are more, false if not
     */
    public boolean hasMoreSongs(){
        return !songQueue.isEmpty();
    }
}
