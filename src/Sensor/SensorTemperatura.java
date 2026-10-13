package Sensor;

public class SensorTemperatura {
    private String idSensor;
    private double valorActual;
    private String unidad;

    public void setIdSensor(String idSensor){
        if (idSensor != null && !idSensor.isBlank()){
            this.idSensor = idSensor;
        }
    }
    public void setValorActual(double valorActual){
        this.valorActual = valorActual;
    }
    public void setUnidad(String unidad){
        if (unidad != null && !unidad.isBlank()){
            if (unidad.toUpperCase().equals("C") || unidad.toUpperCase().equals("F")){
                this.unidad = unidad.toUpperCase();
            }
        }
    }

    public String getIdSensor(){
        return idSensor;
    }
    public double getValorActual(){
        return valorActual;
    }
    public String getUnidad(){
        return unidad;
    }

    public void mostrarInformacion(){
        System.out.println("Temperatura: "+getValorActual()+getUnidad()+"°");
    }

}
