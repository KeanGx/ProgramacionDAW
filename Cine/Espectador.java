
/**
 * Write a description of class Espectador here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Espectador
{
    // instance variables - replace the example below with your own
    protected static int id = 0000;
    protected String nombre;
    protected int edad;
    protected int cartera;

    /** 
     * Constructor for objects of class Espectador
     */
    public Espectador(String nombre, int edad, int cartera)
    {
        id = id++;
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.cartera = cartera;
    }

    public String toString(){
        return "Cliente ["+ id + "], Nombre [" + nombre + "], Edad [" 
        + edad +"], Dinero [" + cartera +"]";
    }
}
