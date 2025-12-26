package persistencia;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;

import logica.Responsable;

public class ResponsableJpaController {

	private EntityManagerFactory emf = null;

    public ResponsableJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
   
    public ResponsableJpaController() {
    	emf = Persistence.createEntityManagerFactory("ClinicaOdontologica_PU");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    // Crear (Insertar)
    public void create(Responsable responsable) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(responsable);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    // Leer (Encontrar por ID)
    public Responsable findResponsable(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Responsable.class, id);
        } finally {
            em.close();
        }
    }

    // Leer (Encontrar TODOS)
    public List<Responsable> findResponsableEntities() {
        return findResponsableEntities(true, -1, -1);
    }

    public List<Responsable> findResponsableEntities(int maxResults, int firstResult) {
        return findResponsableEntities(false, maxResults, firstResult);
    }

    private List<Responsable> findResponsableEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery<Responsable> cq = em.getCriteriaBuilder().createQuery(Responsable.class);
            cq.select(cq.from(Responsable.class));
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
    public void edit(Responsable responsable) throws Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            responsable = em.merge(responsable);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findResponsable(responsable.getPersonaId()) == null) {
                throw new Exception("La responsable con id " + responsable.getPersonaId() + " no existe.");
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
            Responsable responsable;
            try {
                responsable = em.getReference(Responsable.class, id);
                responsable.getPersonaId();
            } catch (Exception ex) {
                throw new Exception("El responsable con id " + id + " no existe.", ex);
            }
            em.remove(responsable);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
}
