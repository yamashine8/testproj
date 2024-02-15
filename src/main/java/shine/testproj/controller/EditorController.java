package shine.testproj.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import shine.testproj.mapper.UserMapper;
import shine.testproj.model.User;

import java.util.List;

@Controller
@RequestMapping("/api")
@AllArgsConstructor
public class EditorController {

    @RequestMapping("/editor")
    public String editor(){
        return "editor";
    }
    private final UserMapper mapper;


    @PostMapping("/saveData")
    public String saveData(@RequestParam String name, @RequestParam Long salary, @RequestParam String email){
        User user = new User();
        user.setEmail(email);
        user.setSalary(salary);
        user.setName(name);
        mapper.insert(user);
        return "redirect:/api/table";
    }

}
