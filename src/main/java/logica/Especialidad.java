package logica;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ESPECIALIDAD")
public class Especialidad {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idEspecialidad;
	
	private String especialidad;
	

	public Especialidad() {
		
	}
	
	public Especialidad(int idEspecialidad, String especialidad) {
		this.idEspecialidad = idEspecialidad;
		this.especialidad = especialidad;
	}
	
	public Especialidad(String especialidad) {
		this.especialidad = especialidad;
	}


	/* Getters y Setters */
	
	public int getIdEspecialidad() {
		return idEspecialidad;
	}

	public void setIdEspecialidad(int idEspecialidad) {
		this.idEspecialidad = idEspecialidad;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}


	@Override
	public String toString() {
		return "Especialidad -> { \n idEspecialidad: " + idEspecialidad + ", \n especialidad: " + especialidad + "";
	}
	
}
