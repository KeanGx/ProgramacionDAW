public class TempDia {
    
    protected int minTemp = 0, maxTemp = 0, media = 0, dia = 0, mes = 0, año = 0000;
    static final int meses[] = {31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365};

    
    public TempDia (int minTemp, int maxTemp, int dia, int mes, int año){
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        this.minTemp = minTemp;
        this.maxTemp = maxTemp;
        this.media = ((maxTemp+minTemp)/2);
    }
    
    public String toString() {
        return "Dia: " + dia +" Mes: " + mes + " año: " + año +
        " con Temperatura min: " + minTemp 
        + " y Temperatura max: " + maxTemp 
        + " Media temperatura: " + media;
    }
    
    public int obtenerNumDia() {
        int pos = 0;
        mes = this.mes;
        for (int i=0; i<meses.length; i++){
            if (mes==i){
                pos = meses[i]+dia;
                break;
            }
        }
        return pos;
    }
    public void eliminarDia() {
        mes = 0;
        dia = 0;
        año = 0;
        minTemp = 0;
        maxTemp = 0;
        media = 0;
    }
}
