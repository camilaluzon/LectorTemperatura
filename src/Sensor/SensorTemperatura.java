package Sensor;

import java.util.Locale;

public class SensorTemperatura {
    private String idsensor;
    private double valoractual;
    private String unidad;

    public void setIdsensor(String idsensor){
        if(idsensor != null && !idsensor.isBlank()){
            this.idsensor=idsensor;
        }
    }
    public void setValoractual(double valoractual){
        this.valoractual=valoractual;
    }
    public void setUnidad(String unidad){
        if(unidad != null && !unidad.isBlank()){
            if (unidad.toUpperCase().equals("C") || unidad.toUpperCase().equals("F")){
                unidad= unidad.toUpperCase();
                this.unidad=unidad;
            }
        }
    }

    public double getValoractual() {
        return valoractual;
    }
    public String getIdsensor() {
        return idsensor;
    }
    public String getUnidad() {
        return unidad;
    }

    public void mostrarLectura(){
        System.out.println("Temperatura: " + getValoractual()+ " " +getUnidad());
    }
}
