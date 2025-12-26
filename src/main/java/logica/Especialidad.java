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
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long especialidad_id;
	
	private String especialidad;
	

	public Especialidad() {
		
	}
	
	public Especialidad(Long especialidad_id, String especialidad) {
		this.especialidad_id = especialidad_id;
		this.especialidad = especialidad;
	}
	
	public Especialidad(String especialidad) {
		this.especialidad = especialidad;
	}


	/* Getters y Setters */
	
	public Long getEspecialidadId() {
		return especialidad_id;
	}

	public void setEspecialidadId(Long especialidad_id) {
		this.especialidad_id = especialidad_id;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}


	@Override
	public String toString() {
		return "Especialidad -> { \n especialidadId: " + especialidad_id + ", \n especialidad: " + especialidad + "";
	}
	
}
