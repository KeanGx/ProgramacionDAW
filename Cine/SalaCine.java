
/**
 * Write a description of class salaCine here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Random;
public class SalaCine{
    private Espectador sala[][];
    protected String pelicula;
    private int precio;
    
    public SalaCine(int x,int y, Pelicula P, int precio){
        this.sala = new Espectador[x+1][y+1];
        this.pelicula = P.toString();
        this.precio = precio;
        //señalesSala();
    }
    
    /*public void señalesSala() {
        for(int x=9;x>=sala.length;x--){
            for(int y=0; y<sala[0].length;y++){
                if(x==9 && y==0){
                    sala[x][y] = 35;
                }
                else if (x==9){
                    sala[x][y] = 64+y;
                }
                else if (y==0){
                    sala[x][y] = x;
                }
            }
        }
    }
    */
    
    public String venderAsiento(Espectador E, Pelicula P){
        Random num = new Random();
        int x, y;
        String error;
        if (salaLlena()){
            error = "["+ E.nombre +"] SALA COMPLETA! No quedan asientos libres...";
            info(error);
            return null;
        }
        if (E.cartera < precio){
            error = "["+ E.nombre +"] FONDOS INSUFICIENTES! No tienes suficiente dinero para pagar...";
            info(error);
            return null;
        }
        if (E.edad < P.minedad){
            error = "["+ E.nombre +"] MENOR DE LA EDAD RECOMENDADA! No alcanza la edad minima para visualizar la pelicula...";
            info(error);
            return null;
        }
       
        do {
            x = num.nextInt(sala.length-1);
            y = num.nextInt(sala[x].length-1)+1;
        } while (sala[x][y] != null);
        sala[x][y] = E;
        E.cartera -= precio;
        char aux = (char)(y+65);
        return "Fila [" + x + "] Asiento [" + aux + "]";
    }
    
    public boolean salaLlena(){
       for(int x=0; x<sala.length-1; x++){
            for(int y=1; y<sala[x].length;y++){
                if(sala[x][y] == null) return false;
            }
       } 
       return true;
    }
    
    public void informeSala(){
        System.out.println("----------------------------------------------------------");
        System.out.println("                  LISTADO DE ESPECTADORES                 ");
        System.out.println("----------------------------------------------------------");
        System.out.println("       Asiento     Datos del Espectador        No. Cliente");
        System.out.println("       -------     --------------------        -----------");
        for(int x=0; x<sala.length-1; x++){
            for(int y=1; y<sala[x].length;y++){
                if (sala[x][y] != null){
                    char aux = (char)(y+65);
                    /*System.out.println("Asiento [" + (x+1) + aux + "]" +
                    " Espectador <" + sala[x][y] + ">");*/
                    System.out.println("         "+(x+1)+ "" +aux + "         " 
                    + sala[x][y].nombre + "                         ["+ sala[x][y].id + "]");
                }
            }
        }
    }
    
    public void MostrarSala(){
        System.out.println();
        System.out.println("------------------------------------------");
        System.out.println("                   SALA                   ");
        System.out.println("------------------------------------------");
        for(int x=sala.length-1;x>=0;x--){
            for(int y=0;y<sala[x].length;y++){
                char aux = (char) (y+64);
               if(x==sala.length-1 && y==0){
                   System.out.print("             #");
               }
               else if (x==sala.length-1){
                   System.out.print(aux);
               }
               else if (y==0){
                   System.out.print("             "+ (x+1));
               }
               else if (sala[x][y]!=null){
                    System.out.print("X");
               }
               else {System.out.print(" ");}
               System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    public int cantEspectadores(){
        int cont = 0;
        for(int x=0; x<sala.length; x++){
            for(int y=0; y<sala[x].length;y++){
                if (sala[x][y] != null){
                    cont++;
                }
            }
        }
        return cont;
    }
    
    public int recaudacion(){
        return cantEspectadores()*precio;
    }
    
    public void info( String error){
        System.err.println(error);
    }
    
    
    
}
    
