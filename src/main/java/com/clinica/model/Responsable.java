package com.clinica.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "RESPONSABLE")
public class Responsable extends Persona{
	
	@Column(nullable = false)
	private String parentesco;
	
	public Responsable() {
		
	}
	
	public Responsable(String parentesco) {
		super();
		this.parentesco = parentesco;
	}


	public Responsable(int numero_identificacion, String nombre, int telefono, Date fecha_nacimiento, String parentesco) {
		super(numero_identificacion, nombre, telefono, fecha_nacimiento);
		this.parentesco = parentesco;
	}

	
	/* Getters y Setters */
	
	public String getParentesco() {
		return parentesco;
	}

	public void setParentesco(String parentesco) {
		this.parentesco = parentesco;
	}

	@Override
	public String toString() {
		return "Responsable -> parentesco: " + parentesco + "\n";
	}
	
	

}
