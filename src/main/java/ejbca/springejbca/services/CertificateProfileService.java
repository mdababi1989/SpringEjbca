package ejbca.springejbca.services;

import ejbca.springejbca.model.CertificateProfile;

import java.util.List;

public interface CertificateProfileService {
    List<CertificateProfile> findAll();
    CertificateProfile findById(String id);
}
