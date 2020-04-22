package ejbca.springejbca.controllers;

import ejbca.springejbca.model.Role;
import ejbca.springejbca.services.RoleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class RoleController {
    private RoleService RoleDataService;

    public RoleController(RoleService RoleDataService) {
        this.RoleDataService = RoleDataService;
    }

    @GetMapping("/RoleData")
    @ResponseBody
    public String getAll() {
        List<Role> roles = this.RoleDataService.findAll();
        roles.forEach(entity -> {
            System.out.println(entity);
            System.out.println("-------------------------");
        });
        return "im hier";
    }

}
