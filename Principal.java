import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("=== SISTEMA DE SEGURIDAD DOMÉSTICO ===\n");

        System.out.print("Ingrese el tipo de sensor que desea activar (por ejemplo: Movimiento, Gas, Puerta): ");
        String tipoSensor = entrada.nextLine();
        Sensor sensor = new Sensor(tipoSensor);

        // Crear observadores
        AlarmaSonora alarma = new AlarmaSonora();
        NotificadorMovil notificador = new NotificadorMovil();
        VentanaAutomatica ventana = new VentanaAutomatica();
        ControlGas controlGas = new ControlGas();
        CamaraSeguridad camara = new CamaraSeguridad();

        // Registrar observadores por defecto
        sensor.agregarObservador(alarma);
        sensor.agregarObservador(notificador);
        sensor.agregarObservador(ventana);
        sensor.agregarObservador(controlGas);
        sensor.agregarObservador(camara);

        int opcion = 0;
        do {
            System.out.println("\n--- MENÚ DE OPCIONES ---");
            System.out.println("1. Detectar movimiento sospechoso");
            System.out.println("2. Detectar fuga de gas");
            System.out.println("3. Detectar apertura de puerta");
            System.out.println("4. Eliminar un observador");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = entrada.nextInt();
            entrada.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    sensor.detectarEvento("Movimiento sospechoso en la sala");
                    break;
                case 2:
                    sensor.detectarEvento("Fuga de gas en la cocina");
                    break;
                case 3:
                    sensor.detectarEvento("Apertura de puerta principal");
                    break;
                case 4:
                    System.out.println("\n--- OBSERVADORES DISPONIBLES ---");
                    System.out.println("1. AlarmaSonora");
                    System.out.println("2. NotificadorMovil");
                    System.out.println("3. VentanaAutomatica");
                    System.out.println("4. ControlGas");
                    System.out.println("5. CamaraSeguridad");
                    System.out.print("Seleccione cuál desea eliminar: ");
                    int eliminar = entrada.nextInt();
                    entrada.nextLine();
                    switch (eliminar) {
                        case 1 -> sensor.eliminarObservador(alarma);
                        case 2 -> sensor.eliminarObservador(notificador);
                        case 3 -> sensor.eliminarObservador(ventana);
                        case 4 -> sensor.eliminarObservador(controlGas);
                        case 5 -> sensor.eliminarObservador(camara);
                        default -> System.out.println("Opción inválida.");
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del sistema... ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 5);

        entrada.close();
    }
}
