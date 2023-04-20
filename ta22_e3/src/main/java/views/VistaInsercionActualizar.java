package views;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class VistaInsercionActualizar extends JFrame {
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;

	public JLabel labelInfo, labelInfoId, labelInfo1, labelInfo2;
	public JTextField tfId, tfInfo1, tfInfo2;
	public JButton buttonInserir;

	public VistaInsercionActualizar() {
		setResizable(false);
		setBounds(100, 100, 300, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		labelInfo = new JLabel("Introduce los datos del nuevo _");
		labelInfo.setHorizontalAlignment(SwingConstants.CENTER);
		labelInfo.setBounds(10, 26, 264, 14);
		contentPane.add(labelInfo);

		labelInfoId = new JLabel("-");
		labelInfoId.setHorizontalAlignment(SwingConstants.RIGHT);
		labelInfoId.setBounds(10, 69, 86, 14);
		contentPane.add(labelInfoId);

		labelInfo1 = new JLabel("-");
		labelInfo1.setHorizontalAlignment(SwingConstants.RIGHT);
		labelInfo1.setBounds(10, 115, 86, 14);
		contentPane.add(labelInfo1);

		labelInfo2 = new JLabel("-");
		labelInfo2.setHorizontalAlignment(SwingConstants.RIGHT);
		labelInfo2.setBounds(10, 161, 86, 14);
		contentPane.add(labelInfo2);

		tfId = new JTextField();
		tfId.setBounds(111, 66, 125, 20);
		contentPane.add(tfId);
		tfId.setColumns(10);

		tfInfo1 = new JTextField();
		tfInfo1.setBounds(111, 112, 125, 20);
		contentPane.add(tfInfo1);
		tfInfo1.setColumns(10);

		tfInfo2 = new JTextField();
		tfInfo2.setBounds(111, 158, 125, 20);
		contentPane.add(tfInfo2);
		tfInfo2.setColumns(10);

		buttonInserir = new JButton("Inserir _");
		buttonInserir.setBounds(60, 204, 164, 30);
		contentPane.add(buttonInserir);
	}

	public void setInfo(int opcion, boolean insercion) {
		if (opcion == 1) {
			setInfo2Visibility(true);
			labelInfo.setText("Introduce datos del proyecto");
			labelInfoId.setText("Id");
			labelInfo1.setText("Nombre");
			labelInfo2.setText("Horas");
			if(insercion) {
				buttonInserir.setText("Inserir proyecto");	
			}
			else {
				buttonInserir.setText("Actualizar proyecto");
			}
		} else if (opcion == 2) {
			setInfo2Visibility(false);
			labelInfo.setText("Introduce datos del cientifico");
			labelInfoId.setText("DNI");
			labelInfo1.setText("Nombre");
			if(insercion) {
				buttonInserir.setText("Inserir cientifico");	
			}
			else {
				buttonInserir.setText("Actualizar cientifico");
			}
		} else if (opcion == 3) {
			setInfo2Visibility(true);
			labelInfo.setText("Introduce datos de la asignacion");
			labelInfoId.setText("Id");
			labelInfo1.setText("Id proyecto");
			labelInfo2.setText("DNI cientifico");
			if(insercion) {
				buttonInserir.setText("Inserir asignacion");	
			}
			else {
				buttonInserir.setText("Actualizar asignacion");
			}
		}
	}

	public void limpiarTextFields() {
		tfInfo1.setText("");
		tfInfo2.setText("");
	}
	
	public void setInfo2Visibility(boolean vis) {
		labelInfo2.setVisible(vis);
		tfInfo2.setVisible(vis);
	}
}
