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
public class VoteDao {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Vote> getAll() {
        return entityManager.createQuery("from Vote").getResultList();
    }
}
