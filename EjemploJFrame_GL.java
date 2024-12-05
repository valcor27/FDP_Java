import java.awt.*;
import javax.swing.*;

public class EjemploJFrame_GL {
    public static void main(String[] args) {
        // Crear un JFrame
        JFrame frame = new JFrame("Mi Primera Ventana");
        frame.setSize(800, 800);  // Definir tamaño de la ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Cerrar la aplicación al cerrar la ventana

        // Crear un panel con GridLayout
        JPanel panel = new JPanel(new GridLayout(3, 1));  // 3 filas, 1 columna
        panel.setBackground(Color.CYAN);  // Color de fondo del panel para verlo mejor

        // Crear componentes
        JLabel label = new JLabel("¡Hola, Mundo!");
        JButton button = new JButton("Haz clic aquí");
        JTextField textField = new JTextField(20);

        // Agregar los componentes al panel
        panel.add(label);
        panel.add(button);
        panel.add(textField);

        // Agregar el panel al JFrame
        frame.add(panel);

        // Hacer visible la ventana
        frame.setVisible(true);
    }
}
