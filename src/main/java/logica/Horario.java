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
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long horario_id;
	
	private Date fecha_inicio;
	
	private Date fecha_fin;
	
	public Horario() {
		
	}
	
	public Horario(Long horario_id, Date fecha_inicio, Date fecha_fin) {
		this.horario_id = horario_id;
		this.fecha_inicio = fecha_inicio;
		this.fecha_fin = fecha_fin;
	}

	public Long getHorarioId() {
		return horario_id;
	}

	public void setHorarioId(Long horario_id) {
		this.horario_id = horario_id;
	}

	public Date getFechaInicio() {
		return fecha_inicio;
	}

	public void setFechaInicio(Date fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}

	public Date getFechaFin() {
		return fecha_fin;
	}

	public void setFechaFin(Date fecha_fin) {
		this.fecha_fin = fecha_fin;
	}

	@Override
	public String toString() {
		return "\n Horario -> horario_id: " + horario_id + ", fecha_inicio: " + fecha_inicio + ", fecha_fin: " + fecha_fin + "\n";
	}
	
	
	
}
