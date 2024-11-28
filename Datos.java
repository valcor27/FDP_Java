import java.util.Scanner;
public class Datos {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        //int edad;
        //String nombre;
        System.out.println("Dime tu nombre");
        String nombre = leer.nextLine();
        System.out.println("Dime tu edad");
        int edad = leer.nextInt();
        
        System.out.println("Tu edad es: " + edad);
        System.out.println("Tu nombre es: " + nombre);
        leer.close();
    }
}
