/**
 * Representa el codigo que representa el objeto Libreria de música
 * Importa las librerias pertinentes
 * @author Andrés Castro
 */
import java.util.ArrayList;
import java.util.Collections;

public abstract class MusicLibrary {
    private ArrayList<Song> songs;

    /**
     * Constructor: permite crear una instancia de la clase MusicLibrary
     * @param songs
     */
    public MusicLibrary(ArrayList<Song> songs) {
        this.songs = songs;
    }

    /**
     * Método para acceder al atributo songs.
     * @return retorna la lista de canciones
     */
    public ArrayList<Song> getSongs() {
        return songs;
    }

    /**
     * Método que modifica el atributo songs.
     * @param songs
     */
    public void setSongs(ArrayList<Song> songs) {
        this.songs = songs;
    }

    /**
     * Método que permite agregar una canción al array.
     * @param song
     */
    public void addSong(Song song){
        this.songs.add(song);
    }

    /**
     * Método para acceder a una canción del array
     * @param id
     * @return
     */
    public Song getSong(int id) {
        int index = 0;
        for(int i = 0;i< songs.size();i++){
            if(songs.get(i).getId()==id){
                index=id-1;
            }
        }
        return this.songs.get(index);
    }

    /**
     * Método que permite filtrar las canciones por el atributo genre
     * @param genre
     * @param filterSongs
     */
    public void byGenre(String genre, ArrayList<Song> filterSongs){
        filterSongs.stream().filter(song -> song.getGenre().equals(genre)).forEach(System.out::println);
    }

    /**
     * Método que permite filtrar las canciones por el atributo date
     * @param date
     * @param filterSongs
     */
    public void byDate(Integer date, ArrayList<Song> filterSongs){
        filterSongs.stream().filter(song -> song.getDate().equals(date)).forEach(System.out::println);
    }

    /**
     * Método que permite ordenar las canciones por el atributo duration
     */
    public void sortByDuration(){
        Collections.sort(songs, Song.orderDuration);
    }

    /**
     * Método que permite ordenar las canciones por el atributo date
     */
    public void sortByDate(){
        Collections.sort(songs, Song.orderDate);
    }

    /**
     * Sobreescribe el método toString para mostrar los datos de la canción de la manera deseada
     * @return
     */
    @Override
    public String toString() {
        return "Music Library{" +
                "songs=" + "\n" + getSongs()+
                '}';
    }
}
