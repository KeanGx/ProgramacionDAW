
/**
 * Write a description of class ModeloHaspMap here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class ModeloHashMap extends ModeloAbs{
    private HashMap <Integer,Producto> lista;
    
    public ModeloHashMap()
    {
       lista=new HashMap  <Integer,Producto>();
    }

    public boolean insertarProducto ( Producto p){
        int codigo = p.getCodigo(); 
        if(lista.containsKey(codigo)){
            return false;
        }
        else if(p.getStock()>0 && p.getPrecio()>0){
            lista.put(codigo, p);
            return true;
        }
      return false;    
    }
 
    public boolean borrarProducto ( int codigo ){
      Scanner sc = new Scanner(System.in);
      System.out.println(buscarProducto(codigo));
      System.out.println("Desea eliminar el producto? [S/N]");
      String confirmacion = sc.next();
      if(confirmacion.charAt(0) == 'S' || confirmacion.charAt(0) == 's'){
          lista.remove(codigo);
          return true;
      }
      return false;
    }
      
    
    public Producto buscarProducto ( int codigo) {
      for(Map.Entry<Integer, Producto> lista:lista.entrySet()){
          if(lista.getKey().equals(codigo)){
                return lista.getValue();
           }
       }
      return null;
    }
    
    public void listarProductos (){
      for(Map.Entry<Integer, Producto> lista:lista.entrySet()){
            System.out.println(lista.getValue());
      }
    }
    
    public void listarProductosStock (){
      for(int i=0;i<lista.size();i++){
          Producto aux = lista.get(i);
          if(aux.getStock()<aux.getStock_min()){
              System.out.println(lista.get(i));
            }
        }
    }
    
    public boolean modificarProducto (Producto nuevo){
       int codigo = nuevo.getCodigo(); 
       Producto aux = buscarProducto(codigo);  
       if(aux != null){
           lista.remove(codigo);
           lista.put(codigo, nuevo);
           return true;
        }
       else{
           return false;
        }
    }
    
}
