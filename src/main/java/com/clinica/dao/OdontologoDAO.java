package com.clinica.dao;

import java.util.List;

import com.clinica.dao.jpa.OdontologoJpaController;
import com.clinica.model.Odontologo;

public class OdontologoDAO {

	OdontologoJpaController odontologoJPAController = new OdontologoJpaController();
	
	public void crearOdontologo(Odontologo Odontologo) {
		odontologoJPAController.create(Odontologo);
	}
	
	public List<Odontologo> obtenerOdontologos(){
		return odontologoJPAController.findOdontologoEntities();
	}
	
	public Odontologo obtenerOdontologoPorId(Long id){
		return odontologoJPAController.findOdontologo(id);
	}
	
	public void actualizarOdontologo(Odontologo Odontologo) throws Exception {
		odontologoJPAController.edit(Odontologo);
	}
	
	public void eliminarOdontologo(Long id) throws Exception{
		odontologoJPAController.destroy(id);
	}
}
