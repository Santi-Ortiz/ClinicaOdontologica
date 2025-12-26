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
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long persona_id;
	
	private int numero_identificacion;
	
	private String nombre;
	
	private int telefono;
	
	private Date fecha_nacimiento;
	
	public Persona() {
		
	}
	
	public Persona(Long persona_id, int numero_identificacion, String nombre, int telefono, Date fecha_nacimiento) {
		this.persona_id = persona_id;
		this.numero_identificacion = numero_identificacion;
		this.nombre = nombre;
		this.telefono = telefono;
		this.fecha_nacimiento = fecha_nacimiento;
	}
	
	public Persona(int numero_identificacion, String nombre, int telefono, Date fecha_nacimiento) {
		this.numero_identificacion = numero_identificacion;
		this.nombre = nombre;
		this.telefono = telefono;
		this.fecha_nacimiento = fecha_nacimiento;
	}
	
	/* Getters y Setters */

	public Long getPersonaId() {
		return persona_id;
	}

	public void setPersonaId(Long persona_id) {
		this.persona_id = persona_id;
	}
	
	public int getNumeroIdentificacion() {
		return numero_identificacion;
	}
	
	public void setNumeroIdentificacion(int numero_identificacion) {
		this.numero_identificacion = numero_identificacion;
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

	public Date getfechaNacimiento() {
		return fecha_nacimiento;
	}

	public void setfechaNacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	@Override
	public String toString() {
		return "\nPersona -> persona_id: " + persona_id + ", numero_identificacion: " + numero_identificacion + ", nombre: "
				+ nombre + ", telefono: " + telefono + ", fecha_nacimiento: " + fecha_nacimiento + "\n";
	}
	
}

