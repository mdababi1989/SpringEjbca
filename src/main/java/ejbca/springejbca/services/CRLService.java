package ejbca.springejbca.services;

import ejbca.springejbca.model.CRL;

import java.util.List;

public interface CRLService {
    List<CRL> findAll();
    CRL findById(String id);
}
