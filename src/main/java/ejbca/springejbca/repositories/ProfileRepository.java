package ejbca.springejbca.repositories;

import ejbca.springejbca.model.Profile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository extends CrudRepository<Profile, Integer> {
}
