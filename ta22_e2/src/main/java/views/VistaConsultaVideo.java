package views;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class VistaConsultaVideo extends JFrame {
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	public JTextField tfId;
	
	public JButton buttonConsultar;

	public VistaConsultaVideo() {
		setResizable(false);
		setBounds(100, 100, 300, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel labelInfo = new JLabel("Introduce los datos del video");
		labelInfo.setBounds(42, 24, 199, 14);
		contentPane.add(labelInfo);

		tfId = new JTextField();
		tfId.setBounds(108, 62, 121, 20);
		contentPane.add(tfId);
		tfId.setColumns(10);

		JLabel labelId = new JLabel("Id");
		labelId.setHorizontalAlignment(SwingConstants.RIGHT);
		labelId.setBounds(52, 65, 46, 14);
		contentPane.add(labelId);

		buttonConsultar = new JButton("Consultar video");
		buttonConsultar.setBounds(72, 106, 130, 30);
		contentPane.add(buttonConsultar);
	}
}
