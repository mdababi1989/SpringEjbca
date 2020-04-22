package ejbca.springejbca.services;

import ejbca.springejbca.model.Role;
import ejbca.springejbca.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    private RoleRepository RoleDataRepository;

    @Autowired
    public RoleServiceImpl(RoleRepository RoleDataRepository) {
        this.RoleDataRepository = RoleDataRepository;
    }

    @Override
    public List<Role> findAll() {
        List<Role> roles = new ArrayList<>();
        this.RoleDataRepository.findAll().forEach(roles::add);
        return roles;
    }

    @Override
    public Role findById(int id) {
        return this.RoleDataRepository.findById(id).orElse(null);
    }
}
