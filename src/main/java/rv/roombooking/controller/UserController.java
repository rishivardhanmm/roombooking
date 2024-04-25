package rv.roombooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rv.roombooking.entities.User;
import rv.roombooking.services.UserService;

import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public Optional<User> getUser(@RequestParam int userId) {
        return userService.getUser(userId);
    }

    @PostMapping
    @RequestMapping("/signup")
    public ResponseEntity<String> signUp(@RequestBody User user) {
        return userService.signUp(user);
    }
}
