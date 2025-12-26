package persistencia;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;

import logica.Turno;

public class TurnoJpaController {
	
	private EntityManagerFactory emf = null;

    public TurnoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
   
    public TurnoJpaController() {
    	emf = Persistence.createEntityManagerFactory("ClinicaOdontologica_PU");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    // Crear (Insertar)
    public void create(Turno Turno) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(Turno);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    // Leer (Encontrar por ID)
    public Turno findTurno(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Turno.class, id);
        } finally {
            em.close();
        }
    }

    // Leer (Encontrar TODOS)
    public List<Turno> findTurnoEntities() {
        return findTurnoEntities(true, -1, -1);
    }

    public List<Turno> findTurnoEntities(int maxResults, int firstResult) {
        return findTurnoEntities(false, maxResults, firstResult);
    }

    private List<Turno> findTurnoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery<Turno> cq = em.getCriteriaBuilder().createQuery(Turno.class);
            cq.select(cq.from(Turno.class));
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
    public void edit(Turno Turno) throws Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Turno = em.merge(Turno);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findTurno(Turno.getTurnoId()) == null) {
                throw new Exception("El Turno con id " + Turno.getTurnoId() + " no existe.");
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
            Turno Turno;
            try {
                Turno = em.getReference(Turno.class, id);
                Turno.getTurnoId();
            } catch (Exception ex) {
                throw new Exception("El Turno con id " + id + " no existe.", ex);
            }
            em.remove(Turno);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

}
