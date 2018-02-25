/**
 * Implementar un almacén de enteros mediante una tabla de huecos
 * se supone que no puede contener el valor 0 ya que indica posiciones libre.
 *
 * @author Kyril Kean Guirit Pilotin
 * 
 */
public class Almacen1 {

	static private final int LIBRE = 0;
	// Array con los valores almacenados
	private int tvalores[];
	private int valoresAlmacenados = 0;
	
	/**
	 *  Constructores sin parámetros creo una tabla de 10 elementos
	 */
	public Almacen1(){
		this(10);  // Llamo al constructor con parámetros
	}

	/**
	 * @param tamaño El tamaño de la tabla
	 */
	public Almacen1( int tamaño){
		tvalores = new int [tamaño];
		init();
	}
	
	/**
	 *  Pone todas las posiciones a LIBRES
	 */
	public void init (){
		for (int i = 0; i < tvalores.length; i++) {
			tvalores[i] = Almacen1.LIBRE;
		}
		valoresAlmacenados = 0;
	}
	
	/**
	 *  Muestra una cadena con los valores de la tabla
	 * @return contenido 
	 */
	public String valoresAlmacenados (){
		StringBuilder contenido = new StringBuilder();
		for (int i= 0 ; i<tvalores.length; i++) {
			if (tvalores[i] != 0) {
				contenido.append(tvalores[i]);	
			}
		}
		return contenido.toString();
	}
	
	/**
	 *  Devuelve el números de posiciones libres
	 * @return libre Numero de posiciones Libres
	 */
	public int numPosicionesLibres(){
		int libre = 0;
		for (int i= 0 ; i<tvalores.length; i++) {
			if (tvalores[i] == 0) {
				libre++;	
			}
		}
		return libre;
	}
	
	/**
	 * Devuelve el número de posiones ocupadas
	 * @return ocupado Numero de posiciones Ocupadas
	 */
	public int numPosicionesOcupadas(){
		int ocupado = 0;
		for (int i= 0 ; i<tvalores.length; i++) {
			if (tvalores[i] != 0) {
				ocupado++;	
			}
		}
		return ocupado;
	}
	
	/**
	 * Devuelve verdadero o falso si está almacenado el valor en la tabla
	 * @param num El valor indicado en la Class principal TestAlmacen1
	 * @return boolean Devuelve True si el valor indicado se encuentra en la tabla de lo contrario devuelve False.
	 */
	public boolean estaValor ( int num){
		for (int i= 0 ; i<tvalores.length; i++) {
			if (tvalores[i] == num) {
				return true;	
			}
		}
	return false;
	}
	
	
	/**
	 * Almacena el valor el la tabla, devuelve false si no puede almacenarlo
	 *
	 * @param num El valor indicado en la Class principal TestAlmacen1
	 * @return boolean Devuelve True si el valor indicado se ha conseguido introducir en la tabla de lo contrario devuelve False.
	 */
	public boolean ponValor (int num){
		for (int i= 0 ; i<tvalores.length; i++) {
			if (tvalores[i] == 0) {
				tvalores[i] = num;
				return true;
			}
			
		}
		
	return false;
	}
	
	/**
	 *  Elimina el elemento de la tabla, si no esta devuelve false
	 * @param num El valor indicado en la Class principal TestAlmacen1
	 * @return boolean Devuelve True si se ha conseguido eliminar el Valor de lo contrario devuelve False.
	 */
	public boolean sacarValor (int num){
		Boolean check = false; 
		for (int i= 0 ; i<tvalores.length; i++) {
			if (tvalores[i] == num) {
				tvalores[i] = 0;
				check = true;
			}
		}
		if (check == false) {
			return false;
		}
		else {
			return true;
		}
	
	}
      // Indica si el almacén esta lleno
	public boolean estaLleno (){
		for (int i= 0 ; i<tvalores.length; i++) {
			if (tvalores[i] == 0) {
				return false;
			}
		}
	return true;
	}
}


