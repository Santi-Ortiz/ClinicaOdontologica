package logica;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "HORARIO")
public class Horario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long horarioId;
	
	private Date fechaInicio;
	
	private Date fechaFin;
	
	public Horario() {
		
	}
	
	public Horario(Long horarioId, Date fechaInicio, Date fechaFin) {
		this.horarioId = horarioId;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
	}

	public Long getHorarioId() {
		return horarioId;
	}

	public void setHorarioId(Long horarioId) {
		this.horarioId = horarioId;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	@Override
	public String toString() {
		return "\n Horario -> horarioId: " + horarioId + ", fechaInicio: " + fechaInicio + ", fechaFin: " + fechaFin + "\n";
	}
	
	
	
}
