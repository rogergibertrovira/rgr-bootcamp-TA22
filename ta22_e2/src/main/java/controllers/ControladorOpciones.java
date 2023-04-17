package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import views.VistaOpciones;

public class ControladorOpciones implements ActionListener {
	private VistaOpciones vista;
	private ControladorConsultaCliente controladorConsultaCliente;
	private ControladorInsercionCliente controladorInsercionCliente;
	private ControladorBorrarCliente controladorBorrarCliente;
	private ControladorActualizarCliente controladorActualizarCliente;

	private ControladorConsultaVideo controladorConsultaVideo;
	private ControladorInsercionVideo controladorInsercionVideo;
	private ControladorBorrarVideo controladorBorrarVideo;
	private ControladorActualizarVideo controladorActualizarVideo;

	private ControladorPrestamo controladorPrestamo;
	private ControladorDevolver controladorDevolver;

	public ControladorOpciones(VistaOpciones vis, ControladorConsultaCliente contConsultaC,
			ControladorInsercionCliente contInsercionC, ControladorActualizarCliente contActualizarC,
			ControladorBorrarCliente contBorrarC, ControladorConsultaVideo contConsultaV,
			ControladorInsercionVideo contInsercionV, ControladorActualizarVideo contActualizarV,
			ControladorBorrarVideo contBorrarV, ControladorPrestamo contPrestamo, ControladorDevolver contDevolver) {

		this.vista = vis;

		// Controladores cliente
		this.controladorConsultaCliente = contConsultaC;
		this.controladorInsercionCliente = contInsercionC;
		this.controladorActualizarCliente = contActualizarC;
		this.controladorBorrarCliente = contBorrarC;

		// Controladores video
		this.controladorConsultaVideo = contConsultaV;
		this.controladorInsercionVideo = contInsercionV;
		this.controladorActualizarVideo = contActualizarV;
		this.controladorBorrarVideo = contBorrarV;
		this.controladorPrestamo = contPrestamo;
		this.controladorDevolver = contDevolver;

		// Botones cliente
		this.vista.buttonConsultaC.addActionListener(this);
		this.vista.buttonInsercionC.addActionListener(this);
		this.vista.buttonBorrarC.addActionListener(this);
		this.vista.buttonActualizarC.addActionListener(this);

		// Botones video
		this.vista.buttonConsultaV.addActionListener(this);
		this.vista.buttonInsercionV.addActionListener(this);
		this.vista.buttonBorrarV.addActionListener(this);
		this.vista.buttonActualizarV.addActionListener(this);

		// Boton prestamo
		this.vista.buttonPrestamo.addActionListener(this);
		
		// Boton devolucion
		this.vista.buttonDevolver.addActionListener(this);
	}

	public void iniciarVista() {
		vista.setTitle("Seleccionar opción");
		vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		vista.setLocationRelativeTo(null);
		vista.setVisible(true);
	}

	public void actionPerformed(ActionEvent evt) {
		// Consulta cliente
		if (evt.getSource() == vista.buttonConsultaC) {
			controladorConsultaCliente.iniciarVista();
		}
		// Inserción cliente
		else if (evt.getSource() == vista.buttonInsercionC) {
			controladorInsercionCliente.iniciarVista();
		}
		// Actualizar cliente
		else if (evt.getSource() == vista.buttonActualizarC) {
			controladorActualizarCliente.iniciarVista();
		}
		// Borrar cliente
		else if (evt.getSource() == vista.buttonBorrarC) {
			controladorBorrarCliente.iniciarVista();
		}
		// Consulta video
		if (evt.getSource() == vista.buttonConsultaV) {
			controladorConsultaVideo.iniciarVista();
		}
		// Inserción video
		else if (evt.getSource() == vista.buttonInsercionV) {
			controladorInsercionVideo.iniciarVista();
		}
		// Actualizar video
		else if (evt.getSource() == vista.buttonActualizarV) {
			controladorActualizarVideo.iniciarVista();
		}
		// Borrar video
		else if (evt.getSource() == vista.buttonBorrarV) {
			controladorBorrarVideo.iniciarVista();
		}
		// Prestar video a cliente
		else if (evt.getSource() == vista.buttonPrestamo) {
			controladorPrestamo.iniciarVista();
		}
		// Devolver video de cliente
		else if (evt.getSource() == vista.buttonDevolver) {
			controladorDevolver.iniciarVista();
		}
	}
}
