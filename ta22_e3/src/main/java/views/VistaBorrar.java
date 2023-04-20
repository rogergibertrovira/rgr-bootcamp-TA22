package views;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class VistaBorrar extends JFrame {
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	public JTextField tfId;
	public JButton buttonBorrar;
	
	public JLabel labelInfo, labelId;

	public VistaBorrar() {
		setResizable(false);
		setBounds(100, 100, 300, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		labelInfo = new JLabel("Introduce el id del cliente a borrar");
		labelInfo.setHorizontalAlignment(SwingConstants.CENTER);
		labelInfo.setBounds(46, 38, 191, 14);
		contentPane.add(labelInfo);

		tfId = new JTextField();
		tfId.setBounds(111, 87, 86, 20);
		contentPane.add(tfId);
		tfId.setColumns(10);

		labelId = new JLabel("Id");
		labelId.setHorizontalAlignment(SwingConstants.RIGHT);
		labelId.setBounds(32, 90, 71, 14);
		contentPane.add(labelId);

		buttonBorrar = new JButton("Borrar cliente");
		buttonBorrar.setBounds(60, 142, 163, 30);
		contentPane.add(buttonBorrar);
	}

	public void setInfo(int opcion) {
		if (opcion == 1) {
			labelInfo.setText("Introduce el id del proyecto");
			labelId.setText("Id");
			buttonBorrar.setText("Borrar proyecto");
		} 
		else if (opcion == 2) {
			labelInfo.setText("Introduce el DNI del cientifico");
			labelId.setText("DNI");
			buttonBorrar.setText("Borrar cientifico");
		} 
		else if (opcion == 3) {
			labelInfo.setText("Introduce el id de la asignacion");
			labelId.setText("Id");
			buttonBorrar.setText("Borrar asignacion");
		}
	}
	
	public void limpiarTextFields() {
		tfId.setText("");
	}
	
}
