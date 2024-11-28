import java.util.Scanner;

public class PracticaTryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Ingresa un número: ");
            int numero = scanner.nextInt(); // Aquí puede ocurrir un error si el usuario no ingresa un número.
            System.out.println("¡Gracias! Ingresaste el número: " + numero);
        } catch (Exception e) {
            System.out.println("Error: Por favor, ingresa un número válido.");
        }
        
        scanner.close();
    }
}
