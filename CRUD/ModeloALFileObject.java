
/**
 * Write a description of class ModeloALFileObject here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.File;
import java.util.ArrayList;
public class ModeloALFileObject extends ModeloArrayList{
    // instance variables - replace the example below with your own
    static final String nombrefichero = "producto.csv";

    /**
     * Constructor for objects of class ModeloALFileObject
     */
    public ModeloALFileObject(){
       super();
       LoadFile();
    }

    private void LoadFile(){
        File ProductFile = new File(nombrefichero);
        if(!ProductFile.exists()){
            return;
        }
        try{
            FileInputStream FileInput = new FileInputStream(ProductFile);
            ObjectInputStream ObjectInput = new ObjectInputStream(FileInput);
            
            try{
                Producto pro = (Producto) ObjectInput.readObject();
                while(true){
                    lista.add(pro);
                    pro = (Producto) ObjectInput.readObject();
                }
            }catch(IOException Ex){}
            ObjectInput.close();
            FileInput.close();
        }catch(IOException InputObjectException){
            InputObjectException.printStackTrace();
          }catch(ClassNotFoundException ex){
                ex.printStackTrace();
            }  
    }
    
    private void SaveFile(){
        File ProductFile = new File(nombrefichero);
        if(!ProductFile.exists()){
            return;
        }
        try{
            FileOutputStream FileOut = new FileOutputStream(ProductFile);
            ObjectOutputStream ObjectOut = new ObjectOutputStream(FileOut);
            
            for(Producto pro: lista){
                ObjectOut.writeObject(pro);
            }
            
            ObjectOut.close();
            FileOut.close();
        }catch(IOException InOutException){
            InOutException.printStackTrace();
        }   
    }
    
    public boolean insertarProducto (Producto p){
        boolean resu = super.insertarProducto(p);
        if(resu){
            SaveFile();
        }
        return resu;
    }
    
    public boolean borrarProducto(int Codigo){
        boolean resu = super.borrarProducto(Codigo);
        if(resu){
            SaveFile();
        }
        return resu;
    }
    
    public boolean modificarProducto(Producto nuevo){
        boolean resu = super.modificarProducto(nuevo);
        if(resu){
            SaveFile();
        }
        return resu;
    }
}
