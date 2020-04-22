package ejbca.springejbca.services;

import ejbca.springejbca.model.CA;

import java.util.List;

public interface CAService {
    List<CA> findAll();
    CA findById(int id);
}
