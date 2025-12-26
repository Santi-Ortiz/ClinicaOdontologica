package logica;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TURNO")
public class Turno {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long turnoId;
	
	private Date fechaTurno;
	
	private int duracionConsulta;
	
	// Desde el lado de Turno, se tiene la relación muchos a uno
	// Se ubica el nombre idTurno_odontologo ya que referencia a la llave primaria de Odontologo
	@ManyToOne
	@JoinColumn(name="persona_id")
	private Odontologo odontologo;
	
	@OneToOne
	private Paciente paciente;

	public Turno() {
		
	}

	public Turno(Long turnoId, Date fechaTurno, int duracionConsulta, Odontologo odontologo, Paciente paciente) {
		super();
		this.turnoId = turnoId;
		this.fechaTurno = fechaTurno;
		this.duracionConsulta = duracionConsulta;
		this.odontologo = odontologo;
		this.paciente = paciente;
	}

	/* Getters y Setters */

	public Long getTurnoId() {
		return turnoId;
	}

	public void setTurnoId(Long turnoId) {
		this.turnoId = turnoId;
	}

	public Date getFechaTurno() {
		return fechaTurno;
	}

	public void setFechaTurno(Date fechaTurno) {
		this.fechaTurno = fechaTurno;
	}

	public int getDuracionConsulta() {
		return duracionConsulta;
	}

	public void setDuracionConsulta(int duracionConsulta) {
		this.duracionConsulta = duracionConsulta;
	}

	public Odontologo getOdontologo() {
		return odontologo;
	}

	public void setOdontologo(Odontologo odontologo) {
		this.odontologo = odontologo;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	
}
