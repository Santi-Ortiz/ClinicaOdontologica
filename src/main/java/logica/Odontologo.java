package logica;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ODONTOLOGO")
public class Odontologo extends Persona{
	
	private Especialidad especialidad;
	
	private Horario horario;
	
	public Odontologo() {
		
	}
	
	public Odontologo(Especialidad especialidad, Horario horario) {
		super();
		this.especialidad = especialidad;
		this.horario = horario;
	}

	
	/* Getters y Setters */
	
	public Especialidad getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}

	public Horario getHorario() {
		return horario;
	}

	public void setHorario(Horario horario) {
		this.horario = horario;
	}
	
}
