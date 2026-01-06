package com.clinica.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.clinica.model.Odontologo;
import com.clinica.service.OdontologoService;
import com.opensymphony.xwork2.ActionSupport;

public class OdontologoAction extends ActionSupport {

	private static final Logger logger = LogManager.getLogger(OdontologoAction.class);

	private static final long serialVersionUID = 1L;

	private Long odontologo_id;

	private OdontologoService odontologoService;

	private Odontologo odontologo;

	private List<Odontologo> odontologos;

	public OdontologoAction() {
		this.odontologoService = new OdontologoService();
		this.odontologos = new ArrayList<>();
		this.odontologo = new Odontologo();
	}

	/* Métodos para CRUD de Odontologo */

	public String crearOdontologo() throws SQLException {

		try {
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

}
