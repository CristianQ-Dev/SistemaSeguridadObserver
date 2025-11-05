public class AlarmaSonora implements Observador {
    @Override
    public void actualizar(Sensor sensor, String evento) {
        System.out.println("AlarmaSonora: Alarma activada por " + evento + " en el sensor " + sensor.getTipo());
    }
}
