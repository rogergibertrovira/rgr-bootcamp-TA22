package views;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class VistaMostrarVideo extends JFrame {
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;

	public JLabel labelId, labelTitulo, labelDirector, labelClienteId;

	public VistaMostrarVideo() {
		setResizable(false);
		setBounds(100, 100, 350, 240);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel labelInfo = new JLabel("Datos del video");
		labelInfo.setHorizontalAlignment(SwingConstants.CENTER);
		labelInfo.setBounds(86, 21, 112, 14);
		contentPane.add(labelInfo);

		JLabel labelInfo_id = new JLabel("Id");
		labelInfo_id.setHorizontalAlignment(SwingConstants.RIGHT);
		labelInfo_id.setBounds(30, 56, 62, 14);
		contentPane.add(labelInfo_id);

		JLabel labelInfo_titulo = new JLabel("Titulo");
		labelInfo_titulo.setHorizontalAlignment(SwingConstants.RIGHT);
		labelInfo_titulo.setBounds(30, 91, 62, 14);
		contentPane.add(labelInfo_titulo);
		labelInfo_titulo.setHorizontalAlignment(SwingConstants.RIGHT);

		JLabel labelInfo_director = new JLabel("Director");
		labelInfo_director.setHorizontalAlignment(SwingConstants.RIGHT);
		labelInfo_director.setBounds(30, 126, 62, 14);
		contentPane.add(labelInfo_director);

		JLabel labelInfoClienteId = new JLabel("ID Cliente");
		labelInfoClienteId.setHorizontalAlignment(SwingConstants.RIGHT);
		labelInfoClienteId.setBounds(10, 161, 83, 14);
		contentPane.add(labelInfoClienteId);

		labelId = new JLabel("New label");
		labelId.setBounds(109, 56, 215, 14);
		contentPane.add(labelId);

		labelTitulo = new JLabel("New label");
		labelTitulo.setBounds(109, 91, 215, 14);
		contentPane.add(labelTitulo);

		labelDirector = new JLabel("New label");
		labelDirector.setBounds(109, 126, 215, 14);
		contentPane.add(labelDirector);

		labelClienteId = new JLabel("");
		labelClienteId.setBounds(109, 161, 215, 14);
		contentPane.add(labelClienteId);
	}
}
