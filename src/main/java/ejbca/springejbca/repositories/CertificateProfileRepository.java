package ejbca.springejbca.repositories;

import ejbca.springejbca.model.CertificateProfile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CertificateProfileRepository extends CrudRepository<CertificateProfile, String> {
}
