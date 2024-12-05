public class EjemploArray {
    public static void main(String[] args) {
        // Declarar y llenar el arreglo
        String[] nombres = new String[6];
        nombres[0]= "Alfonso";
        nombres[1]= "Juan";
        nombres[2]= "Ivan";
        nombres[3]= "Erick";
        nombres[4]= "Luis";
        nombres[5]= "Alejandro";
        
        int[] numeros = {10, 20, 30, 40, 50};

        // Recorrer el arreglo usando un ciclo for
        System.out.println("Elementos del arreglo:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Índice " + i + ": " + numeros[i]);
        }
        
        //Practica imprimir el arreglo de nombres
        System.out.println("Elementos del arreglo Nombres");
        for (int i=0; i<nombres.length; i++){
            System.out.println("Indice " + i + ": " + nombres[i]);
        }
    }
}
