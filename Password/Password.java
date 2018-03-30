
/**
 * Write a description of class Password here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Random;
public class Password{
    protected int longitud = 8;
    protected String Contraseña;
    public Password(){
        this.longitud = longitud;
        this.Contraseña = Contraseña;
    }
    public Password(int longitud){
        
        this.longitud = longitud;
        this.Contraseña = generarPassword(longitud);
    }
    public Password(String Contraseña){
        this.longitud = Contraseña.length();
        this.Contraseña = Contraseña;
    }
    
    public boolean esFuerte(){
        
        if(Contraseña.length()>=8){
            for(int i=0; i<Contraseña.length(); i++){
                int ascii = (int) Contraseña.charAt(i);
                if(ascii >= 65 && ascii <=90){
                    for(int j=0; j<Contraseña.length(); j++){
                        ascii = (int) Contraseña.charAt(j);
                        if(ascii >= 97 && ascii <=122){
                            for(int x=0; x<Contraseña.length(); x++){
                                char letra = Contraseña.charAt(x);
                                if(Character.isDigit(letra)){
                                    return true;
                                }  
                            }
                            return false;
                        }
                    }
                    return false;
                }
            }
            return false;
        }
        return false;
    }
    
    public String generarPassword(int longitud){
        Random rs = new Random();
        StringBuilder Pass = new StringBuilder();
            do{
                int opt = rs.nextInt(2);
                char aux;
                switch(opt){
                    case 0:
                        aux = (char)(rs.nextInt(26)+'a'); 
                        Pass.append(aux);
                    case 1:
                        aux = (char)(rs.nextInt(26)+'A'); 
                        Pass.append(aux);
                    case 2:
                        aux = (char)(rs.nextInt(9)+48); 
                        Pass.append(aux);
                        break;
                }
            }while(Pass.length()<longitud);
        return Pass.toString();
    } 
    
    public String toString(){
        return Contraseña + " " + longitud;
    }
    
    public String getContraseña(){
        return this.Contraseña;
    }
    
    public int getLongitud(){
        return this.longitud;
    }
}
