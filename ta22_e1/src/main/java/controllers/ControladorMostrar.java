package controllers;

import javax.swing.JFrame;

import models.Cliente;
import models.ModeloCliente;
import views.VistaMostrar;

public class ControladorMostrar {
	private ModeloCliente modelo;
	private Cliente cliente; 
	private VistaMostrar vista;
	private ControladorExiste controladorExiste;

	public ControladorMostrar(ModeloCliente mod, VistaMostrar vis, ControladorExiste contExiste) {
		this.modelo = mod;
		this.vista = vis;
		this.controladorExiste = contExiste;
	}

	public void iniciarVista(int id) {
		cliente = modelo.consultarCliente(id);
		vista.setTitle("Mostrar cliente");
		vista.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		vista.setLocationRelativeTo(null);
		
		// Comprueba que cliente existe
		if (cliente.getId() > 0) {
			vista.setVisible(true);
			mostrarCliente(id);
		}else {
			controladorExiste.iniciarVista();
		}
	}

	public void mostrarCliente(int id) {
		vista.labelId.setText(Integer.toString(cliente.getId()));
		vista.labelNombre.setText(cliente.getNombre());
		vista.labelApellido.setText(cliente.getApellido());
		vista.labelDireccion.setText(cliente.getDireccion());
		vista.labelDni.setText(Integer.toString(cliente.getDni()));
		vista.labelFecha.setText(cliente.getFecha().toString());
	}
}
