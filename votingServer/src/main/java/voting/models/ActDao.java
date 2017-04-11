package voting.models;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Kamil on 10.04.2017.
 */
@Repository
@Transactional
public class ActDao {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Act> getAll() {
        return entityManager.createQuery("from Act").getResultList();
    }

    public List<Act> getActsBySphere(int sphereID) {
        return entityManager.createQuery("from Act where sphereID = sphereID").getResultList();
    }
}
