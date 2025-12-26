package persistencia;

import java.util.List;

import logica.Horario;

public class HorarioPersistencia {
	
	HorarioJpaController horarioJPAController = new HorarioJpaController();
	
	public void crearHorario(Horario horario) {
		horarioJPAController.create(horario);
	}
	
	public List<Horario> obtenerHorarios(){
		return horarioJPAController.findHorarioEntities();
	}
	
	public Horario obtenerHorarioPorId(Long id){
		return horarioJPAController.findHorario(id);
	}
	
	public void actualizarHorario(Horario horario) throws Exception {
		horarioJPAController.edit(horario);
	}
	
	public void eliminarHorario(Long id) throws Exception{
		horarioJPAController.destroy(id);
	}

}
