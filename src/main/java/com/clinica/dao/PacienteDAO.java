package com.clinica.dao;

import java.util.List;

import com.clinica.dao.jpa.PacienteJpaController;
import com.clinica.model.Paciente;

public class PacienteDAO {

	PacienteJpaController pacienteJPAController = new PacienteJpaController();
	
	public void crearpaciente(Paciente paciente) {
		pacienteJPAController.create(paciente);
	}
	
	public List<Paciente> obtenerpacientes(){
		return pacienteJPAController.findPacienteEntities();
	}
	
	public Paciente obtenerpacientePorId(Long id){
		return pacienteJPAController.findPaciente(id);
	}
	
	public void actualizarpaciente(Paciente paciente) throws Exception {
		pacienteJPAController.edit(paciente);
	}
	
	public void eliminarpaciente(Long id) throws Exception{
		pacienteJPAController.destroy(id);
	}
}
