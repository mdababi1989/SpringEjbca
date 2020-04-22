package ejbca.springejbca.services;

import ejbca.springejbca.model.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User findById(String id);
}
