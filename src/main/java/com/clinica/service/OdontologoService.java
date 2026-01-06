package com.clinica.service;

import java.sql.SQLException;
import java.util.List;

import com.clinica.dao.OdontologoDAO;
import com.clinica.model.Odontologo;

public class OdontologoService {
	
	OdontologoDAO odontologoDAO = new OdontologoDAO();
	
	public OdontologoService() {
		
	}
	
	public void crearOdontologo(Odontologo odontologo) throws SQLException {
		odontologoDAO.crearOdontologo(odontologo);
	}
	
	public List<Odontologo> obtenerOdontologos() throws SQLException {
		return odontologoDAO.obtenerOdontologos();
	}
	
	public Odontologo obtenerOdontologoPorId(Long id) throws SQLException {
		return odontologoDAO.obtenerOdontologoPorId(id);
	}
	
	public void actualizarOdontologo(Odontologo odontologo) throws Exception {
		odontologoDAO.actualizarOdontologo(odontologo);
	}
	
	public void eliminarOdontologo(Long id) throws Exception {
		odontologoDAO.eliminarOdontologo(id);
	}

}
