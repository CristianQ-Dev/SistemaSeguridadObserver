public class VentanaAutomatica implements Observador {
    @Override
    public void actualizar(Sensor sensor, String evento) {
        System.out.println("VentanaAutomatica: Cerrando ventanas por seguridad debido a " + evento);
    }
}
