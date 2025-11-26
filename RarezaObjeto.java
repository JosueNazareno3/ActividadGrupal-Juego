/**
 * Enum que representa la rareza de un objeto dentro del videojuego.
 * Cada tipo incluye un nombre, una probabilidad de aparición
 * y una breve descripción de su valor.
 */
public enum RarezaObjeto {

    COMUN("Común", 0.60, "Objeto frecuente con bajo valor."),
    RARO("Raro", 0.25, "Objeto poco común con utilidad especial."),
    EPICO("Épico", 0.10, "Objeto poderoso difícil de encontrar."),
    LEGENDARIO("Legendario", 0.05, "Objeto extremadamente valioso y único.");

    // Nombre de la rareza
    private final String nombre;

    // Probabilidad de obtención del objeto
    private final double probabilidad;

    // Descripción del valor del objeto
    private final String descripcion;

    /**
     * Constructor del enum RarezaObjeto.
     * Recibe el nombre, la probabilidad y la descripción de la rareza.
     */
    RarezaObjeto(String nombre, double probabilidad, String descripcion) {
        this.nombre = nombre;
        this.probabilidad = probabilidad;
        this.descripcion = descripcion;
    }

    // Devuelve el nombre de la rareza
    public String getNombre() {
        return nombre;
    }

    // Devuelve la probabilidad de encontrar esta rareza
    public double getProbabilidad() {
        return probabilidad;
    }

    // Devuelve la descripción detallada de la rareza
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Busca un tipo de rareza por su nombre.
     * Si el nombre coincide con alguno de los valores del enum,
     * lo devuelve. Si no existe, retorna null.
     */
    public static RarezaObjeto buscarPorNombre(String nombre) {
        for (RarezaObjeto r : values()) {
            if (r.nombre.equalsIgnoreCase(nombre)) {
                return r;
            }
        }
        return null;
    }
}
