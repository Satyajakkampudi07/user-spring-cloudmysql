package com.example.mysql.IOspring;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/IOSpring")
public class MainController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/add")
    public @ResponseBody User addNewUSer(@RequestParam String name , @RequestParam String email){

        User springUSer = new User();
        springUSer.setEmail(email);
        springUSer.setName(name);
        userRepository.save(springUSer);
        return springUSer;
    }

    @GetMapping("/all")
    public @ResponseBody Iterable<User> getAllUsers(){
        return userRepository.findAll();
    }


}
