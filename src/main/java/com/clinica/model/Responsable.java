package com.clinica.model;

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

	
	/* Getters y Setters */
	
	public String getParentesco() {
		return parentesco;
	}

	public void setParentesco(String parentesco) {
		this.parentesco = parentesco;
	}

	@Override
	public String toString() {
		return "\n Responsable -> parentesco: " + parentesco + "\n";
	}
	
	

}
