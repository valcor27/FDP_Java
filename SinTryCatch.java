public class SinTryCatch {
    public static void main(String[] args) {
        int numero = 0;
        int resultado = 100 / numero; // Esto genera un error (ArithmeticException)
        System.out.println("El resultado es: " + resultado);
    }
}
