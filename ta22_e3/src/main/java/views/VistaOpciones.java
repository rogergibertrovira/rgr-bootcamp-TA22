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

	public JButton buttonConsultaP, buttonInsercionP, buttonBorrarP, buttonActualizarP, buttonConsultaC,
			buttonInsercionC, buttonActualizarC, buttonBorrarC, buttonConsultaA, buttonInsercionA, buttonActualizarA,
			buttonBorrarA;

	public VistaOpciones() {
		setResizable(false);
		setBounds(100, 100, 700, 320);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel labelInfo = new JLabel("Selecciona una opción:");
		labelInfo.setHorizontalAlignment(SwingConstants.CENTER);
		labelInfo.setBounds(275, 25, 134, 14);
		contentPane.add(labelInfo);

		buttonConsultaP = new JButton("Consultar proyecto");
		buttonConsultaP.setBounds(36, 64, 180, 30);
		contentPane.add(buttonConsultaP);

		buttonInsercionP = new JButton("Inserir nuevo proyecto");
		buttonInsercionP.setBounds(36, 119, 180, 30);
		contentPane.add(buttonInsercionP);

		buttonActualizarP = new JButton("Actualizar proyecto");
		buttonActualizarP.setBounds(36, 174, 180, 30);
		contentPane.add(buttonActualizarP);

		buttonBorrarP = new JButton("Borrar proyecto");
		buttonBorrarP.setBounds(36, 229, 180, 30);
		contentPane.add(buttonBorrarP);

		buttonConsultaC = new JButton("Consultar cientifico");
		buttonConsultaC.setBounds(252, 64, 180, 30);
		contentPane.add(buttonConsultaC);

		buttonInsercionC = new JButton("Inserir nuevo cientifico");
		buttonInsercionC.setBounds(252, 119, 180, 30);
		contentPane.add(buttonInsercionC);

		buttonActualizarC = new JButton("Actualizar cientifico");
		buttonActualizarC.setBounds(252, 174, 180, 30);
		contentPane.add(buttonActualizarC);

		buttonBorrarC = new JButton("Borrar cientifico");
		buttonBorrarC.setBounds(252, 229, 180, 30);
		contentPane.add(buttonBorrarC);

		buttonConsultaA = new JButton("Consultar asignacion");
		buttonConsultaA.setBounds(468, 64, 180, 30);
		contentPane.add(buttonConsultaA);

		buttonInsercionA = new JButton("Inserir nueva asignacion");
		buttonInsercionA.setBounds(468, 119, 180, 30);
		contentPane.add(buttonInsercionA);

		buttonActualizarA = new JButton("Actualizar asignacion");
		buttonActualizarA.setBounds(468, 174, 180, 30);
		contentPane.add(buttonActualizarA);

		buttonBorrarA = new JButton("Borrar asignacion");
		buttonBorrarA.setBounds(468, 229, 180, 30);
		contentPane.add(buttonBorrarA);
	}
}
