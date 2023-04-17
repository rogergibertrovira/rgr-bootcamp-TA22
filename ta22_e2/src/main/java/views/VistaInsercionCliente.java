package views;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class VistaInsercionCliente extends JFrame {
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	public JTextField tfNombre;
	public JTextField tfApellido;
	public JTextField tfDireccion;
	public JTextField tfDni;
	public JTextField tfFecha;
	
	public JButton buttonInserir;

	public VistaInsercionCliente() {
		setResizable(false);
		setBounds(100, 100, 300, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel labelInfo = new JLabel("Introduce los datos del nuevo cliente");
		labelInfo.setBounds(35, 30, 213, 14);
		contentPane.add(labelInfo);

		JLabel labelNombre = new JLabel("Nombre");
		labelNombre.setHorizontalAlignment(SwingConstants.RIGHT);
		labelNombre.setBounds(35, 71, 61, 14);
		contentPane.add(labelNombre);

		JLabel labelApellido = new JLabel("Apellido");
		labelApellido.setHorizontalAlignment(SwingConstants.RIGHT);
		labelApellido.setBounds(35, 115, 61, 14);
		contentPane.add(labelApellido);

		JLabel labelDireccion = new JLabel("Dirección");
		labelDireccion.setHorizontalAlignment(SwingConstants.RIGHT);
		labelDireccion.setBounds(35, 159, 61, 14);
		contentPane.add(labelDireccion);

		JLabel labelDni = new JLabel("DNI");
		labelDni.setHorizontalAlignment(SwingConstants.RIGHT);
		labelDni.setBounds(50, 203, 46, 14);
		contentPane.add(labelDni);

		JLabel lblNewLabel_4 = new JLabel("Fecha");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_4.setBounds(50, 247, 46, 14);
		contentPane.add(lblNewLabel_4);

		tfNombre = new JTextField();
		tfNombre.setBounds(111, 68, 125, 20);
		contentPane.add(tfNombre);
		tfNombre.setColumns(10);

		tfApellido = new JTextField();
		tfApellido.setBounds(111, 112, 125, 20);
		contentPane.add(tfApellido);
		tfApellido.setColumns(10);

		tfDireccion = new JTextField();
		tfDireccion.setBounds(111, 156, 125, 20);
		contentPane.add(tfDireccion);
		tfDireccion.setColumns(10);

		tfDni = new JTextField();
		tfDni.setBounds(111, 200, 125, 20);
		contentPane.add(tfDni);
		tfDni.setColumns(10);

		tfFecha = new JTextField();
		tfFecha.setBounds(111, 241, 125, 20);
		contentPane.add(tfFecha);
		tfFecha.setColumns(10);

		buttonInserir = new JButton("Inserir cliente");
		buttonInserir.setBounds(79, 294, 125, 30);
		contentPane.add(buttonInserir);
	}

}
