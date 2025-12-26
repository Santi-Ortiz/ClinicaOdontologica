package persistencia;

import java.util.List;

import logica.Especialidad;

public class EspecialidadPersistencia {
	
	EspecialidadJpaController especialidadJPAController = new EspecialidadJpaController();
	
	public void crearEspecialidad(Especialidad especialidad) {
		especialidadJPAController.create(especialidad);
	}
	
	public List<Especialidad> obtenerEspecialidad(){
		return especialidadJPAController.findEspecialidadEntities();
	}
	
	public Especialidad obtenerEspecialidadPorId(Long id) {
		return especialidadJPAController.findEspecialidad(id);
	}
	
	public void actualizarEspecialidad(Especialidad especialidad) throws Exception  {
		especialidadJPAController.edit(especialidad);
	}
	
	public void eliminarEspecialidad(Long id) throws Exception{
		especialidadJPAController.destroy(id);
	}

}
