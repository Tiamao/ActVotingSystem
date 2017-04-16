package voting.models;

import org.springframework.beans.factory.annotation.Autowired;
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
public class SphereDao {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Sphere> getAll() {
        return entityManager.createQuery("from Sphere").getResultList();
    }

    public Sphere getByName(String name){
        return (Sphere) entityManager.createQuery(
                "from Sphere where name = :name")
                .setParameter("name", name)
                .getSingleResult();
    }
}
