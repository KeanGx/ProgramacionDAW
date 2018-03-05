// Programa principal de pruebas 
/* 
 * En el programa principal crea una estación, introduce cinco días pedidas por  teclado (si la fecha no es correcta te la tiene que volver a pedir) y lista esos días. 
Luego borra dos (pedida por teclado y validándola de nuevo) y los vuelve a listar. 
 * 
 */
public class TestEstacionClimatica {
    
public static void main (String [] argv ){ 
        
        EstacionClimatica estacion  = new EstacionClimatica("Burgos",2017); 
       

        System.out.println(" Introducir 5 medidas :"); 
        

        for (int i=0; i< 5; i++){ 
             TempHumDia medicion = estacion.leerMedida(); 
             estacion.addDia(medicion); 
        } 
        
       estacion.listarDias(); 
        
       System.out.println("Introduca 2 medidas a Borrar:"); 
       TempHumDia medida1 = estacion.leerMedida(); 
       TempHumDia medida2 = estacion.leerMedida(); 
       
       estacion.delDia(medida1);
       estacion.delDia(medida2);
       estacion.listarDias();   
             
    }            
        
 }