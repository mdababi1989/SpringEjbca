package ejbca.springejbca.services;

import ejbca.springejbca.model.CertificateProfile;
import ejbca.springejbca.repositories.CertificateProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CertificateProfileServiceImpl implements CertificateProfileService {

    private CertificateProfileRepository CertificateProfileDataRepository;

    @Autowired
    public CertificateProfileServiceImpl(CertificateProfileRepository CertificateProfileDataRepository) {
        this.CertificateProfileDataRepository = CertificateProfileDataRepository;
    }

    @Override
    public List<CertificateProfile> findAll() {
        List<CertificateProfile> certificateProfiles = new ArrayList<>();
        this.CertificateProfileDataRepository.findAll().forEach(certificateProfiles::add);
        return certificateProfiles;
    }

    @Override
    public CertificateProfile findById(String id) {
        return this.CertificateProfileDataRepository.findById(id).orElse(null);
    }
}
