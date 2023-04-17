package views;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class VistaActualizarVideo extends JFrame {
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	public JTextField tfId;
	public JTextField tfTitulo;
	public JTextField tfDirector;
	
	public JButton buttonActualizar;
	private JLabel labelId;

	public VistaActualizarVideo() {
		setResizable(false);
		setBounds(100, 100, 300, 280);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		labelId = new JLabel("Id");
		labelId.setHorizontalAlignment(SwingConstants.RIGHT);
		labelId.setBounds(50, 61, 46, 14);
		contentPane.add(labelId);

		JLabel labelInfo = new JLabel("Introduce los nuevos datos del video");
		labelInfo.setBounds(22, 22, 239, 14);
		contentPane.add(labelInfo);

		JLabel labelTitulo = new JLabel("Titulo");
		labelTitulo.setHorizontalAlignment(SwingConstants.RIGHT);
		labelTitulo.setBounds(35, 103, 61, 14);
		contentPane.add(labelTitulo);

		JLabel labelDirector = new JLabel("Director");
		labelDirector.setHorizontalAlignment(SwingConstants.RIGHT);
		labelDirector.setBounds(35, 145, 61, 14);
		contentPane.add(labelDirector);
		
		tfId = new JTextField();
		tfId.setBounds(111, 58, 125, 20);
		contentPane.add(tfId);
		tfId.setColumns(10);

		tfTitulo = new JTextField();
		tfTitulo.setBounds(111, 100, 125, 20);
		contentPane.add(tfTitulo);
		tfTitulo.setColumns(10);

		tfDirector = new JTextField();
		tfDirector.setBounds(111, 142, 125, 20);
		contentPane.add(tfDirector);
		tfDirector.setColumns(10);

		buttonActualizar = new JButton("Actualizar video");
		buttonActualizar.setBounds(69, 184, 145, 30);
		contentPane.add(buttonActualizar);
	}

}

