// IMPLEMENTACIÓN PARCIAL DE CLASE EstacionClimática
import java.util.Scanner; 

public class EstacionClimatica 
{ 
    // instance variables - replace the example below with your own 
    private String nombre; 
    private int año; 
    private TempHumDia mediciones[];  // Tabla de mediciones 
    private int nummediciones;      // Número de mediciones almacenadas 
    
    /** 
     * Constructor for objects of class EstacionClimatica 
     */ 
    public EstacionClimatica() 
    { 
         this.nombre = ""; 
         this.año = 2000;  
         mediciones = new TempHumDia[366];  // Por si el año es bisiesto.  
         nummediciones = 0; 
    } 
    
    public EstacionClimatica(String nombre, int año) 
    { 
         this(); // Llamo al constructor por defecto 
         this.nombre = nombre; 
         this.año = año;
    } 

    public boolean addDia (TempHumDia medida){ 
        if (this.año != medida.año) {
            return false;                      
        }
        int posicion = medida.obtenerNumDia();
        mediciones[posicion] = medida;
        System.out.println(medida);
        return true;
    }
    
    public boolean delDia (TempHumDia medida){ 
        if (this.año != medida.año) {
            return false;                      
        }
        medida.eliminarDia();
        return true;  
    } 
    
    public void listarDias(){ 
        mediciones.toString();
        
     
    } 
    
    // Método auxiliar que me indica si una fecha es correcta 
    static boolean fechaOK (int dia, int mes, int año){ 
        
       return true; 
    
    } 
    
    
    public static TempHumDia leerMedida() { 

         Scanner leer = new Scanner(System.in); 
         int dia,mes,año,tempmax,tempmin,hummax,hummin; 
         TempHumDia medicion = null; 
         
        boolean error = true;
        
   
        do { 
        System.out.println("Día:"); dia = leer.nextInt(); 
        System.out.println("Mes:");  mes = leer.nextInt(); 
        System.out.println("Año:");  año = leer.nextInt(); 
  
        if ( fechaOK( dia,mes,año) ) { 
             System.out.println (" Tº Máxima:"); tempmax = leer.nextInt(); 
             System.out.println (" Tº Mínima:"); tempmin = leer.nextInt(); 
             System.out.println (" Hº Máxima:"); hummax = leer.nextInt(); 
             System.out.println (" Hº Mínima:"); hummin = leer.nextInt(); 
             medicion = new TempHumDia (dia,mes,año, tempmax, tempmin, hummax, hummin); 
             error = false;
            }
        else 
        { 
            System.out.println(" Fecha érronea"); 
        } 
    
    } while (error); 
    
    leer.close(); 
    return medicion; 
}
} 