package views;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class VistaActualizarCliente extends JFrame {
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	public JTextField tfId;
	public JTextField tfNombre;
	public JTextField tfApellido;
	public JTextField tfDireccion;
	public JTextField tfDni;
	public JTextField tfFecha;
	
	public JButton buttonActualizar;
	private JLabel labelId;

	public VistaActualizarCliente() {
		setResizable(false);
		setBounds(100, 100, 300, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		labelId = new JLabel("Id");
		labelId.setHorizontalAlignment(SwingConstants.RIGHT);
		labelId.setBounds(50, 59, 46, 14);
		contentPane.add(labelId);

		JLabel labelInfo = new JLabel("Introduce los nuevos datos del cliente");
		labelInfo.setBounds(22, 21, 239, 14);
		contentPane.add(labelInfo);

		JLabel labelNombre = new JLabel("Nombre");
		labelNombre.setHorizontalAlignment(SwingConstants.RIGHT);
		labelNombre.setBounds(35, 100, 61, 14);
		contentPane.add(labelNombre);

		JLabel labelApellido = new JLabel("Apellido");
		labelApellido.setHorizontalAlignment(SwingConstants.RIGHT);
		labelApellido.setBounds(35, 141, 61, 14);
		contentPane.add(labelApellido);

		JLabel labelDireccion = new JLabel("Dirección");
		labelDireccion.setHorizontalAlignment(SwingConstants.RIGHT);
		labelDireccion.setBounds(35, 182, 61, 14);
		contentPane.add(labelDireccion);

		JLabel labelDni = new JLabel("DNI");
		labelDni.setHorizontalAlignment(SwingConstants.RIGHT);
		labelDni.setBounds(50, 223, 46, 14);
		contentPane.add(labelDni);

		JLabel lblNewLabel_4 = new JLabel("Fecha");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_4.setBounds(50, 264, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		tfId = new JTextField();
		tfId.setBounds(111, 56, 125, 20);
		contentPane.add(tfId);
		tfId.setColumns(10);

		tfNombre = new JTextField();
		tfNombre.setBounds(111, 97, 125, 20);
		contentPane.add(tfNombre);
		tfNombre.setColumns(10);

		tfApellido = new JTextField();
		tfApellido.setBounds(111, 138, 125, 20);
		contentPane.add(tfApellido);
		tfApellido.setColumns(10);

		tfDireccion = new JTextField();
		tfDireccion.setBounds(111, 179, 125, 20);
		contentPane.add(tfDireccion);
		tfDireccion.setColumns(10);

		tfDni = new JTextField();
		tfDni.setBounds(111, 220, 125, 20);
		contentPane.add(tfDni);
		tfDni.setColumns(10);

		tfFecha = new JTextField();
		tfFecha.setBounds(111, 261, 125, 20);
		contentPane.add(tfFecha);
		tfFecha.setColumns(10);

		buttonActualizar = new JButton("Actualizar cliente");
		buttonActualizar.setBounds(69, 302, 145, 30);
		contentPane.add(buttonActualizar);
	}

}

