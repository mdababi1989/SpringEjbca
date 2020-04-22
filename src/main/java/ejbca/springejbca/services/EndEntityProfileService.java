package ejbca.springejbca.services;

import ejbca.springejbca.model.EndEntityProfile;

import java.util.List;

public interface EndEntityProfileService {
    List<EndEntityProfile> findAll();
    EndEntityProfile findById(int id);
}
