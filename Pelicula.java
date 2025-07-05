package uni1a;

public class Pelicula extends ContenidoAudiovisual {
    private String estudio;
    private Actor actorPrincipal;

    public Pelicula(String titulo, int duracion, String genero, String estudio, Actor actor) {
        super(titulo, duracion, genero);
        this.estudio = estudio;
        this.actorPrincipal = actor;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    public Actor getActorPrincipal() {
        return actorPrincipal;
    }

    public void setActorPrincipal(Actor actorPrincipal) {
        this.actorPrincipal = actorPrincipal;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la película:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Estudio: " + estudio);
        if (actorPrincipal != null) {
            actorPrincipal.mostrar();
        }
        System.out.println();
    }
}
