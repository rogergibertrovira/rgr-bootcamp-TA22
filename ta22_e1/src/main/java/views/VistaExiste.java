package views;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class VistaExiste extends JFrame {
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;

	public VistaExiste() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 150);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEsteClienteNo = new JLabel("Este cliente no existe");
		lblEsteClienteNo.setHorizontalAlignment(SwingConstants.CENTER);
		lblEsteClienteNo.setBounds(55, 48, 174, 14);
		contentPane.add(lblEsteClienteNo);
	}
}
