package poo;

import uni1a.*;

public class PruebaAudioVisual {
    public static void main(String[] args) {
        System.out.println("=== Sistema de Contenidos Audiovisuales ===\n");

        // Crear objetos relacionados
        Actor actor1 = new Actor("Leonardo DiCaprio", 49);
        Temporada temporada1 = new Temporada(1, 10);
        Investigador investigador1 = new Investigador("Carl Sagan", "Astronomía");

        // Crear instancias de contenidos audiovisuales
        ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[5];

        contenidos[0] = new Pelicula("Origen", 148, "Ciencia Ficción", "Warner Bros", actor1);
        contenidos[1] = new SerieDeTV("Breaking Bad", 50, "Drama", 5, temporada1);
        contenidos[2] = new Documental("Cosmos", 60, "Ciencia", "Universo", investigador1);
        contenidos[3] = new Cortometraje("La luna", 7, "Animación", "Enrico Casarosa");
        contenidos[4] = new VideoYouTube("Tutorial Java", 15, "Educación", 100000);

        // Mostrar los detalles de cada contenido audiovisual
        for (ContenidoAudiovisual contenido : contenidos) {
            contenido.mostrarDetalles();
        }
    }
}
