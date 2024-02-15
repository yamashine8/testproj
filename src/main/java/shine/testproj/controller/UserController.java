package shine.testproj.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import shine.testproj.mapper.UserMapper;
import shine.testproj.model.User;

import java.util.List;

@RestController
@RequestMapping("/api/rest")
@AllArgsConstructor
public class UserController {

    private final UserMapper mapper;

    @PostMapping("/insert")
    public String insert(@RequestBody User user){
        mapper.insert(user);
        return "user saved";
    }

    @DeleteMapping("/delete/{email}")
    public String deleteByEmail(@PathVariable String email){
        mapper.deleteByEmail(email);
        return "user deleted";
    }

    @GetMapping("data")
    public List<User> findAll(){
        return mapper.findAll();
    }

    @GetMapping("/email/{email}")
    public User findByEmail(@PathVariable String email){
        return mapper.findByEmail(email);
    }



}
