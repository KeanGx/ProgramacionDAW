
/**
 * Write a description of class ModeloHashFileObject here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;
public class ModeloHashFileObject extends ModeloHashMap{
    static final String Fichero = "producto.csv";
    public ModeloHashFileObject(){
        super();
        LoadFile();
    }
    
    private void LoadFile(){
        File ProductFile = new File(Fichero);
        if(!ProductFile.exists()){
            return;
        }
        HashMap <Integer, Producto> SerHash = new HashMap<Integer, Producto>();
        try{
            FileInputStream FileInput = new FileInputStream(ProductFile);
            ObjectInputStream ObjectInput = new ObjectInputStream(FileInput);
            
            SerHash = (HashMap <Integer, Producto>) ObjectInput.readObject();
            
            try{
                Producto HashProduct = (Producto) ObjectInput.readObject();
                
                while(true){
                    Ser
                }
            }catch(IOException Ex){}
            ObjectInput.close();
            FileInput.close();
        }catch(IOException InOutEx){ 
            InOutEx.printStackTrace();
         }catch(ClassNotFoundException ex ){
           ex.printStackTrace();
        }
    }
    private void SaveFile(HashMap<Integer,Producto>Lista){
        File ProductFile = new File(Fichero);
        if(!ProductFile.exists()){
            return;
        }
        try{
            FileOutputStream FileOut = new FileOutputStream(ProductFile);
            ObjectOutputStream ObjectOut = new ObjectOutputStream(FileOut);
            
            for(Map.Entry Listado: Lista.entrySet()){
                ObjectOut.writeObject(Listado.getValue());
            }
            
            ObjectOut.close();
            FileOut.close();
        }catch(IOException InOutEx){
            InOutEx.printStackTrace();
        }
    }
   
}
