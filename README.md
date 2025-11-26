# Legends of Aether
## Práctica de Programación Orientada a Objetos — Diseño de Componentes para un Videojuego
_Este proyecto implementa un modelo básico del videojuego ficticio “Legends of Aether”, aplicando los principios fundamentales de Programación Orientada a Objetos (POO). El sistema incluye personajes, criaturas enemigas, objetos recolectables y niveles, todos diseñados mediante clases, encapsulamiento y enumeraciones avanzadas.

## Descripción del Proyecto
_Legends of Aether es un proyecto académico cuyo objetivo es modelar el núcleo de un videojuego de acción y aventura utilizando Programación Orientada a Objetos (POO).
_Se implementan clases, relaciones, encapsulamiento, abstracción y enumeraciones avanzadas para representar personajes, criaturas, objetos y niveles dentro del mundo del juego.

## Principios de POO Aplicados
### Abstracción
_Las entidades del videojuego fueron diseñadas como clases que representan conceptos reales del contexto del juego.
*Se incluyeron:
*PersonajeJugador
*CriaturaEnemiga
*ObjetoRecolectable
*Nivel

_Cada clase define únicamente las características esenciales del concepto representado y sus acciones principales (por ejemplo, atacar, recolectar objetos, recibir daño).

## Encapsulamiento
_Todos los atributos se declararon privados, evitando accesos indebidos.
_La modificación controlada se realiza mediante:
*Métodos get
*Métodos set
*Métodos públicos que representan acciones concretas

Esto mantiene la integridad y consistencia del sistema.

## Enumeraciones Avanzadas (Enums)
_Se implementaron tres enumeraciones obligatorias:

###TipoPersonaje
_Incluye:
*Rol de combate
*Descripción narrativa
_Ejemplo: Mago, Guerrero, Arquero

###TipoCriatura
_Incluye:
*Nivel de amenaza
*Comportamiento característico
_Ejemplo: Gólem, Dragón, Slime

###RarezaObjeto
_Incluye:
*Probabilidad de aparición
*Valor dentro del juego
_Ejemplo: Común, Raro, Épico, Legendario

_Cada enum contiene:
*Campos internos
*Métodos de acceso
*Constructor privado
*Descripciones detalladas

##Relaciones Entre Clases
_El sistema integra interacción entre entidades, simulando un videojuego real:
*El personaje puede atacar a criaturas enemigas.
*El personaje puede recolectar objetos.
*Los niveles contienen listas de enemigos y objetos.
_Esto refleja cohesión entre componentes y aplicación de lógica de juego.

##Funcionamiento General del Sistema
_Al ejecutar Main.java, el sistema:
*Crea un personaje con un tipo definido por el enum.
*Genera criaturas enemigas con amenazas distintas.
*Produce objetos de varias rarezas.
*Construye un nivel que contiene todos estos elementos.
*Muestra información en consola y realiza acciones como ataque y recolección.
