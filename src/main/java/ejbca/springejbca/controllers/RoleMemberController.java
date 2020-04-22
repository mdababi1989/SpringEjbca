package ejbca.springejbca.controllers;

import ejbca.springejbca.model.RoleMember;
import ejbca.springejbca.services.RoleMemberService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class RoleMemberController {
    private RoleMemberService RoleMemberDataService;

    public RoleMemberController(RoleMemberService RoleMemberDataService) {
        this.RoleMemberDataService = RoleMemberDataService;
    }

    @GetMapping("/RoleMemberData")
    @ResponseBody
    public String getAll() {
        List<RoleMember> roleMembers = this.RoleMemberDataService.findAll();
        roleMembers.forEach(entity -> {
            System.out.println(entity);
            System.out.println("-------------------------");
        });
        return "im hier";
    }

}
