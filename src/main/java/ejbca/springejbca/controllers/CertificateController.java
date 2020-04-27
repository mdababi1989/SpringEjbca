package ejbca.springejbca.controllers;

import ejbca.springejbca.model.Certificate;
import ejbca.springejbca.services.CertificateService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CertificateController {
    private CertificateService CertificateDataService;
    public CertificateController(CertificateService CertificateDataService) {
        this.CertificateDataService = CertificateDataService;
    }

    @GetMapping("/certificateData")
    @ResponseBody
    public String getAll(){
        List<Certificate> certificates = this.CertificateDataService.findAll();
        System.out.println(certificates.get(0).getEndEntityProfile().getProfileName());
        return "im hier";
    }

}
