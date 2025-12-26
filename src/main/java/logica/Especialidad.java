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
	private int especialidadId;
	
	private String especialidad;
	

	public Especialidad() {
		
	}
	
	public Especialidad(int especialidadId, String especialidad) {
		this.especialidadId = especialidadId;
		this.especialidad = especialidad;
	}
	
	public Especialidad(String especialidad) {
		this.especialidad = especialidad;
	}


	/* Getters y Setters */
	
	public int getEspecialidadId() {
		return especialidadId;
	}

	public void setEspecialidadId(int especialidadId) {
		this.especialidadId = especialidadId;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}


	@Override
	public String toString() {
		return "Especialidad -> { \n especialidadId: " + especialidadId + ", \n especialidad: " + especialidad + "";
	}
	
}
