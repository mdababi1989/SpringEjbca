package ejbca.springejbca.services;

import ejbca.springejbca.model.EndEntityProfile;
import ejbca.springejbca.repositories.EndEntityProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EndEntityProfileServiceImpl implements EndEntityProfileService {

    private EndEntityProfileRepository EndEntityProfileDataRepository;

    @Autowired
    public EndEntityProfileServiceImpl(EndEntityProfileRepository EndEntityProfileDataRepository) {
        this.EndEntityProfileDataRepository = EndEntityProfileDataRepository;
    }

    @Override
    public List<EndEntityProfile> findAll() {
        List<EndEntityProfile> endEntityProfiles = new ArrayList<>();
        this.EndEntityProfileDataRepository.findAll().forEach(endEntityProfiles::add);
        return endEntityProfiles;
    }

    @Override
    public EndEntityProfile findById(int id) {
        return this.EndEntityProfileDataRepository.findById(id).orElse(null);
    }
}
