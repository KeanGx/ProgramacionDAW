
/**
 * Write a description of class PilaEnteros here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PilaEnteros{
    private int ArPila[];
    
    public PilaEnteros(int tamaño){
       ArPila = new int[tamaño];
    }
    
    public boolean push(int valor){
        for(int i=0; i<ArPila.length;i++){
            if(ArPila[i] == 0){
                ArPila[i] = valor;
                return true;
            }
        }
        return false;
    }
    
    public int pop(){
        int aux = -1;
        for(int i=ArPila.length-1; i>=0;i--){
            if(ArPila[i] != 0){
                aux = ArPila[i];
                ArPila[i] = 0;
                return aux;
            }
        }
        return aux;
    }
    
    public int peek(){
        int aux = -1;
        for(int i=ArPila.length-1; i>=0;i--){
            if(ArPila[i] != 0){
                return ArPila[i];
                
            }
        }
        return aux;
    }
    
    public int cont(){
        int cont = 0;
        for(int i=0; i<ArPila.length;i++){
            if(ArPila[i]!=0){
                cont++;
            }
        }
        return cont;
    }
    
    public void list(){
        System.out.println("      ------------------ LISTA ------------------ ");
        System.out.print("      ");
        for(int i=0; i<ArPila.length;i++){
            System.out.print(ArPila[i]);
            System.out.print(" ");
        }
        System.out.println();
        System.out.println("      ------------------------------------------- ");
    }
    
    public boolean estaLleno(){
        for(int i=0; i<ArPila.length;i++){
            if(ArPila[i]==0){
                return false;
            }
        }
        return true;
    }
    
    public boolean estaVacio(){
        for(int i=0; i<ArPila.length;i++){
            if(ArPila[i]!=0){
                return false;
            }
        }
        return true;
    }

  
}
