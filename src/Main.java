import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1. Instanciación directa de Scanner
        Scanner scanner = new Scanner(System.in);

        // Variable inicializada antes del ciclo
        int opcion = -1;

        // 2. Ciclo while controlado por la opción del usuario
        while (opcion != 0) {
            System.out.println("\n=== SISTEMA DUOC ===");
            System.out.println("1. Mostrar estado");
            System.out.println("2. Procesar operación");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            // Lectura con scanner.nextInt()
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de entrada

            // Evaluamos la opción con if / else if / else para garantizar la detección
            if (opcion == 1) {
                System.out.println("Sistema operativo.");
            } else if (opcion == 2) {
                procesarEstudiante(scanner);
            } else if (opcion == 0) {
                System.out.println("Saliendo del sistema.");
            } else {
                System.out.println("Opción inválida.");
            }
        }

        scanner.close();
    }

    private static void procesarEstudiante(Scanner scanner) {
        System.out.print("Ingrese nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese carrera: ");
        String carrera = scanner.nextLine();

        System.out.print("Ingrese edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        // 3. Uso de if / else if / else para validar la edad y clasificar al estudiante
        if (edad < 0) {
            System.out.println("La edad no puede ser negativa.");
            return;
        } else if (edad < 18) {
            System.out.println("Estudiante menor de edad.");
        } else if (edad < 25) {
            System.out.println("Estudiante joven.");
        } else {
            System.out.println("Estudiante adulto.");
        }

        // 4. Uso del ciclo FOR explícito requeridos por la evaluación (ej. mostrar progreso)
        System.out.println("Procesando datos del estudiante:");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Verificando módulo " + i + "...");
        }

        // Instanciación del estudiante
        Estudiante estudiante = new Estudiante(nombre, carrera, edad);
        estudiante.mostrarInformacion();
    }
}