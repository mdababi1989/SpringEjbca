package ejbca.springejbca.repositories;

import ejbca.springejbca.model.CRL;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CRLRepository extends CrudRepository<CRL, String> {
}
