package ejbca.springejbca.repositories;

import ejbca.springejbca.model.RoleMember;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleMemberRepository extends CrudRepository<RoleMember, Integer> {
}
