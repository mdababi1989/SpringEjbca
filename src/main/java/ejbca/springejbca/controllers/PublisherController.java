package ejbca.springejbca.controllers;

import ejbca.springejbca.model.Publisher;
import ejbca.springejbca.services.PublisherService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PublisherController {
    private PublisherService PublisherDataService;

    public PublisherController(PublisherService PublisherDataService) {
        this.PublisherDataService = PublisherDataService;
    }

    @GetMapping("/PublisherData")
    @ResponseBody
    public String getAll() {
        List<Publisher> publishers = this.PublisherDataService.findAll();
        publishers.forEach(entity -> {
            System.out.println(entity);
            System.out.println("-------------------------");
        });
        return "im hier";
    }

}
