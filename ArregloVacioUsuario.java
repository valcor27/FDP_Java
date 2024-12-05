import java.util.Scanner;

public class ArregloVacioUsuario {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer datos del usuario
        Scanner scanner = new Scanner(System.in);

        // Preguntar al usuario cuántos elementos quiere ingresar
        System.out.print("¿Cuántos números deseas ingresar? ");
        int tamaño = scanner.nextInt();

        // Crear un arreglo vacío de tamaño especificado por el usuario
        int[] numeros = new int[tamaño];

        // Pedir al usuario que ingrese los valores
        System.out.println("Por favor, ingresa " + tamaño + " números:");

        // Llenar el arreglo con los valores proporcionados por el usuario
        for (int i = 0; i < tamaño; i++) {
            System.out.print("Ingresa el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();  // Almacenar el valor en el arreglo
        }

        // Mostrar los números ingresados por el usuario
        System.out.println("\nLos números ingresados son:");
        for (int i = 0; i < tamaño; i++) {
            System.out.println("Número en índice " + i + ": " + numeros[i]);
        }

        // Cerrar el Scanner
        scanner.close();
    }
}
