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
	
	private String tipoTratamiento;
	
	private String rh;
	
	@OneToOne
	private Responsable responsable;
	
	// La relación con Turno es uno a muchos, un paciente tiene muchos turnos
	// Se establece el nombre del atributo de 'Paciente' en 'Turno'
	@OneToMany(mappedBy = "paciente")
	private List<Turno> turnos;
	
	public Paciente() {
		
	}

	public Paciente(String enfermedad, String tipoTratamiento, String rh, Responsable responsable, List<Turno> turnos) {
		super();
		this.enfermedad = enfermedad;
		this.tipoTratamiento = tipoTratamiento;
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
		return tipoTratamiento;
	}

	public void setTipoTratamiento(String tipoTratamiento) {
		this.tipoTratamiento = tipoTratamiento;
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
		return "\n Paciente -> enfermedad: " + enfermedad + ", tipoTratamiento: " + tipoTratamiento + ", rh: " + rh
				+ ", responsable: " + responsable + ", turnos: " + turnos + "\n";
	}
	
	

}
