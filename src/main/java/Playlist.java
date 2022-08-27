import java.util.ArrayList;

public class Playlist extends MusicLibrary{
    private String name;

    public Playlist(String name, ArrayList<Song> songs) {
        super(songs);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Playlist" + name + "\n" + getSongs();
    }
}
