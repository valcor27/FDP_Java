import java.util.Scanner;
public class ConTryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Ingresa un número para dividir 100: ");
            int numero = scanner.nextInt();
            int resultado = 100 / numero;
            System.out.println("El resultado es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir entre 0.");
        } catch (Exception e) {
            System.out.println("Error: Entrada inválida.");
        } finally {
            System.out.println("Gracias por usar el programa.");
            scanner.close();
        }
    }
}