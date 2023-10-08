package upao.pe.edu.iLoveTravel.controllers;
import org.springframework.web.bind.annotation.*;
import upao.pe.edu.iLoveTravel.models.User;
import upao.pe.edu.iLoveTravel.services.UserService;

import java.util.List;
@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping
    private List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/{userid}")
    public User getUserById(@PathVariable Long userid){
        return userService.getUserById(userid).orElse(new User());
    }

    @PostMapping
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }

    @DeleteMapping("/{userid}")
    public void deleteUser(@PathVariable Long userid){
        userService.deleteUserById(userid);
    }
}

