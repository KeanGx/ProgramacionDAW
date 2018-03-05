
public class TempHumDia extends TempDia {

    protected int maxHum, minHum, media;
    
    public TempHumDia (int maxHum, int minHum, int minTemp, int maxTemp, int dia, int mes, int año) {
        super(minTemp,maxTemp,dia, mes, año);
        this.maxHum = maxHum;
        this.minHum = minHum;
        this.media = ((maxHum+minHum)/2);
    }
    
    public String toString() {
        return super.toString() + " con Humedad minima: " 
        + minHum + " y Maxima: " + maxHum+ " Media humedad: " 
        + media;
    }
}
