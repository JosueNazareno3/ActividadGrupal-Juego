/**
 * Enum que representa los distintos tipos de criaturas enemigas del videojuego.
 * Cada criatura tiene un nombre, un nivel de amenaza y una descripción que detalla su comportamiento.
 */

public enum TipoCriaturaEnemiga {
    GOBLIN("Goblin", 1, "Criatura pequeña y astuta que ataca en grupo."),
    ORCO("Orco", 3, "Enemigo fuerte con gran resistencia física."),
    DRAGON("Dragón", 5, "Bestia gigantesca capaz de lanzar fuego."),
    ESPECTRO("Espectro", 4, "Entidad fantasmal difícil de golpear y muy peligrosa.");

    private final String nombre;
    private final int nivelAmenaza;
    private final String descripcion;

    /**
     * Constructor del tipo de criatura enemiga.
     * Permite definir su nombre, nivel de amenaza y descripción.
     */
    TipoCriaturaEnemiga(String nombre, int nivelAmenaza, String descripcion){
        this.nombre = nombre;
        this.nivelAmenaza = nivelAmenaza;
        this.descripcion = descripcion;
    }

    public String getNombre(){ return nombre; }
    public int getNivelAmenaza(){ return nivelAmenaza; }
    public String getDescripcion(){ return descripcion; }

    /**
     * Busca un tipo de criatura enemiga según su nombre.
     * La comparación no distingue entre mayúsculas y minúsculas.
     */
    public static TipoCriaturaEnemiga buscarPorNombre(String nombre){
        for (TipoCriaturaEnemiga t : values()) {
            if (t.nombre.equalsIgnoreCase(nombre)) {
                return t;
            }
        }
        return null;
    }
}
