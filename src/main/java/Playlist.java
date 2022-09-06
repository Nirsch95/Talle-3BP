/**
 * Representa el codigo que representa el objeto Playlist de música heredando metodos de MusicLibrary
 * Importa las librerias pertinentes.
 * @author Andrés Castro
 */
import java.util.ArrayList;

public class Playlist extends MusicLibrary{
    /**
     * Atributo para darle nombre a la playlsit creada.
     */
    private String name;

    /**
     * Constructor: Permite crear una instancia de la clase Playlist.
     * @param name
     * @param songs
     */
    public Playlist(String name, ArrayList<Song> songs) {
        super(songs);
        this.name = name;
    }

    /**
     * Método para acceder al atributo name.
     * @return retorna el nombre de la playlist.
     */
    public String getName() {
        return name;
    }

    /**
     * Método que permite modificar el atributo name.
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sobreescribe el método toString para mostrar los datos de la playlist de la manera deseada
     * @return
     */
    @Override
    public String toString() {
        return "Playlist" + name + "\n" + getSongs();
    }
}
