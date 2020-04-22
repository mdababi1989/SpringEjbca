package ejbca.springejbca.services;

import ejbca.springejbca.model.Role;

import java.util.List;

public interface RoleService {
    List<Role> findAll();
    Role findById(int id);
}
