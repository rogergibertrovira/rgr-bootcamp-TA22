package controllers;

import javax.swing.JFrame;

import models.ModeloCliente;
import views.VistaMostrar;

public class ControladorMostrar {
	private ModeloCliente modelo;
	private VistaMostrar vista;
	private ControladorExiste controladorExiste;

	public ControladorMostrar(ModeloCliente mod, VistaMostrar vis, ControladorExiste contExiste) {
		this.modelo = mod;
		this.vista = vis;
		this.controladorExiste = contExiste;
	}

	public void iniciarVista(int id) {
		boolean existeCliente = modelo.consultarCliente(id);
		vista.setTitle("Mostrar cliente");
		vista.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		vista.setLocationRelativeTo(null);
		if (existeCliente) {
			vista.setVisible(true);
			mostrarCliente(id);
		}else {
			controladorExiste.iniciarVista();
		}
	}

	public void mostrarCliente(int id) {
		vista.labelId.setText(Integer.toString(modelo.getId()));
		vista.labelNombre.setText(modelo.getNombre());
		vista.labelApellido.setText(modelo.getApellido());
		vista.labelDireccion.setText(modelo.getDireccion());
		vista.labelDni.setText(Integer.toString(modelo.getDni()));
		vista.labelFecha.setText(modelo.getFecha().toString());
	}
}
