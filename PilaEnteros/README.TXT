------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE: PILA ENTEROS
PURPOSE OF PROJECT: REPASO 2º EVALUACION
VERSION or DATE: 1.0
HOW TO START THIS PROJECT:
AUTHORS: KYRIL KEAN

Crear una clase PilaEnteros que implemente una pila ( LIFO Último en entrar es el primero en salir)  de números enteros. Para la implementación se utilizará un array de enteros de tamaño fijo que se define cuando se crea el objeto, y un contador que me indica el número de valores introducidos y la posición del siguiente valor a almacenar.

La clase tendrá los siguientes métodos:
•	PilaEnteros (int tamaño) Crea un pila fijando el tamaño máximo.
•	push(int valor) Introduce un entero en la lista. Devuelve verdadero si cabe o falso si la tabla está llena.
•	pop()  Extrae un entero (el último que se ha introducido) de la lista y lo devuelve de la lista, si no hay ningún número devuelve -1;
•	peek() Devuelve el último entero introducido pero sin eliminarlo o -1 si no hay ningún número almacenado.
•	estaLleno() Devuelve verdadero si la capacidad array está completo.
•	estaVacio() Devuelve verdadero si la pila está vacía.
Crea un programa principal que utilice la clase anterior o probar con el Bluej el funcionamiento de la clase.
Ejemplo si creamos una pila  PilaEnteros(5)
  int valores [] → {0,0,0,0,0}
  contador = 0;
y llamamos a los métodos push(5) y push (6)
  valores = {5,6,0,0,0}  y contador = 2
Si luego llamamos pop(); → devolvera 6, si luego hacemos push(7); push(4) la tabla se quedara con lo valores:
  valores = {5,7,4,0,0} y contador = 3
peek() → me devolvería 4 y estaLleno y estaVacio devolverían false.
