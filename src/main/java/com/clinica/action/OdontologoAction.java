package com.clinica.action;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.clinica.model.Especialidad;
import com.clinica.model.Horario;
import com.clinica.model.Odontologo;
import com.clinica.service.EspecialidadService;
import com.clinica.service.OdontologoService;
import com.opensymphony.xwork2.ActionSupport;

public class OdontologoAction extends ActionSupport {

	private static final Logger logger = LogManager.getLogger(OdontologoAction.class);

	private static final long serialVersionUID = 1L;
	
	// Atributos de JSP

	private Long odontologo_id;
	
	private Long especialidad_id;
	
	private Date fechaInicio;
	
	private Date fechaFin;
	
	//Servicios

	private OdontologoService odontologoService;
	
	private EspecialidadService especialidadService;
	
	// Objetos y Listas

	private Odontologo odontologo;

	private List<Especialidad> especialidades;
	
	private List<Odontologo> odontologos;

	public OdontologoAction() {
		this.odontologoService = new OdontologoService();
		this.odontologos = new ArrayList<>();
		this.odontologo = new Odontologo();
		this.especialidadService = new EspecialidadService();
	}

	/* Métodos para CRUD de Odontologo */

	public String crearOdontologo() throws SQLException {
		
		try {
			Especialidad especialidad = especialidadService.obtenerEspecialidadPorId(especialidad_id);
			
			Horario horario = new Horario();
			horario.setFechaInicio(fechaInicio);
			horario.setFechaFin(fechaFin);
			
			odontologo.setEspecialidad(especialidad);
			odontologo.setHorario(horario);
			
			odontologoService.crearOdontologo(odontologo);
		} catch (SQLException e) {
			logger.error("Excepción de SQL: " + e);
			return ERROR;
		} catch (Exception e) {
			logger.error("Error (LOG): " + e);
			return ERROR;
		}

		return SUCCESS;

	}

	public String obtenerOdontologos() throws SQLException {

		try {
			odontologos = odontologoService.obtenerOdontologos();
			logger.info("Odontologos encontrados: {}", odontologos);
		} catch (SQLException e) {
			logger.error("Excepción de SQL (LOG): " + e);
			return ERROR;
		} catch (Exception e) {
			logger.error("Error (LOG): " + e);
			return ERROR;
		}

		return SUCCESS;
	}

	public String obtenerOdontologoPorId() throws SQLException {

		try {
			odontologo = odontologoService.obtenerOdontologoPorId(odontologo_id);
		} catch (SQLException e) {
			logger.error("Excepción de SQL (LOG): " + e);
			return ERROR;
		} catch (Exception e) {
			logger.error("Error (LOG): " + e);
			return ERROR;
		}

		return SUCCESS;
	}

	public String actualizarOdontologo() throws SQLException {

		try {
			odontologoService.actualizarOdontologo(odontologo);
		} catch (SQLException e) {
			logger.error("Excepción de SQL (LOG): " + e);
			return ERROR;
		} catch (Exception e) {
			logger.error("Error (LOG): " + e);
			return ERROR;
		}

		return SUCCESS;
	}

	public String eliminarOdontologo() throws SQLException {

		try {
			odontologoService.eliminarOdontologo(odontologo_id);
		} catch (SQLException e) {
			logger.error("Excepción de SQL (LOG): " + e);
			return ERROR;
		} catch (Exception e) {
			logger.error("Error (LOG): " + e);
			return ERROR;
		}

		return SUCCESS;
	}
	
	@Override
	public String input() throws SQLException {
		especialidades = especialidadService.obtenerEspecialidades();
		logger.info("Especialidades Cargadas: {}", especialidades);
		return INPUT;
	}

	/* Getters y Setters */

	public OdontologoService getOdontologoService() {
		return odontologoService;
	}

	public Long getOdontologo_id() {
		return odontologo_id;
	}

	public void setOdontologo_id(Long odontologo_id) {
		this.odontologo_id = odontologo_id;
	}

	public void setOdontologoService(OdontologoService odontologoService) {
		this.odontologoService = odontologoService;
	}
	
	public EspecialidadService getEspecialidadService() {
		return especialidadService;
	}

	public void setEspecialidadService(EspecialidadService especialidadService) {
		this.especialidadService = especialidadService;
	}

	public Odontologo getOdontologo() {
		return odontologo;
	}

	public void setOdontologo(Odontologo odontologo) {
		this.odontologo = odontologo;
	}

	public List<Odontologo> getOdontologos() {
		return odontologos;
	}

	public void setOdontologos(List<Odontologo> odontologos) {
		this.odontologos = odontologos;
	}

	public Long getEspecialidad_id() {
		return especialidad_id;
	}

	public void setEspecialidad_id(Long especialidad_id) {
		this.especialidad_id = especialidad_id;
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

	public List<Especialidad> getEspecialidades() {
		return especialidades;
	}

	public void setEspecialidades(List<Especialidad> especialidades) {
		this.especialidades = especialidades;
	}
	
}
