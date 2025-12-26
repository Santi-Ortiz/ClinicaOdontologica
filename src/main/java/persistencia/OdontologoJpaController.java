package persistencia;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import logica.Odontologo;

public class OdontologoJpaController {

	private EntityManagerFactory emf = null;

    public OdontologoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
   
    public OdontologoJpaController() {
    	emf = Persistence.createEntityManagerFactory("ClinicaOdontologica_PU");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    // Crear (Insertar)
    public void create(Odontologo odontologo) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(odontologo);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    // Leer (Encontrar por ID)
    public Odontologo findOdontologo(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Odontologo.class, id);
        } finally {
            em.close();
        }
    }

    // Leer (Encontrar TODOS)
    public List<Odontologo> findOdontologoEntities() {
        return findOdontologoEntities(true, -1, -1);
    }

    public List<Odontologo> findOdontologoEntities(int maxResults, int firstResult) {
        return findOdontologoEntities(false, maxResults, firstResult);
    }

    private List<Odontologo> findOdontologoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery<Odontologo> cq = em.getCriteriaBuilder().createQuery(Odontologo.class);
            cq.select(cq.from(Odontologo.class));
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
    public void edit(Odontologo odontologo) throws Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            odontologo = em.merge(odontologo);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findOdontologo(odontologo.getPersonaId()) == null) {
                throw new Exception("La odontologo con id " + odontologo.getPersonaId() + " no existe.");
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
            Odontologo odontologo;
            try {
                odontologo = em.getReference(Odontologo.class, id);
                odontologo.getPersonaId();
            } catch (Exception ex) {
                throw new Exception("La odontologo con id " + id + " no existe.", ex);
            }
            em.remove(odontologo);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
}
