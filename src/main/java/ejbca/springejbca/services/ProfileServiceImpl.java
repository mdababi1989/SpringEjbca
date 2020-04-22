package ejbca.springejbca.services;

import ejbca.springejbca.model.Profile;
import ejbca.springejbca.repositories.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProfileServiceImpl implements ProfileService {

    private ProfileRepository ProfileDataRepository;

    @Autowired
    public ProfileServiceImpl(ProfileRepository ProfileDataRepository) {
        this.ProfileDataRepository = ProfileDataRepository;
    }

    @Override
    public List<Profile> findAll() {
        List<Profile> profiles = new ArrayList<>();
        this.ProfileDataRepository.findAll().forEach(profiles::add);
        return profiles;
    }

    @Override
    public Profile findById(int id) {
        return this.ProfileDataRepository.findById(id).orElse(null);
    }
}
