package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.DateTimeException;
import java.time.LocalDate;

import javax.swing.JFrame;

import models.ModeloCliente;
import views.VistaActualizarCliente;

public class ControladorActualizarCliente implements ActionListener {

	private ModeloCliente modelo;
	private VistaActualizarCliente vista;
	private ControladorExiste controladorExiste;

	// Atributos de cliente necesarios
	private int id;
	private String nombre;
	private String apellido;
	private String direccion;
	private int dni;
	private String fecha;

	public ControladorActualizarCliente(ModeloCliente mod, VistaActualizarCliente vis, ControladorExiste contExiste) {
		this.modelo = mod;
		this.vista = vis;
		this.controladorExiste = contExiste;
		this.vista.buttonActualizar.addActionListener(this);
	}

	public void iniciarVista() {
		vista.setTitle("Actualizar cliente");
		vista.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		vista.setLocationRelativeTo(null);
		vista.setVisible(true);
	}

	public void actionPerformed(ActionEvent evt) {
		if (evt.getSource() == vista.buttonActualizar) {
			// Si los campos no están vacios
			if (!"".equals(vista.tfNombre.getText()) && !"".equals(vista.tfApellido.getText())
					&& !"".equals(vista.tfDireccion.getText()) && !"".equals(vista.tfDni.getText())
					&& !"".equals(vista.tfFecha.getText())) {
				try {
					id = Integer.parseInt(vista.tfId.getText());
					// Comprueba el formato del id
					if (id >= 0) {
						nombre = vista.tfNombre.getText();
						apellido = vista.tfApellido.getText();
						direccion = vista.tfDireccion.getText();
						dni = Integer.parseInt(vista.tfDni.getText());
						fecha = vista.tfFecha.getText();
						LocalDate fechaLocalDate = LocalDate.parse(fecha);

						// Comprueba el formato del dni (8 digitos)
						if ((int) (Math.log10(dni) + 1) == 8) {
							boolean clienteExiste = modelo.actualizarCliente(id, nombre, apellido, direccion, dni,
									fechaLocalDate);
							limpiarTextFields();
							vista.dispose();
							if(!clienteExiste) {
								controladorExiste.iniciarVista(1);
							}
						} else {
							throw new NumberFormatException("Numero negativo");
						}
					}
				} catch (NumberFormatException ex1) {
					System.out.println("ERROR FORMATO DNI");
				} catch (DateTimeException ex2) {
					System.out.println("ERROR FORMATO FECHA (yyyy-MM-dd)");
				}
			}
		}
	}
	
	public void limpiarTextFields() {
		vista.tfId.setText("");
		vista.tfNombre.setText("");
		vista.tfApellido.setText("");
		vista.tfDireccion.setText("");
		vista.tfDni.setText("");
		vista.tfFecha.setText("");
	}
}
