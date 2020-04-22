package ejbca.springejbca.controllers;

import ejbca.springejbca.model.EndEntityProfile;
import ejbca.springejbca.services.EndEntityProfileService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class EndEntityProfileController {
    private EndEntityProfileService EndEntityProfileDataService;

    public EndEntityProfileController(EndEntityProfileService EndEntityProfileDataService) {
        this.EndEntityProfileDataService = EndEntityProfileDataService;
    }

    @GetMapping("/EndEntityProfileData")
    @ResponseBody
    public String getAll() {
        List<EndEntityProfile> endEntityProfiles = this.EndEntityProfileDataService.findAll();
        endEntityProfiles.forEach(entity -> {
            System.out.println(entity);
            System.out.println("-------------------------");
        });
        return "im hier";
    }

}
