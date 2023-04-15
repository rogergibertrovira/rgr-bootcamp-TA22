package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.DateTimeException;
import java.time.LocalDate;

import models.ModeloCliente;
import views.VistaInsercion;

public class ControladorInsercion implements ActionListener {

	private ModeloCliente modelo;
	private VistaInsercion vista;

	// Atributos de cliente necesarios
	private String nombre;
	private String apellido;
	private String direccion;
	private int dni;
	private String fecha;

	public ControladorInsercion(ModeloCliente mod, VistaInsercion vis) {
		this.modelo = mod;
		this.vista = vis;
		this.vista.buttonInserir.addActionListener(this);
	}

	public void iniciarVista() {
		vista.setLocationRelativeTo(null);
		vista.setVisible(true);
	}

	public void actionPerformed(ActionEvent evt) {
		if (evt.getSource() == vista.buttonInserir) {
			// Si los campos no están vacios
			if (!"".equals(vista.tfNombre.getText()) && !"".equals(vista.tfApellido.getText())
					&& !"".equals(vista.tfDireccion.getText()) && !"".equals(vista.tfDni.getText())
					&& !"".equals(vista.tfFecha.getText())) {
				try {
					nombre = vista.tfNombre.getText();
					apellido = vista.tfApellido.getText();
					direccion = vista.tfDireccion.getText();
					dni = Integer.parseInt(vista.tfDni.getText());
					fecha = vista.tfFecha.getText();
					LocalDate fechaLocalDate = LocalDate.parse(fecha);
					
					// Comprueba el formato del dni (8 digitos)
					if ((int) (Math.log10(dni) + 1) == 8) {
						modelo.inserirCliente(nombre, apellido, direccion, dni, fechaLocalDate);
						vista.dispose();
					} else {
						throw new NumberFormatException("Numero negativo");
					}
				} catch (NumberFormatException ex1) {
					System.out.println("ERROR FORMATO DNI");
				}
				catch (DateTimeException ex2) {
					System.out.println("ERROR FORMATO FECHA (yyyy-MM-dd)");
				}
			}
		}
	}
}
