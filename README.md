# Legends of Aether
## Práctica de Programación Orientada a Objetos — Diseño de Componentes para un Videojuego_
_Este proyecto implementa un modelo básico del videojuego ficticio “Legends of Aether”, aplicando los principios fundamentales de Programación Orientada a Objetos (POO). El sistema incluye personajes, criaturas enemigas, objetos recolectables y niveles, todos diseñados mediante clases, encapsulamiento y enumeraciones avanzadas._

## Descripción del Proyecto
_Legends of Aether es un proyecto académico cuyo objetivo es modelar el núcleo de un videojuego de acción y aventura utilizando Programación Orientada a Objetos (POO)._
_Se implementan clases, relaciones, encapsulamiento, abstracción y enumeraciones avanzadas para representar personajes, criaturas, objetos y niveles dentro del mundo del juego._

## Principios de POO Aplicados
### Abstracción
_Las entidades del videojuego fueron diseñadas como clases que representan conceptos reales del contexto del juego._
* Se incluyeron:
* PersonajeJugador
* CriaturaEnemiga
* ObjetoRecolectable
* Nivel

_Cada clase define únicamente las características esenciales del concepto representado y sus acciones principales (por ejemplo, atacar, recolectar objetos, recibir daño)._

## Encapsulamiento
_Todos los atributos se declararon privados, evitando accesos indebidos._
_La modificación controlada se realiza mediante:_
* Métodos get
* Métodos set
* Métodos públicos que representan acciones concretas

_Esto mantiene la integridad y consistencia del sistema._

## Enumeraciones Avanzadas (Enums)
_Se implementaron tres enumeraciones obligatorias:_

###TipoPersonaje
_Incluye:_
* Rol de combate
* Descripción narrativa
_Ejemplo: Mago, Guerrero, Arquero_

###TipoCriatura
_Incluye:_
* Nivel de amenaza
* Comportamiento característico
_Ejemplo: Gólem, Dragón, Slime_

###RarezaObjeto
_Incluye:_
* Probabilidad de aparición
* Valor dentro del juego
_Ejemplo: Común, Raro, Épico, Legendario_

_Cada enum contiene:_
*Campos internos
*Métodos de acceso
*Constructor privado
*Descripciones detalladas

##Relaciones Entre Clases
_El sistema integra interacción entre entidades, simulando un videojuego real:_
* El personaje puede atacar a criaturas enemigas.
* El personaje puede recolectar objetos.
* Los niveles contienen listas de enemigos y objetos.
_Esto refleja cohesión entre componentes y aplicación de lógica de juego._

##Funcionamiento General del Sistema
_Al ejecutar Main.java, el sistema:_
*Crea un personaje con un tipo definido por el enum.
*Genera criaturas enemigas con amenazas distintas.
*Produce objetos de varias rarezas.
*Construye un nivel que contiene todos estos elementos.
*Muestra información en consola y realiza acciones como ataque y recolección.
