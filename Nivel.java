import java.util.ArrayList;

/**
 * Clase que representa un nivel dentro del videojuego.
 * Un nivel contiene un nombre, una descripción, un nivel de dificultad
 * y una lista de objetos que el jugador puede encontrar al explorarlo.
 */

public class Nivel {
    private String nombre;
    private String descripcion;
    private int dificultad;

    // Lista de objetos que pueden ser recolectados en este nivel
    private ArrayList<ObjetoRecolectable> objetosDisponibles = new ArrayList<>();

    /**
     * Constructor del nivel.
     * Permite crear un nivel especificando su nombre, descripción y dificultad.
     */
    public Nivel(String nombre, String descripcion, int dificultad) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.dificultad = dificultad;
    }

    // GETTERS
    public String getNombre() { return nombre; }
    public String getDescripcion() { return descripcion; }
    public int getDificultad() { return dificultad; }
    public ArrayList<ObjetoRecolectable> getObjetosDisponibles() { return objetosDisponibles; }

    // SETTERS
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public void setDificultad(int dificultad) { this.dificultad = dificultad; }

    /**
     * Agrega un objeto recolectable a la lista del nivel.
     */
    public void agregarObjeto(ObjetoRecolectable objeto) {
        objetosDisponibles.add(objeto);
    }

    /**
     * Muestra en pantalla todos los objetos disponibles dentro del nivel.
     */
    public void mostrarObjetos() {
        System.out.println("\nObjetos en el nivel " + nombre + ":");
        for (ObjetoRecolectable o : objetosDisponibles) {
            System.out.println(o);
        }
    }

    /**
     * Devuelve un mensaje indicando que el jugador está explorando el nivel.
     */
    public String explorar() {
        return "Explorando el nivel '" + nombre + "'. " + descripcion;
    }

    @Override
    public String toString() {
        return "Nivel: " + nombre +
                " | Dificultad: " + dificultad +
                " | Descripción: " + descripcion +
                " | Objetos en el nivel: " + objetosDisponibles.size();
    }
}
