package ejercicio03;
import java.util.Scanner;

public class RegistroAduanas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Registro de Turistas en Aduanas");
        System.out.println("Ingrese el nombre del turista:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el apellido del turista:");
        String apellido = scanner.nextLine();

        System.out.println("Ingrese el documento de identidad del turista:");
        String documento = scanner.nextLine();

        // Verificar si el documento es numérico o alfanumérico
        boolean esNumerico = documento.matches("\\d+");

        System.out.println("\nRegistro completo:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Documento de identidad: " + documento);
        if (esNumerico) {
            System.out.println("El documento de identidad es numérico.");
        } else {
            System.out.println("El documento de identidad es alfanumérico.");
        }

        scanner.close();
    }
}
