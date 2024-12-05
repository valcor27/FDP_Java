import javax.swing.*;

public class Ventana_2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mi primera ventana");
        frame.setSize(600,600); // Ancho y alto
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear un JLabel con el mensaje "Hola Mundo"
        JLabel label = new JLabel("Hola Mundo"); // Texto centrado
        label.setBounds(150, 130, 300, 120); // Posición y tamaño del label

        // Agregar el JLabel a la ventana
        frame.add(label);

        frame.setVisible(true);  // Mostrar ventana
    }
}
