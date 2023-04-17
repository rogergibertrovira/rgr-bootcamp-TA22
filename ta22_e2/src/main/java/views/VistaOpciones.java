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

	public JButton buttonConsultaC, buttonInsercionC, buttonBorrarC, buttonActualizarC, buttonConsultaV,
			buttonInsercionV, buttonActualizarV, buttonBorrarV, buttonPrestamo, buttonDevolver;

	public VistaOpciones() {
		setResizable(false);
		setBounds(100, 100, 550, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		buttonConsultaC = new JButton("Consultar cliente");
		buttonConsultaC.setBounds(64, 64, 170, 30);
		contentPane.add(buttonConsultaC);

		buttonInsercionC = new JButton("Inserir nuevo cliente");
		buttonInsercionC.setBounds(64, 119, 170, 30);
		contentPane.add(buttonInsercionC);

		buttonActualizarC = new JButton("Actualizar cliente");
		buttonActualizarC.setBounds(64, 174, 170, 30);
		contentPane.add(buttonActualizarC);

		buttonBorrarC = new JButton("Borrar cliente");
		buttonBorrarC.setBounds(64, 229, 170, 30);
		contentPane.add(buttonBorrarC);

		buttonConsultaV = new JButton("Consultar video");
		buttonConsultaV.setBounds(298, 64, 170, 30);
		contentPane.add(buttonConsultaV);

		buttonInsercionV = new JButton("Inserir nuevo video");
		buttonInsercionV.setBounds(298, 119, 170, 30);
		contentPane.add(buttonInsercionV);

		buttonActualizarV = new JButton("Actualizar video");
		buttonActualizarV.setBounds(298, 174, 170, 30);
		contentPane.add(buttonActualizarV);

		buttonBorrarV = new JButton("Borrar video");
		buttonBorrarV.setBounds(298, 229, 170, 30);
		contentPane.add(buttonBorrarV);

		buttonPrestamo = new JButton("Prestar video");
		buttonPrestamo.setBounds(64, 302, 170, 30);
		contentPane.add(buttonPrestamo);

		buttonDevolver = new JButton("Devolver video");
		buttonDevolver.setBounds(298, 302, 170, 30);
		contentPane.add(buttonDevolver);

		JLabel labelInfo = new JLabel("Selecciona una opción:");
		labelInfo.setHorizontalAlignment(SwingConstants.CENTER);
		labelInfo.setBounds(200, 25, 134, 14);
		contentPane.add(labelInfo);
	}
}
