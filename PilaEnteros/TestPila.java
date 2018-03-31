
/**
 * Write a description of class TestPila here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Random;
public class TestPila{
    public static void main (String Args[]){
        Random rs = new Random();
        PilaEnteros Test = new PilaEnteros(20);
        if(Test.estaVacio()){
            do{
                int aux = rs.nextInt(8)+1;
                System.out.println("Introduciendo [" + aux + "]" + "["+ Test.push(aux) + "]");
            }while(Test.cont()<20);
        }
        if(Test.estaLleno()){
            Test.list();
        }
        System.out.println("Eliminado [" + Test.pop() + "]");
        System.out.println("Eliminado [" + Test.pop() + "]");
        System.out.println("Eliminado [" + Test.pop() + "]");
        System.out.println("Ultimo Valor [" + Test.peek() + "]");
        if(!Test.estaLleno()){
            do{
                int aux = rs.nextInt(8)+1;
                System.out.println("Introduciendo [" + aux + "]" + "["+ Test.push(aux) + "]");
            }while(!Test.estaLleno());
        }
        System.out.println("Ultimo Valor [" + Test.peek() + "]");
        if(Test.estaLleno()){
            Test.list();
        }
            
        
        
        
    }
}
