package views;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class VistaMostrarProyecto extends JFrame {
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;

	public JLabel labelId, labelNombre, labelHoras;

	public VistaMostrarProyecto() {
		setResizable(false);
		setBounds(100, 100, 300, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel labelInfo = new JLabel("Datos del proyecto");
		labelInfo.setHorizontalAlignment(SwingConstants.CENTER);
		labelInfo.setBounds(86, 21, 112, 14);
		contentPane.add(labelInfo);

		JLabel labelInfo_id = new JLabel("Id");
		labelInfo_id.setHorizontalAlignment(SwingConstants.RIGHT);
		labelInfo_id.setBounds(30, 56, 62, 14);
		contentPane.add(labelInfo_id);

		JLabel labelInfo_nombre = new JLabel("Nombre");
		labelInfo_nombre.setHorizontalAlignment(SwingConstants.RIGHT);
		labelInfo_nombre.setBounds(30, 91, 62, 14);
		contentPane.add(labelInfo_nombre);
		labelInfo_nombre.setHorizontalAlignment(SwingConstants.RIGHT);

		JLabel labelInfo_horas = new JLabel("Horas");
		labelInfo_horas.setHorizontalAlignment(SwingConstants.RIGHT);
		labelInfo_horas.setBounds(30, 126, 62, 14);
		contentPane.add(labelInfo_horas);

		labelId = new JLabel("New label");
		labelId.setBounds(109, 56, 215, 14);
		contentPane.add(labelId);

		labelNombre = new JLabel("New label");
		labelNombre.setBounds(109, 91, 215, 14);
		contentPane.add(labelNombre);

		labelHoras = new JLabel("New label");
		labelHoras.setBounds(109, 126, 215, 14);
		contentPane.add(labelHoras);
	}
}
