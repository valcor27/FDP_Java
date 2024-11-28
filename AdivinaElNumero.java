import java.util.*;
public class AdivinaElNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean jugarDeNuevo = true;
        System.out.println("¡Bienvenido al juego de adivinar el número!");
        while (jugarDeNuevo) {
            int numeroSecreto = random.nextInt(100) + 1; // Número entre 1 y 100
            int intentos = 0;
            boolean numeroAdivinado = false;
            System.out.println("\nHe generado un número secreto entre 1 y 100. ¡Intenta adivinarlo!");
            while (!numeroAdivinado) {
                System.out.print("Ingresa tu número: ");
                int adivinanza;
                // Manejo de entrada inválida
                try {
                    adivinanza = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Por favor, ingresa un número válido.");
                    continue;
                }
                intentos++;
                if (adivinanza > numeroSecreto) {
                    System.out.println("El número es más pequeño.");
                } else if (adivinanza < numeroSecreto) {
                    System.out.println("El número es más grande.");
                } else {
                    System.out.println("¡Felicidades! Adivinaste el número en " + intentos + " intento(s).");
                    numeroAdivinado = true;
                }
            }
            System.out.print("¿Quieres jugar otra vez? (si/no): ");
            String respuesta = scanner.nextLine().trim().toLowerCase();
            jugarDeNuevo = respuesta.equals("si");
        }
        System.out.println("¡Gracias por jugar! Hasta la próxima.");
        scanner.close();
    }
}
