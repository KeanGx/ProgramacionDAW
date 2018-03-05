/**
 * Clase TempDia que obtiene las fechas y los datos principales de las temperaturas
 */
public class TempDia {
    
    protected int minTemp = 0, maxTemp = 0, media = 0, dia = 0, mes = 0, año = 0000;
    static final int meses[] = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365};

    /**
     * @param dia
     * @param mes
     * @param año
     * @param maxTemp
     * @param minTemp
     */
    public TempDia ( int dia, int mes, int año, int maxTemp, int minTemp){
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        this.minTemp = minTemp;
        this.maxTemp = maxTemp;
        this.media = ((maxTemp+minTemp)/2);
    }
    
    public String toString() {
        return "Dia: " + dia +" Mes: " + mes + " año: " + año +
        " con Temperatura max: " + maxTemp 
        + " y Temperatura min: " + minTemp 
        + " Media temperatura: " + media;
    }
    /**
     * Obtiene la posicion de la fecha indicada dentro del array de EstacionClimatica Mediciones
     * @return pos La posicion de la fecha.
     */
    public int obtenerNumDia() {
        int pos = 0;
        mes = this.mes;
        for (int i=0; i<meses.length; i++){
            if (mes==i){
                pos = meses[i-1]+dia;
                break;
            }
        }
        return pos;
    }
    
}
