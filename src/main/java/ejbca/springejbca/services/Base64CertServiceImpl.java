package ejbca.springejbca.services;

import ejbca.springejbca.model.Base64Cert;
import ejbca.springejbca.repositories.Base64CertRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Base64CertServiceImpl implements Base64CertService {

    private Base64CertRepository base64CertDataRepository;

    @Autowired
    public Base64CertServiceImpl(Base64CertRepository base64CertDataRepository) {
        this.base64CertDataRepository = base64CertDataRepository;
    }

    @Override
    public List<Base64Cert> findAll() {
        List<Base64Cert> base64Certs = new ArrayList<>();
        this.base64CertDataRepository.findAll().forEach(base64Certs::add);
        return base64Certs;
    }

    @Override
    public Base64Cert findById(String id) {
        return this.base64CertDataRepository.findById(id).orElse(null);
    }
}
