package ejbca.springejbca.services;

import ejbca.springejbca.model.Publisher;
import ejbca.springejbca.repositories.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PublisherServiceImpl implements PublisherService {

    private PublisherRepository PublisherDataRepository;

    @Autowired
    public PublisherServiceImpl(PublisherRepository PublisherDataRepository) {
        this.PublisherDataRepository = PublisherDataRepository;
    }

    @Override
    public List<Publisher> findAll() {
        List<Publisher> publishers = new ArrayList<>();
        this.PublisherDataRepository.findAll().forEach(publishers::add);
        return publishers;
    }

    @Override
    public Publisher findById(int id) {
        return this.PublisherDataRepository.findById(id).orElse(null);
    }
}
