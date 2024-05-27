import java.util.ArrayList;
import java.util.LinkedList;
public class Album {
    // write code here
    private String name;
    private String artist;
    private ArrayList<Song> songs;
    public Album(String name,String artist){
        this.name=name;
        this.artist=artist;
        songs=new ArrayList<>();
    }
    public boolean addSong(String title,double duration){
        if(findSong(title)==null){
            return false;
        }else{
            songs.add(new Song(title,duration));
            return true;
        }
            
    }
    private Song findSong(String title){
        for(Song x:songs){
            if(x.getTitle().equals(title)){
                return x;
            }
        }
        return null;
    }
    public boolean addToPlayList(int trackNumber,LinkedList<Song> playlist){
        if(trackNumber<=songs.size()){
            return true;
        }else
            return false;
    }
    public boolean addToPlayList(String title,LinkedList<Song> playlist){
        if(findSong(title)==null){
            return false;
        }else{
              return true;
        }
    }   
}
