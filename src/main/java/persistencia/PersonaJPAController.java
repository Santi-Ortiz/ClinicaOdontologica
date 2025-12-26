package persistencia;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import logica.Persona;

public class PersonaJPAController{

    private EntityManagerFactory emf = null;

    public PersonaJPAController(EntityManagerFactory emf) {
        this.emf = emf;
    }
   
    public PersonaJPAController() {
    	emf = Persistence.createEntityManagerFactory("ClinicaOdontologica_PU");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    // Crear (Insertar)
    public void create(Persona persona) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(persona);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    // Leer (Encontrar por ID)
    public Persona findPersona(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Persona.class, id);
        } finally {
            em.close();
        }
    }

    // Leer (Encontrar TODOS)
    public List<Persona> findPersonaEntities() {
        return findPersonaEntities(true, -1, -1);
    }

    public List<Persona> findPersonaEntities(int maxResults, int firstResult) {
        return findPersonaEntities(false, maxResults, firstResult);
    }

    private List<Persona> findPersonaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery<Persona> cq = em.getCriteriaBuilder().createQuery(Persona.class);
            cq.select(cq.from(Persona.class));
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
    public void edit(Persona persona) throws Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            persona = em.merge(persona);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findPersona(persona.getPersonaId()) == null) {
                throw new Exception("La persona con id " + persona.getPersonaId() + " no existe.");
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
            Persona persona;
            try {
                persona = em.getReference(Persona.class, id);
                persona.getPersonaId();
            } catch (Exception ex) {
                throw new Exception("La persona con id " + id + " no existe.", ex);
            }
            em.remove(persona);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
}
