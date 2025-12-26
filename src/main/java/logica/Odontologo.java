package logica;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ODONTOLOGO")
public class Odontologo extends Persona{

	@OneToOne
	private Especialidad especialidad;

	@OneToOne
	private Horario horario;
	
	// La relación con Turno es uno a muchos, un odontológo tiene muchos turnos
	// Se establece el nombre del atributo de Odontologo en Turno
	@OneToMany(mappedBy="odontologo")
	private List<Turno> turnos;
	
	public Odontologo() {
		
	}
	
	public Odontologo(Especialidad especialidad, Horario horario, List<Turno> turnos) {
		super();
		this.especialidad = especialidad;
		this.horario = horario;
		this.turnos = turnos;
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

	public List<Turno> getTurnos() {
		return turnos;
	}

	public void setTurnos(List<Turno> turnos) {
		this.turnos = turnos;
	}

	@Override
	public String toString() {
		return "\n Odontologo -> especialidad: " + especialidad + ", horario: " + horario + ", turnos: " + turnos + "\n";
	}
	
	

}
