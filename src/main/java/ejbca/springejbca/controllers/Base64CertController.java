package ejbca.springejbca.controllers;

import ejbca.springejbca.model.Base64Cert;
import ejbca.springejbca.services.Base64CertService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class Base64CertController {
    private Base64CertService base64CertDataService;
    public Base64CertController(Base64CertService base64CertDataService) {
        this.base64CertDataService = base64CertDataService;
    }

    @GetMapping("/")
    @ResponseBody
    public String getAll(){
        List<Base64Cert> base64Certs = this.base64CertDataService.findAll();
        System.out.println(base64Certs);
        return "im hier";

    }

}
