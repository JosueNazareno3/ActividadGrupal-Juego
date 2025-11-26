/**
 * Clase que representa a una criatura enemiga dentro del videojuego.
 * Cada enemigo posee un nombre, salud y un tipo que define su nivel de amenaza
 * y características principales.
 */

public class CriaturaEnemiga {
    private String nombre;
    private int salud;
    private TipoCriaturaEnemiga tipo;

    public CriaturaEnemiga(String nombre, int salud, TipoCriaturaEnemiga tipo){
        this.nombre = nombre;
        this.salud = salud;
        this.tipo = tipo;
    }

    // Devuelve el nombre del enemigo
    public String getNombre() { return nombre; }

    // Devuelve la salud del enemigo
    public int getSalud() { return salud; }

    // Devuelve el tipo de enemigo
    public TipoCriaturaEnemiga getTipo() { return tipo; }

    // Cambia el nombre del enemigo
    public void setNombre(String nombre) { this.nombre = nombre; }

    // Cambia la salud del enemigo
    public void setSalud(int salud) { this.salud = salud; }

    // Cambia el tipo de enemigo
    public void setTipo(TipoCriaturaEnemiga tipo) { this.tipo = tipo; }

    // Permite que el enemigo ataque al jugador
    // El daño depende del nivel de amenaza del tipo
    public String atacar(PersonajeJugador jugador){
        int dano = tipo.getNivelAmenaza() * 10;
        jugador.recibirDanio(dano);

        return nombre + " (Amenaza: " + tipo.getNivelAmenaza() +
                ") ataca a " + jugador.getNombre() +
                " causando " + dano + " de daño.";
    }

    // El enemigo recibe daño y su salud disminuye
    public void recibirDanio(int cantidad){
        salud -= cantidad;
        if(salud < 0){
            salud = 0;
        }

        System.out.println(nombre + " ha recibido " + cantidad +
                " puntos de daño. Salud restante: " + salud);
    }

    // Muestra los datos completos del enemigo en texto
    public String toString(){
        return "Enemigo: " + nombre +
                "\nTipo: " + tipo.getNombre() +
                "\nNivel de amenaza: " + tipo.getNivelAmenaza() +
                "\nDescripción: " + tipo.getDescripcion() +
                "\nSalud: " + salud;
    }
}
