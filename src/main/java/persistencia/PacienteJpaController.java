package persistencia;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import logica.Paciente;

public class PacienteJpaController {

	private EntityManagerFactory emf = null;

    public PacienteJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
   
    public PacienteJpaController() {
    	emf = Persistence.createEntityManagerFactory("ClinicaOdontologica_PU");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    // Crear (Insertar)
    public void create(Paciente paciente) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(paciente);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    // Leer (Encontrar por ID)
    public Paciente findPaciente(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Paciente.class, id);
        } finally {
            em.close();
        }
    }

    // Leer (Encontrar TODOS)
    public List<Paciente> findPacienteEntities() {
        return findPacienteEntities(true, -1, -1);
    }

    public List<Paciente> findPacienteEntities(int maxResults, int firstResult) {
        return findPacienteEntities(false, maxResults, firstResult);
    }

    private List<Paciente> findPacienteEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery<Paciente> cq = em.getCriteriaBuilder().createQuery(Paciente.class);
            cq.select(cq.from(Paciente.class));
            javax.persistence.Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    // Actualizar (Editar)
    public void edit(Paciente paciente) throws Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            paciente = em.merge(paciente);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findPaciente(paciente.getPersonaId()) == null) {
                throw new Exception("La paciente con id " + paciente.getPersonaId() + " no existe.");
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    // Eliminar 
    public void destroy(Long id) throws Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Paciente paciente;
            try {
                paciente = em.getReference(Paciente.class, id);
                paciente.getPersonaId();
            } catch (Exception ex) {
                throw new Exception("La paciente con id " + id + " no existe.", ex);
            }
            em.remove(paciente);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
}
