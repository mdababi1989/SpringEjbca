package ejbca.springejbca.services;

import ejbca.springejbca.model.CRL;
import ejbca.springejbca.repositories.CRLRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CRLServiceImpl implements CRLService {

    private CRLRepository CRLDataRepository;

    @Autowired
    public CRLServiceImpl(CRLRepository CRLDataRepository) {
        this.CRLDataRepository = CRLDataRepository;
    }

    @Override
    public List<CRL> findAll() {
        List<CRL> CRLS = new ArrayList<>();
        this.CRLDataRepository.findAll().forEach(
                CRLS::add);
        return CRLS;
    }

    @Override
    public CRL findById(String id) {
        return this.CRLDataRepository.findById(id).orElse(null);
    }
}
