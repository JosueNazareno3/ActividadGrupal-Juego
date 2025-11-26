/**
 * Clase principal del videojuego.
 * Aquí se crean los personajes, enemigos, niveles y se simula
 * la exploración del mundo y un pequeño combate.
 */

public class Main {
    public static void main(String[] args) {

        // -----------------------------
        // 1. Crear personaje jugador
        // -----------------------------
        PersonajeJugador jugador = new PersonajeJugador(
                "Zephyrion",
                5,
                120,
                TipoPersonaje.MAGO
        );

        System.out.println("=== PERSONAJE JUGADOR ===");
        System.out.println(jugador);
        System.out.println();


        // -----------------------------
        // 2. Crear enemigos
        // -----------------------------
        CriaturaEnemiga dragon = new CriaturaEnemiga(
                "Fangor",
                100,
                TipoCriaturaEnemiga.DRAGON
        );

        CriaturaEnemiga goblin = new CriaturaEnemiga(
                "Ruk",
                40,
                TipoCriaturaEnemiga.GOBLIN
        );


        // -----------------------------
        // 3. Crear nivel
        // -----------------------------
        Nivel nivelBosque = new Nivel(
                "El Bosque de los Olvidos",
                "Una zona oscura llena de criaturas peligrosas.",
                3
        );


        // -----------------------------
        // 4. Crear objetos del nivel
        // -----------------------------
        ObjetoRecolectable pocion = new ObjetoRecolectable(
                "Poción de Vida",
                "+30 Salud",
                RarezaObjeto.COMUN
        );

        ObjetoRecolectable gema = new ObjetoRecolectable(
                "Gema Arcana",
                "Aumenta el poder mágico del usuario.",
                RarezaObjeto.EPICO
        );

        nivelBosque.agregarObjeto(pocion);
        nivelBosque.agregarObjeto(gema);


        // -----------------------------
        // 5. Mostrar nivel y objetos
        // -----------------------------
        System.out.println("=== EXPLORANDO EL NIVEL ===");
        System.out.println(nivelBosque.explorar());
        nivelBosque.mostrarObjetos();
        System.out.println();


        // -----------------------------
        // 6. Recolección de objetos
        // -----------------------------
        System.out.println("=== RECOLECCIÓN DE OBJETOS ===");
        System.out.println(pocion.recolectar());
        System.out.println(gema.recolectar());
        System.out.println();


        // -----------------------------
        // 7. Combate
        // -----------------------------
        System.out.println("=== COMBATE ===");

        System.out.println(jugador.atacar(dragon.getNombre()));
        jugador.atacarEnemigo(dragon);

        System.out.println();

        System.out.println(dragon.atacar(jugador));
        System.out.println(goblin.atacar(jugador));

        System.out.println();


        // -----------------------------
        // 8. Estado final
        // -----------------------------
        System.out.println("=== ESTADO FINAL ===");
        System.out.println("Salud jugador: " + jugador.getSalud());
        System.out.println("Salud Dragón: " + dragon.getSalud());
        System.out.println("Salud Goblin: " + goblin.getSalud());

        System.out.println("\n--- FIN DE LA SIMULACIÓN ---");
    }
}

