package ejbca.springejbca.services;

import ejbca.springejbca.model.Publisher;

import java.util.List;

public interface PublisherService {
    List<Publisher> findAll();
    Publisher findById(int id);
}
