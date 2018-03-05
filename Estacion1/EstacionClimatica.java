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
    /**
     * Metodo para añadir datos al array
     * @param medida de la Clase TempHumDia
     * @return boolean
     */
    public boolean addDia (TempHumDia medida){
        System.out.println(medida);
        System.out.println(this.año + "/" + medida.año);
        if (this.año != medida.año) {
            return false;
           
        }
        int posicion = medida.obtenerNumDia();
        mediciones[posicion] = medida;
        nummediciones++;
        return true;
    }
    /**
     * Metodo que elimina datos del array Mediciones
     * @param medida de la clase TempHumDia
     * @return boolean
     */
    public boolean delDia (TempHumDia medida){ 
        if (this.año != medida.año) {
            return false;                      
        }
        int pos = medida.obtenerNumDia();
        if(mediciones[pos].toString().equals(medida.toString())){
            mediciones[pos] = null;
            nummediciones--;
            return true;
        }
        return false;  
    } 
    /**
     * Metodo que lista todas las fechas con datos del array
     */
    public void listarDias(){
        StringBuilder dias = new StringBuilder();
        for(int i=0; i<mediciones.length;i++){
            if (mediciones[i]!=null){
            dias.append(mediciones[i].dia + "/" + mediciones[i].mes 
            + "/" + mediciones[i].año + "\n");
            }
        }
        System.out.print(dias.toString());
        
     
    } 
    
    /**
     * Método auxiliar que me indica si una fecha es correcta
     * @param dia
     * @param mes
     * @param año
     * @return boolean
     */
    static boolean fechaOK (int dia, int mes, int año){
        boolean check = false;
       if (mes >=1 && mes <=12){check = true;}
       else {return false;}
       if(check == true){
           if(dia+TempDia.meses[mes-1]<=TempDia.meses[mes]){
               return true;
            }
            else {
                return false; 
            }
       }
       else {return false;}
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