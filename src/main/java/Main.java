/**
 * Representa el codigo principal de ejecución
 * Importa las librerias pertinentes
 * @author Andrés Castro
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    /**
     * La clase principal de ejecución del código, que interactua con el usuario para ver, ordenar y filtrar las
     * canciones y crear playlist
     * @param args
     */
    public static void main(String[] args) {

        int opcion =0, opcion2=0, opcion3=0;

        MusicLibrary library = new MusicLibrary(new ArrayList<>()) {};

        ArrayList<Playlist> playlists = new ArrayList<>();

        Song song1 = new Song("Un Siglo Sin Ti",1,2003,4.41f,"Pop","♩♪♫♬♭♮♯","Esta canción fue compuesta por el maestro Franco de Vita e interpretada por Chayanne");
        library.addSong(song1);
        Song song2 = new Song("Mi historia Entre Tus Dedos",2,1995,5.09f,"Rock","♩♪♫♬♭♮♯","Esta canción fue compuesta e interpretada por Gianluca Grignani");
        library.addSong(song2);
        Song song3 = new Song("Maldita Primavera",3,1981,3.54f,"Pop","♩♪♫♬♭♮♯","Esta canción fue compuesta por Luis Gómez y amigos e interpretada por Yuri");
        library.addSong(song3);
        Song song4 = new Song("La Media Vuelta",4,1994,2.41f,"Pop","♩♪♫♬♭♮♯","Esta canción fue compuesta por el maestro José Alfredo Jimenez e interpretada por Luis Miguel");
        library.addSong(song4);
        Song song5 = new Song("El Gato Que Está Triste y Azul",5,2004,3.52f,"Balada","♩♪♫♬♭♮♯","Esta canción fue compuesta por Bigazzi y Savio e interpretada por Roberto Carlos");
        library.addSong(song5);

        Scanner input = new Scanner(System.in);

        do{
            System.out.println("""
            Bienvenido a Castrofy, la mejor biblioteca de música del mundo
            ¿Qué desea hacer?"
            (1) Listar Biblioteca
            (2) Crear Playlist
            (0) Salir""");
            opcion = input.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("""
                            ¿Que desea hacer con la biblioteca de canciones?
                            1. Ordenar las canciones por duración
                            2. Ordenar las canciones por año
                            3. Filtrar las canciones por género
                            4. Filtrar las canciones por fecha
                            5. Mostrar por defecto
                            """);
                    opcion2 = input.nextInt();
                    switch (opcion2){
                        case 1:
                            library.sortByDuration();
                            System.out.println(library);
                            break;
                        case 2:
                            library.sortByDate();
                            System.out.println(library);
                            break;
                        case 3:
                            System.out.println("Ingrese el genero");
                            String genre = input.next();
                            library.byGenre(genre, library.getSongs());
                            break;
                        case 4:
                            System.out.println("Ingrese el año");
                            Integer date = input.nextInt();
                            library.byDate(date, library.getSongs());
                        case 5:
                            System.out.println(library);
                    }
                    break;
                case 2:
                    System.out.println("Por favor indique un nombre para la Playlist");
                    String name = input.next();
                    Playlist playlist = new Playlist(name, new ArrayList<>());
                    playlists.add(playlist);
                    do{
                        System.out.println("¿Qué desea con la playlist " + name + "?"
                                + "\n1. Agregar canción. \n2. Listar Playlist. \n0. Volver al menú principal"
                                );
                        opcion3 = input.nextInt();
                        switch (opcion3){
                            case 1:
                                System.out.println("Por favor indique el id de la canción a agregar");
                                int id = input.nextInt();
                                playlist.addSong(library.getSong(id));
                                break;
                            case 2:
                                System.out.println(playlist);
                                break;
                            case 0:
                                System.out.println("Gracias por crear tu playlist");
                                break;
                            default:
                                System.out.println("Esta opción no esta disponible");
                        }
                    }while(opcion3!=0);
                case 0:
                    System.out.println("Muchas gracias por usar a la mejor biblioteca de música");
                    break;
                default:
                    System.out.println("Esta opción no esta disponible");
            }
        }while(opcion != 0);
    }
}
