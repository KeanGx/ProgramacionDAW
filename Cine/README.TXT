------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE: SALA CINE
PURPOSE OF PROJECT: REPASO 2º EVALUACION
VERSION or DATE: 1.0 
HOW TO START THIS PROJECT:
AUTHORS: KYRIL KEAN

Se solicita hacer la gestión de un cine que dispone solo de una sala. Los atributos de Cine:
  Número de filas y número de columnas que especifica el tamaño de la sala  Filas x Columna
 
Tabla de asientos que pues estar libres (null) o tener asignado un espectadores

Los posiciones de los asientos será identificadas  por una letra (columna) y un número (fila), la fila 1 empieza al final de la matriz como se muestra en la tabla. También deberemos saber si está ocupado o no el asiento. Por ejemplo en una sala de 8 filas y 8 columnas la numeración

    8 A 8 B 8 C 8 D 8 E 8 F 8 G 8 H
    7 A 7 B 7 C 7 D 7 E 7 F 7 G 7 H
    6 A 6 B 6 C 6 D 6 E 6 F 6 G 6 H
    5 A 5 B 5 C 5 D 5 E 5 F 5 G 5 H 
    4 A 4 B 4 C 4 D 4 E 4 F 4 G 4 H
    3 A 3 B 3 C 3 D 3 E 3 F 3 G 3 H 
    2 A 2 B 2 C 2 D 2 E 2 F 2 G 2 H 
    1 A 1 B 1 C 1 D 1 E 1 F 1 G 1 H 

 Película que se emite
 Precio

Métodos
 Contructor   Cine ( filas, columnas, película, precio)
 String venderAsiento ( Espectador E)
    Asigna al espectador aleatoriamente en una posición libre de la sala
    Descuenta el precio de la película al dinero que posee el espectador
    Devuelve la cadena con la posición:  Ej- “Fila 5 asiento E”
    Devuelve NULL y imprime un mensaje de error si no hay asientos libres, si el espectador no posee dinero suficiente o si no tiene la edad mínima asignada a la película

void InformeSala()
  Muestra un listado de los espectadores y en que posiciones se sientan

int recaudación ()
   Devuelve el dinero recaudado por la película en función de los asientos ocupados.

La Película tienen los atributos  título, duración(minutos), edad mínima, genero.
El genero será un enumerado con los valores : drama, comedia, musical, aventuras, terror,  infantil.

El Espectador, nos interesa saber su nombre, edad y el dinero que tiene.



Realizaremos una pequeña simulación (TestCine), en el que generaremos muchos espectadores y les venderemos asientos
Solo se podrá sentar si tienen el suficiente dinero, hay espacio libre y tiene edad para ver la película, en caso de que el asiento este ocupado le buscamos uno libre.
Al final me tiene que mostrar donde están situados los espectadores y cual ha sido la recaudación mediante el método informeSala
La posición de los espectadores se muestra generado el siguiente informe.

      A B C D E F G H I
    8
    7           X X
    6 X X
    5     X X
    4
    3 X X X X
    2             X X X
    1

Película: Star wars episodio 572
N.º de espectadores:   13
Recaudación:           65  
Lista de espectadores
------------------------
Nombre            Asiento
Pepe Pérez        2G
Silvia Pérez      2H
