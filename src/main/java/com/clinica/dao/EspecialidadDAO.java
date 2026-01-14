package com.clinica.dao;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.clinica.dao.jpa.EspecialidadJpaController;
import com.clinica.model.Especialidad;

public class EspecialidadDAO {
	
	EspecialidadJpaController especialidadJPAController = new EspecialidadJpaController();
	
	public static final Logger logger = LogManager.getLogger(EspecialidadDAO.class);
	
	public void crearEspecialidad(Especialidad especialidad) {
		especialidadJPAController.create(especialidad);
		logger.info("La especialidad {}. fue creada", especialidad);
	}
	
	public List<Especialidad> obtenerEspecialidad(){
		List<Especialidad> especialidades = especialidadJPAController.findEspecialidadEntities();
		logger.info("Se encontraron las especialidades: \n {}", especialidades);
		
		return especialidades;
	}
	
	public Especialidad obtenerEspecialidadPorId(Long id) {
		Especialidad especialidad = especialidadJPAController.findEspecialidad(id);
		logger.info("Se encontro la especialidad: {}", especialidad);
		return especialidad;
	}
	
	public void actualizarEspecialidad(Especialidad especialidad) throws Exception {
		especialidadJPAController.edit(especialidad);
		logger.info("La especialidad {} fue actualizada", especialidad);
	}
	
	public void eliminarEspecialidad(Long id) throws Exception{
		especialidadJPAController.destroy(id);
		logger.info("La especialidad con id: {} fue eliminada", id);
	}

}
