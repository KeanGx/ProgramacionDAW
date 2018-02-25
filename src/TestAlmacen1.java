// Clase de prueba COMPLETAR EL CÓDIGO DEL MÉTODO procesar Opción
/**
 * TestAlmacen es la Class principal que ejecutara el programa de Almacen donde
 * se guardaran valores en una Tabla de numeros sobre el cual podremos realizar una
 * serie de funciones.
 *
 * @author Kyril Kean Guirit Pilotin
 * @version 1.0
 * 
 */
import java.util.Scanner;

public class TestAlmacen1 {

	static public void main(String[] argv) {

		Almacen1 prueba = new Almacen1();
		Scanner sc = new Scanner(System.in);
		int opcion;
		int valor = 0;

		mostrarMenu();
		opcion = sc.nextInt();
		while (opcion != 0) {
			if(opcion >= 2 && opcion <=4) {
				System.out.print(" Valor = ");
				valor = sc.nextInt();
			}
			procesarOpcion(opcion, valor, prueba);
			mostrarMenu();
			opcion = sc.nextInt();
		}
		sc.close();
		
	}
	/**
	 * Nos muestra un menu con las diferentes funciones que podemos ejecutar sobre la tabla.
	 */
	static void mostrarMenu() {
		System.out.println("--- MENÚ DE  CONTROL DEL ALMACÉN -----");
		System.out.println(" 1.- Mostrar contenido del Almacén");
		System.out.println(" 2.- Poner un Valor  ");
		System.out.println(" 3.- Buscar un Valor ");
		System.out.println(" 4.- Borrar un Valor");
		System.out.println(" 5.- Contar posiciones ocupadas.");
		System.out.println(" 6.- Contar posiciones libres.");
		System.out.println(" 0.- Terminar");
            System.out.print(" Introduzca una opción:[1-6]:");
	}

	/**
	 * Procesa la opción introducida operando sobre el objeto Almacen1
	 * 
	 * @param opcion Indica la funcion que queremos ejecutar
	 * @param valor	Indica el valor que queremos introducir, eliminar o buscar en la tabla-
	 * @param parAlmacen Indica sobre que tabla se ejecutaran las funciones.
	 */
	static void procesarOpcion(int opcion,int valor, Almacen1 parAlmacen) {
		
		switch (opcion) {
		case 1:
			System.out.println(" Contenido del Almacen = " +                  parAlmacen.valoresAlmacenados());
				break;
		case 2:
			System.out.println(" Poner un Valor = " +                  parAlmacen.ponValor(valor));
				break;
		case 3:
			System.out.println(" Buscar un Valor = " +                  parAlmacen.estaValor(valor));
				break;
		case 4:
			System.out.println(" Borrar un Valor = " +                  parAlmacen.sacarValor(valor));
				break;
		case 5:
			System.out.println(" Posiciones Ocupadas = " +                  parAlmacen.numPosicionesOcupadas());
				break;
		case 6:
			System.out.println(" Posiciones libres = " +                  parAlmacen.numPosicionesLibres());
				break;
		default:
				break;
		}

	}

}
