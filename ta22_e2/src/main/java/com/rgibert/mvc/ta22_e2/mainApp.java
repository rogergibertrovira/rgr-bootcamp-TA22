package com.rgibert.mvc.ta22_e2;

// Modelos
import models.ModeloCliente;
import models.ModeloVideo;

// Controladores comunes
import controllers.ControladorOpciones;
import controllers.ControladorExiste;

// Controladores cliente
import controllers.ControladorActualizarCliente;
import controllers.ControladorBorrarCliente;
import controllers.ControladorConsultaCliente;
import controllers.ControladorInsercionCliente;
import controllers.ControladorMostrarCliente;

// Controladores video
import controllers.ControladorActualizarVideo;
import controllers.ControladorBorrarVideo;
import controllers.ControladorConsultaVideo;
import controllers.ControladorInsercionVideo;
import controllers.ControladorMostrarVideo;
import controllers.ControladorPrestamo;
import controllers.ControladorDevolver;

//Vistas comunes
import views.VistaOpciones;
import views.VistaExiste;

// Vistas Cliente
import views.VistaConsultaCliente;
import views.VistaInsercionCliente;
import views.VistaActualizarCliente;
import views.VistaBorrarCliente;
import views.VistaMostrarCliente;

//Vistas Video
import views.VistaConsultaVideo;
import views.VistaInsercionVideo;
import views.VistaActualizarVideo;
import views.VistaBorrarVideo;
import views.VistaMostrarVideo;
import views.VistaPrestamo;
import views.VistaDevolver;

public class mainApp {
	public static void main(String[] args) {

		// Modelo Cliente
		ModeloCliente modeloCliente = new ModeloCliente();

		// Modelo Video
		ModeloVideo modeloVideo = new ModeloVideo();

		// Vista existe
		VistaExiste vistaExiste = new VistaExiste();

		// Vista opciones
		VistaOpciones vistaOpciones = new VistaOpciones();

		// Vistas Cliente
		VistaConsultaCliente vistaConsultaC = new VistaConsultaCliente();
		VistaInsercionCliente vistaInsercionC = new VistaInsercionCliente();
		VistaActualizarCliente vistaActualizarC = new VistaActualizarCliente();
		VistaBorrarCliente vistaBorrarC = new VistaBorrarCliente();
		VistaMostrarCliente vistaMostrarC = new VistaMostrarCliente();

		// Vistas Video
		VistaConsultaVideo vistaConsultaV = new VistaConsultaVideo();
		VistaInsercionVideo vistaInsercionV = new VistaInsercionVideo();
		VistaActualizarVideo vistaActualizarV = new VistaActualizarVideo();
		VistaBorrarVideo vistaBorrarV = new VistaBorrarVideo();
		VistaMostrarVideo vistaMostrarV = new VistaMostrarVideo();
		VistaPrestamo vistaPrestamo = new VistaPrestamo();
		VistaDevolver vistaDevolver = new VistaDevolver();

		/// Controlador existe
		ControladorExiste controladorExiste = new ControladorExiste(vistaExiste);

		// Controladores Cliente
		ControladorMostrarCliente controladorMostrarC = new ControladorMostrarCliente(modeloCliente, vistaMostrarC,
				controladorExiste);
		ControladorConsultaCliente controladorConsultaC = new ControladorConsultaCliente(vistaConsultaC,
				controladorMostrarC);
		ControladorInsercionCliente controladorInsercionC = new ControladorInsercionCliente(modeloCliente,
				vistaInsercionC);
		ControladorActualizarCliente controladorActualizarC = new ControladorActualizarCliente(modeloCliente,
				vistaActualizarC, controladorExiste);
		ControladorBorrarCliente controladorBorrarC = new ControladorBorrarCliente(modeloCliente, vistaBorrarC,
				controladorExiste);

		// Controladores Video
		ControladorMostrarVideo controladorMostrarV = new ControladorMostrarVideo(modeloVideo, vistaMostrarV,
				controladorExiste);
		ControladorConsultaVideo controladorConsultaV = new ControladorConsultaVideo(vistaConsultaV,
				controladorMostrarV);
		ControladorInsercionVideo controladorInsercionV = new ControladorInsercionVideo(modeloVideo, vistaInsercionV);
		ControladorActualizarVideo controladorActualizarV = new ControladorActualizarVideo(modeloVideo,
				vistaActualizarV, controladorExiste);
		ControladorBorrarVideo controladorBorrarV = new ControladorBorrarVideo(modeloVideo, vistaBorrarV,
				controladorExiste);
		ControladorPrestamo controladorPrestamo = new ControladorPrestamo(modeloCliente, modeloVideo, vistaPrestamo,
				controladorExiste);
		ControladorDevolver controladorDevolver = new ControladorDevolver(modeloVideo, vistaDevolver,
				controladorExiste);

		// Controlador opciones
		ControladorOpciones controladorOpciones = new ControladorOpciones(vistaOpciones, controladorConsultaC,
				controladorInsercionC, controladorActualizarC, controladorBorrarC, controladorConsultaV,
				controladorInsercionV, controladorActualizarV, controladorBorrarV, controladorPrestamo,
				controladorDevolver);

		// Inicia la vista inicial opciones
		controladorOpciones.iniciarVista();
	}
}
