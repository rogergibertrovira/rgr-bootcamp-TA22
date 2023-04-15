package com.rgibert.mvc.ta22_e1;

import models.ModeloCliente;

import controllers.ControladorActualizar;
import controllers.ControladorBorrar;
import controllers.ControladorConsulta;
import controllers.ControladorExiste;
import controllers.ControladorInsercion;
import controllers.ControladorMostrar;
import controllers.ControladorOpciones;

import views.VistaConsulta;
import views.VistaExiste;
import views.VistaInsercion;
import views.VistaActualizar;
import views.VistaBorrar;
import views.VistaMostrar;
import views.VistaOpciones;

public class mainApp {
	public static void main(String[] args) {
		
		// Modelo
		ModeloCliente modeloCliente = new ModeloCliente();

		// Vistas
		VistaOpciones vistaOpciones = new VistaOpciones();
		VistaConsulta vistaConsulta = new VistaConsulta();
		VistaInsercion vistaInsercion = new VistaInsercion();
		VistaActualizar vistaActualizar = new VistaActualizar();
		VistaBorrar vistaBorrar = new VistaBorrar();
		VistaMostrar vistaMostrar = new VistaMostrar();
		VistaExiste vistaExiste = new VistaExiste();
		
		// Controladores
		ControladorExiste controladorExiste = new ControladorExiste(vistaExiste);
		ControladorMostrar controladorMostrar = new ControladorMostrar(modeloCliente, vistaMostrar, controladorExiste);
		ControladorConsulta controladorConsulta = new ControladorConsulta(modeloCliente, vistaConsulta, controladorMostrar);
		ControladorInsercion controladorInsercion = new ControladorInsercion(modeloCliente, vistaInsercion);
		ControladorActualizar controladorActualizar = new ControladorActualizar(modeloCliente, vistaActualizar, controladorExiste);
		ControladorBorrar controladorBorrar = new ControladorBorrar(modeloCliente, vistaBorrar, controladorExiste);
		ControladorOpciones controladorOpciones = new ControladorOpciones(vistaOpciones, controladorConsulta, controladorInsercion, controladorActualizar, controladorBorrar);
				
		controladorOpciones.iniciarVista();
	}
}
