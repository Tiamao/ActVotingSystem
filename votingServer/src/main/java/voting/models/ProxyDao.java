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
public class ProxyDao {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Proxy> getAll() {
        return entityManager.createQuery("from Proxy").getResultList();
    }
}
