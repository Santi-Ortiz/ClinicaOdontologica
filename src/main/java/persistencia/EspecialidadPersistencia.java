package persistencia;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import logica.Especialidad;

public class EspecialidadPersistencia {
	
	EspecialidadJpaController especialidadJPAController = new EspecialidadJpaController();
	
	public static final Logger logger = LoggerFactory.getLogger(EspecialidadPersistencia.class);
	
	public void crearEspecialidad(Especialidad especialidad) {
		especialidadJPAController.create(especialidad);
		logger.atDebug().log("La especialidad {}. fue creada", especialidad);
	}
	
	public List<Especialidad> obtenerEspecialidad(){
		List<Especialidad> especialidades = especialidadJPAController.findEspecialidadEntities();
		logger.atDebug().log("Se encontraron las especialidades: \n {}.", especialidades);
		
		return especialidades;
	}
	
	public Especialidad obtenerEspecialidadPorId(Long id) {
		Especialidad especialidad = especialidadJPAController.findEspecialidad(id);
		logger.atDebug().log("Se encontro la especialidad: {}.", especialidad);
		return especialidad;
	}
	
	public void actualizarEspecialidad(Especialidad especialidad) throws Exception {
		especialidadJPAController.edit(especialidad);
		logger.atDebug().log("La especialidad {}. fue actualizada", especialidad);
	}
	
	public void eliminarEspecialidad(Long id) throws Exception{
		especialidadJPAController.destroy(id);
		logger.atDebug().log("La especialidad con id: {}. fue eliminada", id);
	}

}
