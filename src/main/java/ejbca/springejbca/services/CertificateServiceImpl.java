package ejbca.springejbca.services;

import ejbca.springejbca.model.Certificate;
import ejbca.springejbca.repositories.CertificateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CertificateServiceImpl implements CertificateService {

    private CertificateRepository CertificateDataRepository;

    @Autowired
    public CertificateServiceImpl(CertificateRepository CertificateDataRepository) {
        this.CertificateDataRepository = CertificateDataRepository;
    }

    @Override
    public List<Certificate> findAll() {
        List<Certificate> certificates = new ArrayList<>();
        this.CertificateDataRepository.findAll().forEach(certificates::add);
        return certificates;
    }

    @Override
    public Certificate findById(String id) {
        return this.CertificateDataRepository.findById(id).orElse(null);
    }
}
