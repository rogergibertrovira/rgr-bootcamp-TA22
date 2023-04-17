package views;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class VistaInsercionVideo extends JFrame {
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	public JTextField tfTitulo;
	public JTextField tfDirector;
	
	public JButton buttonInserir;

	public VistaInsercionVideo() {
		setResizable(false);
		setBounds(100, 100, 300, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel labelInfo = new JLabel("Introduce los datos del nuevo video");
		labelInfo.setBounds(35, 25, 213, 14);
		contentPane.add(labelInfo);

		JLabel labelTitulo = new JLabel("Titulo");
		labelTitulo.setHorizontalAlignment(SwingConstants.RIGHT);
		labelTitulo.setBounds(35, 67, 61, 14);
		contentPane.add(labelTitulo);

		JLabel labelDirector = new JLabel("Director");
		labelDirector.setHorizontalAlignment(SwingConstants.RIGHT);
		labelDirector.setBounds(35, 112, 61, 14);
		contentPane.add(labelDirector);

		tfTitulo = new JTextField();
		tfTitulo.setBounds(111, 64, 125, 20);
		contentPane.add(tfTitulo);
		tfTitulo.setColumns(10);

		tfDirector = new JTextField();
		tfDirector.setBounds(111, 109, 125, 20);
		contentPane.add(tfDirector);
		tfDirector.setColumns(10);

		buttonInserir = new JButton("Inserir video");
		buttonInserir.setBounds(75, 154, 125, 30);
		contentPane.add(buttonInserir);
	}
}
