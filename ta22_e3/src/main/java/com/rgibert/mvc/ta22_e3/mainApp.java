package com.rgibert.mvc.ta22_e3;

// Modelos
import models.ModeloProyecto;
import models.ModeloCientifico;
import models.ModeloAsignadoA;

// Controladores
import controllers.ControladorOpciones;
import controllers.ControladorBorrar;
import controllers.ControladorConsulta;
import controllers.ControladorInsercionActualizar;
import controllers.ControladorMostrar;

//Vistas
import views.VistaOpciones;
import views.VistaBorrar;
import views.VistaConsulta;
import views.VistaInsercionActualizar;
import views.VistaMostrarAsignadoA;
import views.VistaMostrarCientifico;
import views.VistaMostrarProyecto;

public class mainApp {
	public static void main(String[] args) {

		// Modelo Proyecto
		ModeloProyecto modeloProyecto = new ModeloProyecto();

		// Modelo Cientifico
		ModeloCientifico modeloCientifico = new ModeloCientifico();

		// Modelo AsignadoA
		ModeloAsignadoA modeloAsignadoA = new ModeloAsignadoA();

		// Vistas mostrar
		VistaMostrarProyecto vistaMostrarProyecto = new VistaMostrarProyecto();
		VistaMostrarCientifico vistacVistaMostrarCientifico = new VistaMostrarCientifico();
		VistaMostrarAsignadoA vistaMostrarAsignadoA = new VistaMostrarAsignadoA();

		// Vistas comunes
		VistaOpciones vistaOpciones = new VistaOpciones();
		VistaConsulta vistaConsulta = new VistaConsulta();
		VistaBorrar vistaBorrar = new VistaBorrar();
		VistaInsercionActualizar vistaInsercionActualizar = new VistaInsercionActualizar();

		// Controlador mostrar
		ControladorMostrar controladorMostrar = new ControladorMostrar(modeloProyecto, modeloCientifico,
				modeloAsignadoA, vistaMostrarProyecto, vistacVistaMostrarCientifico, vistaMostrarAsignadoA);

		// Controladores comunes
		ControladorConsulta controladorConsulta = new ControladorConsulta(vistaConsulta, controladorMostrar);
		ControladorBorrar controladorBorrar = new ControladorBorrar(modeloProyecto, modeloCientifico, modeloAsignadoA,
				vistaBorrar);
		ControladorInsercionActualizar controladorInsercionActualizar = new ControladorInsercionActualizar(
				modeloProyecto, modeloCientifico, modeloAsignadoA, vistaInsercionActualizar);

		// Controlador opciones
		ControladorOpciones controladorOpciones = new ControladorOpciones(vistaOpciones, controladorConsulta,
				controladorBorrar, controladorInsercionActualizar);

		// Inicia la vista inicial opciones
		controladorOpciones.iniciarVista();
	}
}
