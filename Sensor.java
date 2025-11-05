import java.util.ArrayList;
import java.util.List;

public class Sensor {
    private String tipo;
    private List<Observador> observadores;

    public Sensor(String tipo) {
        this.tipo = tipo;
        this.observadores = new ArrayList<>();
    }

    public void agregarObservador(Observador observador) {
        observadores.add(observador);
        System.out.println("Se agregó un nuevo observador: " + observador.getClass().getSimpleName());
    }

    public void eliminarObservador(Observador observador) {
        observadores.remove(observador);
        System.out.println("Se eliminó el observador: " + observador.getClass().getSimpleName());
    }

    public void notificarObservadores(String evento) {
        System.out.println("\nNotificando a todos los observadores sobre el evento: " + evento);
        for (Observador observador : observadores) {
            observador.actualizar(this, evento);
        }
    }

    public void detectarEvento(String evento) {
        System.out.println("\nEl sensor de tipo '" + tipo + "' ha detectado: " + evento);
        notificarObservadores(evento);
    }

    public String getTipo() {
        return tipo;
    }
}
