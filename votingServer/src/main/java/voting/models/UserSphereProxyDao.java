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
public class UserSphereProxyDao {
    @PersistenceContext
    private EntityManager entityManager;

    public List<UserSphereProxy> getAll() {
        return entityManager.createQuery("from UserSphereProxy").getResultList();
    }

}
