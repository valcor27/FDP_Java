import java.util.Scanner;
public class PracticaTryCatchCiclo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean numeroValido = false;

        while (!numeroValido) {
            try {
                System.out.print("Ingresa un número: ");
                int numero = scanner.nextInt();
                System.out.println("¡Gracias! Ingresaste el número: " + numero);
                numeroValido = true; // Salir del bucle si no hay errores.
            } catch (Exception e) {
                System.out.println("Error: Por favor, ingresa un número válido.");
                scanner.nextLine(); // Limpiar la entrada incorrecta del usuario.
            }
        }

        scanner.close();
    }
}
