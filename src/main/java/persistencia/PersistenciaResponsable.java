package persistencia;

import java.util.List;

import logica.Responsable;

public class PersistenciaResponsable {
	
	ResponsableJpaController responsableJPAController = new ResponsableJpaController();
	
	public void crearResponsable(Responsable responsable) {
		responsableJPAController.create(responsable);
	}
	
	public List<Responsable> obtenerResponsables(){
		return responsableJPAController.findResponsableEntities();
	}
	
	public Responsable obtenerResponsablePorId(Long id){
		return responsableJPAController.findResponsable(id);
	}
	
	public void actualizarResponsable(Responsable responsable) throws Exception {
		responsableJPAController.edit(responsable);
	}
	
	public void eliminarResponsable(Long id) throws Exception{
		responsableJPAController.destroy(id);
	}

}
