package uni1a;

public class Cortometraje extends ContenidoAudiovisual {
    private String director;

    public Cortometraje(String titulo, int duracion, String genero, String director) {
        super(titulo, duracion, genero);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del cortometraje:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración: " + getDuracionEnMinutos() + " min");
        System.out.println("Género: " + getGenero());
        System.out.println("Director: " + director);
        System.out.println();
    }
}
