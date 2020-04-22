package ejbca.springejbca.services;

import ejbca.springejbca.model.Base64Cert;

import java.util.List;

public interface Base64CertService {
    List<Base64Cert> findAll();
    Base64Cert findById(String id);
}
