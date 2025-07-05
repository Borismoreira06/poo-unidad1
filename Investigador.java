package uni1a;

public class Investigador {
    private String nombre;
    private String campo;

    public Investigador(String nombre, String campo) {
        this.nombre = nombre;
        this.campo = campo;
    }

    public void mostrar() {
        System.out.println("Investigador: " + nombre + ", Campo: " + campo);
    }
}
