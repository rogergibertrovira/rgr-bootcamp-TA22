package views;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class VistaMostrarCientifico extends JFrame {
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;

	public JLabel labelDni, labelNombre;

	public VistaMostrarCientifico() {
		setResizable(false);
		setBounds(100, 100, 300, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel labelInfo = new JLabel("Datos del cientifico");
		labelInfo.setHorizontalAlignment(SwingConstants.CENTER);
		labelInfo.setBounds(86, 29, 112, 14);
		contentPane.add(labelInfo);

		JLabel labelInfo_dni = new JLabel("DNI");
		labelInfo_dni.setHorizontalAlignment(SwingConstants.RIGHT);
		labelInfo_dni.setBounds(30, 72, 62, 14);
		contentPane.add(labelInfo_dni);

		JLabel labelInfo_nombre = new JLabel("Nombre");
		labelInfo_nombre.setHorizontalAlignment(SwingConstants.RIGHT);
		labelInfo_nombre.setBounds(30, 115, 62, 14);
		contentPane.add(labelInfo_nombre);
		labelInfo_nombre.setHorizontalAlignment(SwingConstants.RIGHT);

		labelDni = new JLabel("New label");
		labelDni.setBounds(109, 72, 215, 14);
		contentPane.add(labelDni);

		labelNombre = new JLabel("New label");
		labelNombre.setBounds(109, 115, 215, 14);
		contentPane.add(labelNombre);
	}
}
