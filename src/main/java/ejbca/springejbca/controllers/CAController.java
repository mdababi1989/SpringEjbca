package ejbca.springejbca.controllers;

import ejbca.springejbca.model.CA;
import ejbca.springejbca.services.CAService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CAController {
    private CAService CADataService;
    public CAController(CAService CADataService) {
        this.CADataService = CADataService;
    }

    @GetMapping("/cadata")
    @ResponseBody
    public String getAll(){
        List<CA> CAS = this.CADataService.findAll();
        System.out.println(CAS);
        return "im hier";
    }

}
