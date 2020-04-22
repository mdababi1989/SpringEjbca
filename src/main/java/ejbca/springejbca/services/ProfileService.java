package ejbca.springejbca.services;

import ejbca.springejbca.model.Profile;
import java.util.List;

public interface ProfileService {
    List<Profile> findAll();
    Profile findById(int id);
}
