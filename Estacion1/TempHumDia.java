/**
 * Clase TempHumDia que hereda atributos de TempDia
 */
public class TempHumDia extends TempDia {

    protected int maxHum, minHum, media;
    /**
     * 
     * Solicita informacion sobre la Humedad del dia
     * 
     * @param dia
     * @param mes
     * @param año
     * @param maxTemp
     * @param minTemp
     * @param maxHum
     * @param minHum
     * 
     */
    public TempHumDia (int dia, int mes, int año,int maxTemp, int minTemp, int maxHum, int minHum ) {
        super(dia, mes, año, maxTemp, minTemp);
        this.maxHum = maxHum;
        this.minHum = minHum;
        this.media = ((maxHum+minHum)/2);
    }
    
    public String toString() {
        return super.toString() + " con Humedad Maxima: " 
        + maxHum + " y Minima: " + minHum+ " Media humedad: " 
        + media;
    }
}
