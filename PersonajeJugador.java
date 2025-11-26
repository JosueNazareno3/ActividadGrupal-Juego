/**
 * Clase que representa al personaje controlado por el jugador dentro del videojuego.
 * Incluye atributos como el nombre, nivel, salud y el tipo de personaje que define su rol.
 * También permite realizar ataques y recibir daño.
 */

public class PersonajeJugador {
    private String nombre;
    private int nivel;
    private int salud;
    private TipoPersonaje tipo;

    /**
     * Constructor que permite crear un personaje jugador indicando su nombre,
     * nivel inicial, salud y tipo de personaje.
     */
    public PersonajeJugador(String nombre, int nivel, int salud, TipoPersonaje tipo){
        this.nombre = nombre;
        this.nivel = nivel;
        this.salud = salud;
        this.tipo = tipo;
    }

    // GETTERS
    public String getNombre() { return nombre; }
    public int getNivel() { return nivel; }
    public int getSalud() { return salud; }
    public TipoPersonaje getTipo() { return tipo; }

    // SETTERS
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setNivel(int nivel) { this.nivel = nivel; }
    public void setSalud(int salud) { this.salud = salud; }
    public void setTipo(TipoPersonaje tipo) { this.tipo = tipo; }

    /**
     * Permite al personaje recibir daño, reduciendo su salud.
     * Si la salud llega a valores negativos, se ajusta a cero.
     */
    public void recibirDanio(int cantidad){
        this.salud -= cantidad;
        if(this.salud < 0){
            this.salud = 0;
        }
        System.out.println(nombre + " ha recibido " + cantidad +
                " puntos de daño. Salud restante: " + salud);
    }

    /**
     * Acción simple de ataque hacia un enemigo representado por su nombre.
     */
    public String atacar(String enemigo){
        return nombre + " ataca a " + enemigo + " utilizando su habilidad de "
                + tipo.getNombre() + ".";
    }

    /**
     * Acción de ataque hacia una criatura enemiga real del juego.
     * El daño se calcula con base en el nivel del personaje.
     */
    public void atacarEnemigo(CriaturaEnemiga enemigo){
        int dano = this.nivel * 5; // daño basado en el nivel del jugador
        enemigo.recibirDanio(dano);

        System.out.println(this.nombre + " ha atacado a " + enemigo.getNombre() +
                " causando " + dano + " puntos de daño.");
    }

    @Override
    public String toString(){
        return "Nombre: " + nombre +
                "\nNivel: " + nivel +
                "\nSalud: " + salud +
                "\nTipo de personaje: " + tipo.getNombre() +
                "\nDescripción: " + tipo.getDescripcion() +
                "\nCódigo: " + tipo.getCodigo();
    }
}
