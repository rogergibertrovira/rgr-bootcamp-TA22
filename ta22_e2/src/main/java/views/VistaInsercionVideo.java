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
	
	public JTextField tfId;
	public JTextField tfTitulo;
	public JTextField tfDirector;
	
	public JButton buttonInserir;

	public VistaInsercionVideo() {
		setResizable(false);
		setBounds(100, 100, 300, 320);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelId = new JLabel("Id");
		labelId.setHorizontalAlignment(SwingConstants.RIGHT);
		labelId.setBounds(45, 75, 46, 14);
		contentPane.add(labelId);

		JLabel labelInfo = new JLabel("Introduce los datos del nuevo video");
		labelInfo.setBounds(35, 29, 213, 14);
		contentPane.add(labelInfo);

		JLabel labelTitulo = new JLabel("Titulo");
		labelTitulo.setHorizontalAlignment(SwingConstants.RIGHT);
		labelTitulo.setBounds(35, 124, 61, 14);
		contentPane.add(labelTitulo);

		JLabel labelDirector = new JLabel("Director");
		labelDirector.setHorizontalAlignment(SwingConstants.RIGHT);
		labelDirector.setBounds(35, 173, 61, 14);
		contentPane.add(labelDirector);
		
		tfId = new JTextField();
		tfId.setBounds(111, 72, 125, 20);
		contentPane.add(tfId);
		tfId.setColumns(10);

		tfTitulo = new JTextField();
		tfTitulo.setBounds(111, 121, 125, 20);
		contentPane.add(tfTitulo);
		tfTitulo.setColumns(10);

		tfDirector = new JTextField();
		tfDirector.setBounds(111, 170, 125, 20);
		contentPane.add(tfDirector);
		tfDirector.setColumns(10);

		buttonInserir = new JButton("Inserir video");
		buttonInserir.setBounds(75, 219, 125, 30);
		contentPane.add(buttonInserir);
	}
}
