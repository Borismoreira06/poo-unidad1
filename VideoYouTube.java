package uni1a;

public class VideoYouTube extends ContenidoAudiovisual {
    private int likes;

    public VideoYouTube(String titulo, int duracion, String genero, int likes) {
        super(titulo, duracion, genero);
        this.likes = likes;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del video de YouTube:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración: " + getDuracionEnMinutos() + " min");
        System.out.println("Género: " + getGenero());
        System.out.println("Likes: " + likes);
        System.out.println();
    }
}
