/**
 * Enum que representa los distintos tipos de personajes disponibles en el videojuego.
 * Cada tipo incluye un nombre, un código identificador y una descripción breve
 * sobre sus habilidades principales.
 */
public enum TipoPersonaje {

    GUERRERO("Guerrero", "G01", "Experto en combate cuerpo a cuerpo"),
    MAGO("Mago", "M02", "Especialista en ataques mágicos"),
    ARQUERO("Arquero", "A03", "Ataca a distancia con gran precisión"),
    LADRON("Ladrón", "L04", "Sigiloso y rápido para evadir peligros");

    // Nombre visible del tipo de personaje
    private final String nombre;

    // Código único utilizado para identificarlo
    private final String codigo;

    // Breve explicación del estilo o habilidades del personaje
    private final String descripcion;

    // Constructor del enum
    TipoPersonaje(String nombre, String codigo, String descripcion){
        this.nombre = nombre;
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    // Obtiene el nombre del tipo de personaje
    public String getNombre() { return nombre; }

    // Obtiene el código identificador
    public String getCodigo() { return codigo; }

    // Obtiene la descripción del personaje
    public String getDescripcion() { return descripcion; }

    /**
     * Busca un tipo de personaje usando su código.
     * Si no existe, devuelve null.
     */
    public static TipoPersonaje buscarPorCodigo(String codigo){
        for(TipoPersonaje t : values()){
            if(t.codigo.equalsIgnoreCase(codigo)){
                return t;
            }
        }
        return null;
    }
}
