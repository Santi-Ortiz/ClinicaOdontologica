package com.clinica.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.clinica.model.Especialidad;
import com.clinica.service.EspecialidadService;
import com.opensymphony.xwork2.ActionSupport;

public class EspecialidadAction extends ActionSupport {

	private static final Logger logger = LogManager.getLogger(EspecialidadAction.class);

	private static final long serialVersionUID = 1L;

	private EspecialidadService especialidadService;

	private List<Especialidad> especialidades;

	private Especialidad especialidad;

	private Long especialidad_id;

	public EspecialidadAction() {
		this.especialidadService = new EspecialidadService();
		this.especialidades = new ArrayList<>();
		this.especialidad = new Especialidad();
	}

	public String crearEspecialidad() throws SQLException {
		try {
			especialidadService.crearEspecialidad(especialidad);
		} catch (SQLException e) {
			logger.error("Excepción de SQL: " + e);
			return ERROR;
		} catch (Exception e) {
			logger.error("Error (LOG): " + e);
			return ERROR;
		}

		return SUCCESS;
	}

	public String obtenerEspecialidades() throws SQLException {
		try {
			especialidades = especialidadService.obtenerEspecialidades();
		} catch (SQLException e) {
			logger.error("Excepción de SQL: " + e);
			return ERROR;
		} catch (Exception e) {
			logger.error("Error (LOG): " + e);
			return ERROR;
		}

		return SUCCESS;
	}

	public String obtenerEspecialidadPorId() throws SQLException {
		try {
			especialidad = especialidadService.obtenerEspecialidadPorId(especialidad_id);
		} catch (SQLException e) {
			logger.error("Excepción de SQL: " + e);
			return ERROR;
		} catch (Exception e) {
			logger.error("Error (LOG): " + e);
			return ERROR;
		}

		return SUCCESS;
	}

	public String actualizarEspecialidad() throws SQLException {
		try {
			especialidadService.actualizarEspecialidad(especialidad);
		} catch (SQLException e) {
			logger.error("Excepción de SQL: " + e);
			return ERROR;
		} catch (Exception e) {
			logger.error("Error (LOG): " + e);
			return ERROR;
		}

		return SUCCESS;
	}

	public String eliminarEspecialidad() throws SQLException {
		try {
			especialidadService.eliminarEspecialidad(especialidad_id);
		} catch (SQLException e) {
			logger.error("Excepción de SQL: " + e);
			return ERROR;
		} catch (Exception e) {
			logger.error("Error (LOG): " + e);
			return ERROR;
		}

		return SUCCESS;
	}

	/* Getters y Setters */

	public EspecialidadService getEspecialidadService() {
		return especialidadService;
	}

	public void setEspecialidadService(EspecialidadService especialidadService) {
		this.especialidadService = especialidadService;
	}

	public List<Especialidad> getEspecialidades() {
		return especialidades;
	}

	public void setEspecialidades(List<Especialidad> especialidades) {
		this.especialidades = especialidades;
	}

	public Especialidad getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}

	public Long getEspecialidad_id() {
		return especialidad_id;
	}

	public void setEspecialidad_id(Long especialidad_id) {
		this.especialidad_id = especialidad_id;
	}

}
