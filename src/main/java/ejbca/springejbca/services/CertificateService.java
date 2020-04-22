package ejbca.springejbca.services;

import ejbca.springejbca.model.Certificate;

import java.util.List;

public interface CertificateService {
    List<Certificate> findAll();
    Certificate findById(String id);
}
