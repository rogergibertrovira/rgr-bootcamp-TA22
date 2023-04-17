package views;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class VistaPrestamo extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	
	public JTextField tfCliente, tfVideo;
	
	public JButton buttonPrestar;

	public VistaPrestamo() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 300, 230);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelInfo = new JLabel("Introduce IDs del cliente y el video");
		labelInfo.setBounds(48, 28, 217, 14);
		contentPane.add(labelInfo);
		
		JLabel labelCliente = new JLabel("Id cliente");
		labelCliente.setHorizontalAlignment(SwingConstants.CENTER);
		labelCliente.setBounds(44, 70, 86, 14);
		contentPane.add(labelCliente);
		
		JLabel labelVideo = new JLabel("Id video");
		labelVideo.setHorizontalAlignment(SwingConstants.CENTER);
		labelVideo.setBounds(154, 70, 86, 14);
		contentPane.add(labelVideo);
		
		tfCliente = new JTextField();
		tfCliente.setBounds(44, 95, 86, 20);
		contentPane.add(tfCliente);
		tfCliente.setColumns(10);
		
		tfVideo = new JTextField();
		tfVideo.setBounds(154, 95, 86, 20);
		contentPane.add(tfVideo);
		tfVideo.setColumns(10);
		
		buttonPrestar = new JButton("Prestar video");
		buttonPrestar.setBounds(79, 139, 125, 30);
		contentPane.add(buttonPrestar);
	}
}
