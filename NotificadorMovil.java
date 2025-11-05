public class NotificadorMovil implements Observador {
    @Override
    public void actualizar(Sensor sensor, String evento) {
        System.out.println("NotificadorMovil: Enviando notificación al propietario. Evento: " + evento);
    }
}
