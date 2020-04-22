package ejbca.springejbca.repositories;

import ejbca.springejbca.model.CA;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CARepository extends CrudRepository<CA, Integer> {
}
