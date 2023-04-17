package views;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class VistaBorrarCliente extends JFrame {
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	public JTextField tfId;
	public JButton buttonBorrar;

	public VistaBorrarCliente() {
		setResizable(false);
		setBounds(100, 100, 300, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel labelInfo = new JLabel("Introduce el id del cliente a borrar");
		labelInfo.setBounds(46, 38, 191, 14);
		contentPane.add(labelInfo);

		tfId = new JTextField();
		tfId.setBounds(111, 87, 86, 20);
		contentPane.add(tfId);
		tfId.setColumns(10);

		JLabel labelId = new JLabel("Id");
		labelId.setBounds(85, 90, 46, 14);
		contentPane.add(labelId);

		buttonBorrar = new JButton("Borrar cliente");
		buttonBorrar.setBounds(79, 142, 125, 30);
		contentPane.add(buttonBorrar);
	}

}
