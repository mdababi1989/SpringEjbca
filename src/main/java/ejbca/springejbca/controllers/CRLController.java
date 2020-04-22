package ejbca.springejbca.controllers;

import ejbca.springejbca.model.CRL;
import ejbca.springejbca.services.CRLService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CRLController {
    private CRLService CRLDataService;
    public CRLController(CRLService CRLDataService) {
        this.CRLDataService = CRLDataService;
    }

    @GetMapping("/CRLData")
    @ResponseBody
    public String getAll(){
        List<CRL> CRLS = this.CRLDataService.findAll();
        System.out.println(CRLS);
        return "im hier";
    }

}
