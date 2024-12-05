import javax.swing.*;

public class EjemploJFrame_LN {
    public static void main(String[] args) {
        // Crear un JFrame
        JFrame frame = new JFrame("Mi Primera Ventana");
        frame.setSize(800, 800);  // Definir tamaño de la ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Cerrar la aplicación al cerrar la ventana

        // Crear un panel con layout null (sin layout manager)
        frame.setLayout(null);  // Desactivamos el LayoutManager del JFrame

        // Crear componentes
        JLabel etiqueta_anuncio = new JLabel("¡Hola, Mundo!");
        JLabel etiqueta_2 = new JLabel("Prueba");
        JButton button = new JButton("Enviar");
        JLabel nombre_usuario = new JLabel("Nombre Usuario");
        JTextField textField = new JTextField(20);

        // Establecer tamaño y posición de los componentes con setBounds()
        etiqueta_anuncio.setBounds(100, 50, 200, 30);  // x, y, width, height
        etiqueta_2.setBounds(300,50,200,30);
        button.setBounds(100, 100, 150, 30);
        nombre_usuario.setBounds(50,150,200,30);
        textField.setBounds(200, 150, 200, 30);

        // Agregar los componentes al JFrame
        frame.add(etiqueta_anuncio);
        frame.add(etiqueta_2);
        frame.add(button);
        frame.add(nombre_usuario);
        frame.add(textField);

        // Hacer visible la ventana
        frame.setVisible(true);
    }
}
