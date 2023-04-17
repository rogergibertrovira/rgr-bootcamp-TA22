package views;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class VistaMostrarCliente extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	
	public JLabel labelId;
	public JLabel labelNombre;
	public JLabel labelApellido;
	public JLabel labelDireccion;
	public JLabel labelDni;
	public JLabel labelFecha;

	public VistaMostrarCliente() {
		setResizable(false);
		setBounds(100, 100, 350, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelInfo = new JLabel("Datos del cliente");
		labelInfo.setHorizontalAlignment(SwingConstants.CENTER);
		labelInfo.setBounds(86, 20, 112, 14);
		contentPane.add(labelInfo);
		
		JLabel labelInfo_id = new JLabel("Id");
		labelInfo_id.setHorizontalAlignment(SwingConstants.RIGHT);
		labelInfo_id.setBounds(30, 54, 62, 14);
		contentPane.add(labelInfo_id);
		
		JLabel labelInfo_nombre = new JLabel("Nombre");
		labelInfo_nombre.setHorizontalAlignment(SwingConstants.RIGHT);
		labelInfo_nombre.setBounds(30, 88, 62, 14);
		contentPane.add(labelInfo_nombre);
		
		JLabel labelInfo_apellido = new JLabel("Apellido");
		labelInfo_apellido.setHorizontalAlignment(SwingConstants.RIGHT);
		labelInfo_apellido.setBounds(30, 122, 62, 14);
		contentPane.add(labelInfo_apellido);
		
		JLabel labelInfo_direccion = new JLabel("Dirección");
		labelInfo_direccion.setHorizontalAlignment(SwingConstants.RIGHT);
		labelInfo_direccion.setBounds(30, 156, 62, 14);
		contentPane.add(labelInfo_direccion);
		
		JLabel labelInfo_dni = new JLabel("DNI");
		labelInfo_dni.setHorizontalAlignment(SwingConstants.RIGHT);
		labelInfo_dni.setBounds(30, 190, 62, 14);
		contentPane.add(labelInfo_dni);
		
		JLabel labelInfo_fecha = new JLabel("Fecha");
		labelInfo_fecha.setHorizontalAlignment(SwingConstants.RIGHT);
		labelInfo_fecha.setBounds(30, 224, 62, 14);
		contentPane.add(labelInfo_fecha);
		
		labelId = new JLabel("New label");
		labelId.setBounds(109, 54, 215, 14);
		contentPane.add(labelId);
		
		labelNombre = new JLabel("New label");
		labelNombre.setBounds(109, 88, 215, 14);
		contentPane.add(labelNombre);
		
		labelApellido = new JLabel("New label");
		labelApellido.setBounds(109, 122, 215, 14);
		contentPane.add(labelApellido);
		
		labelDireccion = new JLabel("New label");
		labelDireccion.setBounds(109, 156, 215, 14);
		contentPane.add(labelDireccion);
		
		labelDni = new JLabel("New label");
		labelDni.setBounds(109, 190, 215, 14);
		contentPane.add(labelDni);
		
		labelFecha = new JLabel("New label");
		labelFecha.setBounds(109, 224, 215, 14);
		contentPane.add(labelFecha);
	}

}
