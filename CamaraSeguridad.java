public class CamaraSeguridad implements Observador {
    @Override
    public void actualizar(Sensor sensor, String evento) {
        System.out.println("CamaraSeguridad: Grabando el área del sensor '" + sensor.getTipo() + "' por evento: " + evento);
    }
}
