import java.util.ArrayList;
import java.util.Collections;

public abstract class MusicLibrary {
    private ArrayList<Song> songs;

    public MusicLibrary(ArrayList<Song> songs) {
        this.songs = songs;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public void setSongs(ArrayList<Song> songs) {
        this.songs = songs;
    }

    public void addSong(Song song){
        this.songs.add(song);
    }

    public Song getSong(int id) {
        int index = 0;
        for(int i = 0;i< songs.size();i++){
            if(songs.get(i).getId()==id){
                index=id-1;
            }
        }
        return this.songs.get(index);
    }

    public void byGenre(String genre, ArrayList<Song> filterSongs){
        filterSongs.stream().filter(song -> song.getGenre().equals(genre)).forEach(System.out::println);
    }

    public void byDate(Integer date, ArrayList<Song> filterSongs){
        filterSongs.stream().filter(song -> song.getDate().equals(date)).forEach(System.out::println);
    }

    public void sortByDuration(){
        Collections.sort(songs, Song.orderDuration);
    }

    public void sortByDate(){
        Collections.sort(songs, Song.orderDate);
    }

    @Override
    public String toString() {
        return "Music Library{" +
                "songs=" + "\n" + getSongs()+
                '}';
    }
}
