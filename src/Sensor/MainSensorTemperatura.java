package Sensor;

public class MainSensorTemperatura {
    static void main() {
        SensorTemperatura sen1 = new SensorTemperatura();
        SensorTemperatura sen2 = new SensorTemperatura();

        sen1.setIdSensor("098Vsd");
        sen1.setUnidad("f");
        sen1.setValorActual(25.3);

        sen2.setIdSensor("2568Vf");
        sen2.setUnidad("c");
        sen2.setValorActual(28.54);

        sen1.mostrarInformacion();
        sen2.mostrarInformacion();
    }
}
