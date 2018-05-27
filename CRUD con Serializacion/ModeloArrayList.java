
/**
 * Implementa la parte de Modelo de Datow
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;
public class ModeloArrayList extends ModeloAbs{
    protected ArrayList <Producto> lista;
    
    public ModeloArrayList(){
       lista=new ArrayList <Producto>();
    }

    // Implementar los metodos abstractos de ModeloAbs
        
    public boolean insertarProducto ( Producto p){
        for(int i=0;i<lista.size();i++){
            Producto aux = lista.get(i);
            if(aux.getCodigo() == p.getCodigo()){
                return false;
            }
        }
        if(p.getStock()>0 && p.getPrecio()>0){
            lista.add(p);
            return true;
        }
      return false;    
    }
 
    public boolean borrarProducto ( int codigo ){
      Scanner sc = new Scanner(System.in);
      for(int i=0;i<lista.size();i++){
            if(lista.get(i).getCodigo() == codigo){
                lista.get(i);
                System.out.println("Desea eliminar el producto? [S/N]");
                String confirmacion = sc.next();
                if(confirmacion.charAt(0) == 'S' || confirmacion.charAt(0) == 's'){
                    lista.remove(i);
                    return true;
                }
            }
      }
      return false;
    }
    
    public Producto buscarProducto ( int codigo) {
        for(int i=0;i<lista.size();i++){
            Producto aux = lista.get(i);
            if(aux.getCodigo() == codigo){
                return aux;
            }
      }
      return null;
    }
    
    public void listarProductos (){
      for(int i=0;i<lista.size();i++){
            System.out.println(lista.get(i));
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
       Producto aux = buscarProducto(nuevo.getCodigo());
       if(aux != null){
           lista.set(lista.indexOf(aux), nuevo);
           return true;
        }
       else{
           return false;
        }
    }
    
 
}    
