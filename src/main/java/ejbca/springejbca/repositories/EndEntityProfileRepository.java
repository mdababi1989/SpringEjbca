package ejbca.springejbca.repositories;

import ejbca.springejbca.model.EndEntityProfile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EndEntityProfileRepository extends CrudRepository<EndEntityProfile, Integer> {
}
