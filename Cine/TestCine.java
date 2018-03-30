
/**
 * Write a description of class TestCine here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestCine{
    public static void main (String argv[]){
        Pelicula InfinityWar = new Pelicula("Avengers: Infinity War", 150, 15, listGenero.Aventuras );
        
        SalaCine Kinepolis = new SalaCine(8,8, InfinityWar,12);
        
        Kinepolis.venderAsiento(new Espectador("Pablo", 19, 50),InfinityWar);
        Kinepolis.venderAsiento(new Espectador("Gonzalo", 18, 20),InfinityWar);
        Kinepolis.venderAsiento(new Espectador("Sergio", 20, 21),InfinityWar);
        Kinepolis.venderAsiento(new Espectador("Alex", 18, 30),InfinityWar);
        Kinepolis.venderAsiento(new Espectador("Pablo", 19, 50),InfinityWar);
        Kinepolis.venderAsiento(new Espectador("Luis", 23, 40),InfinityWar);
        Kinepolis.venderAsiento(new Espectador("Guille", 18, 10),InfinityWar);
        Kinepolis.venderAsiento(new Espectador("Silvia", 23, 8),InfinityWar);
        Kinepolis.venderAsiento(new Espectador("Daniel", 23, 30),InfinityWar);
        Kinepolis.venderAsiento(new Espectador("Javier", 13, 12),InfinityWar);
        Kinepolis.venderAsiento(new Espectador("Jose", 19, 50),InfinityWar);
        Kinepolis.venderAsiento(new Espectador("Elena", 19, 50),InfinityWar);
        
        Kinepolis.MostrarSala();
        System.out.println("--------------------------------------");
        System.out.println("          INFORMACION SESION          ");
        System.out.println("--------------------------------------");
        System.out.println("Pelicula: [" + InfinityWar.titulo + "]");
        System.out.println("Nº de Espectadores: "+ Kinepolis.cantEspectadores());
        System.out.println("Recaudacion: " + Kinepolis.recaudacion());
        Kinepolis.informeSala();
    }
 

    
}
