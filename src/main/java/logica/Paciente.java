package logica;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "PACIENTE")
public class Paciente extends Persona{
	
	private String enfermedad;
	
	private String tipoTratamiento;
	
	private String rh;
	
	private Responsable responsable;
	
	public Paciente() {
		
	}

	public Paciente(String enfermedad, String tipoTratamiento, String rh, Responsable responsable) {
		super();
		this.enfermedad = enfermedad;
		this.tipoTratamiento = tipoTratamiento;
		this.rh = rh;
		this.responsable = responsable;
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

}
