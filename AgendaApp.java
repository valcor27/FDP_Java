import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class AgendaApp extends JFrame {
    private JTextField txtNombre, txtTelefono;
    private JTable table;
    private DefaultTableModel tableModel;
    private ArrayList<Contacto> contactos;

    public AgendaApp() {
        // Configuración de la ventana
        setTitle("Agenda de Contactos");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        contactos = new ArrayList<>();

        // Panel superior para los campos de entrada
        JPanel panelEntrada = new JPanel(new GridLayout(2, 2, 10, 10));
        panelEntrada.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        panelEntrada.add(new JLabel("Nombre Completo:"));
        txtNombre = new JTextField();
        panelEntrada.add(txtNombre);

        panelEntrada.add(new JLabel("Teléfono:"));
        txtTelefono = new JTextField();
        panelEntrada.add(txtTelefono);

        add(panelEntrada, BorderLayout.NORTH);

        // Botones de acciones
        JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton btnAgregar = new JButton("Agregar");
        JButton btnEliminar = new JButton("Eliminar");
        panelBotones.add(btnAgregar);
        panelBotones.add(btnEliminar);
        add(panelBotones, BorderLayout.SOUTH);

        // Tabla para mostrar los contactos
        String[] columnas = {"ID", "Nombre Completo", "Teléfono"};
        tableModel = new DefaultTableModel(columnas, 0);
        table = new JTable(tableModel);
        add(new JScrollPane(table), BorderLayout.CENTER);

        // Acción para el botón Agregar
        btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarContacto();
            }
        });

        // Acción para el botón Eliminar
        btnEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eliminarContacto();
            }
        });

        setVisible(true);
    }

    private void agregarContacto() {
        String nombre = txtNombre.getText().trim();
        String telefono = txtTelefono.getText().trim();

        if (!nombre.isEmpty() && !telefono.isEmpty()) {
            int id = contactos.size() + 1; // ID autoincremental
            Contacto contacto = new Contacto(id, nombre, telefono);
            contactos.add(contacto);

            // Añadir contacto a la tabla
            tableModel.addRow(new Object[]{id, nombre, telefono});
            txtNombre.setText("");
            txtTelefono.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, llena todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void eliminarContacto() {
        int filaSeleccionada = table.getSelectedRow();
        if (filaSeleccionada >= 0) {
            // Eliminar de la lista
            contactos.remove(filaSeleccionada);
            // Eliminar de la tabla
            tableModel.removeRow(filaSeleccionada);
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona un contacto para eliminar.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new AgendaApp();
    }
}

class Contacto {
    private int id;
    private String nombre;
    private String telefono;

    public Contacto(int id, String nombre, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }
}