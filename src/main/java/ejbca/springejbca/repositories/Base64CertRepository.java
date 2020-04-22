package ejbca.springejbca.repositories;

import ejbca.springejbca.model.Base64Cert;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Base64CertRepository extends CrudRepository<Base64Cert, String> {
}
