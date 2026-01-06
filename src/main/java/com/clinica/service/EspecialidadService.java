package com.clinica.service;

import java.sql.SQLException;
import java.util.List;

import com.clinica.dao.EspecialidadDAO;
import com.clinica.model.Especialidad;

public class EspecialidadService {
	
	EspecialidadDAO especialidadDAO = new EspecialidadDAO();
	
	public EspecialidadService() {
		
	}
	
	public void crearEspecialidad(Especialidad especialidad) throws SQLException {
		especialidadDAO.crearEspecialidad(especialidad);
	}
	
	public List<Especialidad> obtenerEspecialidades() throws SQLException {
		return especialidadDAO.obtenerEspecialidad();
	}
	
	public Especialidad obtenerEspecialidadPorId(Long id) throws SQLException {
		return especialidadDAO.obtenerEspecialidadPorId(id);
	}
	
	public void actualizarEspecialidad(Especialidad especialidad) throws Exception {
		especialidadDAO.actualizarEspecialidad(especialidad);
	}
	
	public void eliminarEspecialidad(Long id) throws Exception{
		especialidadDAO.eliminarEspecialidad(id);
	}

}
