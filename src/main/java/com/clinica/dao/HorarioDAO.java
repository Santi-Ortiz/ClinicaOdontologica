package com.clinica.dao;

import java.util.List;

import com.clinica.dao.jpa.HorarioJpaController;
import com.clinica.model.Horario;

public class HorarioDAO {
	
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
