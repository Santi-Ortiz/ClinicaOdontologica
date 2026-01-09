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
			logger.info("Se ha creado correctamente la especialidad");
		} catch (SQLException e) {
			logger.error("Ha ocurrido un error de SQL en crear especialidad: " + e);
			return ERROR;
		} catch (Exception e) {
			logger.error("Ha ocurrido un error en crear especialidad: " + e);
			return ERROR;
		}

		return SUCCESS;
	}

	public String obtenerEspecialidades() throws SQLException {
		try {
			especialidades = especialidadService.obtenerEspecialidades();
			logger.info("Se han obtenido todas las especialidades correctamente");
		} catch (SQLException e) {
			logger.error("Ha ocurrido un error de SQL en obtener todas las especialidades: " + e);
			return ERROR;
		} catch (Exception e) {
			logger.error("Ha ocurrido un error en obtener todas las especialidades: " + e);
			return ERROR;
		}

		return SUCCESS;
	}

	public String obtenerEspecialidadPorId() throws SQLException {
		try {
			especialidad = especialidadService.obtenerEspecialidadPorId(especialidad_id);
			logger.info("Se hanobtenido lasespecialidad con id {} correctamente", especialidad_id);
		} catch (SQLException e) {
			logger.error("Ha ocurrido un error de SQL en obtener la especialidad por id: " + e);
			return ERROR;
		} catch (Exception e) {
			logger.error("Ha ocurrido un error en obtener la especialidad por id: " + e);
			return ERROR;
		}

		return SUCCESS;
	}

	public String actualizarEspecialidad() throws SQLException {
		try {
			especialidadService.actualizarEspecialidad(especialidad);
			logger.info("Se ha actualizado la especialidad correctamente");
		} catch (SQLException e) {
			logger.error("Ha ocurrido un error de SQL en actualizar la especialidad: " + e);
			return ERROR;
		} catch (Exception e) {
			logger.error("Ha ocurrido un error en actualizar la especialidad: " + e);
			return ERROR;
		}

		return SUCCESS;
	}

	public String eliminarEspecialidad() throws SQLException {
		try {
			especialidadService.eliminarEspecialidad(especialidad_id);
			logger.info("Se ha eliminado la especialidad con id {} correctamente", especialidad_id);
		} catch (SQLException e) {
			logger.error("Ha ocurrido un error de SQL en eliminar la especialidad: " + e);
			return ERROR;
		} catch (Exception e) {
			logger.error("Ha ocurrido un error en eliminar la especialidad: " + e);
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
