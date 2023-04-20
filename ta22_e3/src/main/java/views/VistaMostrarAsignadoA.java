package views;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class VistaMostrarAsignadoA extends JFrame {
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;

	public JLabel labelId, labelCientifico, labelProyecto;

	public VistaMostrarAsignadoA() {
		setResizable(false);
		setBounds(100, 100, 300, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel labelInfo = new JLabel("Datos de la asignacion");
		labelInfo.setHorizontalAlignment(SwingConstants.CENTER);
		labelInfo.setBounds(66, 31, 152, 14);
		contentPane.add(labelInfo);

		JLabel labelInfo_Id = new JLabel("Id");
		labelInfo_Id.setHorizontalAlignment(SwingConstants.RIGHT);
		labelInfo_Id.setBounds(46, 76, 46, 14);
		contentPane.add(labelInfo_Id);

		JLabel labelInfo_Proyecto = new JLabel("Id Proyecto");
		labelInfo_Proyecto.setHorizontalAlignment(SwingConstants.RIGHT);
		labelInfo_Proyecto.setBounds(10, 121, 82, 14);
		contentPane.add(labelInfo_Proyecto);

		JLabel labelInfo_dni = new JLabel("DNI cientifico");
		labelInfo_dni.setHorizontalAlignment(SwingConstants.RIGHT);
		labelInfo_dni.setBounds(10, 166, 82, 14);
		contentPane.add(labelInfo_dni);

		labelId = new JLabel("New label");
		labelId.setBounds(109, 76, 215, 14);
		contentPane.add(labelId);

		labelCientifico = new JLabel("New label");
		labelCientifico.setBounds(109, 166, 215, 14);
		contentPane.add(labelCientifico);

		labelProyecto = new JLabel("New label");
		labelProyecto.setBounds(109, 121, 215, 14);
		contentPane.add(labelProyecto);
	}
}
