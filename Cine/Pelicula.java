
/**
 * Write a description of class Pelicula here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pelicula
{
    // instance variables - replace the example below with your own
    protected String titulo;
    protected int duracion;
    protected int minedad;
    protected listGenero genero;

    /**
     * Constructor for objects of class Pelicula
     */
    public Pelicula(String titulo, int duracion, int minedad, listGenero genero){
        this.titulo = titulo;
        this.duracion = duracion;
        this.minedad = minedad;
        this.genero = genero;
    }

    public String toString(){
        return "Titulo ["+ titulo + "], Duracion [" + duracion + "], Calificacion [" 
        + minedad +"], Genero [" + genero +"]";
    }
}
