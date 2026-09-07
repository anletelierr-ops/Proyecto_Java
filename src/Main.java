import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int opcion;

            do {
                System.out.println("\n=== SISTEMA DUOC ===");
                System.out.println("1. Mostrar estado");
                System.out.println("2. Procesar operación");
                System.out.println("0. Salir");
                System.out.print("Seleccione una opción: ");

                String entrada = scanner.nextLine();
                try {
                    opcion = Integer.parseInt(entrada);
                } catch (NumberFormatException e) {
                    opcion = -1;
                }

                switch (opcion) {
                    case 1:
                        System.out.println("Sistema operativo.");
                        break;
                    case 2:
                        procesarEstudiante(scanner);
                        break;
                    case 0:
                        System.out.println("Saliendo del sistema.");
                        break;
                    default:
                        System.out.println("Opción inválida.");
                }
            } while (opcion != 0);
        }
    }

    private static void procesarEstudiante(Scanner scanner) {
        System.out.print("Ingrese nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese carrera: ");
        String carrera = scanner.nextLine();

        int edad;
        while (true) {
            System.out.print("Ingrese edad: ");
            String entrada = scanner.nextLine();
            try {
                edad = Integer.parseInt(entrada);
                if (edad >= 0) {
                    break;
                }
                System.out.println("La edad no puede ser negativa.");
            } catch (NumberFormatException e) {
                System.out.println("Ingrese una edad válida.");
            }
        }

        if (edad < 18) {
            System.out.println("Estudiante menor de edad.");
        } else if (edad < 25) {
            System.out.println("Estudiante joven.");
        } else {
            System.out.println("Estudiante adulto.");
        }

        Estudiante estudiante = new Estudiante(nombre, carrera, edad);
        estudiante.mostrarInformacion();
    }
}
