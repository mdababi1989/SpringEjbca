package ejbca.springejbca.services;

import ejbca.springejbca.model.RoleMember;
import ejbca.springejbca.repositories.RoleMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoleMemberServiceImpl implements RoleMemberService {

    private RoleMemberRepository RoleMemberDataRepository;

    @Autowired
    public RoleMemberServiceImpl(RoleMemberRepository RoleMemberDataRepository) {
        this.RoleMemberDataRepository = RoleMemberDataRepository;
    }

    @Override
    public List<RoleMember> findAll() {
        List<RoleMember> roleMembers = new ArrayList<>();
        this.RoleMemberDataRepository.findAll().forEach(roleMembers::add);
        return roleMembers;
    }

    @Override
    public RoleMember findById(int id) {
        return this.RoleMemberDataRepository.findById(id).orElse(null);
    }
}
