import java.util.*;
public class AdivinaNumero {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        Random random = new Random();
        boolean jugar_de_nuevo = true;       
        System.out.println("Vamos a jugar a adivinar el número");
        System.out.println("Listo?....");
        System.out.println("Comenzamos");
        while(jugar_de_nuevo){
            int numero_aleatorio = random.nextInt(100) + 1;
            int intentos = 0;
            boolean numero_adivinado = false; 
            System.out.println("¿Qué número estoy pensando entre 1 y 100?");
            while(!numero_adivinado){
                System.out.println("Ingresa un número");
                int numero = leer.nextInt(); 
                leer.nextLine();
                intentos++; //intentos = intentos + 1;
                if(numero < 0){
                    System.out.println("Recuerda que el número esta en el rango de 1 a 100");
                }
                else if(numero > 100){
                    System.out.println("El maximo es 100, no tiene que ser mayor a 100");
                }
                else if(numero < numero_aleatorio){
                    System.out.println("El número que pense es mas grande");
                }else if(numero > numero_aleatorio){
                    System.out.println("El número que pense es mas pequeño");
                }else{
                    System.out.println("Felicidades adivinaste el número....!");
                    System.out.println("Hiciste, " + intentos + " intentos para adivinarlo.");
                    numero_adivinado = true;
                }
            }
            System.out.println("¿Quieres jugar de nuevo (si/no)?");
            String respuesta = leer.nextLine().trim().toLowerCase();
            jugar_de_nuevo = respuesta.equals("si");
        }
        System.out.println("Nos vemos!");
        leer.close();
    }
}