package ejbca.springejbca.services;

import ejbca.springejbca.model.RoleMember;

import java.util.List;

public interface RoleMemberService {
    List<RoleMember> findAll();
    RoleMember findById(int id);
}
