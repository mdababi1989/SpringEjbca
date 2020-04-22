package ejbca.springejbca.controllers;

import ejbca.springejbca.model.Profile;
import ejbca.springejbca.services.ProfileService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ProfileController {
    private ProfileService ProfileDataService;

    public ProfileController(ProfileService ProfileDataService) {
        this.ProfileDataService = ProfileDataService;
    }

    @GetMapping("/ProfileData")
    @ResponseBody
    public String getAll() {
        List<Profile> profiles = this.ProfileDataService.findAll();
        profiles.forEach(entity -> {
            System.out.println(entity);
            System.out.println("-------------------------");
        });
        return "im hier";
    }

}
