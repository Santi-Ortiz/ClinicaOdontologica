package logica;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PACIENTE")
public class Paciente extends Persona{
	
	private String enfermedad;
	
	private String tipo_tratamiento;
	
	private String rh;
	
	@OneToOne
	private Responsable responsable;
	
	// La relación con Turno es uno a muchos, un paciente tiene muchos turnos
	// Se establece el nombre del atributo de 'Paciente' en 'Turno'
	@OneToMany(mappedBy = "paciente")
	private List<Turno> turnos;
	
	public Paciente() {
		
	}

	public Paciente(String enfermedad, String tipo_tratamiento, String rh, Responsable responsable, List<Turno> turnos) {
		super();
		this.enfermedad = enfermedad;
		this.tipo_tratamiento = tipo_tratamiento;
		this.rh = rh;
		this.responsable = responsable;
		this.turnos = turnos;
	}
	

	/* Getters y Setters */

	public String getEnfermedad() {
		return enfermedad;
	}

	public void setEnfermedad(String enfermedad) {
		this.enfermedad = enfermedad;
	}

	public String getTipoTratamiento() {
		return tipo_tratamiento;
	}

	public void setTipoTratamiento(String tipo_tratamiento) {
		this.tipo_tratamiento = tipo_tratamiento;
	}

	public String getRh() {
		return rh;
	}

	public void setRh(String rh) {
		this.rh = rh;
	}

	public Responsable getResponsable() {
		return responsable;
	}

	public void setResponsable(Responsable responsable) {
		this.responsable = responsable;
	}

	public List<Turno> getTurnos() {
		return turnos;
	}

	public void setTurnos(List<Turno> turnos) {
		this.turnos = turnos;
	}

	@Override
	public String toString() {
		return "\n Paciente -> enfermedad: " + enfermedad + ", tipo_tratamiento: " + tipo_tratamiento + ", rh: " + rh
				+ ", responsable: " + responsable + ", turnos: " + turnos + "\n";
	}
	
	

}
