package persistencia;

import java.util.List;

import logica.Turno;

public class TurnoPersistencia {

	TurnoJpaController turnoJPAController = new TurnoJpaController();
	
	public void crearTurno(Turno turno) {
		turnoJPAController.create(turno);
	}
	
	public List<Turno> obtenerTurnos(){
		return turnoJPAController.findTurnoEntities();
	}
	
	public Turno obtenerTurnoPorId(Long id){
		return turnoJPAController.findTurno(id);
	}
	
	public void actualizarTurno(Turno turno) throws Exception {
		turnoJPAController.edit(turno);
	}
	
	public void eliminarTurno(Long id) throws Exception{
		turnoJPAController.destroy(id);
	}
}
