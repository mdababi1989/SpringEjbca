package ejbca.springejbca.services;

import ejbca.springejbca.model.User;
import ejbca.springejbca.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository UserDataRepository;

    @Autowired
    public UserServiceImpl(UserRepository UserDataRepository) {
        this.UserDataRepository = UserDataRepository;
    }

    @Override
    public List<User> findAll() {
        List<User> users = new ArrayList<>();
        this.UserDataRepository.findAll().forEach(users::add);
        return users;
    }

    @Override
    public User findById(String id) {
        return this.UserDataRepository.findById(id).orElse(null);
    }
}
