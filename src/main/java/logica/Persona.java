package logica;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="PERSONA")
public class Persona{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idPersona;
	
	private int numeroIdentificacion;
	
	private String nombre;
	
	private int telefono;
	
	private Date fechaNacimiento;
	
	public Persona() {
		
	}
	
	public Persona(int idPersona, int numeroIdentificacion, String nombre, int telefono, Date fechaNacimiento) {
		this.setIdPersona(idPersona);
		this.numeroIdentificacion = numeroIdentificacion;
		this.nombre = nombre;
		this.setTelefono(telefono);
		this.setFechaNacimiento(fechaNacimiento);
	}
	
	public Persona(int numeroIdentificacion, String nombre, int telefono, Date fechaNacimiento) {
		this.numeroIdentificacion = numeroIdentificacion;
		this.nombre = nombre;
		this.setTelefono(telefono);
		this.setFechaNacimiento(fechaNacimiento);
	}
	
	/* Getters y Setters */

	public int getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
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
		return "\nPersona -> idPersona: " + idPersona + ", numeroIdentificacion: " + numeroIdentificacion + ", nombre: "
				+ nombre + ", telefono: " + telefono + ", fechaNacimiento: " + fechaNacimiento + "\n";
	}
	
	
	
	

}

