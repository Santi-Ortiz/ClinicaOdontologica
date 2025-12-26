package logica;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="PERSONA")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) 
// Estrategia TABLE_PER_CLASS crea una tabla para cada una de las clases, incluyendo la clase Padre (Persona)
// El id para Odontologo y Paciente se maneja a través de Persona (clase Padre)
public class Persona{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long personaId;
	
	private int numeroIdentificacion;
	
	private String nombre;
	
	private int telefono;
	
	private Date fechaNacimiento;
	
	public Persona() {
		
	}
	
	public Persona(Long personaId, int numeroIdentificacion, String nombre, int telefono, Date fechaNacimiento) {
		this.personaId = personaId;
		this.numeroIdentificacion = numeroIdentificacion;
		this.nombre = nombre;
		this.telefono = telefono;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public Persona(int numeroIdentificacion, String nombre, int telefono, Date fechaNacimiento) {
		this.numeroIdentificacion = numeroIdentificacion;
		this.nombre = nombre;
		this.telefono = telefono;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	/* Getters y Setters */

	public Long getPersonaId() {
		return personaId;
	}

	public void setPersonaId(Long personaId) {
		this.personaId = personaId;
	}
	
	public int getNumeroIdentificacion() {
		return numeroIdentificacion;
	}
	
	public void setNumeroIdentificacion(int numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "\nPersona -> personaId: " + personaId + ", numeroIdentificacion: " + numeroIdentificacion + ", nombre: "
				+ nombre + ", telefono: " + telefono + ", fechaNacimiento: " + fechaNacimiento + "\n";
	}
	
}

