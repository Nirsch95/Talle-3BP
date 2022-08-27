import java.util.Comparator;

public class Song {
    private String title;
    private Integer id;
    private Integer date;
    private Float duration;
    private String genre;
    private String cover;
    private String description;

    public Song(String title, Integer id, Integer date, Float duration, String genre, String cover, String description) {
        this.title = title;
        this.id = id;
        this.date = date;
        this.duration = duration;
        this.genre = genre;
        this.cover = cover;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDate() {
        return date;
    }

    public void setDate(Integer date) {
        this.date = date;
    }

    public Float getDuration() {
        return duration;
    }

    public void setDuration(Float duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

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
