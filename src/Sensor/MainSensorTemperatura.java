package Sensor;

public class MainSensorTemperatura {
    static void main() {
        SensorTemperatura st1= new SensorTemperatura();
        SensorTemperatura st2= new SensorTemperatura();

        st1.setIdsensor("2514v");
        st1.setUnidad("c");
        st1.setValoractual(-20);

        st2.setIdsensor("245b");
        st2.setUnidad("f");
        st2.setValoractual(12);

        st1.mostrarLectura();
        st2.mostrarLectura();
    }
}
