package ejbca.springejbca.controllers;

import ejbca.springejbca.model.CertificateProfile;
import ejbca.springejbca.services.CertificateProfileService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CertificateProfileController {
    private CertificateProfileService CertificateProfileDataService;
    public CertificateProfileController(CertificateProfileService CertificateProfileDataService) {
        this.CertificateProfileDataService = CertificateProfileDataService;
    }

    @GetMapping("/certificateProfileData")
    @ResponseBody
    public String getAll(){
        List<CertificateProfile> certificateProfiles = this.CertificateProfileDataService.findAll();
        System.out.println(certificateProfiles.get(0).getCertificates());
        return "im hier";
    }

}
