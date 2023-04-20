package controllers;

import javax.swing.JFrame;

import models.Proyecto;
import models.Cientifico;
import models.AsignadoA;

import models.ModeloProyecto;
import models.ModeloCientifico;
import models.ModeloAsignadoA;

import views.VistaMostrarProyecto;
import views.VistaMostrarCientifico;
import views.VistaMostrarAsignadoA;

public class ControladorMostrar {
	private Proyecto proyecto;
	private Cientifico cientifico;
	private AsignadoA asignadoA;

	private ModeloProyecto modeloProyecto;
	private ModeloCientifico modeloCientifico;
	private ModeloAsignadoA modeloAsignadoA;

	private VistaMostrarProyecto vistaMostrarProyecto;
	private VistaMostrarCientifico vistaMostrarCientifico;
	private VistaMostrarAsignadoA vistaMostrarAsignadoA;

	public ControladorMostrar(ModeloProyecto modP, ModeloCientifico modC, ModeloAsignadoA modA,
			VistaMostrarProyecto vistP, VistaMostrarCientifico vistC, VistaMostrarAsignadoA vistA) {

		this.vistaMostrarProyecto = vistP;
		this.vistaMostrarCientifico = vistC;
		this.vistaMostrarAsignadoA = vistA;

		this.modeloProyecto = modP;
		this.modeloCientifico = modC;
		this.modeloAsignadoA = modA;

	}

	public void iniciarVista(String id, int opcion) {
		if (opcion == 1) {
			proyecto = modeloProyecto.consultarProyecto(id);
			vistaMostrarProyecto.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			vistaMostrarProyecto.setLocationRelativeTo(null);
			vistaMostrarProyecto.setTitle("Mostrar proyecto");
			vistaMostrarProyecto.setVisible(true);
			mostrarProyecto();
		} else if (opcion == 2) {
			cientifico = modeloCientifico.consultarCientifico(id);
			vistaMostrarCientifico.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			vistaMostrarCientifico.setLocationRelativeTo(null);
			vistaMostrarCientifico.setTitle("Mostrar cientifico");
			vistaMostrarCientifico.setVisible(true);
			mostrarCientifico();
		} else if (opcion == 3) {
			asignadoA = modeloAsignadoA.consultarAsignadoA(id);
			vistaMostrarAsignadoA.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			vistaMostrarAsignadoA.setLocationRelativeTo(null);
			vistaMostrarAsignadoA.setTitle("Mostrar asignacion");
			vistaMostrarAsignadoA.setVisible(true);
			mostrarAsignadoA();
		}
	}

	public void mostrarProyecto() {
		vistaMostrarProyecto.labelId.setText(proyecto.getId());
		vistaMostrarProyecto.labelNombre.setText(proyecto.getNombre());
		vistaMostrarProyecto.labelHoras.setText(Integer.toString(proyecto.getHoras()));
	}

	public void mostrarCientifico() {
		vistaMostrarCientifico.labelDni.setText(cientifico.getDni());
		vistaMostrarCientifico.labelNombre.setText(cientifico.getNomApels());
	}

	public void mostrarAsignadoA() {
		vistaMostrarAsignadoA.labelId.setText(asignadoA.getId());
		vistaMostrarAsignadoA.labelProyecto.setText(asignadoA.getProyectoId());
		vistaMostrarAsignadoA.labelCientifico.setText(asignadoA.getCientificoId());
	}
}
