
/**
 * Write a description of class PruebaContraseña here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class PruebaContraseña{
    public static void main (String Args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Tamaño del array");
        Password listPass[] = new Password[sc.nextInt()];
        Boolean listFort[] = new Boolean[listPass.length];
        for(int i=0; i<listPass.length;i++){
            System.out.println("Que opcion deseas?");
            System.out.println("1. Automatico");
            System.out.println("2. Manual");
            int opt = 0;
            do{
                opt = sc.nextInt(3);
            }while(opt >2 || opt < 1);
            switch(opt){
            case 1:
                System.out.println("Indica el tamaño de la contraseña");
                listPass[i] = new Password(sc.nextInt());
                break;
            case 2:
                System.out.println("Indica la contraseña");
                listPass[i] = new Password(sc.next());
                break;
            }
            listFort[i] = listPass[i].esFuerte();
        }
        System.out.println();
        System.out.println("-----------------");
        System.out.println("VALOR      FUERTE");
        System.out.println();
        for(int j=0; j<listPass.length; j++){
            System.out.println( listPass[j].getContraseña() + "      " +listFort[j]);
        }
    }
}
