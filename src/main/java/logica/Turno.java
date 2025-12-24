package logica;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TURNO")
public class Turno {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idTurno;
	
	private Date fechaTurno;
	
	private int duracionConsulta;
	
	private Odontologo odontologo;
	
	private Paciente paciente;

	public Turno() {
		
	}

	public Turno(Long idTurno, Date fechaTurno, int duracionConsulta, Odontologo odontologo, Paciente paciente) {
		super();
		this.idTurno = idTurno;
		this.fechaTurno = fechaTurno;
		this.duracionConsulta = duracionConsulta;
		this.odontologo = odontologo;
		this.paciente = paciente;
	}

	/* Getters y Setters */

	public Long getIdTurno() {
		return idTurno;
	}

	public void setIdTurno(Long idTurno) {
		this.idTurno = idTurno;
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
