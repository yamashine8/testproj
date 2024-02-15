package shine.testproj.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import shine.testproj.mapper.UserMapper;
import shine.testproj.model.User;

import java.util.List;

@Controller
@RequestMapping("/api")
@AllArgsConstructor
public class HomeController {

    private final UserMapper mapper;

    @RequestMapping("/table")
    public String getUsers(Model model) {
        List<User> userList = mapper.findAll();
        model.addAttribute("users", userList);
        return "users";
    }
}
