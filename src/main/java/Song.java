import java.util.Comparator;

public class Song {
    /**
     * Atributo para darle un titulo a la canción creada.
     */
    private String title;
    /**
     * Atributo para darle un id a la canción creada.
     */
    private Integer id;
    /**
     * Atributo para darle un fecha de lanzamiento a la canción creada.
     */
    private Integer date;
    /**
     * Atributo para darle tiempo de duración a la canción creada.
     */
    private Float duration;
    /**
     * Atributo para darle un género a la canción creada.
     */
    private String genre;
    /**
     * Atributo para darle un caratula a la canción creada.
     */
    private String cover;
    /**
     * Atributo para darle una descripción a la canción creada.
     */
    private String description;

    /**
     * Constructor: Permite crear una instancia de la clase Song.
     * @param title
     * @param id
     * @param date
     * @param duration
     * @param genre
     * @param cover
     * @param description
     */
    public Song(String title, Integer id, Integer date, Float duration, String genre, String cover, String description) {
        this.title = title;
        this.id = id;
        this.date = date;
        this.duration = duration;
        this.genre = genre;
        this.cover = cover;
        this.description = description;
    }

    /**
     * Método para acceder al atributo title.
     * @return
     */
    public String getTitle() {
        return title;
    }

    /**
     * Método modificador del atributo title.
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Método para acceder al atributo id.
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     * Método modificador del atributo id.
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Método para acceder al atributo date.
     * @return
     */
    public Integer getDate() {
        return date;
    }

    /**
     * Método modificador del atributo date.
     * @param date
     */
    public void setDate(Integer date) {
        this.date = date;
    }

    /**
     * Método para acceder al atributo duration.
     * @return
     */
    public Float getDuration() {
        return duration;
    }

    /**
     * Método modificador del atributo duration.
     * @param duration
     */
    public void setDuration(Float duration) {
        this.duration = duration;
    }

    /**
     * Método para acceder al atributo genre.
     * @return
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Método modificador del atributo genre.
     * @param genre
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * Método para acceder al atributo cover.
     * @return
     */
    public String getCover() {
        return cover;
    }

    /**
     * Método modificador del atributo cover.
     * @param cover
     */
    public void setCover(String cover) {
        this.cover = cover;
    }

    /**
     * Método para acceder al atributo description.
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * Método modificador del atributo description.
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Sobreescribe el método toString para mostrar las canciones de la manera deseada
     * @return
     */
    @Override
    public String toString() {
        return "\nId=" + id +
                " {title=" + title +
                ", date=" + date +
                ", duration=" + duration +
                ", genre=" + genre +
                ", cover=" + cover +
                ", description=" + description +
                '}';
    }

    public static Comparator<Song> orderDuration = (Song s1, Song s2)->{
        float duration1 = s1.getDuration();
        float duration2 = s2.getDuration();
        if(duration1 < duration2) return -1;
        if(duration1 > duration2) return 1;
        return 0;
    };

    public static Comparator<Song> orderDate = (Song s1, Song s2)->{
        float date1 = s1.getDate();
        float date2 = s2.getDate();
        if(date1 < date2) return -1;
        if(date1 > date2) return 1;
        return 0;
    };
}
