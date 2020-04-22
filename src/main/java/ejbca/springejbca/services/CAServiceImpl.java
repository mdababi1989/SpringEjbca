package ejbca.springejbca.services;

import ejbca.springejbca.model.CA;
import ejbca.springejbca.repositories.CARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CAServiceImpl implements CAService {

    private CARepository CADataRepository;

    @Autowired
    public CAServiceImpl(CARepository CADataRepository) {
        this.CADataRepository = CADataRepository;
    }

    @Override
    public List<CA> findAll() {
        List<CA> CAS = new ArrayList<>();
        this.CADataRepository.findAll().forEach(CAS::add);
        return CAS;
    }

    @Override
    public CA findById(int id) {
        return this.CADataRepository.findById(id).orElse(null);
    }
}
