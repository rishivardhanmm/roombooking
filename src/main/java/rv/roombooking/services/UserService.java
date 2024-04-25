package rv.roombooking.services;


import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import rv.roombooking.entities.User;
import rv.roombooking.repositories.UserRepository;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Transactional
    public ResponseEntity<String> signUp(User user) {

        // Save the user to the database
        userRepository.save(user);

        // Send response
        return ResponseEntity.ok("Account Creation Successful");
    }

    @Transactional
    public Optional<User> getUser(int id) {
        return userRepository.findById(Long.valueOf(id));
    }
}
