package logica;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "RESPONSABLE")
public class Responsable extends Persona{
	
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

}
