public class ControlGas implements Observador {
    @Override
    public void actualizar(Sensor sensor, String evento) {
        if (evento.toLowerCase().contains("gas")) {
            System.out.println("ControlGas: Activando ventilación y cerrando válvulas de gas.");
        } else {
            System.out.println("ControlGas: Evento no relacionado con gas, sin acción.");
        }
    }
}
