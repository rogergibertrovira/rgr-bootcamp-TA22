package views;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class VistaConsulta extends JFrame {
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	public JTextField tfId;

	public JLabel labelInfo, labelId;

	public JButton buttonConsultar;

	public VistaConsulta() {
		setResizable(false);
		setBounds(100, 100, 300, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		labelInfo = new JLabel();
		labelInfo.setBounds(26, 24, 231, 14);
		contentPane.add(labelInfo);

		tfId = new JTextField();
		tfId.setBounds(108, 62, 121, 20);
		contentPane.add(tfId);
		tfId.setColumns(10);

		labelId = new JLabel("Id");
		labelId.setHorizontalAlignment(SwingConstants.RIGHT);
		labelId.setBounds(10, 65, 88, 14);
		contentPane.add(labelId);

		buttonConsultar = new JButton();
		buttonConsultar.setBounds(61, 106, 162, 30);
		contentPane.add(buttonConsultar);
	}

	public void setInfo(int opcion) {
		if (opcion == 1) {
			labelInfo.setText("Introduce los datos del proyecto");
			labelId.setText("Id");
			buttonConsultar.setText("Consultar proyecto");
		} 
		else if (opcion == 2) {
			labelInfo.setText("Introduce los datos del cientifico");
			labelId.setText("DNI");
			buttonConsultar.setText("Consultar cientifico");
		} 
		else if (opcion == 3) {
			labelInfo.setText("Introduce los datos de la asignacion");
			labelId.setText("Id proyecto");
			buttonConsultar.setText("Consultar asignacion");
		}
	}
	
	public void limpiarTextFields() {
		tfId.setText("");
	}
}
