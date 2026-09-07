import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese carrera: ");
        String carrera = scanner.nextLine();

        System.out.print("Ingrese edad: ");
        int edad = scanner.nextInt();

        Estudiante estudiante = new Estudiante(nombre, carrera, edad);


        estudiante.mostrarInformacion();
    }
}
