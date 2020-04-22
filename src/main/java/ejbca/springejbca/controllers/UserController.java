package ejbca.springejbca.controllers;

import ejbca.springejbca.model.User;
import ejbca.springejbca.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    private UserService UserDataService;

    public UserController(UserService UserDataService) {
        this.UserDataService = UserDataService;
    }

    @GetMapping("/UserData")
    @ResponseBody
    public String getAll() {
        List<User> users = this.UserDataService.findAll();
        users.forEach(entity -> {
            System.out.println(entity);
            System.out.println("-------------------------");
        });
        return "im hier";
    }

}
