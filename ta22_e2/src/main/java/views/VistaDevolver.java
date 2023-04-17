package views;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class VistaDevolver extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	public JTextField tfVideo;
	
	public JButton buttonDevolver;

	public VistaDevolver() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 300, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelInfo = new JLabel("Introduce el id del video a devolver");
		labelInfo.setHorizontalAlignment(SwingConstants.CENTER);
		labelInfo.setBounds(33, 26, 218, 14);
		contentPane.add(labelInfo);
		
		JLabel labelVideo = new JLabel("Id video");
		labelVideo.setHorizontalAlignment(SwingConstants.RIGHT);
		labelVideo.setBounds(56, 69, 56, 14);
		contentPane.add(labelVideo);
		
		tfVideo = new JTextField();
		tfVideo.setBounds(122, 66, 86, 20);
		contentPane.add(tfVideo);
		tfVideo.setColumns(10);
		
		buttonDevolver = new JButton("Devolver video");
		buttonDevolver.setBounds(79, 112, 125, 30);
		contentPane.add(buttonDevolver);
	}

}
