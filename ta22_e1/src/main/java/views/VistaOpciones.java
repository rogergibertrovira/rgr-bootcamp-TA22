package views;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class VistaOpciones extends JFrame {
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	
	public JButton buttonConsulta, buttonInsercion, buttonBorrar, buttonActualizar;

	public VistaOpciones() {
		setResizable(false);
		setBounds(100, 100, 300, 322);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		buttonConsulta = new JButton("Consultar cliente");
		buttonConsulta.setBounds(57, 62, 170, 30);
		contentPane.add(buttonConsulta);
		
		buttonInsercion = new JButton("Inserir nuevo cliente");
		buttonInsercion.setBounds(57, 116, 170, 30);
		contentPane.add(buttonInsercion);
		
		buttonActualizar = new JButton("Actualizar cliente");
		buttonActualizar.setBounds(57, 170, 170, 30);
		contentPane.add(buttonActualizar);
		
		buttonBorrar = new JButton("Borrar cliente");
		buttonBorrar.setBounds(57, 224, 170, 30);
		contentPane.add(buttonBorrar);
		
		JLabel labelInfo = new JLabel("Selecciona una opción:");
		labelInfo.setHorizontalAlignment(SwingConstants.CENTER);
		labelInfo.setBounds(75, 24, 134, 14);
		contentPane.add(labelInfo);
	}
}
