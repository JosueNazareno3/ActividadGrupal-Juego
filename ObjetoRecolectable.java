/**
 * Clase que representa un objeto recolectable dentro del videojuego.
 * Cada objeto tiene un nombre, un efecto que produce al usarse
 * y una rareza que indica qué tan difícil es encontrarlo.
 */

public class ObjetoRecolectable {
    private String nombre;
    private String efecto;
    private RarezaObjeto rareza;

    /**
     * Constructor que permite crear un objeto indicando su nombre,
     * el efecto que produce y su rareza.
     */
    public ObjetoRecolectable(String nombre, String efecto, RarezaObjeto rareza) {
        this.nombre = nombre;
        this.efecto = efecto;
        this.rareza = rareza;
    }

    // GETTERS
    public String getNombre() { return nombre; }
    public String getEfecto() { return efecto; }
    public RarezaObjeto getRareza() { return rareza; }

    // SETTERS
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setEfecto(String efecto) { this.efecto = efecto; }
    public void setRareza(RarezaObjeto rareza) { this.rareza = rareza; }

    /**
     * Devuelve un mensaje indicando que el jugador ha recolectado el objeto.
     */
    public String recolectar() {
        return "Has recolectado: " + nombre + " (Rareza: " + rareza.getNombre() + ")";
    }

    @Override
    public String toString() {
        return "Objeto: " + nombre +
                " | Efecto: " + efecto +
                " | Rareza: " + rareza.getNombre() +
                " | Descripción: " + rareza.getDescripcion() +
                " | Probabilidad: " + rareza.getProbabilidad();
    }
}
